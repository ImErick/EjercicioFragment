package mx.iteso.erickgarcia.ejerciciofragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by erickgarcia on 28/02/18
 */

public class ActivityFragmentEstatico extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragment_estatico);
    }
}
