package com.ron.animation;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv1, tv2, tv3, tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv1:
                tv1.setBackgroundColor(Color.parseColor("#FF0000"));
                tv2.setBackgroundColor(Color.parseColor("#FF0000"));
                break;
            case R.id.tv2:
                tv1.setBackgroundColor(Color.parseColor("#FFFFFF"));
                tv2.setBackgroundColor(Color.parseColor("#FFFFFF"));
                break;
        }
    }
}
