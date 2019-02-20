package programaescolar.developsrd.com.programaescolar.TercerGradoSecundariaDias;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import programaescolar.developsrd.com.programaescolar.MateriasSecundariasTemplate.TercerGradoSecundariaTemplate;
import programaescolar.developsrd.com.programaescolar.R;

public class TercerGradoSecundariaDiasTemplate extends AppCompatActivity {
    private ListView lvDias;
    public int unidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer_grado_secundaria_dias_template);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        lvDias = (ListView) findViewById(R.id.lvDias);

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

        int nuevaPosicion = extra.getInt("nuevaPosicion");
        if (nuevaPosicion == 1) {
            String[] dias = {"Dia 1", "Dia 2", "Dia 3", "Dia 4", "Dia 5", "Dia 6", "Dia 7", "Dia 8", "Dia 9", "Dia 10", "Dia 11", "Dia 12", "Dia 13", "Dia 14", "Dia 15", "Dia 16", "Dia 17"};
            ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dias);
            lvDias.setAdapter(adaptador);
            lvDias.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {
                    // TODO Auto-generated method stub
                    int nuevaPosicion = position + 1;
                    unidad = 1;
                    Intent intent = new Intent(TercerGradoSecundariaDiasTemplate.this, TercerGradoMatematicasDias.class);
                    intent.putExtra("nuevaPosicion", nuevaPosicion);
                    intent.putExtra("unidad", unidad);
                    startActivity(intent);
                    // Toast.makeText(getApplicationContext(), "Ha pulsado el item " + nuevaPosicion, Toast.LENGTH_SHORT).show();
                }

            });

        } else if (nuevaPosicion == 2) {
            String[] dias = {"Dia 29", "Dia 30", "Dia 31", "Dia 32", "Dia 33"};
            ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dias);
            lvDias.setAdapter(adaptador);
            lvDias.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {
                    // TODO Auto-generated method stub
                    int nuevaPosicion = position + 1;
                    unidad = 2;
                    Intent intent = new Intent(TercerGradoSecundariaDiasTemplate.this, TercerGradoMatematicasDias.class);
                    intent.putExtra("nuevaPosicion", nuevaPosicion);
                    intent.putExtra("unidad", unidad);
                    startActivity(intent);
                    // Toast.makeText(getApplicationContext(), "Ha pulsado el item " + nuevaPosicion, Toast.LENGTH_SHORT).show();
                }

            });
        } else if (nuevaPosicion == 3) {
            String[] dias = {"Dia 45", "Dia 46", "Dia 47", "Dia 48", "Dia 49"};
            ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dias);
            lvDias.setAdapter(adaptador);
            lvDias.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {
                    // TODO Auto-generated method stub
                    int nuevaPosicion = position + 1;
                    unidad = 3;
                    Intent intent = new Intent(TercerGradoSecundariaDiasTemplate.this, TercerGradoMatematicasDias.class);
                    intent.putExtra("nuevaPosicion", nuevaPosicion);
                    intent.putExtra("unidad", unidad);
                    startActivity(intent);
                    // Toast.makeText(getApplicationContext(), "Ha pulsado el item " + nuevaPosicion, Toast.LENGTH_SHORT).show();
                }

            });
        }

    }
}