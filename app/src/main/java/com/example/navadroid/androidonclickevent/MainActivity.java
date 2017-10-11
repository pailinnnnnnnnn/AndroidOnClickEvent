package com.example.navadroid.androidonclickevent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnNextMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindView();
        initInstance();
    }

    private void initInstance(){
        btnNextMain.setOnClickListener(this);
    }

    private void bindView(){
        btnNextMain = (Button)findViewById(R.id.btn_next_main);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_next_main:
//                Log.d("pailin", "onClick: eiei");
                Intent intent = new Intent(MainActivity.this,Option0Activity.class);
                startActivity(intent);
                break;
        }
    }
}
