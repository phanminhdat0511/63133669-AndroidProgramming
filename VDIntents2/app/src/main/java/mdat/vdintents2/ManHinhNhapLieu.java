package mdat.vdintents2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ManHinhNhapLieu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_nhap_lieu);
    }

    public void Nhap(View v){
        EditText edtHT = (EditText) findViewById(R.id.edtHoTen);
        EditText edtN = (EditText) findViewById(R.id.edtNam);

        String hoten = edtHT.getText().toString();
        int namsinh = Integer.parseInt(edtN.getText().toString());

        Intent iKQNhap = new Intent();
        iKQNhap.putExtra("HT", hoten);
        iKQNhap.putExtra("NS", namsinh);
        setResult(RESULT_OK, iKQNhap);

        finish();
    }

    public void Huy(View v){
        Intent iHuy = new Intent(this, MainActivity.class);
        startActivity(iHuy);
    }
}