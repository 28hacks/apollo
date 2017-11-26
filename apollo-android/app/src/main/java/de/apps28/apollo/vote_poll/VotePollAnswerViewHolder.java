package de.apps28.apollo.vote_poll;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.apps28.apollo.R;
import de.apps28.apollo.model.entity.Poll;

/**
 * Created by dominic on 26.11.17.
 */

public class VotePollAnswerViewHolder extends RecyclerView.ViewHolder{

    @BindView(R.id.answer_text)
    TextView mAnswerText;


    public VotePollAnswerViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(Poll.Answer answer){
        mAnswerText.setText(answer.getTitle());
    }
}
