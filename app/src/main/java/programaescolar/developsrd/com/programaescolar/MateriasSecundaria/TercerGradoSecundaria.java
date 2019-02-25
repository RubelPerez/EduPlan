package programaescolar.developsrd.com.programaescolar.MateriasSecundaria;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import programaescolar.developsrd.com.programaescolar.MainActivity;
import programaescolar.developsrd.com.programaescolar.MateriasSecundariasTemplate.PrimerGradoSecundariaTemplate;
import programaescolar.developsrd.com.programaescolar.MateriasSecundariasTemplate.TercerGradoSecundariaTemplate;
import programaescolar.developsrd.com.programaescolar.PrimariaActivity;
import programaescolar.developsrd.com.programaescolar.R;
import programaescolar.developsrd.com.programaescolar.Secundaria.PrimerCicloSecundaria;

public class TercerGradoSecundaria extends AppCompatActivity {
    public EditText btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    public int btnID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer_grado_secundaria);
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

        btn1= (EditText)findViewById(R.id.btn1);
        btn2= (EditText)findViewById(R.id.btn2);
        btn3= (EditText)findViewById(R.id.btn3);
        btn4= (EditText)findViewById(R.id.btn4);
        btn5= (EditText)findViewById(R.id.btn5);
        btn6= (EditText)findViewById(R.id.btn6);
        btn7= (EditText)findViewById(R.id.btn7);
        btn8= (EditText)findViewById(R.id.btn8);
        btn9= (EditText)findViewById(R.id.btn9);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnID=1;
                Intent intent = new Intent(TercerGradoSecundaria.this,TercerGradoSecundariaTemplate.class);
                intent.putExtra("btnID", btnID);
                startActivity(intent);

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnID=4;
                Intent intent = new Intent(TercerGradoSecundaria.this,TercerGradoSecundariaTemplate.class);
                intent.putExtra("btnID", btnID);
                startActivity(intent);

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnID=9;
                Intent intent = new Intent(TercerGradoSecundaria.this,TercerGradoSecundariaTemplate.class);
                intent.putExtra("btnID", btnID);
                startActivity(intent);

            }
        });
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent atras = new Intent(TercerGradoSecundaria.this,PrimerCicloSecundaria.class);
                atras.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // <- Aquí :)
                startActivity(atras);
                finish();
            }
        });
    }

}
