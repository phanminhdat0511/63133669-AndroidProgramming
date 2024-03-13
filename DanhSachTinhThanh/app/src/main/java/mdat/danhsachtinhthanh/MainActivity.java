package mdat.danhsachtinhthanh;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> dsTenTinhThanhVN = new ArrayList<>();
        dsTenTinhThanhVN.add("Hà Nội");
        dsTenTinhThanhVN.add("Hồ Chính Minh");
        dsTenTinhThanhVN.add("Đồng Nai");
        dsTenTinhThanhVN.add("Khánh Hòa");

        ArrayAdapter<String> adapterTinhThanh = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dsTenTinhThanhVN);

        ListView lvTenTinhThanh = findViewById(R.id.lvDanhSachTT);
        lvTenTinhThanh.setAdapter(adapterTinhThanh);
    }
}