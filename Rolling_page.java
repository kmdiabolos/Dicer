package com.example.dicer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by 이규민 on 2017-06-07.
 */

public class Rolling_page extends AppCompatActivity {

    private ImageView dice1,dice2,dice3,dice4;
    int player,dicer;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);
        Intent intent = getIntent();
        player = intent.getExtras().getInt("유저수");
        dicer = intent.getExtras().getInt("주사위수");

        dice1 = (ImageView)findViewById(R.id.dice1);
        dice2 = (ImageView)findViewById(R.id.dice2);
        dice3 = (ImageView)findViewById(R.id.dice3);
        dice4 = (ImageView)findViewById(R.id.dice4);




        if(dicer==4){

        }
    }
}
