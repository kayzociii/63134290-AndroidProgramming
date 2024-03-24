package ntu.SV63134290;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtChieuCao,edtCanNang;
    Button btnTinh;

    TextView txtKetQua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtChieuCao = findViewById(R.id.edtChieuCao);
        edtCanNang = findViewById(R.id.edtCanNang);
        btnTinh = findViewById(R.id.btnTinh);
        txtKetQua = findViewById(R.id.txtKetQua);

        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhBMI();
            }
        });
    }

    private void tinhBMI(){
        String chieuCao = edtChieuCao.getText().toString();
        String canNang = edtCanNang.getText().toString();

        if(!chieuCao.isEmpty() && !canNang.isEmpty()){
            float ChieuCao = Float.parseFloat(chieuCao);
            float CanNang = Float.parseFloat(canNang);
            float ChieuCaoM = ChieuCao/100;
            float bmi = CanNang / (ChieuCaoM * ChieuCaoM);
            inKetQua(bmi);
        }
        else{
            txtKetQua.setText("Mời bạn nhập vào chiều cao và cân nặng!");
        }
    }

    private void inKetQua(float bmi){
        String kq;
        if(bmi < 18.5){
            kq = "Thiếu cân";
        }
        else if(bmi >= 18.5 && bmi < 25){
            kq = "Cân đối";
        }
        else if(bmi >= 25 && bmi < 30){
            kq = "Thừa cân";
        }
        else if(bmi >= 30 && bmi < 35){
            kq = "Béo phì";
        }
        else{
            kq = "Béo phì nguy hiểm";
        }

        txtKetQua.setText(String.format("BMI: %.1f\n %s", bmi , kq));
    }
}