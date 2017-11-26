package de.apps28.apollo.create_poll;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import butterknife.BindView;
import de.apps28.apollo.R;

/**
 * Created by dominic on 26.11.17.
 */

public class CreatePoiAnswerViewHolder extends RecyclerView.ViewHolder{
    @BindView(R.id.answer_text)
    TextView mAnswerText;

    @BindView(R.id.remover_answer_button)
    ImageButton mRemoveAnswerButton;

    public CreatePoiAnswerViewHolder(View itemView) {
        super(itemView);
    }
}
