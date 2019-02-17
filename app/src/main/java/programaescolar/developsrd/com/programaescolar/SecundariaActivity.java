package programaescolar.developsrd.com.programaescolar;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import programaescolar.developsrd.com.programaescolar.Primaria.PrimerCicloPrimaria;
import programaescolar.developsrd.com.programaescolar.Primaria.SegundoCicloPrimaria;
import programaescolar.developsrd.com.programaescolar.Secundaria.PrimerCicloSecundaria;
import programaescolar.developsrd.com.programaescolar.Secundaria.SegundoCicloSecundaria;

public class SecundariaActivity extends AppCompatActivity {
    public  Toolbar toolbar;
    public Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
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
                Intent atras = new Intent(SecundariaActivity.this,MainActivity.class);
                atras.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // <- Aquí :)
                startActivity(atras);
                finish();
            }
        });

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecundariaActivity.this,PrimerCicloSecundaria.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecundariaActivity.this,SegundoCicloSecundaria.class);
                startActivity(intent);
            }
        });

    }

}
