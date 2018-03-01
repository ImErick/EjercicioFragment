package mx.iteso.erickgarcia.ejerciciofragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by erickgarcia on 28/02/18
 * Creando fragment dinamico
 */

public class ActivityFragmentDinamico extends Activity {
    Button agrega_cliente, mostrar_cliente;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_dinamico);
        agrega_cliente = (Button) findViewById(R.id.btn_agregar);
        mostrar_cliente = (Button) findViewById(R.id.btn_listado);

        agrega_cliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentAgregarCliente  fragmentAgregarCliente = new FragmentAgregarCliente();
                fragmentTransaction.add(R.id.flayout, fragmentAgregarCliente);

                fragmentTransaction.commit();
            }
        });

        mostrar_cliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FragmentListadoCliente  fragmentListadoCliente = new FragmentListadoCliente();
                fragmentTransaction.add(R.id.flayout, fragmentListadoCliente);

                fragmentTransaction.commit();
            }
        });
    }
}
