package mdat.ontap;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Cau1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Cau1Fragment extends Fragment {
    EditText edtkm;
    EditText edtm;
    Button button;
    public Cau1Fragment() {
        // Required empty public constructor
    }

    public static Cau1Fragment newInstance(String param1, String param2) {
        Cau1Fragment fragment = new Cau1Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cau1, container, false);

        edtkm = view.findViewById(R.id.editTextKm);
        edtm = view.findViewById(R.id.editTextM);
        button = view.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String km = edtkm.getText().toString();
                String m = edtm.getText().toString();

                if(!km.isEmpty() && m.isEmpty()){
                    double kilomet = Double.parseDouble(km);
                    double met = kilomet * 1000;
                    String kq = String.valueOf(met);
                    edtm.setText(kq);
                }
                if ( (!m.isEmpty() && km.isEmpty()) ){
                    double met = Double.parseDouble(m);
                    double kilomet = met / 1000;
                    String kq = String.valueOf(kilomet);
                    edtkm.setText(kq);
                }
                else {
                    double kilomet = Double.parseDouble(km);
                    double met = kilomet * 1000;
                    String kq = String.valueOf(met);
                    edtm.setText(kq);
                }
            }
        });

        return view;
    }
}