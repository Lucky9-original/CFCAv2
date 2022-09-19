package complete.ex.cfcav2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ManNova extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_nova);

        PDFView pdfView = findViewById(R.id.mannovapdf);

        pdfView.fromAsset("man_tp43.pdf").load();
    }
}