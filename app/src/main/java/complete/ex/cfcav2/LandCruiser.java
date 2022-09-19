package complete.ex.cfcav2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class LandCruiser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_land_cruiser);

        PDFView pdfView = findViewById(R.id.landcruiserpdf);

        pdfView.fromAsset("land_cruiser.pdf").load();
    }
}