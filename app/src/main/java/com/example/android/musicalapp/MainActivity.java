package com.example.android.musicalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView polish = (TextView) findViewById(R.id.polish_music);

        // Set a click listener on that View
        polish.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Polish Music Activity}
                Intent polishIntent = new Intent(MainActivity.this, PolishMusic.class);

                // Start the new activity
                startActivity(polishIntent);
            }
        });

        // Find the View that shows the numbers category
        TextView italian = (TextView) findViewById(R.id.italian_music);

        // Set a click listener on that View
        italian.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Indian Music Activity}
                Intent italianIntent = new Intent(MainActivity.this, ItalianMusic.class);

                // Start the new activity
                startActivity(italianIntent);
            }
        });

        // Find the View that shows the numbers category
        TextView ukrainian = (TextView) findViewById(R.id.ukrainian_music);

        // Set a click listener on that View
        ukrainian.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link UkrainianMusic}
                Intent ukrainianIntent = new Intent(MainActivity.this, UkrainianMusic.class);

                // Start the new activity
                startActivity(ukrainianIntent);
            }
        });

        // Find the View that shows the numbers category
        TextView central = (TextView) findViewById(R.id.central_asia_music);

        // Set a click listener on that View
        central.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link CentralAsiaMusic activity}
                Intent centralIntent = new Intent(MainActivity.this, CentralAsiaMusic.class);

                // Start the new activity
                startActivity(centralIntent);
            }
        });
    }
}
