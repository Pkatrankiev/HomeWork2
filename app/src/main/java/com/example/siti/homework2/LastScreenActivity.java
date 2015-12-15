package com.example.siti.homework2;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LastScreenActivity extends AppCompatActivity {

    private TextView textRezult;
    private Button button;
    String textSum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_screen);

        textRezult = (TextView) findViewById(R.id.text_rezult);
        button = (Button) findViewById(R.id.bnt_enter);

       textSum = FirstScreenActivity.First_name.getText().toString() +" "+
                FirstScreenActivity.Last_name.getText().toString() +" "+
                SecondScreenActyvity.Years.getText().toString() +" год. \n "+
                SecondScreenActyvity.Adres.getText().toString() +" \n "+
                SecondScreenActyvity.City.getText().toString();

        textRezult.setText(textSum);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent in = new Intent(LastScreenActivity.this, MapActivity.class);
                startActivity(in);


//                if (isDataValid()) {
//
//                    Intent in = new Intent(SecondScreenActyvity.this, LastScreenActivity.class);
//                    startActivity(in);
//                } else {
//                    Text_error2.setVisibility(View.VISIBLE);
//                    Text_error2.setText("Попълнете всички полета");
//                }
//            }
//
//            private boolean isDataValid() {
//                boolean fl;
//                if (Years.getText().toString().equals("") ||
//                        Adres.getText().toString().equals("") ||
//                        City.getText().toString().equals("") ||
//                        Birthday.getText().toString().equals("")) {
//                    fl = false;
//                } else fl = true;
//                return fl;
            }
        });

    }
}
