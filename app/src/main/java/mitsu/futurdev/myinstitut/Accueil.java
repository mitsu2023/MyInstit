package mitsu.futurdev.myinstitut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Accueil extends AppCompatActivity {

    private ImageView quitter, calendrier, lesson, about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
        this.quitter = (ImageView) findViewById(R.id.quitter);
        this.calendrier = (ImageView) findViewById(R.id.calendrier);
        this.lesson = (ImageView) findViewById(R.id.lesson);
        this.about = (ImageView) findViewById(R.id.about);

        quitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quitte = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(quitte);
            }
        });

        calendrier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calend = new Intent(getApplicationContext(), edt.class);
                startActivity(calend);
            }
        });

        lesson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent less = new Intent(getApplicationContext(), Lesson.class);
                startActivity(less);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent app = new Intent(getApplicationContext(), apropos.class);
                startActivity(app);
            }
        });
    }
}