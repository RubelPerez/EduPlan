package programaescolar.developsrd.com.programaescolar.MateriasSecundariasTemplate;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import programaescolar.developsrd.com.programaescolar.R;

public class PrimerGradoSecundariaTemplate extends AppCompatActivity {
public TextView txtMateria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primer_grado_secundaria_template);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        txtMateria = (TextView)findViewById(R.id.txtMateria);
        Intent intent = this.getIntent();
        Bundle extra = intent.getExtras();

        int btnID = extra.getInt("btnID");
        if (btnID==1){
            txtMateria.setText("Lengua Espanola");
        }
        else if (btnID==4){
            txtMateria.setText("Matematica");
        }
    }

}
