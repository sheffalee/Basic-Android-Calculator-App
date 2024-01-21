package com.example.basic_calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.app.Activity;


public class MainActivity extends AppCompatActivity {

    TextView result;

    Button digits[] = new Button[10];

    Button add , sub ,mul , div, dot, clear, equal;

    float op1 , op2;

    char operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result1);

        digits[0] = findViewById(R.id.number0);
        digits[1] = findViewById(R.id.number1);
        digits[2] = findViewById(R.id.number2);
        digits[3] = findViewById(R.id.number3);
        digits[4] = findViewById(R.id.number4);
        digits[5] = findViewById(R.id.number5);
        digits[6] = findViewById(R.id.number6);
        digits[7] = findViewById(R.id.number7);
        digits[8] = findViewById(R.id.number8);
        digits[9] = findViewById(R.id.number9);

        add = findViewById(R.id.plus);
        sub = findViewById(R.id.minus);
        mul = findViewById(R.id.star);
        div = findViewById(R.id.div);
        dot = findViewById(R.id.dot);
        clear = findViewById(R.id.clear);
        equal = findViewById(R.id.equa);

        for(int i =0;i<10;i++){
            int tempi = i;
            digits[i].setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {

                    result.append(tempi+"");
                }
            });
        }

        clear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                result.setText("");
            }
        });

        dot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                result.append(".");
            }
        });

        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                op1 = Float.parseFloat(result.getText().toString());
                result.setText("");
                operator='+';
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op1 = Float.parseFloat(result.getText().toString());
                result.setText("");
                operator='-';
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op1= Float.parseFloat(result.getText().toString());
                result.setText("");
                operator='*';
            }

        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op1 = Float.parseFloat(result.getText().toString());
                result.setText("");
                operator='/';
            }
        });
        equal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                op2 = Float.parseFloat(result.getText().toString());
                if(operator=='+'){
                    result.setText(op1+op2+"");
                }

                if (operator=='-'){
                    result.setText(op1-op2+"");
                }

                if(operator=='*'){
                    result.setText(op1*op2+"");
                }
                if(operator=='/'){
                    result.setText(op1/op2+"");
                }
            }
        });





    }
}