package com.example.spinnerimageviewbuttonpassdatatoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView tv2;
    private ImageView iv2;
    private int[] img = {R.drawable.p1, R.drawable.p2, R.drawable.p3,
            R.drawable.p4, R.drawable.p5, R.drawable.p6, R.drawable.p7, };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Bundle bundle = getIntent().getExtras();
        int pos = bundle.getInt("pic");
        tv2 = (TextView) findViewById(R.id.tv2);
        iv2 = (ImageView) findViewById(R.id.iv2);

        iv2.setImageResource(img [pos]);
    }
}