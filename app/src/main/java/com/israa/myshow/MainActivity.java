package com.israa.myshow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName = findViewById(R.id.edtName);
    }

    public void btnShow_onClick(View view) {
        String Name =edtName.getText().toString().trim();
        Toast.makeText(this, Name, Toast.LENGTH_SHORT).show();
    }
}