package complete.ex.cfcav2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Defender extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_defender);

        PDFView pdfView = findViewById(R.id.defenderpdf);

        pdfView.fromAsset("defender.pdf").load();
    }
}