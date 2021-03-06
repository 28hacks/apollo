package de.apps28.apollo.create_poll;

import de.apps28.apollo.MainContract;
import de.apps28.apollo.model.entity.Answer;

/**
 * Created by dominic on 26.11.17.
 */

public interface CreatePollContract {
    interface Presenter extends MainContract.Presenter{

        void onQuestionTypedIn(String question);

        void onAnswerTypedIn(int answerIndex, String answerText);

        void onMultipleAnswersPossibleClicked(boolean multipleAnswersPossible);

        void createPollButtonClicked();

        void onAddAnswerButtonClicked();

        void onDeleteAnswerButtonClicked(int answerIndex);
    }

    interface View  extends  MainContract.View{
        void addAnswer(Answer answer);

        void deleteAnswer(int answerIndedx);

        void enableCreatePollButton();

        void disableCreatePollButton();

        void showSummaryScreen(long pollId);

        void copyLinkToClipboard(String linkUrl);

        void showErrorMessage(int stringRessourceId);
    }

}
