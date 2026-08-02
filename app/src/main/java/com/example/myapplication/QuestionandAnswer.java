package com.example.myapplication;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class QuestionandAnswer extends AppCompatActivity {
    int i=1;
    TextView textView1, textView2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionand_answer);
        textView1=findViewById(R.id.q1);
        textView2=findViewById(R.id.a1);
        button=findViewById(R.id.qabtn);
        button.setOnClickListener(v->
        {
            switch(i)
            {
                case 1 : textView1.setText("Q"+i+"  . What is the Capital of India?");
                    textView2.setText("Answer : NewDelhi");i++;break;
                case 2 :textView1.setText("Q"+i+" . What is the Capital of Kerala?");
                    textView2.setText("Answer : TVM");i++;break;
                case 3:textView1.setText("Q"+i+"  . What is the Capital of Tamil Nadu?");
                    textView2.setText("Answer : Chennai");i++;break;
                case 4 : textView1.setText("Q"+i+"  . What is the Capital of ?");
                    textView2.setText("Answer : NewDelhi");i++;break;
                case 5 :textView1.setText("Q"+i+"  . What is the Capital  India?");
                    textView2.setText("Answer : NewDelhi");i=1;break;
            }
        });

    }

}



