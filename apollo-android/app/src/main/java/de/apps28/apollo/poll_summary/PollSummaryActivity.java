package de.apps28.apollo.poll_summary;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.TextView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.dynamiclinks.FirebaseDynamicLinks;
import com.google.firebase.dynamiclinks.PendingDynamicLinkData;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.apps28.apollo.R;
import de.apps28.apollo.model.entity.Answer;
import de.apps28.apollo.model.entity.Poll;

import static android.content.ContentValues.TAG;

/**
 * Created by dominic on 26.11.17.
 */

public class PollSummaryActivity extends Activity implements PollSummaryContract.View {

    public static final String EXTRA_POLL_ID = "pollId";

    @BindView(R.id.question_headline)
    TextView headline;

    private String pollId;

    public static Intent getIntent(Context context, String pollId){
        Intent intent = new Intent(context, PollSummaryActivity.class);
        intent.putExtra(EXTRA_POLL_ID, pollId);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poll_summary);
        ButterKnife.bind(this);

        if(getIntent().getExtras()!=null) {
            pollId = getIntent().getExtras().getString(EXTRA_POLL_ID);
            //only for testing
            headline.setText(headline.getText()+" JEAH!!! pollId via Notification: "+pollId);
        }
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
