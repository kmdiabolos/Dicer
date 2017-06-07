package com.example.dicer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by 이규민 on 2017-06-07.
 */

public class Rolling_page extends AppCompatActivity {

    private ImageView dice1,dice2,dice3,dice4;
    private Button exit,roll,add,change;
    int player,dicer;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);
        Intent intent = getIntent();
        player = intent.getExtras().getInt("유저수");
        dicer = intent.getExtras().getInt("주사위수");

        add = (Button)findViewById(R.id.dice_add);
        change = (Button)findViewById(R.id.dice_change);
        roll = (Button)findViewById(R.id.dice_roll);
        exit = (Button)findViewById(R.id.exit);
        dice1 = (ImageView)findViewById(R.id.dice1);
        dice2 = (ImageView)findViewById(R.id.dice2);
        dice3 = (ImageView)findViewById(R.id.dice3);
        dice4 = (ImageView)findViewById(R.id.dice4);

        if(dicer==3){
            dice4.setVisibility(View.INVISIBLE);
        }
        else if(dicer==2){
            dice4.setVisibility(View.INVISIBLE);
            dice3.setVisibility(View.INVISIBLE);
        }
        else if(dicer==1){
            dice4.setVisibility(View.INVISIBLE);
            dice3.setVisibility(View.INVISIBLE);
            dice2.setVisibility(View.INVISIBLE);
        }

        /*---------------------------------------------------------------------*/

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
         /*---------------------------------------------------------------------*/

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dicer==4){
                    Toast.makeText(getBaseContext(), "더 이상 주사위를 추가 할 수 없습니다.", Toast.LENGTH_LONG).show();
                }
                else if(dicer==3){
                    dice4.setVisibility(View.VISIBLE);
                    dicer++;
                }
                else if(dicer==2){
                    dice3.setVisibility(View.VISIBLE);
                    dicer++;
                }
                else if(dicer==1){
                    dice2.setVisibility(View.VISIBLE);
                    dicer++;
                }
            }
        });
         /*---------------------------------------------------------------------*/


    }
}
