package com.example.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle","onCreate method override");
        tv=(TextView)findViewById(R.id.tv);
        tv.append("onCreate method override\n");
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle","onStart method override");
        tv=(TextView)findViewById(R.id.tv);
        tv.append("onStart method override\n");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle","onResume method override");
        tv=(TextView)findViewById(R.id.tv);
        tv.append("onResume method override\n");


    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle","onPause method override");
        tv=(TextView)findViewById(R.id.tv);
        tv.append("onPause method override\n");


    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle","onStop method override");
        tv=(TextView)findViewById(R.id.tv);
        tv.append("onStop method override\n");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle","onRestart method override");
        tv=(TextView)findViewById(R.id.tv);
        tv.append("onRestart method override\n");

    }
}