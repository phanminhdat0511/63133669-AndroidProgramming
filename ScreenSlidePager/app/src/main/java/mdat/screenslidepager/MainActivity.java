package mdat.screenslidepager;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> viewPager2Data;
    ViewPager2 viewPager2Land;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager2Data = getDataForRecyclerView();

        viewPager2Land = findViewById(R.id.vp2Land);
        landScapeAdapter = new LandScapeAdapter(this, viewPager2Data);

        viewPager2Land.setAdapter(landScapeAdapter);

        // Add PageTransformer
        viewPager2Land.setPageTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(android.view.View page, float position) {
                float absPosition = Math.abs(position);
                page.setScaleY(0.85f + (0.15f * (1 - absPosition)));
            }
        });

        viewPager2Land.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });
    }

    ArrayList<LandScape> getDataForRecyclerView() {
        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("flag_tower_of_hanoi", "Cột cờ Hà Nội");
        dsDuLieu.add(landScape1);
        LandScape landScape2 = new LandScape("effel", "Tháp Effel");
        dsDuLieu.add(landScape2);
        LandScape landScape3 = new LandScape("statue_of_lyberty", "Tượng nữ thần tự do");
        dsDuLieu.add(landScape3);

        return dsDuLieu;
    }

    @Override
    public void onBackPressed() {
        if (viewPager2Land.getCurrentItem() == 0) {
            super.onBackPressed();
        } else {
            viewPager2Land.setCurrentItem(viewPager2Land.getCurrentItem() - 1);
        }
    }
}