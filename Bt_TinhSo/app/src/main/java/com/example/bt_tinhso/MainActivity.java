package com.example.bt_tinhso;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void XuLyCong(View v) {
       EditText  editTextA = (EditText)findViewById(R.id.edtA);
        EditText  editTextB = (EditText)findViewById(R.id.edtB);
        String soA = editTextA.getText().toString();
        String soB = editTextB.getText().toString();
        float so1 = Float.parseFloat(soA);
        float so2 = Float.parseFloat(soB);
        float Cong = so1 + so2;
        EditText  editTextKq= (EditText)findViewById(R.id.edtKetqua);
        String KQ = String.valueOf(Cong);
        editTextKq.setText(KQ);
    }
    public void XuLyTru(View v) {
        EditText  editTextA = (EditText)findViewById(R.id.edtA);
        EditText  editTextB = (EditText)findViewById(R.id.edtB);
        String soA = editTextA.getText().toString();
        String soB = editTextB.getText().toString();
        float so1 = Float.parseFloat(soA);
        float so2 = Float.parseFloat(soB);
        float Cong = so1 - so2;
        EditText  editTextKq= (EditText)findViewById(R.id.edtKetqua);
        String KQ = String.valueOf(Cong);
        editTextKq.setText(KQ);
    }
    public void XuLyNhan(View v) {
        EditText  editTextA = (EditText)findViewById(R.id.edtA);
        EditText  editTextB = (EditText)findViewById(R.id.edtB);
        String soA = editTextA.getText().toString();
        String soB = editTextB.getText().toString();
        float so1 = Float.parseFloat(soA);
        float so2 = Float.parseFloat(soB);
        float Cong = so1 * so2;
        EditText  editTextKq= (EditText)findViewById(R.id.edtKetqua);
        String KQ = String.valueOf(Cong);
        editTextKq.setText(KQ);
    }
    public void XuLyChia(View v) {
        EditText  editTextA = (EditText)findViewById(R.id.edtA);
        EditText  editTextB = (EditText)findViewById(R.id.edtB);
        String soA = editTextA.getText().toString();
        String soB = editTextB.getText().toString();
        float so1 = Float.parseFloat(soA);
        float so2 = Float.parseFloat(soB);
        float Cong = so1 / so2;
        EditText  editTextKq= (EditText)findViewById(R.id.edtKetqua);
        String KQ = String.valueOf(Cong);
        editTextKq.setText(KQ);
    }
}