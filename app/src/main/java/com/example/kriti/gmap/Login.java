package com.example.kriti.gmap;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        TextView signUpLink = (TextView)findViewById(R.id.link_signup);
        signUpLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), SignUp.class);
                startActivity(intent);
            }
        });

        Button loginButton = (Button) findViewById(R.id.btn_login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
//                    ProgressDialog pd = new ProgressDialog(Login.this);
//                    pd.setMessage("Authenticating");
//                    pd.show();
                    //Thread.sleep(3000);
                    Intent intent = new Intent(getBaseContext(), SubscribedUsers.class);
                    startActivity(intent);
                }catch (Exception e) {
                    Log.v("Login", e.toString());
                }
            }
        });
    }
}
