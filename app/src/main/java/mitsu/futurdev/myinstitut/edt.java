package mitsu.futurdev.myinstitut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class edt extends AppCompatActivity {

    private ImageView homeC, quitterC, lessonC, aboutC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edt);
        this.quitterC = (ImageView) findViewById(R.id.quitterC);
        this.homeC = (ImageView) findViewById(R.id.homeC);
        this.lessonC = (ImageView) findViewById(R.id.lessonC);
        this.aboutC = (ImageView) findViewById(R.id.aboutC);

        quitterC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent QuitterC = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(QuitterC);
            }
        });

        homeC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent HomeC = new Intent(getApplicationContext(), Accueil.class);
                startActivity(HomeC);
            }
        });

        lessonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LessonC = new Intent(getApplicationContext(), Lesson.class);
                startActivity(LessonC);
            }
        });

        aboutC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AboutC = new Intent(getApplicationContext(), apropos.class);
                startActivity(AboutC);
            }
        });
    }
}