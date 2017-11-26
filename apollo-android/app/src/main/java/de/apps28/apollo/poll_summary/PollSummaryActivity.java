package de.apps28.apollo.poll_summary;

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

public class PollSummaryActivity extends Activity implements PollSummaryContract.View {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poll_summary);
        ButterKnife.bind(this);
    }

    @Override
    public void showEndPollButton() {

    }

    @Override
    public void setQuestion(String questionText) {

    }

    @Override
    public void setAnswers(List<Answer> answerList) {

    }

    @Override
    public void showPollUpdateOnAnswer(int answer, int numberOfVotes) {

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
