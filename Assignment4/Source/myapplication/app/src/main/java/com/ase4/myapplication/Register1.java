package com.ase4.myapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register1);
        final EditText etFullname = (EditText) findViewById(R.id.etFullname);
        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etemail = (EditText) findViewById(R.id.etemail);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final EditText etPhonenumber = (EditText) findViewById(R.id.etPhonenumber);
        final Button bCreate = (Button) findViewById(R.id.bCreate);
        bCreate.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick(View v)
            {
                if (etFullname.getText().toString().equals("Sravani Konujula")&&
                        etUsername.getText().toString().equals("Sravanik07")&&
                        etemail.getText().toString().equals("sravani.konujula@gmail.com")&&
                        etPassword.getText().toString().equals("qwerty123")&&
                        etPhonenumber.getText().toString().equals("8167453357"))
                {
                    Toast.makeText(Register1.this, "Thanks for Registering", Toast.LENGTH_SHORT).show();
                    Intent CreateIntent = new Intent(Register1.this, LoginActivity.class);
                    Register1.this.startActivity(CreateIntent);
                }
                else
                {
                    Toast.makeText(Register1.this, "Fill all the details", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
