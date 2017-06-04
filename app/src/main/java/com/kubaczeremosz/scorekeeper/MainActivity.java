package com.kubaczeremosz.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int pointsA;
    private int pointsB;
    private int redsA;
    private int redsB;
    private int yellowsA;
    private int yellowsB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayPointsA(int points) {
        TextView t = (TextView) findViewById(R.id.pts_A);
        t.setText(""+points);
    }

    public void displayPointsB(int points) {
        TextView t = (TextView) findViewById(R.id.pts_B);
        t.setText(""+points);
    }
    public void displayRedsA(int points) {
        TextView t = (TextView) findViewById(R.id.reds_A);
        t.setText(""+points);
    }

    public void displayRedsB(int points) {
        TextView t = (TextView) findViewById(R.id.reds_B);
        t.setText(""+points);
    }
    public void displayYellowsA(int points) {
        TextView t = (TextView) findViewById(R.id.yellows_A);
        t.setText(""+points);
    }

    public void displayYellowsB(int points) {
        TextView t = (TextView) findViewById(R.id.yellows_B);
        t.setText(""+points);
    }

    public void reset(View view) {
        pointsA = 0;
        pointsB = 0;
        redsA = 0;
        redsB = 0;
        yellowsA = 0;
        yellowsB = 0;
        displayPointsA(pointsA);
        displayPointsB(pointsB);
        displayRedsA(redsA);
        displayRedsB(redsB);
        displayYellowsA(yellowsA);
        displayYellowsB(yellowsB);
    }

    public void addGoalA(View view) {
        pointsA += 1;
        displayPointsA(pointsA);
    }

    public void addRedA(View view) {
        redsA += 1;
        displayRedsA(redsA);
    }

    public void addYellowA(View view) {
        yellowsA += 1;
        displayYellowsA(yellowsA);
    }
    public void addGoalB(View view) {
        pointsB += 1;
        displayPointsB(pointsB);
    }

    public void addRedB(View view) {
        redsB += 1;
        displayRedsB(redsB);
    }

    public void addYellowB(View view) {
        yellowsB += 1;
        displayYellowsB(yellowsB);
    }
}
