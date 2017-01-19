package com.freniche.adventure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.freniche.adventure.model.Monster;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FightMonsterActivity extends AppCompatActivity {

    @BindView(R.id.activity_fight_monster_moster_fight)
    Button fightButton;

    @BindView(R.id.activity_fight_monster_moster_name)
    TextView monsterNameText;

    @BindView(R.id.activity_fight_monster_monster_description)
    TextView monsterDescriptionText;

    @BindView(R.id.activity_fight_monster_moster_life)
    TextView monsterLifeMeterText;

    @BindView(R.id.activity_fight_monster_monster_player_life)
    TextView playerLifeMeterText;

    @BindView(R.id.activity_fight_monster_image)
    ImageView monsterImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight_monster);
        ButterKnife.bind(this);

        Intent i = getIntent();
        Monster monster = (Monster) i.getSerializableExtra("monster");

        monsterNameText.setText(monster.getName());
        monsterDescriptionText.setText(monster.getDescription());
        Picasso.with(this).load(monster.getImageUrl()).into(monsterImage);
    }
}
