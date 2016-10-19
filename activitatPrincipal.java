package com.example.sr_pedro.exemplecanvipantalla;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class activitatPrincipal extends AppCompatActivity {
  //      declara
    EditText Valor;
    EditText Valor1;
    EditText Valor2;
    CheckBox Valor3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitat_principal);
        //relaciona el objeto o botton con el layout.
        Button bcanvi = (Button)findViewById(R.id.button);
        Valor=(EditText) findViewById(R.id.txtNom);
        Valor1=(EditText) findViewById(R.id.txtApellido );
        Valor2=(EditText) findViewById(R.id.ponsexo );
        Valor3=(CheckBox)  findViewById(R.id.checkBox );

        bcanvi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //creamos el armario donde se guarda
                Bundle b = new Bundle();
                b.putString("Name",Valor.getText().toString());
                b.putString("Apellido",Valor1.getText().toString());
                b.putString("Femenino/Masculino",Valor2.getText().toString());
                b.putBoolean("CheckBox",Valor3.isChecked()) ;
                //instenciem l'intent y li diem quina es la principal y a on va destinada
                Intent intencio = new Intent(activitatPrincipal.this,activitatSecundaria.class);//origen/desti
                //omplim la intencio.
                intencio.putExtras(b);
                //diem que comenci l'activitat amb la intencio
                startActivity(intencio);

            }
        });
    }
}
