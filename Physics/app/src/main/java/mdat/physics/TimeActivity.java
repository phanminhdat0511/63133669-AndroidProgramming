package mdat.physics;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class TimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        ArrayList<String> khoangCach = new ArrayList<>();
        khoangCach.add("km");
        khoangCach.add("m");

        AutoCompleteTextView autoCompleteTextView;
        autoCompleteTextView = findViewById(R.id.distance);

        ArrayAdapter<String> adapterKhoangCach = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, khoangCach);
        autoCompleteTextView.setAdapter(adapterKhoangCach);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id){
               String item = parent.getItemAtPosition(position).toString();
               Toast.makeText(getApplicationContext(), "Item: " + item, Toast.LENGTH_SHORT).show();
           }
        });
    }
}