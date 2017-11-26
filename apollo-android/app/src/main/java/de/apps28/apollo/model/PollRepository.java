package de.apps28.apollo.model;

import android.support.annotation.NonNull;
import android.util.Log;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.iid.FirebaseInstanceId;

import de.apps28.apollo.model.entity.Poll;
import de.apps28.apollo.model.entity.Vote;
import io.reactivex.Completable;
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

    public Completable votePoll(final Poll poll, int answerId) {
        poll.getAnswers().get(answerId).getVotes().add(new Vote("Test"));
        poll.getDeviceTokens().add(FirebaseInstanceId.getInstance().getToken());

        return Completable.create(emitter -> firestore.collection(COLLECTION_POLLS)
                .document(poll.getId())
                .update("deviceTokens", poll.getDeviceTokens())
                .addOnSuccessListener(documentReference -> emitter.onComplete())
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
