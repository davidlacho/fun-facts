package com.davidlacho.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

//    Declare our view variables
    private TextView factTextView;
    private Button showFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Assign the views from the layout file to the view variables
        factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showFactButton);

        View.OnClickListener listener = new OnClickListener() {
            int randomNumber;
            int lastRandomNumber;

            String[] facts = {
                "Ants stretch when they wake up in the morning.",
                "Ostriches can run faster than horses.",
                "Olympic gold medals are actually made mostly of silver.",
                "You are born with 300 bones; by the time you are an adult you will have 206.",
                "It takes about 8 minutes for light from the Sun to reach Earth.",
                "Some bamboo plants can grow almost a meter in just one day.",
                "The state of Florida is bigger than England.",
                "Some penguins can leap 2-3 meters out of the water.",
                "On average, it takes 66 days to form a new habit.",
                "Mammoths still walked the earth when the Great Pyramid was being built." };

            @Override
            public void onClick(View v) {
                    Random randomGenerator = new Random();
                    lastRandomNumber = randomNumber;

                    while (randomNumber == lastRandomNumber) {
                        randomNumber = randomGenerator.nextInt(facts.length);
                    }

                    String fact = facts[randomNumber];

                    factTextView.setText(fact);
            }
        };

        showFactButton.setOnClickListener(listener);
    }
}
