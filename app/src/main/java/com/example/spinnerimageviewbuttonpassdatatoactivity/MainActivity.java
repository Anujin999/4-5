package com.example.spinnerimageviewbuttonpassdatatoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private Spinner s1;
    private ImageView iv1;
    private String[] user = {"User 1", "User 2",
            "User 3", "User 4", "User 5",
            "User 6","User 7", };
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.b1);
        s1 = (Spinner) findViewById(R.id.s1);
        adapter = new ArrayAdapter(
                this, android.R.layout.simple_spinner_item, user
        );
        s1.setAdapter(adapter);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = s1.getSelectedItemPosition();
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("pic", pos);
                startActivity(i);
            }
        });
    }
}