package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;

public class Calculator extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
    Button btnplus,btndiff,btnproduct,btndiv,btnmod,btneq,btnclear;
    TextView txt;
    double num1, num2,result;
    String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        btn0=findViewById(R.id.zero);
        btn1=findViewById(R.id.one);
        btn2=findViewById(R.id.two);
        btn3=findViewById(R.id.three);
        btn4=findViewById(R.id.four);
        btn5=findViewById(R.id.five);
        btn6=findViewById(R.id.six);
        btn7=findViewById(R.id.seven);
        btn8=findViewById(R.id.eight);
        btn9=findViewById(R.id.nine);
        btnplus=findViewById(R.id.plus);
        btndiff=findViewById(R.id.minus);
        btndiv=findViewById(R.id.div);
        btnproduct=findViewById(R.id.product);
        btnmod=findViewById(R.id.rem);
        btnclear=findViewById(R.id.clear);
        btneq=findViewById(R.id.equal);
        txt=findViewById(R.id.textbox);

        btn0.setOnClickListener(v -> txt.append("0"));
        btn1.setOnClickListener(v -> txt.append("1"));
        btn2.setOnClickListener(v -> txt.append("2"));
        btn3.setOnClickListener(v -> txt.append("3"));
        btn4.setOnClickListener(v -> txt.append("4"));
        btn5.setOnClickListener(v -> txt.append("5"));
        btn6.setOnClickListener(v -> txt.append("6"));
        btn7.setOnClickListener(v -> txt.append("7"));
        btn8.setOnClickListener(v -> txt.append("8"));
        btn9.setOnClickListener(v -> txt.append("9"));

        btnplus.setOnClickListener(v->{
            num1 = Double.parseDouble(txt.getText().toString());
            operator = "+";
            txt.setText("");
        });
        btndiff.setOnClickListener(v->{
            num1 = Double.parseDouble(txt.getText().toString());
            operator = "-";
            txt.setText("");
        });
        btnproduct.setOnClickListener(v->{
            num1 = Double.parseDouble(txt.getText().toString());
            operator = "*";
            txt.setText("");
        });
        btndiv.setOnClickListener(v->{
            num1 = Double.parseDouble(txt.getText().toString());
            operator = "/";
            txt.setText("");
        });
        btnmod.setOnClickListener(v->{
            num1 = Double.parseDouble(txt.getText().toString());
            operator = "%";
            txt.setText("");
        });
        btneq.setOnClickListener(v->{
            num2 = Double.parseDouble(txt.getText().toString());
            txt.setText("");
            switch (operator)
            {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                case "%":
                    result = num1 % num2;
                    break;
            }

            txt.setText(String.valueOf(result));

        });
        btnclear.setOnClickListener(v->txt.setText(""));
    }




}