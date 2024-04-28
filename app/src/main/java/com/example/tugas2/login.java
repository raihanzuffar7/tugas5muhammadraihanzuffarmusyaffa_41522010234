package com.example.tugas2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.content.Intent;


public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void pindahlogin1(View view) {
        Intent pindahlogin1 = new Intent(login.this, login2.class);
        startActivity(pindahlogin1);
    }
    public void pindahkembalikeregistrasi (View view) {
        Intent pindahkembalikeregistrasi = new Intent(login.this, registrasi.class);
        startActivity(pindahkembalikeregistrasi);
    }
    public void pindahkehomepage (View view) {
        Intent pindahkehomepage = new Intent(login.this, homepage.class);
        startActivity(pindahkehomepage);
    }

}


