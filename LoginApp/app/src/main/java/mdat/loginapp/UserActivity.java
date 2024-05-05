package mdat.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        Intent myintent = getIntent();
        String nameNhanDuoc = myintent.getStringExtra("N");
        String emailNhanDuoc = myintent.getStringExtra("E");

        TextView tvName = findViewById(R.id.TextUserName);
        TextView tvEmail = findViewById(R.id.TextUserEmail);

        tvName.setText(nameNhanDuoc);
        tvEmail.setText(emailNhanDuoc);
    }
}