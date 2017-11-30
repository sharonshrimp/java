package com.sharon.eightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askbutton;
        askbutton = (Button) findViewById(R.id.askbutton);

        final ImageView eightball;
        eightball = (ImageView) findViewById(R.id.eightball);

        final TextView toptext;
        toptext = (TextView) findViewById(R.id.toptextview);

        final int[] answerweget ={R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        askbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("eightball","The ask button has been pressed!");

                Random randomanswer = new Random();

                int answer = randomanswer.nextInt(5);

                Log.d("eightball","The random answer is " + answer);

                eightball.setImageResource(answerweget[answer]);


            }
        });



    }
}
