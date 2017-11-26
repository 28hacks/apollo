package de.apps28.apollo.vote_poll;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import java.util.List;

import butterknife.ButterKnife;
import de.apps28.apollo.R;
import de.apps28.apollo.model.entity.Answer;
import de.apps28.apollo.model.entity.Poll;

/**
 * Created by dominic on 26.11.17.
 */

public class VotePollActivity extends Activity implements VotePollContract.View {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote_poll);
        ButterKnife.bind(this);
    }

    @Override
    public void setQuestion(String questionText) {

    }

    @Override
    public void setAnswers(List<Answer> answerList) {

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

    @Override
    public boolean onBackPress() {
        return false;
    }

    @Override
    public void setBundle(Bundle bundle) {

    }

    @Override
    public void showMessage(int stringRessource, String... fields) {

    }

    @Override
    public Bundle getBundle() {
        return null;
    }
}
