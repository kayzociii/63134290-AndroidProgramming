package nhdk.edu.ex6cong_listviewthemxoasua;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> dsTenTinhThanhVN;
    ArrayAdapter<String> adapterTinhThanh;

    ListView lvTenTinhThanh;
    Button btnthem, btnxoa, btnsua;
    EditText edtTentinhthanh;

    int ViTri = -1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnthem = (Button)findViewById(R.id.btnThem);
        btnsua = (Button)findViewById(R.id.btnSua);
        btnxoa = (Button)findViewById(R.id.btnXoa);
        edtTentinhthanh = (EditText)findViewById(R.id.edtTentinhthanh);
        dsTenTinhThanhVN = new ArrayList<String>();
        dsTenTinhThanhVN.add("Hà Nội");
        dsTenTinhThanhVN.add("Huế");
        dsTenTinhThanhVN.add("Đà Nẵng");
        dsTenTinhThanhVN.add("Khánh Hòa");
        dsTenTinhThanhVN.add("Cần Thơ");
        dsTenTinhThanhVN.add("Bình Thuận");
        dsTenTinhThanhVN.add("Thành phố Hồ Chí Minh");

        adapterTinhThanh = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dsTenTinhThanhVN);
        lvTenTinhThanh = findViewById(R.id.lvDanhSachTT);
        lvTenTinhThanh.setAdapter(adapterTinhThanh);
        lvTenTinhThanh.setOnItemClickListener(BoLangNghevaXL);
        //Thêm tỉnh thành
        Them();
        Sua();
        Xoa();
    }
    AdapterView.OnItemClickListener BoLangNghevaXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String chuoiTB ="Bạn vừa chọn " + dsTenTinhThanhVN.get(position);
            Toast.makeText(MainActivity.this, chuoiTB, Toast.LENGTH_LONG).show();
        }
    };

    public void Them(){
        btnthem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tinhthanh = edtTentinhthanh.getText().toString();
                dsTenTinhThanhVN.add(tinhthanh);
                adapterTinhThanh.notifyDataSetChanged();
            }
        });
    }

    public void Sua(){
        lvTenTinhThanh.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                edtTentinhthanh.setText(dsTenTinhThanhVN.get(position));
                ViTri = position;
            }
        });

        btnsua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dsTenTinhThanhVN.set(ViTri, edtTentinhthanh.getText().toString());
                adapterTinhThanh.notifyDataSetChanged();
            }
        });
    }

    public void Xoa(){
        lvTenTinhThanh.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                edtTentinhthanh.setText(dsTenTinhThanhVN.get(position));
                ViTri = position;
            }
        });

        btnxoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dsTenTinhThanhVN.remove(ViTri);
                adapterTinhThanh.notifyDataSetChanged();
            }
        });
    }
}