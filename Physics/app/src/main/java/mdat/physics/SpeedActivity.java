package mdat.physics;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SpeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);

        TimView();
        btnkq.setOnClickListener(boLangNgheKQ);
    }

    View.OnClickListener boLangNgheKQ = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            tinh();
        }
    };

    void tinh(){
        String thoigian = time.getText().toString();
        String quangduong = distance.getText().toString();

        double t = Double.parseDouble(thoigian);
        double s = Double.parseDouble(quangduong);

        double v = s / t;
        String strkq = String.valueOf(v);

        kq.setText(strkq);

    }

    void TimView(){
        distance = (EditText) findViewById(R.id.edtDistance);
        time = (EditText) findViewById(R.id.edtTime);
        kq = (EditText) findViewById(R.id.edtKQ);
        btnkq = (Button) findViewById(R.id.buttonKQ);
    }

    EditText distance, time, kq;
    Button btnkq;
}