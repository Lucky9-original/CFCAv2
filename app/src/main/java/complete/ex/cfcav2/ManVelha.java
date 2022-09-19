package complete.ex.cfcav2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ManVelha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_velha);

        PDFView pdfView = findViewById(R.id.manvelhapdf);

        pdfView.fromAsset("man_tp53.pdf").load();
    }
}