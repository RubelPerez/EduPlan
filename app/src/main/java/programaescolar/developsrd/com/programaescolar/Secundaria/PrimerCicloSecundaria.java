package programaescolar.developsrd.com.programaescolar.Secundaria;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import programaescolar.developsrd.com.programaescolar.MainActivity;
import programaescolar.developsrd.com.programaescolar.MateriasSecundaria.PrimerGradoSecundaria;
import programaescolar.developsrd.com.programaescolar.MateriasSecundaria.SegundoGradoSecundaria;
import programaescolar.developsrd.com.programaescolar.MateriasSecundaria.TercerGradoSecundaria;
import programaescolar.developsrd.com.programaescolar.Primaria.PrimerCicloPrimaria;
import programaescolar.developsrd.com.programaescolar.PrimariaActivity;
import programaescolar.developsrd.com.programaescolar.R;
import programaescolar.developsrd.com.programaescolar.SecundariaActivity;

public class PrimerCicloSecundaria extends AppCompatActivity {
public  Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primer_ciclo_secundaria);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atras = new Intent(PrimerCicloSecundaria.this,MainActivity.class);
                atras.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // <- Aquí :)
                startActivity(atras);
                finish();
            }
        });
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent i1 = new Intent(PrimerCicloSecundaria.this,PrimerGradoSecundaria.class);
            startActivity(i1);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(PrimerCicloSecundaria.this,SegundoGradoSecundaria.class);
                startActivity(i2);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(PrimerCicloSecundaria.this,TercerGradoSecundaria.class);
                startActivity(i3);

            }
        });
    }

}
