package programaescolar.developsrd.com.programaescolar.TercerGradoSecundariaDias;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import programaescolar.developsrd.com.programaescolar.R;

public class TercerGradoMatematicasDias extends AppCompatActivity {
    TextView txtHoras,txtCompEspe,txtConceptual,txtProcedimental,txtActitudinal,txtCompetencia,txtSugerida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer_grado_matematicas_dias);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        txtHoras=(TextView)findViewById(R.id.txtHoras);
        txtCompEspe=(TextView)findViewById(R.id.txtCompEspe);
        txtConceptual=(TextView)findViewById(R.id.txtConceptual);
        txtProcedimental=(TextView)findViewById(R.id.txtProcedimental);
        txtActitudinal=(TextView)findViewById(R.id.txtActitudinal);
        txtCompetencia=(TextView)findViewById(R.id.txtCompetencia);
        txtSugerida=(TextView)findViewById(R.id.txtSugerida);


        Intent intent = this.getIntent();
        Bundle extra = intent.getExtras();

        int nuevaPosicion = extra.getInt("nuevaPosicion");
        int unidad = extra.getInt("unidad");
        // =================================================Unidad 1=========================//
        if (nuevaPosicion==1 && unidad==1)
        {
            this.setTitle(R.string.dia1);
            txtHoras.setText("1");
            txtCompEspe.setText("Enumera los saberes previos");
            txtConceptual.setText("saberes previos");
            txtProcedimental.setText("Preguntas sobre el tema a tratar");
            txtActitudinal.setText("Muestra entusiasmo y curiosidad");
            txtCompetencia.setText("Comunica");
            txtSugerida.setText("Lluvia de ideas");
        }
        else if (nuevaPosicion==2 && unidad==1)
        {   this.setTitle(R.string.dia2);
            txtHoras.setText("2");
            txtCompEspe.setText("Clasifica y Define polinomios por grado, número de términos y especiales");
            txtConceptual.setText("Concepto, clasificación de polinomios por grado, número de términos y especiales");
            txtProcedimental.setText("Identifica el grado, número de términos y Polinomios especiales");
            txtActitudinal.setText("Interés en la clasificación de polinomios");
            txtCompetencia.setText("Razona y argumenta. Comunica");
            txtSugerida.setText("RyA. Mapa conceptual sobre la clasificación de polinomios. C. Exposiciones sobre Clasificación de Polinomios");
        }
        else if (nuevaPosicion==3 && unidad==1)
        {   this.setTitle(R.string.dia3);
            txtHoras.setText("2");
            txtCompEspe.setText("Aplica la regla y propiedades para operar adición de Polinomios.  Construye y realiza operaciones con expresiones algebraicas a partir de modelos financieros y otros. ");
            txtConceptual.setText("Regla para operar con polinomios; adición");
            txtProcedimental.setText("Obtención de los resultados de las operaciones con polinomios: adición. Traducción de expresiones algebraicas, del lenguaje cotidiano al algebraico y viceversa.");
            txtActitudinal.setText("Rigor en los procesos seguidos al realizar operaciones. Disfrute al modelar expresiones algebraicas a partir de situaciones problemáticas dadas.");
            txtCompetencia.setText("Comunica. Conecta");
            txtSugerida.setText("C. Producción oral sobre la regla para operar con polinomios. Con. Estudio de Casos");
        }
        else if (nuevaPosicion==4 && unidad==1)
        {   this.setTitle(R.string.dia4);
            txtHoras.setText("2");
            txtCompEspe.setText("Explica y realiza cada paso para operar adición de Polinomios.  Construye y realiza operaciones con expresiones algebraicas a partir de modelos financieros y otros.");
            txtConceptual.setText("Regla para operar con polinomios; adición");
            txtProcedimental.setText("Obtención de los resultados de las operaciones con polinomios: adición. Traducción de expresiones algebraicas, del lenguaje cotidiano al algebraico y viceversa.");
            txtActitudinal.setText("Rigor en los procesos seguidos al realizar operaciones. Disfrute al modelar expresiones algebraicas a partir de situaciones problemáticas dadas.");
            txtCompetencia.setText("Comunica. Conecta");
            txtSugerida.setText("C. Producción oral sobre la regla para operar con polinomios. Con. Estudio de Casos");
        }
        else if (nuevaPosicion==5 && unidad==1)
        {   this.setTitle(R.string.dia5);
            txtHoras.setText("1");
            txtCompEspe.setText("Enumera los saberes previos ");
            txtConceptual.setText("saberes previos");
            txtProcedimental.setText("Preguntas sobre el tema a tratar");
            txtActitudinal.setText("Muestra entusiasmo y curiosidad");
            txtCompetencia.setText("Comunica");
            txtSugerida.setText("Lluvia de ideas");
        }
        else if (nuevaPosicion==6 && unidad==1)
        {   this.setTitle(R.string.dia6);
            txtHoras.setText("2");
            txtCompEspe.setText("Explica y realiza cada paso para  operar sustración de Polinomios.  Construye y realiza operaciones con expresiones algebraicas a partir de modelos financieros y otros.");
            txtConceptual.setText("Regla para operar con polinomios; sustración");
            txtProcedimental.setText("Obtención de los resultados de las operaciones con polinomios: sustración. Traducción de expresiones algebraicas, del lenguaje cotidiano al algebraico y viceversa.");
            txtActitudinal.setText("Rigor en los procesos seguidos al realizar operaciones. Disfrute al modelar expresiones algebraicas a partir de situaciones problemáticas dadas.");
            txtCompetencia.setText("Comunica. Conecta");
            txtSugerida.setText("C. Producción oral; regla para operar con polinomios. Con. Estudio de Casos.");
        }
        else if (nuevaPosicion==7 && unidad==1)
        {   this.setTitle(R.string.dia7);
            txtHoras.setText("2");
            txtCompEspe.setText("Explica y realiza cada paso para  operar sustración de Polinomios.  Construye y realiza operaciones con expresiones algebraicas a partir de modelos financieros y otros.");
            txtConceptual.setText("Regla para operar con polinomios; sustración");
            txtProcedimental.setText("Obtención de los resultados de las operaciones con polinomios: sustración. Traducción de expresiones algebraicas, del lenguaje cotidiano al algebraico y viceversa.");
            txtActitudinal.setText("Rigor en los procesos seguidos al realizar operaciones. Disfrute al modelar expresiones algebraicas a partir de situaciones problemáticas dadas.");
            txtCompetencia.setText("Comunica. Conecta");
            txtSugerida.setText("C. Producción oral; regla para operar con polinomios. Con. Estudio de Casos");
        }
        else if (nuevaPosicion==8 && unidad==1)
        {   this.setTitle(R.string.dia8);
            txtHoras.setText("2");
            txtCompEspe.setText("Aplica la regla y propiedades para operar multiplicación de Polinomios.  Construye y realiza operaciones con expresiones algebraicas a partir de modelos financieros y otros.");
            txtConceptual.setText("Regla para operar con polinomios; Multiplicación");
            txtProcedimental.setText("Obtención de los resultados de las operaciones con polinomios: multiplicación. Traducción de expresiones algebraicas, del lenguaje cotidiano al algebraico y viceversa.");
            txtActitudinal.setText("Rigor en los procesos seguidos al realizar operaciones. Disfrute al modelar expresiones algebraicas a partir de situaciones problemáticas dadas.");
            txtCompetencia.setText("Comunica. Conecta");
            txtSugerida.setText("C. Producción oral; regla para operar con polinomios. Con. Estudio de Casos.");
        }
        else if (nuevaPosicion==9 && unidad==1)
        {   this.setTitle(R.string.dia9);
            txtHoras.setText("1");
            txtCompEspe.setText("Enumera los saberes previos.");
            txtConceptual.setText("saberes previos.");
            txtProcedimental.setText("Preguntas sobre el tema a tratar.");
            txtActitudinal.setText("Muestra entusiasmo y curiosidad.");
            txtCompetencia.setText("Comunica.");
            txtSugerida.setText("Lluvia de ideas.");
        }
        else if (nuevaPosicion==10 && unidad==1)
        {   this.setTitle(R.string.dia10);
            txtHoras.setText("2");
            txtCompEspe.setText("Explica y realiza cada paso para operar multiplicación de Polinomios.  Construye y realiza operaciones con expresiones algebraicas a partir de modelos financieros y otros.");
            txtConceptual.setText("Regla para operar con polinomios; Multiplicación.");
            txtProcedimental.setText("Obtención de los resultados de las operaciones con polinomios: multiplicación. Traducción de expresiones algebraicas, del lenguaje cotidiano al algebraico y viceversa.");
            txtActitudinal.setText("Rigor en los procesos seguidos al realizar operaciones. Disfrute al modelar expresiones algebraicas a partir de situaciones problemáticas dadas.");
            txtCompetencia.setText("Comunica. Conecta.");
            txtSugerida.setText("C. Producción oral; regla para operar con polinomios. Con. Estudio de Casos.");
        }
        else if (nuevaPosicion==11 && unidad==1)
        {this.setTitle(R.string.dia11);
            txtHoras.setText("2");
            txtCompEspe.setText("Explica y realiza cada paso para  operar división de Polinomios.  Construye y realiza operaciones con expresiones algebraicas a partir de modelos financieros y otros.");
            txtConceptual.setText("Regla para operar con polinomios; División tradicional.");
            txtProcedimental.setText("Obtención de los resultados de las operaciones con polinomios: División. Traducción de expresiones algebráicas, del lenguaje cotidiano al algebráico y viceversa.");
            txtActitudinal.setText("Rigor en los procesos seguidos al realizar operaciones. Disfrute al modelar expresiones algebraicas a partir de situaciones problemáticas dadas.");
            txtCompetencia.setText("Comunica. Conecta.");
            txtSugerida.setText("C. Producción oral; regla para operar con polinomios. Con. Estudio de Casos.");
        }
        else if (nuevaPosicion==12 && unidad==1)
        {   this.setTitle(R.string.dia12);
            txtHoras.setText("2");
            txtCompEspe.setText("Explica y realiza cada paso para operar división de Polinomios.  Construye y realiza operaciones con expresiones algebraicas a partir de modelos financieros y otros.");
            txtConceptual.setText("Regla para operar con polinomios; División tradicional.");
            txtProcedimental.setText("Obtención de los resultados de las operaciones con polinomios: División. Traducción de expresiones algebráicas, del lenguaje cotidiano al algebráico y viceversa.");
            txtActitudinal.setText("Rigor en los procesos seguidos al realizar operaciones. Disfrute al modelar expresiones algebraicas a partir de situaciones problemáticas dadas.");
            txtCompetencia.setText("Comunica. Conecta.");
            txtSugerida.setText("C. Producción oral; regla para operar con polinomios. Con. Estudio de Casos.");
        }
        else if (nuevaPosicion==13 && unidad==1)
        {   this.setTitle(R.string.dia13);
            txtHoras.setText("1");
            txtCompEspe.setText("Evaluar saberes previos y/o evaluación sumativa.");
            txtConceptual.setText("Diagnóstica y/0 evaluación de saberes.");
            txtProcedimental.setText(" ");
            txtActitudinal.setText(" ");
            txtCompetencia.setText(" ");
            txtSugerida.setText(" ");
        }
        else if (nuevaPosicion==14 && unidad==1)
        {   this.setTitle(R.string.dia14);
            txtHoras.setText("2");
            txtCompEspe.setText("Explica y realiza cada paso para  operar división sintética de Polinomios.");
            txtConceptual.setText("Regla para operar con polinomios; División sintética.");
            txtProcedimental.setText("Obtención de los resultados de las operaciones con polinomios: División sintética.");
            txtActitudinal.setText("Rigor en los procesos seguidos al realizar operaciones.");
            txtCompetencia.setText("Comunica. Conecta.");
            txtSugerida.setText("C. Producción oral; regla para operar con polinomios.");
        }
        else if (nuevaPosicion==15 && unidad==1)
        {   this.setTitle(R.string.dia15);
            txtHoras.setText("2");
            txtCompEspe.setText("Aplica la regla y propiedades para operar división sintética de Polinomios.");
            txtConceptual.setText("Regla para operar con polinomios; División sintética.");
            txtProcedimental.setText("Obtención de los resultados de las operaciones con polinomios: División sintética");
            txtActitudinal.setText("Rigor en los procesos seguidos al realizar operaciones.");
            txtCompetencia.setText("Comunica y Modela y Representa.");
            txtSugerida.setText("C. Producción oral; regla para operar con polinomios. MyR. Resolución de problemas.");
        }
        else if (nuevaPosicion==16 && unidad==1)
        {   this.setTitle(R.string.dia16);
            txtHoras.setText("2");
            txtCompEspe.setText("Crea una expresión algebraica para un enunciado dado en lenguaje ordinario dando diferentes valores numéricos.");
            txtConceptual.setText("Valor numérico de un polinomio para valores dados de la variable.");
            txtProcedimental.setText("Determina el valor numérico de un polinomio para valores dados de la variable.");
            txtActitudinal.setText("Rigor en los procesos seguidos al determinarl el valor numérico.");
            txtCompetencia.setText("Modela y Representa. Conecta.");
            txtSugerida.setText("Con. Estudio de Casos.");
        }
        else if (nuevaPosicion==17 && unidad==1)
        {   this.setTitle(R.string.dia17);
            txtHoras.setText("1");
            txtCompEspe.setText("Enumera los saberes previos.");
            txtConceptual.setText("saberes previos.");
            txtProcedimental.setText("Preguntas sobre el tema a tratar.");
            txtActitudinal.setText("Muestra entusiasmo y curiosidad.");
            txtCompetencia.setText("Comunica.");
            txtSugerida.setText("Lluvia de ideas.");
        }
        //=================================================Fin Unidad 1=========================//
        //=================================================Unidad 2=========================//
        else   if (nuevaPosicion==1 && unidad==2)
        {   this.setTitle(R.string.dia29);
            txtHoras.setText("1");
            txtCompEspe.setText("Enumera los saberes previos.");
            txtConceptual.setText("saberes previos.");
            txtProcedimental.setText("Preguntas sobre el tema a tratar.");
            txtActitudinal.setText("Muestra entusiasmo y curiosidad.");
            txtCompetencia.setText("Comunica.");
            txtSugerida.setText("Lluvia de ideas.");
        }
        else   if (nuevaPosicion==2 && unidad==2)
        { this.setTitle(R.string.dia30);
            txtHoras.setText("2");
            txtCompEspe.setText("Explica y realiza cada paso para  operar con diversos casos de factorización; Diferencia de Cubo y Suma de Cubo.");
            txtConceptual.setText("Regla para operar diferencia de cubo y Suma de cubo.");
            txtProcedimental.setText("Obtención de los resultados de los diversos casos de factorización; Diferencia de cubo y suma de cubo.");
            txtActitudinal.setText("Interés en la resolución de polinomios utilizando caso de factorización.");
            txtCompetencia.setText("Comunica. Conecta.");
            txtSugerida.setText("C. Producción oral sobre la regla para operar con polinomios. Con. Resolución de problemas.");
        }
        else   if (nuevaPosicion==3 && unidad==2)
        {   this.setTitle(R.string.dia31);
            txtHoras.setText("2");
            txtCompEspe.setText("Explica y realiza cada paso para  operar con diversos casos de factorización;Trinomio Cuadrado perfecto y de la forma X²+BX+C.");
            txtConceptual.setText("Regla para operar Trinomio Cuadrado perfecto y de la forma X²+BX+C.");
            txtProcedimental.setText("Obtención de los resultados de los diversos casos de factorización; Trinomio Cuadrado perfecto y de la forma X²+BX+C.");
            txtActitudinal.setText("Interés en la resolución de polinomios utilizando caso de factorización.");
            txtCompetencia.setText("Comunica. Conecta.");
            txtSugerida.setText("C. Producción oral sobre la regla para operar con polinomios. Con. Resolución de problemas.");
        }
        else   if (nuevaPosicion==4 && unidad==2)
        {this.setTitle(R.string.dia32);
            txtHoras.setText("2");
            txtCompEspe.setText("Explica y realiza cada paso para operar con diversos casos de factorización;Trinomio de la forma AX²+BX+C");
            txtConceptual.setText("Regla para operar Trinomio de la forma AX²+BX+C.");
            txtProcedimental.setText("Obtención de los resultados de los diversos casos de factorización; Trinomio de la forma AX²+BX+C.");
            txtActitudinal.setText("Interés en la resolución de polinomios utilizando caso de factorización.");
            txtCompetencia.setText("Comunica. Conecta.");
            txtSugerida.setText("C. Producción oral sobre la regla para operar con polinomios con Resolución de problemas.");
        }
        else   if (nuevaPosicion==5 && unidad==2)
        {this.setTitle(R.string.dia33);
            txtHoras.setText("1");
            txtCompEspe.setText("Enumera los saberes previos.");
            txtConceptual.setText("saberes previos.");
            txtProcedimental.setText("Preguntas sobre el tema a tratar.");
            txtActitudinal.setText("Muestra entusiasmo y curiosidad.");
            txtCompetencia.setText("Comunica.");
            txtSugerida.setText("Lluvia de ideas.");
        }
        //=================================================Fin Unidad 2=========================//
        //=================================================Unidad 3=========================//
        else   if (nuevaPosicion==1 && unidad==3)
        {this.setTitle(R.string.dia45);
            txtHoras.setText("1");
            txtCompEspe.setText("Enumera los saberes previos.");
            txtConceptual.setText("saberes previos.");
            txtProcedimental.setText("Preguntas sobre el tema a tratar.");
            txtActitudinal.setText("Muestra entusiasmo y curiosidad.");
            txtCompetencia.setText("Comunica.");
            txtSugerida.setText("Lluvia de ideas.");
        }
        else   if (nuevaPosicion==2 && unidad==3)
        {   this.setTitle(R.string.dia46);
            txtHoras.setText("2");
            txtCompEspe.setText("Discrimina entre identidad y ecuaciones.");
            txtConceptual.setText("Ecuaciones e identidades.");
            txtProcedimental.setText("Evaluación de diferencias entre cuaciones e identidades.");
            txtActitudinal.setText("Demuestra interés.");
            txtCompetencia.setText("Razona y argumenta.");
            txtSugerida.setText("RyA. Debate.");
        }
        else   if (nuevaPosicion==3 && unidad==3)
        {   this.setTitle(R.string.dia47);
            txtHoras.setText("2");
            txtCompEspe.setText("Presenta cado paso en la resolución de ecuaciones.");
            txtConceptual.setText("Ecuaciones de primer grado con números enteros.");
            txtProcedimental.setText("Resolución de ecuaciones de primer grado con una incógnita y con coeficientes racionales e irracionales.");
            txtActitudinal.setText("Interés en la resolución ecuaciones lineales.");
            txtCompetencia.setText("Comunica.");
            txtSugerida.setText("C. Mesa redonda.");
        }
        else   if (nuevaPosicion==4 && unidad==3)
        {   this.setTitle(R.string.dia48);
            txtHoras.setText("2");
            txtCompEspe.setText("Elabora modelos que den lugar a ecuaciones e inecuaciones lineales a partir de situaciones dadas.");
            txtConceptual.setText("Ecuaciones de primer grado con números enteros.");
            txtProcedimental.setText("Traducción de expresiones algebraicas, del lenguaje cotidiano al algebraico y viceversa.");
            txtActitudinal.setText("Interés en la relación de ecuaciones lineales con el entorno.");
            txtCompetencia.setText("Conecta.");
            txtSugerida.setText("Con. Estudio de Casos\n");
        }
        else   if (nuevaPosicion==5 && unidad==3)
        {   this.setTitle(R.string.dia49);
            txtHoras.setText("1");
            txtCompEspe.setText("Enumera los saberes previos.");
            txtConceptual.setText("saberes previos.");
            txtProcedimental.setText("Preguntas sobre el tema a tratar.");
            txtActitudinal.setText("Muestra entusiasmo y curiosidad.");
            txtCompetencia.setText("Comunica.");
            txtSugerida.setText("Lluvia de ideas.");
        }
        //=================================================Fin Unidad 3=========================//

    }

}
