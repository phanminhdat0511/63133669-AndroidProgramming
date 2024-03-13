package mdat.physics;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimView();
        btnSpeed.setOnClickListener(moveSpeed);
    }

    View.OnClickListener moveSpeed = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, speed.class);
            startActivity(intent);
        }
    };

    void TimView(){
        btnSpeed = (Button) findViewById(R.id.speed);
        btnTime = (Button) findViewById(R.id.time);
        btnDistance = (Button) findViewById(R.id.distance);
    }
    Button btnSpeed, btnTime, btnDistance;
}