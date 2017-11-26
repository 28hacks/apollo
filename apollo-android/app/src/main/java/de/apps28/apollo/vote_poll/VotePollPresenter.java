package de.apps28.apollo.vote_poll;

import android.os.Bundle;

import de.apps28.apollo.MainContract;
import de.apps28.apollo.model.PollBundle;

/**
 * Created by dominic on 26.11.17.
 */

public class VotePollPresenter implements VotePollContract.Presenter {

    @Override
    public void onAnswerClicked(int answerNumber, boolean selected) {

    }

    @Override
    public void onVoteButtonClicked() {

    }

    @Override
    public void onAttachView(MainContract.View view, PollBundle data) {

    }

    @Override
    public Bundle onDetachView() {
        return null;
    }

    @Override
    public boolean onBackPress() {
        return false;
    }
}
