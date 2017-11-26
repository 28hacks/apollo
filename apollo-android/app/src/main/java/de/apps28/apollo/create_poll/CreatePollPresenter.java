package de.apps28.apollo.create_poll;

import android.content.ContentProviderOperation;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import de.apps28.apollo.MainContract;
import de.apps28.apollo.model.PollBundle;
import de.apps28.apollo.model.entity.Answer;
import de.apps28.apollo.model.entity.Poll;

/**
 * Created by dominic on 26.11.17.
 */

public class CreatePollPresenter implements CreatePollContract.Presenter {

    CreatePollContract.View mView;

    List<Answer> mAnswers;

    Poll mPoll;


    @Override
    public void onAttachView(MainContract.View view, PollBundle data) {
        mView =(CreatePollContract.View) view;
        mAnswers = new ArrayList<>();
        mPoll = new Poll("", "",false, mAnswers, new ArrayList<>());
    }

    @Override
    public void onQuestionTypedIn(String question) {
        mPoll.setDescription(question);
    }

    @Override
    public void onAnswerTypedIn(int answerIndex, String answerText) {
        mAnswers.get(answerIndex).setTitle(answerText);
    }

    @Override
    public void onMultipleAnswersPossibleClicked(boolean multipleAnswersPossible) {

    }

    @Override
    public void createPollButtonClicked() {

    }

    @Override
    public void onAddAnswerButtonClicked() {
        mAnswers.add(new Answer("", null));
        mView.addAnswer(mAnswers.get(mAnswers.size()-1));

    }

    @Override
    public void onDeleteAnswerButtonClicked(int answerIndex) {
        mAnswers.remove(answerIndex);
        mView.deleteAnswer(answerIndex);
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
