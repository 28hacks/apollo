package de.apps28.apollo.vote_poll;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.apps28.apollo.R;
import de.apps28.apollo.model.PollRepository;
import de.apps28.apollo.model.entity.Answer;
import de.apps28.apollo.model.entity.Poll;

/**
 * Created by dominic on 26.11.17.
 */

public class VotePollActivity extends Activity implements VotePollContract.View {
    private static final String TAG = "VotePollActivity";

    private PollRepository repo;

    @BindView(R.id.question_headline) TextView headline;
    private Poll poll;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote_poll);
        ButterKnife.bind(this);
        repo = new PollRepository();

        String data = "yjJrtXKbUw12IH1D4GBa";
        if(getIntent().getExtras().getString("poll") != null) {
            data = getIntent().getExtras().getString("poll");
        }

        repo.getPoll(data).subscribe(poll -> {
            this.poll = poll;
            String text = "Possible answers:";
            for (Answer answer : poll.getAnswers()) {
                text += "\n\n" + answer.getTitle();
            }
            headline.setText(poll.getDescription()+ "\n\n\n"+text);
        }, throwable -> Log.e(TAG, "onCreate: ", throwable));
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
