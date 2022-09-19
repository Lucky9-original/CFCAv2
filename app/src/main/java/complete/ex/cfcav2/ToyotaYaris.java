package complete.ex.cfcav2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ToyotaYaris extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toyota_yaris);

        PDFView pdfView = findViewById(R.id.toyotayarispdf);

        pdfView.fromAsset("toyota_yaris.pdf").load();
    }
}