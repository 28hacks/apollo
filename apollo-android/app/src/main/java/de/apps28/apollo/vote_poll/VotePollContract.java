package de.apps28.apollo.vote_poll;

import java.util.List;

import de.apps28.apollo.MainContract;
import de.apps28.apollo.model.entity.Answer;
import de.apps28.apollo.model.entity.Poll;

/**
 * Created by dominic on 26.11.17.
 */

public interface VotePollContract {

    interface Presenter extends MainContract.Presenter{
        void onAnswerClicked(int answerNumber, boolean selected);

        void onVoteButtonClicked();
    }

    interface View{
        void setQuestion(String questionText);

        void setAnswers(List<Answer> answerList); //TODO use list of Answer objcts

        void showErrorMessage(int stringRessourceId);

        void enableVoteButton();

        void disableVoteButton();
    }
}
