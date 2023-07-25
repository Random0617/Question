package com.example.simpleexample;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    LinearLayout layoutList;
    Button buttonAdd;
    Button btn_next;
    Button btn_back;
    Button btn_generate_outside;
    int quantity = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layoutList = findViewById(R.id.layout_list);
        buttonAdd = findViewById(R.id.generate);
        btn_next = findViewById(R.id.button_go_to_2);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View new_view;
                TextView quantity_textview;
                quantity++;
                //Source: https://www.youtube.com/watch?v=EJrmgJT2NnI&ab_channel=DroidGuru
                new_view = getLayoutInflater().inflate(R.layout.activity3, null, false);
                quantity_textview = (TextView) new_view.findViewById(R.id.quantity);
                quantity_textview.setText("x " + String.valueOf(quantity));
                layoutList.addView(new_view);
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity2);
                //btn_back = findViewById(R.id.button2);
            }
        });
        /* // When uncomment just this part, nothing happens when the back button (button2 in activity2.xml) is clicked.
        View activity_2 = getLayoutInflater().inflate(R.layout.activity2, null, false);
        btn_back = activity_2.findViewById(R.id.button2);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
            }
        });
        */
        /* // When uncomment just this part, the app crashed immediately
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
            }
        });
        */
    }
}
