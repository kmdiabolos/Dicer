package com.example.dicer;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button connect,looking;
    private EditText Player,dice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        looking = (Button)findViewById(R.id.look_dice);
        connect = (Button)findViewById(R.id.connect);
        Player = (EditText)findViewById(R.id.player);
        dice = (EditText)findViewById(R.id.dice);

        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int user = Integer.parseInt(Player.getText().toString());
                int dicer = Integer.parseInt(dice.getText().toString());

                Intent intent = new Intent(MainActivity.this, Rolling_page.class);
                intent.putExtra("유저수",user);
                intent.putExtra("주사위수",dicer);
                startActivity(intent);
                Player.setText("");
                dice.setText("");

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
