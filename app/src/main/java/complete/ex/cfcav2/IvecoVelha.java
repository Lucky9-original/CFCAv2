package complete.ex.cfcav2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class IvecoVelha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iveco_velha);

        PDFView pdfView = findViewById(R.id.ivecovelhapdf);

        pdfView.fromAsset("iveco_velha.pdf").load();
    }
}