package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA;
    int scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addTwoTeamA(View v) {
        int twoPoints = 2;
        scoreTeamA = scoreTeamA + twoPoints;
        displayForTeamA(scoreTeamA);
    }
    public void addThreeTeamA(View v) {
        int threePoints = 3;
        scoreTeamA = scoreTeamA + threePoints;
        displayForTeamA(scoreTeamA);
    }
    public void addOneTeamA(View v) {
        int onePoint = 1;
        scoreTeamA = scoreTeamA + onePoint;
        displayForTeamA(scoreTeamA);
    }


    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addTwoTeamB(View v) {
        int twoPoints = 2;
        scoreTeamB = scoreTeamB + twoPoints;
        displayForTeamB(scoreTeamB);
    }
    public void addThreeTeamB(View v) {
        int threePoints = 3;
        scoreTeamB = scoreTeamB + threePoints;
        displayForTeamB(scoreTeamB);
    }
    public void addOneTeamB(View v) {
        int onePoint = 1;
        scoreTeamB = scoreTeamB + onePoint;
        displayForTeamB(scoreTeamB);
    }

    public void resetScores(View v) {

        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
    }
}
