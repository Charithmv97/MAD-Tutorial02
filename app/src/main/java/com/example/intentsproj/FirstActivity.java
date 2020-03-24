package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Log.i("Lifecycle", "OnCreate() Invoked");

        final EditText fno1 = (EditText)findViewById(R.id.editTextno1);
        final EditText fno2 = (EditText)findViewById(R.id.editTextno2);

        button = (Button) findViewById(R.id.btnok);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                String num1 = fno1.getText().toString();
                String num2 = fno2.getText().toString();


                    openSecondActivity();
            }
        });
    }

    public void openSecondActivity(){
        final EditText fno1 = (EditText)findViewById(R.id.editTextno1);
        final EditText fno2 = (EditText)findViewById(R.id.editTextno2);

        String number1 = fno1.getText().toString();
        String number2 = fno2.getText().toString();

        Intent intent = new Intent(FirstActivity.this,SecondActivity.class);

        intent.putExtra("number1",fno1.getText().toString());
        intent.putExtra("number2",fno2.getText().toString());

        Context context = getApplicationContext();
        //The context to use. Usually your Application or Activity object
        CharSequence message = "You just clicked the OK button";
        //Display string
        int duration = Toast.LENGTH_SHORT;
        //How long the toast message will lasts
        Toast toast = Toast.makeText(context, message, duration); toast.show();

        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);

        startActivity(intent);
    }




}
