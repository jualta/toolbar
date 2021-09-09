package com.example.practica;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonM1= findViewById(R.id.metodo1);
        botonM1.setOnClickListener(this);


        Button botonM2= findViewById(R.id.metodo2);
        botonM2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mi codigo Metodo2
                Toast.makeText(getApplicationContext(),"putitos Metodo2",Toast.LENGTH_LONG).show();

            }
        });


        Toolbar miToolbar = findViewById(R.id.miToolbar);
        setSupportActionBar(miToolbar);


    }


    @Override
    public void onClick(View view) {
        // mi codigo Metodo1
        Toast.makeText(this,"hola gentita METODO1",Toast.LENGTH_LONG ).show();
    }

    public void  mostrarTexto(View view){
       //metodo extra con textview
        Toast.makeText(this,"texto view",Toast.LENGTH_LONG).show();
    }

    public void mostrarMensaje(View view){
       //metodo 3 con el activity main en el codigo
       Toast.makeText(this,"habla gente Metodo 3",Toast.LENGTH_LONG).show();
    }

    public void cambiarActivity(View view) {
        Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
        //metodo para llamar
        intent.putExtra("nombre","Omar");
        intent.putExtra("apellido","sulca");
        startActivity(intent);
    }
    //metodo para llamar
    public void llamarUniversidad(View view) {
        Intent intent= new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:"+"062519773"));
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mi_menu, menu);
        return true;
    }
//hacer como fb o wassap semana 5 video 2
    @Override
    public boolean onOptionsItemSelected( MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(getApplicationContext(),"Buscar",Toast.LENGTH_LONG).show();
                return true;
            case R.id.item2:
                Toast.makeText(getApplicationContext(),"Texto",Toast.LENGTH_LONG).show();
                return true;
            case R.id.item3:
                Toast.makeText(getApplicationContext(),"Carpeta",Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}



// crear login con comparacion en el video semana 4 el segundo por los segundos finales

