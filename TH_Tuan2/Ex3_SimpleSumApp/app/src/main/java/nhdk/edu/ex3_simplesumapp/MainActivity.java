package nhdk.edu.ex3_simplesumapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void XuLyCong(View view){
        EditText editTextsoA = findViewById(R.id.edtA);
        EditText editTextsoB = findViewById(R.id.edtB);
        EditText editTextKetQua = findViewById(R.id.edtKetQua);
        String strA = editTextsoA.getText().toString();
        String strB = editTextsoB.getText().toString();

        int so_A = Integer.parseInt(strA);
        int so_B = Integer.parseInt(strB);

        int Tong = so_A + so_B;
        String strTong = String.valueOf(Tong);

        editTextKetQua.setText(strTong);
    }
}