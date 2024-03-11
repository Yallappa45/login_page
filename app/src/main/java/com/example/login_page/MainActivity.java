package com.example.login_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private  EditText  username;
    private  EditText password;
    private  Button submit;

    private static  final String Correct_username = "yallappa";
    private  static  final String Correct_pass ="1234";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        submit = findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             PerformLogin();

            }

            private void PerformLogin() {
                String EnterTheUserName = username.getText().toString();
                String EnterThePassword = password.getText().toString();


                if(EnterTheUserName.equals(Correct_username) && EnterThePassword.equals(Correct_pass))
                {
                    Toast.makeText(MainActivity.this,"Login Successfull",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,Example.class);
                    startActivity(intent);


                }
                else{
                    Toast.makeText(MainActivity.this,"Please Check The Username or Password",Toast.LENGTH_LONG).show();
                }
            }
        });



    }
}