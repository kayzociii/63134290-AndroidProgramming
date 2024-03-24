package nhdk.edu.lvnangcao;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import nhdk.edu.lvnangcao.adapters.CountryAdapter;
import nhdk.edu.lvnangcao.models.Country;

public class MainActivity extends AppCompatActivity {
    ArrayList<Country> dsQG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //b1
        dsQG = new ArrayList<Country>();

        dsQG.add(new Country("Vietnam", 90, "vn"));
        dsQG.add(new Country("Russia", 1000, "ru"));
        dsQG.add(new Country("Vietnam", 90, "vn"));
        //dsQG.add(new Country("United State", 500, "ru"));

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        ListView listView = findViewById(R.id.lvQG);
        CountryAdapter adapter = new CountryAdapter(dsQG, this);
        listView.setAdapter(adapter);
    }
}