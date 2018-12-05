package com.example.markham.andrew.andrewsjokeslibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokesActivty extends AppCompatActivity {

    public static String JOKE_KEY = "JOKE_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes_activty);

        TextView textView = findViewById(R.id.Joke_tv);

        String JokeResult = null;
        Intent intent = getIntent();
        JokeResult = intent.getStringExtra(getString(R.string.jokeEnvelope));

        if (JokeResult != null) {
            textView.setText(JokeResult);
        } else {
            textView.setText("Looking for a construction joke? Well too bad, I'm still working on it!!");
        }
    }
}
