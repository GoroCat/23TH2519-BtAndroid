package com.example.bt_vd4;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsTenTinhThanhVN;
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


        dsTenTinhThanhVN = new ArrayList<String>();
        dsTenTinhThanhVN.add("TP.Hồ Chí Minh");
        dsTenTinhThanhVN.add("Hà Nội");
        dsTenTinhThanhVN.add("Đồng Nai");
        dsTenTinhThanhVN.add("Ninh Thuận");
        dsTenTinhThanhVN.add("Nha Trang");
        dsTenTinhThanhVN.add("Bình Thuận");

        ArrayAdapter<String> adapterTinhThnah;
        adapterTinhThnah = new ArrayAdapter<String>
                ( this, android.R.layout.simple_list_item_1, dsTenTinhThanhVN);
        ListView lvTenTinhThanh= findViewById(R.id.tvDanhSach);
        lvTenTinhThanh.setAdapter(adapterTinhThnah);

        lvTenTinhThanh.setOnItemClickListener(BoLangNghevaXL);
    }
    AdapterView.OnItemClickListener BoLangNghevaXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            String strTenTinhChon= dsTenTinhThanhVN.get(i);

            Toast.makeText(MainActivity.this, "Bạn đã chọn"+ String.valueOf(i), Toast.LENGTH_LONG).show();
        }
    };
}