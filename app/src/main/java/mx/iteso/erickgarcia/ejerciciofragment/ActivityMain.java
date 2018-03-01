package mx.iteso.erickgarcia.ejerciciofragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by erickgarcia on 28/02/18
 * Necesitamos un activityHost para nuestro fragment estatico
 */

public class ActivityMain extends Activity {

    Button fragment_estatico, fragment_dinamico;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment_dinamico = (Button) findViewById(R.id.button_fragment_dinamico);
        fragment_estatico = (Button) findViewById(R.id.button_fragment_estatico);

        fragment_estatico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityMain.this, ActivityFragmentEstatico.class);
                startActivity(intent);
            }
        });
    }
}
