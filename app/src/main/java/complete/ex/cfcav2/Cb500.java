package complete.ex.cfcav2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Cb500 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cb500);

        PDFView pdfView = findViewById(R.id.cb500pdf);

        // pdfView.fromAsset("bmw_moto.pdf").load();

    }
}