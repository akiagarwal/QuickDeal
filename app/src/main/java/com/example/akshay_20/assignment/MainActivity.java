package com.example.akshay_20.assignment;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView but1, but2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        but1= (ImageView)findViewById(R.id.but1);
        but2= (ImageView)findViewById(R.id.but2);

        but1.setOnClickListener(this);
        but2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.but1:
                startActivity(new Intent(this, Buyer.class));
                break;
            case R.id.but2:
                startActivity(new Intent(this, Seller.class));
                break;


        }
    }
}
