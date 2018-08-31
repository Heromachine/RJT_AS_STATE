package com.example.herotruth.state;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edEdtiText;
    Button btnSend;
    int score;


   @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        edEdtiText = findViewById(R.id.editText);
        btnSend = findViewById(R.id.button);
        score = 0;

       btnSend.setOnClickListener(new View.OnClickListener() {

           @Override
           public void onClick(View v) {
               score++;
               Toast.makeText(MainActivity.this, "score"+score, Toast.LENGTH_SHORT).show();
           }
       });
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("score", score);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        score = savedInstanceState.getInt("score");
    }
}
