package mdat.vd51;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimView();
        btnCong.setOnClickListener(boLangNgheCong);
        btnTru.setOnClickListener(boLangNgheTru);
        btnNhan.setOnClickListener(boLangNgheNhan);
        btnChia.setOnClickListener(boLangNgheChia);
    }
    //--------------------------------------------------------

    View.OnClickListener boLangNgheCong = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSoA = soA.getText().toString();
            String strSoB = soB.getText().toString();

            double soA = Double.parseDouble(strSoA);
            double soB = Double.parseDouble(strSoB);

            double tong = soA + soB;

            String strKQ = String.valueOf(tong);
            kq.setText(strKQ);
        }
    };

    View.OnClickListener boLangNgheTru = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSoA = soA.getText().toString();
            String strSoB = soB.getText().toString();

            double soA = Double.parseDouble(strSoA);
            double soB = Double.parseDouble(strSoB);

            double tru = soA - soB;

            String strKQ = String.valueOf(tru);
            kq.setText(strKQ);
        }
    };

    View.OnClickListener boLangNgheNhan = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSoA = soA.getText().toString();
            String strSoB = soB.getText().toString();

            double soA = Double.parseDouble(strSoA);
            double soB = Double.parseDouble(strSoB);

            double nhan = soA * soB;

            String strKQ = String.valueOf(nhan);
            kq.setText(strKQ);
        }
    };

    View.OnClickListener boLangNgheChia = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSoA = soA.getText().toString();
            String strSoB = soB.getText().toString();

            double soA = Double.parseDouble(strSoA);
            double soB = Double.parseDouble(strSoB);

            double chia = soA + soB;

            String strKQ = String.valueOf(chia);
            kq.setText(strKQ);
        }
    };

    void TimView(){
        soA = (EditText) findViewById(R.id.edtA);
        soB = (EditText) findViewById(R.id.edtB);
        btnCong = (Button) findViewById(R.id.buttonCong);
        btnTru = (Button) findViewById(R.id.buttonTru);
        btnNhan = (Button) findViewById(R.id.buttonNhan);
        btnChia = (Button) findViewById(R.id.buttonChia);
        kq = (EditText) findViewById(R.id.edtKQ);
    }
    EditText soA;
    EditText soB;
    EditText kq;
    Button btnCong, btnTru, btnNhan, btnChia;
}