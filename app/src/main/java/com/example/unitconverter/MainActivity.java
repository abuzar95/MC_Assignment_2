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
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing Widgets
        txt = findViewById(R.id.result);

        editText = findViewById(R.id.enterValue);

        btn = findViewById(R.id.cnvrttoINCHES);

        //Adding a click event for button (Executing the convert method when clicked)
        btn.setOnClickListener(v -> {
            //Calling ConvertFromMeterToInch
            ConvertFromMeterToINCHES();
        });
    }

    private void ConvertFromMeterToINCHES() {
        //This method will convert the values in edittext
        //From Meter to INCHE
        String valueEnterInMeter = editText.getText().toString();
        //Converting String to a number
        double meter = Double.parseDouble(valueEnterInMeter);

        //Converting meter to cm formula
        double INCH = meter * 39.37;
        //Displaying Result
        txt.setText(INCH + " INCHES");
    }

}