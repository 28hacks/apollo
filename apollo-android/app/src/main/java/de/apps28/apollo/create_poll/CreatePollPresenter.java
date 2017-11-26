package de.apps28.apollo.create_poll;

import android.os.Bundle;

import java.util.ArrayList;

import de.apps28.apollo.MainContract;
import de.apps28.apollo.model.PollBundle;
import de.apps28.apollo.model.entity.Answer;

/**
 * Created by dominic on 26.11.17.
 */

public class CreatePollPresenter implements CreatePollContract.Presenter {

    CreatePollContract.View mView;

    @Override
    public void onAttachView(MainContract.View view, PollBundle data) {
        mView =(CreatePollContract.View) view;
    }

    @Override
    public void onQuestionTypedIn(String question) {

    }

    @Override
    public void onAnswerTypedIn(int answerIndex, String answerText) {

    }

    @Override
    public void onMultipleAnswersPossibleClicked(boolean multipleAnswersPossible) {

    }

    @Override
    public void createPollButtonClicked() {

    }

    @Override
    public void onAddAnswerButtonClicked() {
        mView.addAnswer(new Answer("", null));
    }

    @Override
    public void onDeleteAnswerButtonClicked(int answerIndex) {

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
