package de.apps28.apollo.poll_summary;

import android.app.Activity;

import java.util.List;

import de.apps28.apollo.model.entity.Poll;

/**
 * Created by dominic on 26.11.17.
 */

public class PollSummaryActivity extends Activity implements PollSummaryContract.View {
    @Override
    public void showEndPollButton() {

    }

    @Override
    public void setQuestion(String questionText) {

    }

    @Override
    public void setAnswers(List<Poll.Answer> answerList) {

    }

    @Override
    public void showPollUpdateOnAnswer(int answer, int numberOfVotes) {

    }
}