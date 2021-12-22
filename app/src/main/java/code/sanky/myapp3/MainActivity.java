package code.sanky.myapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.ds.merchant.MerchantAcquisition;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView faID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        faID = findViewById(R.id.faID);
        button.setOnClickListener(
                View -> {
                    if(faID.getText().length() == 0){
                        Toast.makeText(this , "Please Enter an ID" ,Toast.LENGTH_LONG).show();
                    }else{
                        MerchantAcquisition.startApp(
                                this,
                                "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MSwiZmlyc3ROYW1lIjoiU291dmlrIiwibGFzdE5hbWUiOiJDaGluYSIsImVtYWlsIjoic291dmlrQGRhdGFzdXRyYW0uY29tIiwicm9sZXMiOlsiYmFzaWMiLCJhZG1pbiJdLCJpYXQiOjE2Mzk4MTIyMDEsImV4cCI6MTYzOTgxMjIwNH0.JOVUJ1htG7fO9A2MZlpt5yBn8wiGvyZLEZLccA3-A3k",
                                Integer.parseInt(String.valueOf(faID.getText())));
                    }

                }
        );
    }
}