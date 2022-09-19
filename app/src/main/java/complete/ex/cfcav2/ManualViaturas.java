package complete.ex.cfcav2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ManualViaturas extends AppCompatActivity {

    public Button cb500;
    public Button mt07;
    public Button bmw;
    public Button yaris;
    public Button defender;
    public Button landCruiser;
    public Button ivecoAntiga;
    public Button ivecoNova;
    public Button unimog;
    public Button manTrator;
    public Button ivecoTrator;
    public Button manVelha;
    public Button manNova;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual_viaturas);

        cb500 = findViewById(R.id.cb500);
        mt07 = findViewById(R.id.mt07);
        bmw = findViewById(R.id.bmw);
        yaris = findViewById(R.id.yaris);
        defender = findViewById(R.id.defender);
        landCruiser = findViewById(R.id.landCruiser);
        ivecoAntiga = findViewById(R.id.ivecoAntiga);
        ivecoNova = findViewById(R.id.ivecoNova);
        unimog = findViewById(R.id.unimog);
        manTrator = findViewById(R.id.manTrator);
        ivecoTrator = findViewById(R.id.ivecoTrator);
        manVelha = findViewById(R.id.manVelha);
        manNova = findViewById(R.id.manNova);

        cb500.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(ManualViaturas.this, Cb500.class);
                //startActivity(intent);
            }
        });

        mt07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManualViaturas.this, Mt07.class);
                startActivity(intent);
            }
        });

        bmw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManualViaturas.this, Bmw.class);
                startActivity(intent);
            }
        });

        yaris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManualViaturas.this, ToyotaYaris.class);
                startActivity(intent);
            }
        });

        defender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManualViaturas.this, Defender.class);
                startActivity(intent);
            }
        });

        landCruiser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManualViaturas.this, LandCruiser.class);
                startActivity(intent);
            }
        });

        ivecoAntiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManualViaturas.this, IvecoVelha.class);
                startActivity(intent);
            }
        });

        ivecoNova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManualViaturas.this, IvecoNova.class);
                startActivity(intent);
            }
        });

        unimog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManualViaturas.this, Unimog.class);
                startActivity(intent);
            }
        });

        manTrator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManualViaturas.this, ManTrator.class);
                startActivity(intent);
            }
        });

        ivecoTrator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManualViaturas.this, IvecoTrator.class);
                startActivity(intent);
            }
        });

        manVelha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManualViaturas.this, ManVelha.class);
                startActivity(intent);
            }
        });

        manNova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManualViaturas.this, ManNova.class);
                startActivity(intent);
            }
        });

    }
}