package mdat.recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recycleViewData;
    RecyclerView recyclerViewLandScape;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycleViewData = getDataForRecycleView();
        recyclerViewLandScape = findViewById(R.id.recyclerLand);
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerViewLandScape.setLayoutManager(layoutLinear);
        landScapeAdapter = new LandScapeAdapter(this, recycleViewData);
        recyclerViewLandScape.setAdapter(landScapeAdapter);
    }

    ArrayList<LandScape> getDataForRecycleView(){
        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("flag_tower_of_hanoi", "Cột cờ Hà Nội");
        dsDuLieu.add(landScape1);
        LandScape landScape2 = new LandScape("effel", "Tháp Effel");
        dsDuLieu.add(landScape2);
        LandScape landScape3 = new LandScape("statue_of_lyberty", "Tượng nữ thần tự do");
        dsDuLieu.add(landScape3);

        return dsDuLieu;
    }
}