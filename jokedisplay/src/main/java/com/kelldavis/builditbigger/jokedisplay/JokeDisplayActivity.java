package com.kelldavis.builditbigger.jokedisplay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {
    public static final String EXTRA_JOKE_KEY ="joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);
        TextView tvJoke = findViewById(R.id.tv_joke);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null && bundle.containsKey(EXTRA_JOKE_KEY)) {
            tvJoke.setText(bundle.getString(EXTRA_JOKE_KEY));
        }
    }
}
