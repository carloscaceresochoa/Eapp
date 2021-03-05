package com.usb.eapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
/**defino los atributos de los tipos componente**/

    private EditText doctext;
    private EditText nomtext;
    private EditText apeltext;
    private EditText dirtext;
    private TextView saltext;
    private RadioButton radiom;
    private RadioButton radiof;
    private Switch pregsw1;
    private Switch pregsw2;
    private Switch pregsw3;


//metodo se ejecuta cuando se lanza la aplicacion
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // asocia el atributo tipo de componente con el componente layout
        doctext=findViewById(R.id.doctext);
        nomtext=findViewById(R.id.nomtext);
        apeltext=findViewById(R.id.apeltext);
        dirtext=findViewById(R.id.dirtext);
        saltext=findViewById(R.id.saltext);
        radiom=findViewById(R.id.radiom);
        radiof=findViewById(R.id.radiof);
        pregsw1=findViewById(R.id.pregsw1);
        pregsw2=findViewById(R.id.pregsw2);
        pregsw3=findViewById(R.id.pregsw3);


    }

    /**
     * metodo mostrar sirve evento para realizar la logica de captura de datos
     * parametro view sirve para que lo reconoza el boton
     * @param view
     */
    public void mostrar(View view){

        String nombre,apellido,dir,doc,sal,sexo,preg1,preg2,preg3;
        sexo="Sin sexo";
        preg1="No";
        preg2="No";
        preg3="No";
        /**
         * asigno varible doc a la captura del compoente ediitext que se llama doctext
         */
        doc=doctext.getText().toString();//
        /**
         * asigno varible nombre la captura del compoente ediitext que se llama nomtext
         */
        nombre=nomtext.getText().toString();
        /**
         * asigno varible apellido a la captura del compoente ediitext que se llama apeltext
         */
        apellido=apeltext.getText().toString();
        dir=dirtext.getText().toString();


        if(radiom.isChecked())
            sexo="Masculino";
        else if(radiof.isChecked())
            sexo="Femenino";
        if(pregsw1.isChecked())
            preg1="SI";
        if(pregsw2.isChecked())
            preg2="SI";
        if(pregsw3.isChecked())
            preg3="SI";


        sal="Documento "+doc+
                " nombre "+nombre+"\n"+
                "apellido "+apellido+"\n"+
                "direccion "+dir+"\n"+
                "Sexo "+sexo+"\n"+
                "Respuesta pregunta 1 "+preg1+"\n"+
                "Respuesta pregunta 2 "+preg2+"\n"+
                "Respuesta pregunta 3 "+preg3;


        saltext.setText(sal);
        Toast.makeText(this,"Gracias por Llenar la Encuesta",
                Toast.LENGTH_LONG).show();

    }
}