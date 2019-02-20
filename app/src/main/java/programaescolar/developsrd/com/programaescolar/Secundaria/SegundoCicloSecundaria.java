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
import programaescolar.developsrd.com.programaescolar.Primaria.PrimerCicloPrimaria;
import programaescolar.developsrd.com.programaescolar.PrimariaActivity;
import programaescolar.developsrd.com.programaescolar.R;
import programaescolar.developsrd.com.programaescolar.SecundariaActivity;

public class SegundoCicloSecundaria extends AppCompatActivity {
public Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo_ciclo_secundaria);
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
                Intent atras = new Intent(SegundoCicloSecundaria.this,MainActivity.class);
                atras.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // <- Aquí :)
                startActivity(atras);
                finish();
            }
        });

    }

}
