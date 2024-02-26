package mitsu.futurdev.myinstitut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class apropos extends AppCompatActivity {

    private ImageView quitterA, homeA, calendrierA, lessonA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apropos);
        this.quitterA = (ImageView) findViewById(R.id.quitterA);
        this.homeA = (ImageView) findViewById(R.id.homeA);
        this.calendrierA = (ImageView) findViewById(R.id.calendrierA);
        this.lessonA = (ImageView) findViewById(R.id.lessonA);

        quitterA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent QuitterA = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(QuitterA);
            }
        });

        homeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent HomeA = new Intent(getApplicationContext(), Accueil.class);
                startActivity(HomeA);
            }
        });

        calendrierA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CalendA = new Intent(getApplicationContext(), edt.class);
                startActivity(CalendA);
            }
        });

        lessonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LessonA = new Intent(getApplicationContext(), Lesson.class);
                startActivity(LessonA);
            }
        });
    }
}