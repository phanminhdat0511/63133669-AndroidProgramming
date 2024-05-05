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

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void DangKy(View v){
        EditText edtName = findViewById(R.id.editTextName);
        EditText edtPass = findViewById(R.id.editTextPass);
        EditText edtComfirm = findViewById(R.id.editTextComfirm);
        EditText edtEmail = findViewById(R.id.editTextEmail);

        String name = edtName.getText().toString();
        String pass = edtPass.getText().toString();
        String comfirm = edtComfirm.getText().toString();
        String email = edtEmail.getText().toString();

        if(pass.equals(comfirm)){
            Intent iRegister = new Intent(this, UserActivity.class);

            iRegister.putExtra("N", name);
            iRegister.putExtra("E", email);

            startActivity(iRegister);
        }
        else
            Toast.makeText(this, "Xác nhận mật khẩu không đúng", Toast.LENGTH_SHORT).show();
    }
}