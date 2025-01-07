package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.accessibilityservice.AccessibilityGestureEvent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creating buttons to add onClickListeners to
        Button buttonAdd = (Button) findViewById(R.id.b_Add);
        Button buttonSubtract = (Button) findViewById(R.id.b_Subtract);
        Button buttonMultiply = (Button) findViewById(R.id.b_Multiply);
        Button buttonDivide = (Button) findViewById(R.id.b_Divide);

        // Listeners for the buttons, they're all basically the same aside from the operation
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("M01_Calculator ADD BUTTON", "User tapped the Add button");

                Double double1 = 0.0;
                Double double2 = 0.0;
                Double answer = 0.0;

                EditText textN1 = (EditText) findViewById(R.id.editTextN1);
                EditText textN2 = (EditText) findViewById(R.id.editTextN2);
                // we actually don't need to get ans from screen
                EditText textANS = (EditText) findViewById(R.id.editTextNumAns);

                try {
                    double1 = Double.parseDouble(textN1.getText().toString());
                    double2 = Double.parseDouble(textN2.getText().toString());
                    answer = double1 + double2;
                }
                catch (Exception e) {
                    Log.w("M01_Calculator ADD BUTTON", "Add Selected with no inputs ... " + answer);
                }

                // Set the Answer into the the answer field
                textANS.setText(answer.toString());

                // log what we are doing
                Log.w("M01_Calculator ADD BUTTON", "Add Selected with => " + double1 + " + " + double2 + "=" + answer);
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("M01_Calculator SUBTRACT BUTTON", "User tapped the Subtract button");

                Double double1 = 0.0;
                Double double2 = 0.0;
                Double answer = 0.0;

                EditText textN1 = (EditText) findViewById(R.id.editTextN1);
                EditText textN2 = (EditText) findViewById(R.id.editTextN2);
                // we actually don't need to get ans from screen
                EditText textANS = (EditText) findViewById(R.id.editTextNumAns);

                try {
                    double1 = Double.parseDouble(textN1.getText().toString());
                    double2 = Double.parseDouble(textN2.getText().toString());
                    answer = double1 - double2;
                }
                catch (Exception e) {
                    Log.w("M01_Calculator SUBTRACT BUTTON", "Subtract Selected with no inputs ... " + answer);
                }

                // Set the Answer into the the answer field
                textANS.setText(answer.toString());

                // log what we are doing
                Log.w("M01_Calculator SUBTRACT BUTTON", "Subtract Selected with => " + double1 + " - " + double2 + "=" + answer);
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("M01_Calculator MULTIPLY BUTTON", "User tapped the Multiply button");

                Double double1 = 0.0;
                Double double2 = 0.0;
                Double answer = 0.0;

                EditText textN1 = (EditText) findViewById(R.id.editTextN1);
                EditText textN2 = (EditText) findViewById(R.id.editTextN2);
                // we actually don't need to get ans from screen
                EditText textANS = (EditText) findViewById(R.id.editTextNumAns);

                try {
                    double1 = Double.parseDouble(textN1.getText().toString());
                    double2 = Double.parseDouble(textN2.getText().toString());
                    answer = double1 * double2;
                }
                catch (Exception e) {
                    Log.w("M01_Calculator MULTIPLY BUTTON", "Multiply Selected with no inputs ... " + answer);
                }

                // Set the Answer into the the answer field
                textANS.setText(answer.toString());

                // log what we are doing
                Log.w("M01_Calculator MULTIPLY BUTTON", "Multiply Selected with => " + double1 + " * " + double2 + "=" + answer);
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("M01_Calculator DIVIDE BUTTON", "User tapped the DIVIDE button");

                Double double1 = 0.0;
                Double double2 = 0.0;
                Double answer = 0.0;

                EditText textN1 = (EditText) findViewById(R.id.editTextN1);
                EditText textN2 = (EditText) findViewById(R.id.editTextN2);
                // we actually don't need to get ans from screen
                EditText textANS = (EditText) findViewById(R.id.editTextNumAns);

                try {
                    double1 = Double.parseDouble(textN1.getText().toString());
                    double2 = Double.parseDouble(textN2.getText().toString());
                    answer = double1 / double2;
                }
                catch (Exception e) {
                    Log.w("M01_Calculator DIVIDE BUTTON", "DIVIDE Selected with no inputs ... " + answer);
                }

                // Set the Answer into the the answer field
                textANS.setText(answer.toString());

                // log what we are doing
                Log.w("M01_Calculator DIVIDE BUTTON", "Divide Selected with => " + double1 + " / " + double2 + "=" + answer);
            }
        });

    }

}
