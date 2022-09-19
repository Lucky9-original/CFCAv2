package complete.ex.cfcav2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class IvecoTrator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iveco_trator);

        PDFView pdfView = findViewById(R.id.ivecotratorpdf);

        pdfView.fromAsset("iveco_stralis.pdf").load();
    }
}