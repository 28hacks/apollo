package de.apps28.apollo.vote_poll;

import android.app.Activity;

import java.util.List;

import de.apps28.apollo.model.entity.Poll;

/**
 * Created by dominic on 26.11.17.
 */

public class VotePollActivity extends Activity implements VotePollContract.View {
    @Override
    public void setQuestion(String questionText) {

    }

    @Override
    public void setAnswers(List<Poll.Answer> answerList) {

    }

    @Override
    public void showErrorMessage(int stringRessourceId) {

    }

    @Override
    public void enableVoteButton() {

    }

    @Override
    public void disableVoteButton() {

    }
}
