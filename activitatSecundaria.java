package com.example.sr_pedro.exemplecanvipantalla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class activitatSecundaria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitat_secundaria);
        TextView nombre=(TextView)findViewById(R.id.nombre);
        TextView apellido=(TextView)findViewById(R.id.Apellido );
        TextView SEXes=(TextView)findViewById(R.id.SEXO);
        TextView Resposta=(TextView)findViewById(R.id.Valor);

        Bundle b = getIntent().getExtras();
        nombre.setText(b.getString("Name"));
        apellido.setText(b.getString("Apellido"));
        SEXes.setText(b.getString("Femenino/Masculino"));
        if(b.getBoolean("CheckBox")== true ){
            Resposta.setText("SI QUE PERMET") ;
        }else
        Resposta.setText("NO PERMET") ;
    }

}
