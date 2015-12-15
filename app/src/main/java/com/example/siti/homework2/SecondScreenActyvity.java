package com.example.siti.homework2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondScreenActyvity extends AppCompatActivity {

    static EditText Years;
    static EditText Adres;
    static EditText City;
    static TextView Text_error2;
    static EditText Birthday;
    private Button btn_go;
    static String TextRsult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        Years = (EditText) findViewById(R.id.edit_Years);
        Adres = (EditText) findViewById(R.id.edit_Adres);
        City = (EditText) findViewById(R.id.edit_City);
        Birthday = (EditText) findViewById(R.id.edit_Birthday);
        Text_error2 = (TextView) findViewById(R.id.textError2);
        btn_go = (Button) findViewById(R.id.btn_go);
        Years.setInputType(InputType.TYPE_CLASS_NUMBER);

        btn_go.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (isDataValid()) {

                    Intent in = new Intent(SecondScreenActyvity.this, LastScreenActivity.class);
                    startActivity(in);
                } else {
                    Text_error2.setVisibility(View.VISIBLE);
                    Text_error2.setText("Попълнете всички полета");
                }
            }

            private boolean isDataValid() {
                boolean fl;
                if (Years.getText().toString().equals("") ||
                        Adres.getText().toString().equals("") ||
                        City.getText().toString().equals("") ||
                        Birthday.getText().toString().equals("")) {
                    fl = false;
                } else fl = true;
                return fl;
            }
        });
    }
}