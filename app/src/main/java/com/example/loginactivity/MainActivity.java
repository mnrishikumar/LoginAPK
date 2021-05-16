package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText) findViewById(R.id.etusname);
        Password = (EditText) findViewById(R.id.etpswd);
        Login = (Button) findViewById(R.id.btnlogin);


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputName = Name.getText().toString();
                String inputPassword = Password.getText().toString();

                if(inputName.equals("Admin")&&(inputPassword.equals("DSC@Sastra")))
                {
                    Intent intent = new Intent (MainActivity.this,HomeActivity.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Invalid Login Credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });






    }
}