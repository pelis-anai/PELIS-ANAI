package com.dari.loginbdremote;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {

    //Definimos el ListView
    private ListView listView;
    //Elementos que se mostraran en el listview
    private String pelis[]=new String[]{"PELEA DE MAESTRO","CHIPS","COVENAN","FAST AND FURIOUS","GHOST SHELL","LOGAN",
            "KONG","WONDER WOMAN","POWER RANGERS"};


    private int[] LogoId = new int[]{R.drawable.pelea, R.drawable.chips,
            R.drawable.covenan,R.drawable.fast,
            R.drawable.ghost, R.drawable.logan,R.drawable.kong,
            R.drawable.mujer,R.drawable.power};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Conectamos mi Lista a mi ListView
        listView = (ListView) findViewById(R.id.miLista);

        //Declaramos el Array Adactes,le pasamos el contexto, le indicamos para que tenga
        // una simple_expandable_list_item_1 y le damos nuestro Array de String
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1, pelis);

        //Le asignamos el adacter al listView
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // La posición donde se hace clic en el elemento de lista se obtiene de la
                // la posición de parámetro de la vista de lista de Android
                int posicion = position;

                //obtengo el valor del string del elemento donde se hizo clic
                String itemValue = (String) listView.getItemAtPosition(position);

                //Con el fin de empezar a mostrar una nueva actividad lo que necesitamos es una intención
                Intent intent = new Intent(getApplicationContext(),LenguajeActivity.class);

                // Poner el Id de la imagen como extra en la intención
                intent.putExtra("logo",LogoId[position]);

                // Aquí pasaremos el parámetro de la intención creada previamente
                startActivity(intent);
            }
        });

    }


}
