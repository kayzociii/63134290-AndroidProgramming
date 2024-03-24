package ntu.SV63134290.cau3_appgioithieubanthan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageViewFacebook, imageViewGitHub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewFacebook = findViewById(R.id.imageViewFacebook);
        imageViewGitHub = findViewById(R.id.imageViewGitHub);

        imageViewFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String facebookUrl = "https://www.facebook.com/bon.beo.1/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(facebookUrl));
                startActivity(intent);
            }
        });

        imageViewGitHub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String githubUrl = "https://github.com/kayzociii";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(githubUrl));
                startActivity(intent);
            }
        });
    }
}