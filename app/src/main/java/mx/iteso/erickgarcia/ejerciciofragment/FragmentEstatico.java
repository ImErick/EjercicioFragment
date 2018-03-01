package mx.iteso.erickgarcia.ejerciciofragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by erickgarcia on 28/02/18
 */

public class FragmentEstatico extends Fragment {

    Button btn_mensaje;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_estatico, container, false);
        btn_mensaje = (Button) view.findViewById(R.id.btn_mensaje);

        btn_mensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "mensaje desde fragment", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
