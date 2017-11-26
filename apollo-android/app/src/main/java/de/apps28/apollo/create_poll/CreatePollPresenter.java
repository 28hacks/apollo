package de.apps28.apollo.create_poll;

import android.os.Bundle;

import de.apps28.apollo.MainContract;
import de.apps28.apollo.model.PollBundle;

/**
 * Created by dominic on 26.11.17.
 */

public class CreatePollPresenter implements CreatePollContract.Presenter {
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

    }

    @Override
    public void onDeleteAnswerButtonClicked(int answerIndex) {

    }

    @Override
    public void onAttachView(MainContract.View view, PollBundle data) {

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
