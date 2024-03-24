package ntu_63133669.cau2_appvatly;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TimeActivity extends AppCompatActivity {
    Spinner spinnervantoc, spinnerkhoangcach;
    EditText vantoc, khoangcach, thoigian;
    Button nutTinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        spinnervantoc = (Spinner) findViewById(R.id.spinnerSpeed);
        ArrayList<String> vantoc = new ArrayList<>();
        vantoc.add("m/s");
        vantoc.add("km/h");
        ArrayAdapter<String> adapterVanToc = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, vantoc);
        spinnervantoc.setAdapter(adapterVanToc);

        spinnerkhoangcach = (Spinner) findViewById(R.id.spinnerDistance);
        ArrayList<String> khoangCach = new ArrayList<>();
        khoangCach.add("km");
        khoangCach.add("m");
        ArrayAdapter<String> adapterKhoangCach = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, khoangCach);
        spinnerkhoangcach.setAdapter(adapterKhoangCach);

        timView();
        nutTinh.setOnClickListener(boLangNgheThoiGian);

    }

    void timView(){
        vantoc = (EditText) findViewById(R.id.edtSpeed);
        khoangcach = (EditText) findViewById(R.id.edtDistance);
        thoigian = (EditText) findViewById(R.id.edtKQ);
        nutTinh = (Button) findViewById(R.id.buttonKQ);
    }

    View.OnClickListener boLangNgheThoiGian = (new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText vantoc = findViewById(R.id.edtSpeed);
            EditText khoangcach = findViewById(R.id.edtDistance);
            EditText thoigian  = findViewById(R.id.edtKQ);
            Spinner donviv = findViewById(R.id.spinnerSpeed);
            Spinner donvis = findViewById(R.id.spinnerDistance);

            double v1 = Double.parseDouble(vantoc.getText().toString());
            double s = Double.parseDouble(khoangcach.getText().toString());
            String donviVanToc = donviv.getSelectedItem().toString();
            String donviKhoangCach = donvis.getSelectedItem().toString();

            double t;
            if( donviVanToc.equals("m/s")){
                if(donviKhoangCach.equals("km")){
                    t = (s / (v1 * 3.6)) * 3600;
                }
                else
                    t = ((s/1000) / (v1 * 3.6)) * 3600 ;
            }
            else{
                if(donviKhoangCach.equals("km")){
                    t = (s / v1) * 3600;
                }
                else
                    t = ((s/1000) / v1) * 3600;
            }

            String kq = String.valueOf(t) + " (giây)";
            thoigian.setText(kq);

        }
    });
}