package de.apps28.apollo.poll_summary;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.apps28.apollo.R;
import de.apps28.apollo.model.entity.Answer;
import de.apps28.apollo.model.entity.Poll;

/**
 * Created by dominic on 26.11.17.
 */

public class PollSummaryAnswerViewHolder extends RecyclerView.ViewHolder{
    @BindView(R.id.answer_text)
    TextView mAnswerText;

    @BindView(R.id.votes)
    TextView mVotes;

    public PollSummaryAnswerViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(Answer answer, int votes){
        mAnswerText.setText(answer.getTitle());
        mVotes.setText(answer.getVotes().size());
    }


}
