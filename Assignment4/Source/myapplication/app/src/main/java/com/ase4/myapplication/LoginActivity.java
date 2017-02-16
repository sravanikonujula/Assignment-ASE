package com.ase4.myapplication;



import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText etUsername = (EditText) findViewById(R.id.etFullname);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final Button bLogin = (Button) findViewById(R.id.bLogin);

        final TextView Registerlink = (TextView) findViewById(R.id.tvRegisterhere);

        Registerlink.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent RegisterIntent = new Intent(LoginActivity.this, Register1.class);
                LoginActivity.this.startActivity(RegisterIntent);
            }

        });
        bLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick(View v)
            {
                if (etUsername.getText().toString().equals("Sravanik07")&&
                        etPassword.getText().toString().equals("qwerty123"))
                {
                    Toast.makeText(LoginActivity.this, "Username and Password Matches", Toast.LENGTH_SHORT).show();
                    Intent LoginIntent = new Intent(LoginActivity.this, MapsActivity.class);
                    LoginActivity.this.startActivity(LoginIntent);


                }
                else
                {
                    Toast.makeText(LoginActivity.this, "Username and Password does not Matches", Toast.LENGTH_SHORT).show();
                }
            }



        });    }
}
