package mdat.vdintents2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ChuyenNhap(View v){
        Intent iChuyen = new Intent(this, ManHinhNhapLieu.class);
        startActivityForResult(iChuyen, 8000);
    }

    @SuppressLint("SuspiciousIndentation")
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode == 8000){
            if(resultCode == RESULT_OK) {
                String hoten = data.getStringExtra("HT");
                int namsinh = data.getIntExtra("NS", 2020);

                TextView txtHT = (TextView) findViewById(R.id.txtHoTen);
                TextView txtNS = (TextView) findViewById(R.id.txtNamSinh);

                txtHT.setText(hoten);
                txtNS.setText(String.valueOf(namsinh));
            }
            else
                Toast.makeText(this, "Trả về thất bại", Toast.LENGTH_SHORT).show();
        }
        else
        super.onActivityResult(requestCode, resultCode, data);
    }
}