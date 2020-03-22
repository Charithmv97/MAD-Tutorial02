package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button button;
    EditText number1, number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Log.i("Lifecycle", "OnCreate() Invoked");

        EditText no1 = (EditText)findViewById(R.id.editTextsno1);
        EditText no2 = (EditText)findViewById(R.id.editTextsno2);

        no1.setText(getIntent().getExtras().getString("number1"));
        no2.setText(getIntent().getExtras().getString("number2"));
    }

    //Add button functions goes here

    public void onButtonAdd(View v){
        EditText no1 = (EditText)findViewById(R.id.editTextsno1);
        EditText no2 = (EditText)findViewById(R.id.editTextsno2);

        TextView textView = (TextView)findViewById(R.id.result);

        float number1 = Float.parseFloat(no1.getText().toString());
        float number2 = Float.parseFloat(no2.getText().toString());

        float sum = (number1 + number2);

        textView.setText(Float.toString(number1)+" "+"+"+" "+Float.toString(number2)+" "+"="+" "+Float.toString(sum));
    }

    //subtraction function goes here

    public void onButtonSub(View v){
        EditText no1 = (EditText)findViewById(R.id.editTextsno1);
        EditText no2 = (EditText)findViewById(R.id.editTextsno2);

        TextView textView = (TextView)findViewById(R.id.result);

        float number1 = Float.parseFloat(no1.getText().toString());
        float number2 = Float.parseFloat(no2.getText().toString());

        float sub = (number1 - number2);

        textView.setText(Float.toString(number1)+" "+"-"+" "+Float.toString(number2)+" "+"="+" "+Float.toString(sub));
    }

    //multiple function goes here

    public void onButtonMul(View v){
        EditText no1 = (EditText)findViewById(R.id.editTextsno1);
        EditText no2 = (EditText)findViewById(R.id.editTextsno2);

        TextView textView = (TextView)findViewById(R.id.result);

        float number1 = Float.parseFloat(no1.getText().toString());
        float number2 = Float.parseFloat(no2.getText().toString());

        float mul = (number1 * number2);

        textView.setText(Float.toString(number1)+" "+"x"+" "+Float.toString(number2)+" "+"="+" "+Float.toString(mul));

    }

    //division function goes here

    public void onButtonDiv(View v){
        EditText no1 = (EditText)findViewById(R.id.editTextsno1);
        EditText no2 = (EditText)findViewById(R.id.editTextsno2);

        TextView textView = (TextView)findViewById(R.id.result);

        float number1 = Float.parseFloat(no1.getText().toString());
        float number2 = Float.parseFloat(no2.getText().toString());

        float div = number1/number2;

        textView.setText(Float.toString(number1)+" "+"/"+" "+Float.toString(number2)+" "+"="+" "+Float.toString(div));

    }


}


