package de.apps28.apollo.poll_summary;

import java.util.List;

import de.apps28.apollo.MainContract;
import de.apps28.apollo.model.entity.Answer;
import de.apps28.apollo.model.entity.Poll;

/**
 * Created by dominic on 26.11.17.
 */

public interface PollSummaryContract {
    interface Presenter extends MainContract.Presenter{
        void onShareButtonClicked();

        void onEndPollButtonClicked();
    }

    interface View  extends  MainContract.View{
        void showEndPollButton();

        void setQuestion(String questionText);

        void setAnswers(List<Answer> answerList);

        void showPollUpdateOnAnswer(int answer, int numberOfVotes);
    }
}
