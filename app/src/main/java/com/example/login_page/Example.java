package com.example.login_page;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Example extends AppCompatActivity {
     EditText username,mobil_number,adress,pin;

      Button submit;





    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);
        username=findViewById(R.id.username);
        mobil_number=findViewById(R.id.mobile);
        adress=findViewById(R.id.adress);
        pin= findViewById(R.id.Pin);


        submit =findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String EnterTheUserNAme=username.getText().toString();
                String EnterThenumber=mobil_number.getText().toString();
                String EnterTheAdress=adress.getText().toString();
                String EnterThepin=pin.getText().toString();


                Toast.makeText(Example.this,"Register sucessfully",Toast.LENGTH_SHORT).show();

            }






        });
    }
}