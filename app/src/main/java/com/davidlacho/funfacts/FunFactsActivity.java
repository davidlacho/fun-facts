package com.davidlacho.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FunFactsActivity extends AppCompatActivity {
    public static final String TAG = FunFactsActivity.class.getSimpleName();

//    Declare our view variables
    private TextView factTextView;
    private Button showFactButton;
    private RelativeLayout relativeLayout;
    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();
    private int initialColor = colorWheel.nextColor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showFactButton);
        relativeLayout = findViewById(R.id.relativeLayout);

        relativeLayout.setBackgroundColor(initialColor);
        showFactButton.setTextColor(initialColor);

        View.OnClickListener listener = new OnClickListener() {
            @Override
            public void onClick(View v) {
                int backgroundColor = colorWheel.nextColor();
                relativeLayout.setBackgroundColor(backgroundColor);
                factTextView.setText(factBook.getFact());
                showFactButton.setTextColor(backgroundColor);
            }
        };

        showFactButton.setOnClickListener(listener);
//        Toast.makeText(this, "Oh hai there!", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "HELLO, WORLD!");
    }
}
