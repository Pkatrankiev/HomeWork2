package com.example.siti.homework2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdScreenActivity extends AppCompatActivity {

    String TxRezult;
    private TextView text_rezult;
    private Button bnt_enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_screen);
//
//        text_rezult = (TextView) findViewById(R.id.text_rezult);
//
//        TxRezult = FirstScreenActivity.First_name.getText().toString() +" "+
//                FirstScreenActivity.Last_name.getText().toString() +" "+
//                SecondScreenActyvity.Years.getText().toString() +" год. \n "+
//                SecondScreenActyvity.Adres.getText().toString() +" \n "+
//                SecondScreenActyvity.City.getText().toString();
//
//        text_rezult.setText(TxRezult);

        bnt_enter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
//
//                Intent in = new Intent(ThirdScreenActivity.this, MapActivity.class);
//                startActivity(in);

            }

        });
    }
}
