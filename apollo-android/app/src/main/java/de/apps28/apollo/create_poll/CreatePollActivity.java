package de.apps28.apollo.create_poll;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.apps28.apollo.R;
import de.apps28.apollo.model.entity.Answer;

/**
 * Created by dominic on 26.11.17.
 */

public class CreatePollActivity extends Activity implements CreatePollContract.View {

    @BindView(R.id.answer_list)
    RecyclerView mAnswerRecyclerView;

    @BindView(R.id.add_answer_button)
    ImageButton mAddAnswerButton;

    CreatePollAnswerAdapter mListAdapter;

    CreatePollContract.Presenter mPresenter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_poll);
        ButterKnife.bind(this);

        mPresenter = new CreatePollPresenter();

        mPresenter.onAttachView(this, null);

        mListAdapter = new CreatePollAnswerAdapter(mAnswerRecyclerView);
        mListAdapter.deletedAnswer().subscribe(integer
                -> mPresenter.onDeleteAnswerButtonClicked(integer));
        mListAdapter.changedAnswer().subscribe(integerStringPair
                -> mPresenter.onAnswerTypedIn(integerStringPair.first, integerStringPair.second));

        mAddAnswerButton.setOnClickListener(v -> mPresenter.onAddAnswerButtonClicked());
    }

    @Override
    public void addAnswer(Answer answer) {
        mListAdapter.addAnswer(answer);
    }

    @Override
    public void deleteAnswer(int answerIndedx) {
        mListAdapter.deleteAnswer(answerIndedx);
    }

    @Override
    public void enableCreatePollButton() {

    }

    @Override
    public void disableCreatePollButton() {

    }

    @Override
    public void showSummaryScreen(long pollId) {

    }

    @Override
    public void copyLinkToClipboard(String linkUrl) {

    }

    @Override
    public void showErrorMessage(int stringRessourceId) {

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
