package mdat.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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
    }

    public void Login(View v){
        Intent iLogin = new Intent(this, LoginActivity.class);
        startActivity(iLogin);
    }

    public void Register(View v){
        Intent iRegister = new Intent(this, RegisterActivity.class);
        startActivity(iRegister);
    }
}