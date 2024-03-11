package nhdk.edu.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsBH;
    ArrayAdapter<String> adapterBH;

    ListView listViewBH;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bước 2

        dsBH = new ArrayList<String>();
        dsBH.add("Nha Trang thu");
        dsBH.add("Gần lắm Trường Sa");
        dsBH.add("Hà Nội đêm trở gió");

        //Bước 3

        adapterBH = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,dsBH);

        //Buoc 4
        listViewBH = findViewById(R.id.lvLoiBaiHat);
        listViewBH.setAdapter(adapterBH);

        //B5
        listViewBH.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Code xử lý
                String chuoiThongBao = "Bạn chọn bài" + dsBH.get(position);
                Toast.makeText(MainActivity.this, chuoiThongBao, Toast.LENGTH_SHORT).show();
            }
        });

        //HamXuLyChonItem(position);
    }


}