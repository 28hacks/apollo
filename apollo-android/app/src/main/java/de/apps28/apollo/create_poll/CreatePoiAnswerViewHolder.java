package de.apps28.apollo.create_poll;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import de.apps28.apollo.R;
import de.apps28.apollo.model.entity.Answer;

/**
 * Created by dominic on 26.11.17.
 */

public class CreatePoiAnswerViewHolder extends RecyclerView.ViewHolder{
    @BindView(R.id.answer_text_edit)
    EditText mAnswerTextEdit;

    @BindView(R.id.remover_answer_button)
    ImageButton mRemoveAnswerButton;

    Answer mAnswer;

    public CreatePoiAnswerViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        mAnswer = new Answer();
    }

    public void bind(Answer answer){
    }

    public ImageButton getRemoveAnswerButton(){
        return mRemoveAnswerButton;
    }

    public EditText getAnswerEditText(){
        return mAnswerTextEdit;
    }

    public Answer getAnswer(){
        return mAnswer;
    }
}
