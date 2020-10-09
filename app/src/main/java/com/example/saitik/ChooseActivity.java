package com.example.saitik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseActivity extends AppCompatActivity {

    private Button mDrivers, mCustomers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mDrivers = (Button) findViewById(R.id.driver);
        mCustomers = (Button) findViewById(R.id.customer);

        mDrivers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(getApplicationContext(), DriverLoginActivity.class);
                startActivity(intent);
                finish();
                return;

            }
        });
        mCustomers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(getApplicationContext(), CustomerLoginActivity.class);
                startActivity(intent);
                finish();
                return;

            }
        });


    }
}