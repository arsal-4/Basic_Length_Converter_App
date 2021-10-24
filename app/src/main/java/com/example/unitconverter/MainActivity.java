package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declaring Widgets
    EditText editText;
    TextView txt;
    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing Widgets
        txt = findViewById(R.id.result);

        editText = findViewById(R.id.enterValue);

        btn1 = findViewById(R.id.cnvrttoCM);
        btn2 = findViewById(R.id.cnvrttoINCHES);
        btn3 = findViewById(R.id.cnvrttoFEET);
        btn4 = findViewById(R.id.cnvrttoKM);

        //Adding a click event for button (Executing the convert method when clicked)
        btn1.setOnClickListener(v -> {
            //Calling ConvertFromMeterToInch
            ConvertFromMeterToCM();
        });

        btn2.setOnClickListener(v -> {
            //Calling ConvertFromMeterToInch
            ConvertFromMeterToINCH();
        });

        btn3.setOnClickListener(v -> {
            //Calling ConvertFromMeterToInch
            ConvertFromMeterToFEET();
        });

        btn4.setOnClickListener(v -> {
            //Calling ConvertFromMeterToInch
            ConvertFromMeterToKM();
        });
    }

    private void ConvertFromMeterToCM() {
        //This method will convert the values in edittext
        //From meter to length
        String valueEnterInMeter = editText.getText().toString();
        //Converting String to a number
        double meter = Double.parseDouble(valueEnterInMeter);

        //Converting meter to cm formula
        double cm = meter * 100;
        //Displaying Result
        txt.setText(cm + " CM");
    }

    private void ConvertFromMeterToINCH() {
        //This method will convert the values in edittext
        //From meter to length
        String valueEnterInMeter = editText.getText().toString();
        //Converting String to a number
        double meter = Double.parseDouble(valueEnterInMeter);

        //Converting meter to inch formula
        double inch = meter * 39.37;
        //Displaying Result
        txt.setText(inch + " INCHES");
    }

    private void ConvertFromMeterToFEET() {
        //This method will convert the values in edittext
        //From meter to length
        String valueEnterInMeter = editText.getText().toString();
        //Converting String to a number
        double meter = Double.parseDouble(valueEnterInMeter);

        //Converting meter to feet formula
        double inch = meter * 3.281;
        //Displaying Result
        txt.setText(inch + " FEET");
    }

    private void ConvertFromMeterToKM() {
        //This method will convert the values in edittext
        //From meter to length
        String valueEnterInMeter = editText.getText().toString();
        //Converting String to a number
        double meter = Double.parseDouble(valueEnterInMeter);

        //Converting meter to KM formula
        double inch = meter/1000;
        //Displaying Result
        txt.setText(inch + " KM");
    }

}