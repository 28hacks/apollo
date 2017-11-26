package de.apps28.apollo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

import de.apps28.apollo.create_poll.CreatePollActivity;

public class MainActivity extends AppCompatActivity {

    private static final int RC_SING_IN = 646;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        auth = FirebaseAuth.getInstance();
        login();
    }


    private void login() {
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RC_SING_IN) {
            if (resultCode == RESULT_OK) {
                start();
            }
        }
    }

    private void start() {
        if (auth.getCurrentUser() != null) {
            login();
        } else {
            startActivity(new Intent(this, CreatePollActivity.class));
        }
    }
}
