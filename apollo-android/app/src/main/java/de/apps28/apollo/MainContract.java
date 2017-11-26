package de.apps28.apollo;

import android.os.Bundle;
import android.support.annotation.StringRes;

import de.apps28.apollo.model.PollBundle;

/**
 * Created by dominic on 26.11.17.
 */

public interface MainContract {
    public interface Presenter <T extends View> {

        /**
         * Attaches a view to this presenter
         * @param view View to attach to this presenter
         * @param data Current state of data, will be given to next step
         */
        void onAttachView(T view, PollBundle data);

        Bundle onDetachView();

        /**
         * @return false if the fragments handels the backpress by itself
         * or true if the activity should handle it
         */
        boolean onBackPress();

    }

    public interface View {

        /**
         * @return false if the fragments handels the backpress by itself
         * or true if the activity should handle it
         */
        boolean onBackPress();

        /**
         * Can be used to set the Bundle data into a Fragment
         * @param bundle The bundle to set
         */
        void setBundle(Bundle bundle);

        /**
         * Shows message to user (as toast, snackbar or some other way)
         *
         * @param stringRessource String resource, can contain placeholders
         * @param fields          data to fill in placeholders (if there are any)
         */
        void showMessage(@StringRes int stringRessource, String... fields);

        /**
         * Can be used to get the Bundle data from a Fragment
         * @return bundle from the fragment
         */
        Bundle getBundle ();
    }
}
