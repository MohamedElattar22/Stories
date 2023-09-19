package com.example.stories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_login);
        Button openbtn = (Button) findViewById(R.id.regBtn);
        openbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext() , MainActivity.class);
                 startActivity(i);
            }
        });
//        openbtn.setOnClickListener(view -> {
//            Intent i = new Intent(this, MainActivity.class);
//            startActivity(i);
//        });




    }
}