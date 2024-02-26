package mitsu.futurdev.myinstitut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Inscription extends AppCompatActivity {

    private EditText utilisateur1, motdepasse1, confirme;
    private Button btnSignup;
    private TextView Signin;
    DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        this.utilisateur1 = (EditText) findViewById(R.id.utilisateur1);
        this.motdepasse1 = (EditText) findViewById(R.id.motdepasse1);
        this.confirme = (EditText) findViewById(R.id.confirme);
        this.btnSignup = (Button) findViewById(R.id.btnSignup);
        this.Signin = (TextView) findViewById(R.id.Signin);
        db = new DBHelper(this);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nom = utilisateur1.getText().toString();
                String pass = motdepasse1.getText().toString();
                String repass = confirme.getText().toString();

                if (nom.equals("")||pass.equals("")||repass.equals("")){
                    Toast.makeText(Inscription.this, "Veuillez remplir les champs s'il vous plait!", Toast.LENGTH_SHORT).show();
                }else{
                    if(pass.equals(repass)){
                        Boolean checkusername = db.checkusername(nom);
                        if (checkusername==false){
                            Boolean insert = db.insertData(nom, pass);
                            if (insert==true){
                                Toast.makeText(Inscription.this, "Enregistrement reussie!", Toast.LENGTH_SHORT).show();
                                Intent pageconnexion = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(pageconnexion);
                            }else{
                                Toast.makeText(Inscription.this, "Echec de l'enregistrement", Toast.LENGTH_SHORT).show();
                            }
                        }else{
                            Toast.makeText(Inscription.this, "Utilisateur existant! connectez-vous s'il vous plait", Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(Inscription.this, "Mot de passe non conforme!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        Signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pageconnexion = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(pageconnexion);
                finish();
            }
        });
    }
}