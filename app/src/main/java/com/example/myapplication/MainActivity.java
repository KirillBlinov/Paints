package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText, editText2, editText3, editText4, editText5;
    RadioButton radioButton, radioButton2, radioButton3;
    TextView textView;
    double square = 0;
    double ParamPaint = 0;
    double Reserve = 0;
    double Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        editText = findViewById(R.id.editTextNumber);
        editText2 = findViewById(R.id.editTextNumber2);
        editText3 = findViewById(R.id.editTextNumber3);
        editText4 = findViewById(R.id.editTextNumber4);
        editText5 = findViewById(R.id.editTextNumber5);
        radioButton = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
    }

    public void Button(View view){
        if (editText.getText().toString() == "" | editText2.getText().toString() == "" | editText3.getText().toString() == "" | editText5.getText().toString() == ""){
            Toast toast = Toast.makeText(MainActivity.this, "Заполните все поля!", Toast.LENGTH_LONG);
            toast.show();
        }
        else {
            square = Double.parseDouble(editText.getText().toString()) * Double.parseDouble(editText2.getText().toString());
            ParamPaint = Double.parseDouble(editText3.getText().toString()) * Double.parseDouble(editText4.getText().toString());

            if (radioButton.isChecked()){
                Reserve = 0.10 * square;
            }
            else if (radioButton3.isChecked()){
                Reserve = 0.15 * square;
            }

            Result = (square + Reserve) * ParamPaint / Double.parseDouble(editText5.getText().toString());
            Toast toast = Toast.makeText(MainActivity.this, Double.toString(Math.ceil(Result)) + " банок", Toast.LENGTH_LONG);
            toast.show();
        }
    }

}