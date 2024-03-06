package mdat.vd5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editTextSo1, editTextSo2, editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;

    void TimDieuKien(){
        editTextSo1 = (EditText)findViewById(R.id.edtA);
        editTextSo2 = (EditText)findViewById(R.id.edtB);
        editTextKQ = (EditText)findViewById(R.id.edtKQ);
        nutCong = (Button)findViewById(R.id.btnCong);
        nutTru = (Button)findViewById(R.id.btnTru);
        nutNhan = (Button)findViewById(R.id.btnNhan);
        nutChia = (Button)findViewById(R.id.btnChia);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKien();
        //Gắn bộ lắng nghe xự kiện và code xử lý cho từng nút
        View.OnClickListener boLangNgheCong = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLy_Cong();
            }
        };
        nutCong.setOnClickListener(boLangNgheCong);

        nutTru.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                XuLy_Tru();
            }
        });

        nutNhan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                XuLy_Nhan();
            }
        });

        nutChia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                XuLy_Chia();
            }
        });
    }

    void XuLy_Cong(){
        EditText soA = findViewById(R.id.edtA);
        EditText soB = findViewById(R.id.edtB);
        EditText KQ = findViewById(R.id.edtKQ);

        String sothunhat = soA.getText().toString();
        String sothunhai = soB.getText().toString();

        double a = Double.parseDouble(sothunhat);
        double b = Double.parseDouble(sothunhai);

        double kq = a + b;

        String strKq = String.valueOf(kq);

        KQ.setText(strKq);
    }

    void XuLy_Tru(){
        EditText soA = findViewById(R.id.edtA);
        EditText soB = findViewById(R.id.edtB);
        EditText KQ = findViewById(R.id.edtKQ);

        String sothunhat = soA.getText().toString();
        String sothuhai = soB.getText().toString();

        double a = Double.parseDouble(sothunhat);
        double b = Double.parseDouble(sothuhai);

        double kq = a - b;
        String strKQ = String.valueOf(kq);

        KQ.setText(strKQ);
    }

    void XuLy_Nhan(){
        EditText soA = findViewById(R.id.edtA);
        EditText soB = findViewById(R.id.edtB);
        EditText KQ = findViewById(R.id.edtKQ);

        String sothunhat = soA.getText().toString();
        String sothuhai = soB.getText().toString();

        double a = Double.parseDouble(sothunhat);
        double b = Double.parseDouble(sothuhai);

        double kq = a * b;
        String strKQ = String.valueOf(kq);

        KQ.setText(strKQ);
    }

    void XuLy_Chia() {
        EditText soA = findViewById(R.id.edtA);
        EditText soB = findViewById(R.id.edtB);
        EditText KQ = findViewById(R.id.edtKQ);

        String sothunhat = soA.getText().toString();
        String sothuhai = soB.getText().toString();

        double a = Double.parseDouble(sothunhat);
        double b = Double.parseDouble(sothuhai);

        if (b == 0) {
            KQ.setText("Số chia phải khác 0");
        } else {
            double kq = a / b;
            String strKQ = String.valueOf(kq);
            KQ.setText(strKQ);
        }
    }
}