package mdat.animallists;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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

        //Tìm listView
        ListView lvDSDongVat = (ListView) findViewById(R.id.lvDSDongVat);

        ArrayList<DongVat> dsDongVat = new ArrayList<DongVat>();
        dsDongVat.add(new DongVat("Rắn", "Bò sát", R.drawable.snake));
        dsDongVat.add(new DongVat("Bướm", "Sâu", R.drawable.butterfly));
        dsDongVat.add(new DongVat("Rùa", "Bò sát", R.drawable.turtle));
        dsDongVat.add(new DongVat("Kangaroo", "Động vật có vú", R.drawable.kangaroo));
        dsDongVat.add(new DongVat("Cá voi", "Động vật có vú", R.drawable.whale));

        DongVatAdapter adapter = new DongVatAdapter(this, dsDongVat);
        lvDSDongVat.setAdapter(adapter);

        //Bắt sự kiện
        lvDSDongVat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                //Lấy phần tử được chọn
                DongVat dongVatChon = dsDongVat.get(i);
                //Làm gì đó
                Toast.makeText(MainActivity.this, dongVatChon.getTenDongVat(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}