package com.example.siti.homework2;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LastScreenActivity extends AppCompatActivity {

    private TextView textRezult;
    private Button button;
    String textSum;
    String address;


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


                address = "geo:0,0?q=" + SecondScreenActyvity.Adres.getText().toString() +
                        " " + SecondScreenActyvity.City.getText().toString();

                Uri gmmIntentUri = Uri.parse(address);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);


            }
        });

    }
}
