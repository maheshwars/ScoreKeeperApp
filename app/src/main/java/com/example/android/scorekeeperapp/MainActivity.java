package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;
    int foulTeamA=0;
    int foulTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayScoreTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayScoreTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayFoulTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));
    }
    public void displayFoulTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));
    }

    public void addOneTeamAScore(View view){
        scoreTeamA=scoreTeamA+1;
        displayScoreTeamA(scoreTeamA);
    }
    public void addOneTeamBScore(View view){
        scoreTeamB=scoreTeamB+1;
        displayScoreTeamB(scoreTeamB);
    }
    public void addFoulTeamA(View view){
        foulTeamA=foulTeamA+1;
        displayFoulTeamA(foulTeamA);
    }
    public void addFoulTeamB(View view){
        foulTeamB=foulTeamB+1;
        displayFoulTeamB(foulTeamB);
    }
    public void reset(View view){
        scoreTeamA=0;
        scoreTeamB=0;
        foulTeamA=0;
        foulTeamB=0;
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
        displayFoulTeamA(foulTeamA);
        displayFoulTeamB(foulTeamB);
    }
}
