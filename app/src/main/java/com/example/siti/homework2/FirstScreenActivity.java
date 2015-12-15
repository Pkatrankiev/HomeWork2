package com.example.siti.homework2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstScreenActivity extends AppCompatActivity implements View.OnClickListener {

    static EditText First_name;
    static TextView Text_error;
    static EditText Last_name;
    static Button btn_enter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);

        First_name = (EditText) findViewById(R.id.edit_First_name);
        Last_name = (EditText) findViewById(R.id.edit_Last_name);
        btn_enter = (Button) findViewById(R.id.btn_enter);
        Text_error = (TextView) findViewById(R.id.textError);

        btn_enter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (isDataValid()) {
                    Text_error.setVisibility(View.INVISIBLE);
                    Intent in = new Intent(FirstScreenActivity.this, SecondScreenActyvity.class);
                    startActivity(in);
                } else {
                    Text_error.setVisibility(View.VISIBLE);
                    Text_error.setText("Попълнете и двете полета");
                }

            }

            private boolean isDataValid() {
                boolean fl;
                if (First_name.getText().toString().equals("") ||
                        Last_name.getText().toString().equals("")) {
                    fl = false;
                } else fl = true;
                return fl;
            }
        });
    }


    @Override
    public void onClick(View v) {

    }
}

