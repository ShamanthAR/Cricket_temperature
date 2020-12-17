package com.example.thermometer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.text.AttributedString;

public class MainActivity extends AppCompatActivity {

    EditText etNumber;
    Button btnCalculate;
    TextView tvResults;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        etNumber=findViewById(R.id.etNumber);
        btnCalculate=findViewById(R.id.btnCalculate);
        tvResults=findViewById(R.id.tcResults);

        tvResults.setVisibility(View.GONE);

        String Text1=getString(R.string.Text1);
        String Text2=getString(R.string.Text2);
        String Text3=getString(R.string.NullValue);
        btnCalculate.setOnClickListener(view -> {

            String StringNumber=etNumber.getText().toString();
            if(StringNumber.isEmpty()){
                tvResults.setText(Text3);
                tvResults.setVisibility(View.VISIBLE);
            }
            else{
                int Result=Integer.parseInt(StringNumber);
                int result= (Result /3)+4;

                String StringResult= Integer.toString(result);
                tvResults.setText(Text1+result+Text2);
                tvResults.setVisibility(View.VISIBLE);
            }

        });
    }
}