package mitsu.futurdev.myinstitut;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText utilisateur, motdepasse;
    private Button btnSignin;
    private TextView Signup;
    DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.utilisateur = (EditText) findViewById(R.id.utilisateur);
        this.motdepasse = (EditText) findViewById(R.id.motdepasse);
        this.btnSignin = (Button) findViewById(R.id.btnSignin);
        this.Signup = (TextView) findViewById(R.id.Signup);
        db = new DBHelper(this);

        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String membre = utilisateur.getText().toString();
                String mdp = motdepasse.getText().toString();

                if (membre.equals("")||mdp.equals("")) {
                    Toast.makeText(MainActivity.this, "Veuillez remplir les champs s'il vous plait!", Toast.LENGTH_SHORT).show();
                }else{
                    Boolean checkpassword = db.checkpassword(membre, mdp);
                    if (checkpassword==true){
                        Toast.makeText(MainActivity.this, "Connexion etablie!", Toast.LENGTH_SHORT).show();
                        Intent pageaccueil = new Intent(getApplicationContext(), Accueil.class);
                        startActivity(pageaccueil);
                    }else{
                        Toast.makeText(MainActivity.this, "Mot de passe non valide!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pageinscription = new Intent(getApplicationContext(), Inscription.class);
                startActivity(pageinscription);
                finish();
            }
        });
    }
}