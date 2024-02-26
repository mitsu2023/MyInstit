package mitsu.futurdev.myinstitut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Lesson extends AppCompatActivity {

    private ImageView quitterL, homeL, calendrierL, aboutL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);
        this.quitterL = (ImageView) findViewById(R.id.quitterL);
        this.homeL = (ImageView) findViewById(R.id.homeL);
        this.calendrierL = (ImageView) findViewById(R.id.calendrierL);
        this.aboutL = (ImageView) findViewById(R.id.aboutL);

        quitterL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent QuitterL = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(QuitterL);
            }
        });

        homeL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent HomeL = new Intent(getApplicationContext(), Accueil.class);
                startActivity(HomeL);
            }
        });

        calendrierL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CalendL = new Intent(getApplicationContext(), edt.class);
                startActivity(CalendL);
            }
        });

        aboutL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AbouL = new Intent(getApplicationContext(), apropos.class);
                startActivity(AbouL);
            }
        });
    }
}