package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button TopButton;
    private Button LowButton;
    private TextView StoryTextView;
    private int mStoryIndex=1;
    // TODO: Steps 4 & 8 - Declare member variables here:



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        TopButton=findViewById(R.id.buttonTop);
        LowButton=findViewById(R.id.buttonBottom);
        StoryTextView=findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        TopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex==1 || mStoryIndex==2){
                    mStoryIndex=3;
                    TopButton.setText(R.string.T3_Ans1);
                    LowButton.setText(R.string.T3_Ans2);
                    StoryTextView.setText(R.string.T3_Story);


                }else{
                    TopButton.setVisibility(View.GONE);
                    LowButton.setVisibility(View.GONE);
                    StoryTextView.setText(R.string.T6_End);

                }

            }
        });
        LowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mStoryIndex==1){
                    mStoryIndex=2;
                    TopButton.setText(R.string.T2_Ans1);
                    LowButton.setText(R.string.T2_Ans2);
                    StoryTextView.setText(R.string.T2_Story);
                }else if (mStoryIndex==2){
                    TopButton.setVisibility(View.GONE);
                    LowButton.setVisibility(View.GONE);
                    StoryTextView.setText(R.string.T4_End);
                }else {
                    TopButton.setVisibility(View.GONE);
                    LowButton.setVisibility(View.GONE);
                    StoryTextView.setText(R.string.T5_End);
                }


            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }
}
