package complete.ex.cfcav2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Unimog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unimog);

        PDFView pdfView = findViewById(R.id.unimogpdf);

        pdfView.fromAsset("unimog.pdf").load();
    }
}