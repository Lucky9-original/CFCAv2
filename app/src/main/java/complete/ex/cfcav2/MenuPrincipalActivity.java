package complete.ex.cfcav2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuPrincipalActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal);

        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCircuitos();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openManuais();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAvarias();
            }
        });

    }

    public void openCircuitos() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openManuais() {
        Intent intent = new Intent(this, ManualViaturas.class);
        startActivity(intent);
    }

    public void  openAvarias(){
        Intent intent = new Intent(this, avarias.class);
        startActivity(intent);
    }

}