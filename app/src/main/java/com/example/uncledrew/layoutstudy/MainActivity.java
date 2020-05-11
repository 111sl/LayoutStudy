package com.example.uncledrew.layoutstudy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button frame = findViewById(R.id.frame_button);
        Button relative = findViewById(R.id.relative_button);
        Button absolute = findViewById(R.id.absolute_button);
        Button table = findViewById(R.id.table_button);
        Button grid = findViewById(R.id.grid_button);
        Button constraint = findViewById(R.id.constraint_button);
        frame.setOnClickListener(this);
        relative.setOnClickListener(this);
        absolute.setOnClickListener(this);
        table.setOnClickListener(this);
        grid.setOnClickListener(this);
        constraint.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.frame_button:
                Intent frameIntent = new Intent(MainActivity.this,FrameActivity.class);
                startActivity(frameIntent);
                break;
            case R.id.relative_button:
                Intent relativeIntent = new Intent(MainActivity.this,RelativeActivity.class);
                startActivity(relativeIntent);
                break;
            case R.id.absolute_button:
                Intent absoluteIntent = new Intent(MainActivity.this,AbsoluteActivity.class);
                startActivity(absoluteIntent);
                break;
            case R.id.table_button:
                Intent tableIntent = new Intent(MainActivity.this,TableActivity.class);
                startActivity(tableIntent);
                break;
            case R.id.grid_button:
                Intent gridIntent = new Intent(MainActivity.this,GridActivity.class);
                startActivity(gridIntent);
                break;
            case R.id.constraint_button:
                Intent constraintIntent = new Intent(MainActivity.this,ConstraintActivity.class);
                startActivity(constraintIntent);
                break;
            default:
        }
    }
}
