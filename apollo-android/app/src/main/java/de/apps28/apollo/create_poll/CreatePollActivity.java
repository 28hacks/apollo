package de.apps28.apollo.create_poll;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.BoolRes;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Pair;
import android.widget.EditText;
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

    @BindView(R.id.question_editText)
    EditText mQuestionEditText;

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
        mAnswerRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAnswerRecyclerView.setAdapter(mListAdapter);


        mListAdapter.deletedAnswer().subscribe(integer
                -> mPresenter.onDeleteAnswerButtonClicked(integer));
        mListAdapter.changedAnswer().subscribe(integerStringPair
                -> mPresenter.onAnswerTypedIn(integerStringPair.first, integerStringPair.second));

        mAddAnswerButton.setOnClickListener(v -> mPresenter.onAddAnswerButtonClicked());

        mQuestionEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mPresenter.onQuestionTypedIn(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
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
