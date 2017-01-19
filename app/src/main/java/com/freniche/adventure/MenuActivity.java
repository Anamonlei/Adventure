package com.freniche.adventure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.freniche.adventure.util.JetPlayerUtil;

import static com.freniche.adventure.R.raw.jet;

public class MenuActivity extends AppCompatActivity {

    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().requestFeature(getWindow().FEATURE_ACTION_BAR);   //ESTO SIRVE PARA OCULTAR LA BARRA DE WINDOW EN LA APP


        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();                           //ESTO SIRVE PARA OCULTAR LA BARRA DE WINDOW EN LA APP
        setContentView(R.layout.activity_menu);

        startButton = (Button) findViewById(R.id.activity_menu_button_start);
        startButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                Intent i = new Intent (MenuActivity.this, MainActivity.class);
                startActivity(i);
            }


        });

        JetPlayerUtil.play(this, jet);


    }


}
