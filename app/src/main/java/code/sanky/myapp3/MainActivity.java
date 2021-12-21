package code.sanky.myapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.ds.merchant.MerchantAcquisition;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(
                View -> {
                    MerchantAcquisition.startApp(
                            this,
                            "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwiZmlyc3ROYW1lIjoiU291dmlrIiwibGFzdE5hbWUiOiJDaGluYSIsImVtYWlsIjoic291dmlrQGRhdGFzdXRyYW0uY29tIiwicm9sZXMiOlsiYmFzaWMiLCJhZG1pbiJdLCJpYXQiOjE2Mzk4MTIyMDEsImV4cCI6MTYzOTgxMjIwNH0.JOVUJ1htG7fO9A2MZlpt5yBn8wiGvyZLEZLccA3-A3k",
                            32);
                }
        );
    }
}