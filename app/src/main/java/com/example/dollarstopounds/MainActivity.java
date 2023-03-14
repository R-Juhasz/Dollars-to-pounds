package com.example.dollarstopounds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Convert function
    public void convertAmount(View View) {

        // Converts American Dollars to  English pounds.
        EditText DollarseditTextNumber = (EditText) findViewById(R.id.DollarseditTextNumber);

        Double DollarsteditTextNumberDouble = Double.parseDouble(DollarseditTextNumber.getText().toString());

        Double Poundamount = DollarsteditTextNumberDouble * 0.85;

        // Shows converted amount to screen as a Toast pop up.
        Toast.makeText(MainActivity.this, "£" + String.format("%.2f", Poundamount), Toast.LENGTH_SHORT).show();

        // Logs to console for test purpose.
        Log.i("Amount", DollarseditTextNumber.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}