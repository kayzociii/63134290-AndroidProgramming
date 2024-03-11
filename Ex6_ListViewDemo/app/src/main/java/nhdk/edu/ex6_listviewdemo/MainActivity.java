package nhdk.edu.ex6_listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsTenTinhThanhVN;
    ArrayAdapter<String> adapterTinhThanh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //B1

        dsTenTinhThanhVN = new ArrayList<String>();
        dsTenTinhThanhVN.add("Hà Nội");
        dsTenTinhThanhVN.add("Huế");
        dsTenTinhThanhVN.add("Đà Nẵng");
        dsTenTinhThanhVN.add("Khánh Hòa");
        dsTenTinhThanhVN.add("Cần Thơ");
        dsTenTinhThanhVN.add("Bình Thuận");
        dsTenTinhThanhVN.add("Thành phố Hồ Chí Minh");

        //B2. Tạo adapter

        adapterTinhThanh = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dsTenTinhThanhVN);
        //B3. Gắn vào điều khiển hiển thị ListView
        //3.1 Tìm
        ListView lvTenTinhThanh = findViewById(R.id.lvDanhSachTT);
        //3.2 Gắn
        lvTenTinhThanh.setAdapter(adapterTinhThanh);
        //3.3 Lắng nghe và xử lý sự kiện user tương tác
        lvTenTinhThanh.setOnItemClickListener(BoLangNghevaXL);
    }
    //Tạo bộ lắng nghe và xử lý sự kiện On
    AdapterView.OnItemClickListener BoLangNghevaXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String chuoiTB ="Bạn vừa chọn " + dsTenTinhThanhVN.get(position);
            Toast.makeText(MainActivity.this, chuoiTB, Toast.LENGTH_LONG).show();
        }
    };
}