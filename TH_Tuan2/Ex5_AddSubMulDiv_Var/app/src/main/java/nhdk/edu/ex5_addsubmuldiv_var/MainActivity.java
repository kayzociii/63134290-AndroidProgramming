package nhdk.edu.ex5_addsubmuldiv_var;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextso1;
    EditText editTextso2;
    EditText editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        nutCong.setOnClickListener(boLangNgheCong);
        nutTru.setOnClickListener(boLangNgheTru);
        nutNhan.setOnClickListener(boLangNgheNhan);
        nutChia.setOnClickListener(boLangNgheChia);
    }

    void TimDieuKhien(){
        editTextso1 = (EditText)findViewById(R.id.edtSo1);
        editTextso2 = (EditText)findViewById(R.id.edtSo2);
        editTextKQ = (EditText)findViewById(R.id.edtKetqua);
        nutCong = (Button)findViewById(R.id.btnCong);
        nutTru = (Button)findViewById(R.id.btnTru);
        nutNhan = (Button)findViewById(R.id.btnNhan);
        nutChia = (Button)findViewById(R.id.btnChia);
    }

    View.OnClickListener boLangNgheCong = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String soThu1 = editTextso1.getText().toString();
            String soThu2 = editTextso2.getText().toString();

            float soA = Float.parseFloat(soThu1);
            float soB = Float.parseFloat(soThu2);

            float tong = soA + soB;

            String chuoiKQ = String.valueOf(tong);
            editTextKQ.setText(chuoiKQ);
        }
    };

    View.OnClickListener boLangNgheTru = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String soThu1 = editTextso1.getText().toString();
            String soThu2 = editTextso2.getText().toString();

            float soA = Float.parseFloat(soThu1);
            float soB = Float.parseFloat(soThu2);

            float hieu = soA - soB;

            String chuoiKQ = String.valueOf(hieu);
            editTextKQ.setText(chuoiKQ);
        }
    };

    View.OnClickListener boLangNgheNhan = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String soThu1 = editTextso1.getText().toString();
            String soThu2 = editTextso2.getText().toString();

            float soA = Float.parseFloat(soThu1);
            float soB = Float.parseFloat(soThu2);

            float tich = soA * soB;

            String chuoiKQ = String.valueOf(tich);
            editTextKQ.setText(chuoiKQ);
        }
    };

    View.OnClickListener boLangNgheChia = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String soThu1 = editTextso1.getText().toString();
            String soThu2 = editTextso2.getText().toString();

            float soA = Float.parseFloat(soThu1);
            float soB = Float.parseFloat(soThu2);

            float thuong = soA / soB;

            String chuoiKQ = String.valueOf(thuong);
            editTextKQ.setText(chuoiKQ);
        }
    };
}