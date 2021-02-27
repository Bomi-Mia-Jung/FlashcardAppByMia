package com.example.miasflashcardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isShowingAnswers = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // toggle between question flashcard and answer flashcard.
            findViewById(R.id.flashcard_question).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    findViewById(R.id.flashcard_question).setVisibility(View.INVISIBLE);
                    findViewById(R.id.answer).setVisibility(View.VISIBLE);
                }
            });

            findViewById(R.id.answer).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    findViewById(R.id.answer).setVisibility(View.INVISIBLE);
                    findViewById(R.id.flashcard_question).setVisibility(View.VISIBLE);

                }
            });


        // if multiple choice buttons are clicked, the button's color changes.
            findViewById(R.id.choice_1).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    findViewById(R.id.choice_1).setBackgroundColor(getResources().getColor(R.color.soft_pink));
                }
            });
            findViewById(R.id.choice_2).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    findViewById(R.id.choice_2).setBackgroundColor(getResources().getColor(R.color.soft_pink));
                }
            });
            findViewById(R.id.choice_3).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    findViewById(R.id.choice_3).setBackgroundColor(getResources().getColor(R.color.soft_pink));
                }
            });

        //toggle multiple choices.
        findViewById(R.id.toggle_choices_visibility).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isShowingAnswers){
                    // if multiple choice answers are showing, a closed-eye icon should be displayed to indicate that clicking on it will the answers from view.
                    // make multiple choice buttons invisible.
                        findViewById(R.id.choice_1).setVisibility(View.INVISIBLE);
                        findViewById(R.id.choice_2).setVisibility(View.INVISIBLE);
                        findViewById(R.id.choice_3).setVisibility(View.INVISIBLE);
                        isShowingAnswers=false;

                    //display a open_eye icon.
                    ((ImageView) findViewById(R.id.toggle_choices_visibility)).setImageResource(R.drawable.open_eye);
                }
                else{
                    //if the multiple choice answers are NOT shown,
                    // make them visible.
                    findViewById(R.id.choice_1).setVisibility(View.VISIBLE);
                    findViewById(R.id.choice_2).setVisibility(View.VISIBLE);
                    findViewById(R.id.choice_3).setVisibility(View.VISIBLE);
                    isShowingAnswers=true;

                    //display a closed_eye icon.
                    ((ImageView) findViewById(R.id.toggle_choices_visibility)).setImageResource(R.drawable.closed_eye);
                }
            }
        });
    }
}