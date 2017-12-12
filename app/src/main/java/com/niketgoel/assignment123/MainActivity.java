package com.niketgoel.assignment123;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements DialogInterface {
    /**
     * created a dialogue with two manual button to perform actions by inflating prompt layout.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater layoutInflater = LayoutInflater.from(this);
        View promptView = layoutInflater.inflate(R.layout.prompt, null);

        final AlertDialog alertD = new AlertDialog.Builder(this).create();

        //EditText userInput = (EditText) promptView.findViewById(R.id.userInput);

        Button btnAdd1 = (Button) promptView.findViewById(R.id.btnAdd1);

        Button btnAdd2 = (Button) promptView.findViewById(R.id.btnAdd2);

        btnAdd1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // btnAdd1 has been clicked to dismiss
                alertD.dismiss();

            }
        });

        btnAdd2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // btnAdd2 has been clicked to cancel
                alertD.cancel();
            }
        });

        alertD.setView(promptView);

        alertD.show();

    }

    @Override
    public void cancel() {

    }

    @Override
    public void dismiss() {

    }
}