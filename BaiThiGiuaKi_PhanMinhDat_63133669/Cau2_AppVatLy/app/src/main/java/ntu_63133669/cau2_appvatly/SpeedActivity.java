package ntu_63133669.cau2_appvatly;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SpeedActivity extends AppCompatActivity {
    Spinner spinnerthoigian, spinnerkhoangcach;
    EditText vantoc, khoangcach, thoigian;
    Button nutTinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);

        spinnerthoigian = (Spinner) findViewById(R.id.spinnerTime);
        ArrayList<String> thoigian = new ArrayList<>();
        thoigian.add("h");
        thoigian.add("m");
        thoigian.add("s");
        ArrayAdapter<String> adapterThoiGian = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, thoigian);
        spinnerthoigian.setAdapter(adapterThoiGian);

        spinnerkhoangcach = (Spinner) findViewById(R.id.spinnerDistance);
        ArrayList<String> khoangCach = new ArrayList<>();
        khoangCach.add("km");
        khoangCach.add("m");
        ArrayAdapter<String> adapterKhoangCach = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, khoangCach);
        spinnerkhoangcach.setAdapter(adapterKhoangCach);

        timView();
        nutTinh.setOnClickListener(boLangNgheVanToc);
    }
    void timView(){
        vantoc = (EditText) findViewById(R.id.edtSpeed);
        khoangcach = (EditText) findViewById(R.id.edtDistance);
        thoigian = (EditText) findViewById(R.id.edtKQ);
        nutTinh = (Button) findViewById(R.id.buttonKQ);
    }

    View.OnClickListener boLangNgheVanToc = (new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText thogian = findViewById(R.id.edtTime);
            EditText khoangcach = findViewById(R.id.edtDistance);
            EditText vantoc  = findViewById(R.id.edtKQ);
            Spinner donvit = findViewById(R.id.spinnerTime);
            Spinner donvis = findViewById(R.id.spinnerDistance);

            double t = Double.parseDouble(thogian.getText().toString());
            double s = Double.parseDouble(khoangcach.getText().toString());
            String donviThoiGian = donvit.getSelectedItem().toString();
            String donviKhoangCach = donvis.getSelectedItem().toString();

            double v1;
            if( donviKhoangCach.equals("m")){
                if(donviThoiGian.equals("h"))
                    v1 = (s/1000) / t;
                else if(donviThoiGian.equals("m"))
                    v1 = (s/1000) / (t/60);
                else if(donviThoiGian.equals("s"))
                    v1 = (s/1000) / (t/3600);
            }
            else{
                if(donviThoiGian.equals("h"))
                    v1 = (s) / t;
                else if(donviThoiGian.equals("m"))
                    v1 = (s) / (t/60);
                else if(donviThoiGian.equals("s"))
                    v1 = (s) / (t/3600);
            }

            String kq = String.valueOf(t) + " (km/h)";
            khoangcach.setText(kq);

        }
    });
}