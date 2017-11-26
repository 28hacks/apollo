package de.apps28.apollo.model;

import android.support.annotation.NonNull;
import android.util.Log;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import de.apps28.apollo.model.entity.Poll;

/**
 * @author Jonas Gerdes <dev@jonasgerdes.com>
 * @since 26-Nov-17
 */

public class PollRepository {
    private static final String TAG = "PollRepository";

    @NonNull
    private final FirebaseFirestore firestore;

    public PollRepository() {
        firestore = FirebaseFirestore.getInstance();
    }

    public void savePolls() {
        Poll poll = new Poll("Jonas",
                new Poll.Question("How do you like firebase?",
                        new Poll.Answer("Yeah", new Poll.Vote("Dominic")),
                        new Poll.Answer("Meh", new Poll.Vote("Viktor"))
                )
        );
        firestore.collection("polls")
                .add(poll)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Log.d(TAG, "Success!: " + documentReference.getPath());
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.e(TAG, "Failure:", e);
                    }
                });


    }
}
