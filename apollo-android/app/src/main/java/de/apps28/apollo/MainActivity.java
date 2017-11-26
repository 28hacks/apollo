package de.apps28.apollo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import de.apps28.apollo.model.PollRepository;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testRepo(new PollRepository());
    }

    private void testRepo(PollRepository pollRepository) {
        pollRepository.testSavePoll();
    }
}
