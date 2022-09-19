package complete.ex.cfcav2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class IvecoNova extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iveco_nova);

        PDFView pdfView = findViewById(R.id.iveconovapdf);

        pdfView.fromAsset("iveco_nova.pdf").load();
    }
}