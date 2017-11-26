package de.apps28.apollo.create_poll;

import android.support.v7.util.SortedList;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import de.apps28.apollo.model.entity.Answer;
import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;

/**
 * Created by dominic on 26.11.17.
 */

public class CreatePollAnswerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<Answer> mAnswers;

    private BehaviorSubject<Integer> mAnswerDeletedSubject = BehaviorSubject.create();
    private BehaviorSubject<Pair<Integer, String>> mAnswerTextChangeSubject = BehaviorSubject.create();

    public CreatePollAnswerAdapter(RecyclerView recyclerView){
        mAnswers = new ArrayList<>();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        RecyclerView.ViewHolder holder = new CreatePoiAnswerViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Answer answer = mAnswers.get(position);
        ((CreatePoiAnswerViewHolder) holder).bind(answer);
        ((CreatePoiAnswerViewHolder) holder).getRemoveAnswerButton().setOnClickListener(v ->
                mAnswerDeletedSubject.onNext(holder.getAdapterPosition()
        ));

        ((CreatePoiAnswerViewHolder) holder).getAnswerEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mAnswerTextChangeSubject.onNext(new Pair<>(holder.getAdapterPosition(), s.toString()) );
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return mAnswers != null? mAnswers.size():-1;
    }


    public Observable<Integer> deletedAnswer() {
        return mAnswerDeletedSubject.hide();
    }

    public Observable<Pair<Integer,String >> changedAnswer() {
        return mAnswerTextChangeSubject.hide();
    }

    public void deleteAnswer(int position){
        mAnswers.remove(position);
    }

    public void addAnswer(Answer answer){
        mAnswers.add(answer);
        this.notifyDataSetChanged();
    }
}
