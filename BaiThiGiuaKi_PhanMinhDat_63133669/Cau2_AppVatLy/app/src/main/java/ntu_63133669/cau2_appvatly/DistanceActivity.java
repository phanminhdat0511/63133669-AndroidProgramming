package ntu_63133669.cau2_appvatly;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class DistanceActivity extends AppCompatActivity {
    Spinner spinnervantoc, spinnerthoigian;
    EditText vantoc, khoangcach, thoigian;
    Button nutTinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance);

        spinnervantoc = (Spinner) findViewById(R.id.spinnerSpeed);
        ArrayList<String> vantoc = new ArrayList<>();
        vantoc.add("m/s");
        vantoc.add("km/h");
        ArrayAdapter<String> adapterVanToc = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, vantoc);
        spinnervantoc.setAdapter(adapterVanToc);

        spinnerthoigian = (Spinner) findViewById(R.id.spinnerTime);
        ArrayList<String> thoigian = new ArrayList<>();
        thoigian.add("h");
        thoigian.add("m");
        thoigian.add("s");
        ArrayAdapter<String> adapterThoiGian = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, thoigian);
        spinnerthoigian.setAdapter(adapterThoiGian);

        timView();
        nutTinh.setOnClickListener(boLangNgheKhoangCach);
    }
    void timView(){
        vantoc = (EditText) findViewById(R.id.edtSpeed);
        thoigian = (EditText) findViewById(R.id.edtTime);
        khoangcach = (EditText) findViewById(R.id.edtKQ);
        nutTinh = (Button) findViewById(R.id.buttonKQ);
    }

    View.OnClickListener boLangNgheKhoangCach = (new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText vantoc = findViewById(R.id.edtSpeed);
            EditText thoigian = findViewById(R.id.edtTime);
            EditText khoangcach  = findViewById(R.id.edtKQ);
            Spinner donviv = findViewById(R.id.spinnerSpeed);
            Spinner donvit = findViewById(R.id.spinnerTime);

            double v1 = Double.parseDouble(vantoc.getText().toString());
            double t = Double.parseDouble(thoigian.getText().toString());
            String donviVanToc = donviv.getSelectedItem().toString();
            String donviThoiGian = donvit.getSelectedItem().toString();

            double s;
            if( donviVanToc.equals("m/s")){
                if(donviThoiGian.equals("h")){
                    s = (v1 * 3.6) * t;
                }
                else if(donviThoiGian.equals("m"))
                    s = (v1 * 3.6) * (t / 60);
                else
                    s = (v1 * 3.6) * (t / 3600);
            }
            else{
                if(donviThoiGian.equals("h"))
                    s = v1 * t;
                else if(donviThoiGian.equals("m"))
                    s = v1 * t / 60;
                else
                    s = v1 * t / 3600;
            }

            String kq = String.valueOf(s) + " (km)";
            khoangcach.setText(kq);

        }
    });

}