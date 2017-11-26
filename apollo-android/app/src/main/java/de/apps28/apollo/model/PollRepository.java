package de.apps28.apollo.model;

import android.support.annotation.NonNull;
import android.util.Log;

import com.google.firebase.firestore.FirebaseFirestore;

import de.apps28.apollo.model.entity.Poll;
import io.reactivex.Observable;
import io.reactivex.Single;

/**
 * @author Jonas Gerdes <dev@jonasgerdes.com>
 * @since 26-Nov-17
 */

public class PollRepository {
    private static final String TAG = "PollRepository";
    public static final String COLLECTION_POLLS = "polls";

    @NonNull
    private final FirebaseFirestore firestore;

    public PollRepository() {
        firestore = FirebaseFirestore.getInstance();
    }

    public Single<String> savePoll(final Poll poll) {
        return Single.create(emitter -> firestore.collection(COLLECTION_POLLS)
                .add(poll)
                .addOnSuccessListener(documentReference -> emitter.onSuccess(documentReference.getId()))
                .addOnFailureListener(emitter::onError));

    }

    public Observable<Poll> getPoll(String id) {
        return Observable.create(emitter -> firestore.collection(COLLECTION_POLLS)
                .document(id)
                .addSnapshotListener((documentSnapshot, e) -> {
                    if (e != null) {
                        emitter.onError(e);
                    }
                    try {
                        if (documentSnapshot != null && documentSnapshot.exists()) {
                            Log.d(TAG, "getPoll: " + documentSnapshot.getData());
                            Poll poll = documentSnapshot.toObject(Poll.class);
                            emitter.onNext(poll);
                        }
                    } catch (Exception error) {
                        emitter.onError(error);
                    }
                }));
    }

}
