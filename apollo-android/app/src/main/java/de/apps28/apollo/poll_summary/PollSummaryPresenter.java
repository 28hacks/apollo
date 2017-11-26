package de.apps28.apollo.poll_summary;

import android.os.Bundle;

import de.apps28.apollo.MainContract;
import de.apps28.apollo.model.PollBundle;

/**
 * Created by dominic on 26.11.17.
 */

public class PollSummaryPresenter implements PollSummaryContract.Presenter {
    @Override
    public void onShareButtonClicked() {

    }

    @Override
    public void onEndPollButtonClicked() {

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
