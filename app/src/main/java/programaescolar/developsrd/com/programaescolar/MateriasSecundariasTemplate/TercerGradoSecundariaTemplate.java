package programaescolar.developsrd.com.programaescolar.MateriasSecundariasTemplate;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import programaescolar.developsrd.com.programaescolar.MateriasSecundaria.PrimerGradoSecundaria;
import programaescolar.developsrd.com.programaescolar.R;
import programaescolar.developsrd.com.programaescolar.TercerGradoSecundariaDias.TercerGradoSecundariaDiasTemplate;

public class TercerGradoSecundariaTemplate extends AppCompatActivity {
    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer_grado_secundaria_template);
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
        Intent intent = this.getIntent();
        Bundle extra = intent.getExtras();

        int btnID = extra.getInt("btnID");
        list = (ListView) findViewById(R.id.listViewClases);

        if (btnID == 4) {
            String[] dias = {"Unidad 1 - 29 Dias","Unidad 2 - 20 Dias","Unidad 3 - 25 Dias","Unidad 4 - 27 Dias","Unidad 5 - 25 Dias","Unidad 6 - 25 Dias",};
            ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dias);
            list.setAdapter(adaptador);
            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {
                    // TODO Auto-generated method stub
                    int nuevaPosicion = position + 1;
                    Intent intent = new Intent(TercerGradoSecundariaTemplate.this, TercerGradoSecundariaDiasTemplate.class);
                    intent.putExtra("nuevaPosicion", nuevaPosicion);
                    startActivity(intent);
                    // Toast.makeText(getApplicationContext(), "Ha pulsado el item " + nuevaPosicion, Toast.LENGTH_SHORT).show();

                }

            });
        }

    }
}