package com.example.imageviewtask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView ivResult;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivResult = findViewById(R.id.ivResult);
        btn = findViewById(R.id.makeRnadom);
    }

    public void clicked(View view) {
        int rand = (int) (3 * Math.random() + 1);

        if(rand == 1){
            ivResult.setImageResource(R.drawable.stickman1);
            btn.setText("1");
        }
        else if(rand == 2){
            ivResult.setImageResource(R.drawable.two);
            btn.setText("2");
        }
        else if(rand == 3){
            ivResult.setImageResource(R.drawable.three);
            btn.setText("3");
        }

    }
}