package mdat.vd4;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void XuLyCong(View view){
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

    public void XuLyTru(View view){
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

    public void XuLyNhan(View view){
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

    public void XuLyChia(View view){
        EditText soA = findViewById(R.id.edtA);
        EditText soB = findViewById(R.id.edtB);
        EditText KQ = findViewById(R.id.edtKQ);

        String sothunhat = soA.getText().toString();
        String sothuhai = soB.getText().toString();

        double a = Double.parseDouble(sothunhat);
        double b = Double.parseDouble(sothuhai);

        if(b == 0){
            KQ.setText("Số chia phải khác 0");
        }
        else{
            double kq = a / b;
            String strKQ = String.valueOf(kq);
            KQ.setText(strKQ);
        }
    }
}
