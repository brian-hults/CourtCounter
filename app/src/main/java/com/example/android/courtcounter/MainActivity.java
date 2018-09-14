package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Creates a new Team object for both team A and team B that contain
    // the respective scores and fouls.
    Team teamA = new Team();
    Team teamB = new Team();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * com.example.android.courtcounter.Team A Section
     */
    // Adds three points to com.example.android.courtcounter.Team A's score
    public void plusThreeTeamA (View view) {
        teamA.score = teamA.score + 3;
        displayForTeamA(teamA.score);
    }
    // Adds two points to com.example.android.courtcounter.Team A's score
    public void plusTwoTeamA (View view) {
        teamA.score = teamA.score + 2;
        displayForTeamA(teamA.score);
    }
    // Adds a point to com.example.android.courtcounter.Team A's score for a free throw
    public void freeThrowTeamA (View view) {
        teamA.score = teamA.score + 1;
        displayForTeamA(teamA.score);
    }
    // Adds a foul to com.example.android.courtcounter.Team A
    public void foulTeamA(View view) {
        teamA.foul = teamA.foul + 1;
        displayFoulTeamA(teamA.foul);
    }

    // Displays the given score for com.example.android.courtcounter.Team A.
    public void displayForTeamA(int scoreTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    // Displays the foul count for com.example.android.courtcounter.Team A.
    public void displayFoulTeamA(int foulTeamA) {
        TextView foulView = (TextView) findViewById(R.id.team_a_fouls);
        if (foulTeamA < 10) {
            foulView.setText(String.valueOf(foulTeamA));
        } else {
            foulView.setText("Bonus+");
        }

    }

    /**
     * com.example.android.courtcounter.Team B Section
     */
    // Adds three points to com.example.android.courtcounter.Team B's score
    public void plusThreeTeamB (View view) {
        teamB.score = teamB.score + 3;
        displayForTeamB(teamB.score);
    }
    // Adds two points to com.example.android.courtcounter.Team B's score
    public void plusTwoTeamB (View view) {
        teamB.score = teamB.score + 2;
        displayForTeamB(teamB.score);
    }
    // Adds a point to com.example.android.courtcounter.Team B's score for a free throw
    public void freeThrowTeamB (View view) {
        teamB.score = teamB.score + 1;
        displayForTeamB(teamB.score);
    }

    // Adds a foul to com.example.android.courtcounter.Team B
    public void foulTeamB(View view) {
        teamB.foul = teamB.foul + 1;
        displayFoulTeamB(teamB.foul);
    }

    // Displays the given score for com.example.android.courtcounter.Team A.
    public void displayForTeamB(int scoreTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }
    // Displays the foul count for com.example.android.courtcounter.Team B.
    public void displayFoulTeamB(int foulTeamB) {
        TextView foulView = (TextView) findViewById(R.id.team_b_fouls);
        if (foulTeamB < 10) {
            foulView.setText(String.valueOf(foulTeamB));
        } else {
            foulView.setText("Bonus+");
        }
    }

    /**
     * Reset button method to set both teams scores and fouls back to zero
     */
    public void resetScore(View view) {
        teamA.score = 0;
        teamB.score = 0;
        teamA.foul = 0;
        teamB.foul = 0;
        displayFoulTeamA(teamA.foul);
        displayFoulTeamB(teamB.foul);
        displayForTeamA(teamA.score);
        displayForTeamB(teamB.score);
    }
}
