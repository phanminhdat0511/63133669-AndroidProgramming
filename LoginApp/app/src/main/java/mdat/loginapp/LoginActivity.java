package mdat.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void DangNhap(View v){
        EditText edtName = findViewById(R.id.editTextUsername);
        EditText edtPass = findViewById(R.id.editTextPassword);
        EditText edtEmail = findViewById(R.id.editTextUserEmail);

        String name = edtName.getText().toString();
        String pass = edtPass.getText().toString();
        String email = edtEmail.getText().toString();

        if (name.equals("63CNTT2") && pass.equals("ABC")) {
            Intent iLogin = new Intent(this, UserActivity.class);

            iLogin.putExtra("N", name);
            iLogin.putExtra("E", email);

            startActivity(iLogin);
        }
        else
            Toast.makeText(this, "Tên người dùng hoặc mật khẩu không đúng", Toast.LENGTH_SHORT).show();
    }
}