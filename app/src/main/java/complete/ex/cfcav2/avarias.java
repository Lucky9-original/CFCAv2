package complete.ex.cfcav2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelUuid;
import android.view.View;
import android.widget.Button;

public class avarias extends AppCompatActivity {

    public Button MX5836;
    public Button MX5837;
    public Button MX5838;
    public Button MX6532;
    public Button MX2208;
    public Button MX2214;
    public Button MX5667;
    public Button MX5668;
    public Button MX5669;
    public Button MX5670;
    public Button MX5671;
    public Button MX5673;
    public Button MX5674;
    public Button MX5675;
    public Button MX0492;
    public Button MX4264;
    public Button ME9565;
    public Button MX1080;
    public Button MX1082;
    public Button MX1083;
    public Button MX1086;
    public Button MX1088;
    public Button MX1089;
    public Button MX1091;
    public Button MX1097;
    public Button MX1099;
    public Button MX1102;
    public Button MX5894;
    public Button MX5895;
    public Button MX5896;
    public Button MX5897;
    public Button MX1603;
    public Button MX4408;
    public Button MX4342;
    public Button MX5892;
    public Button MX5893;
    public Button MX4588;
    public Button MX5678;
    public Button MX5679;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avarias);

        MX5836 = findViewById(R.id.MX5836);
        MX5837 = findViewById(R.id.MX5837);
        MX5838 = findViewById(R.id.MX5838);
        MX6532 = findViewById(R.id.MX6532);
        MX2208 = findViewById(R.id.MX2208);
        MX2214 = findViewById(R.id.MX2214);
        MX5667 = findViewById(R.id.MX5667);
        MX5668 = findViewById(R.id.MX5668);
        MX5669 = findViewById(R.id.MX5669);
        MX5670 = findViewById(R.id.MX5670);
        MX5671 = findViewById(R.id.MX5671);
        MX5673 = findViewById(R.id.MX5673);
        MX5674 = findViewById(R.id.MX5674);
        MX5675 = findViewById(R.id.MX5675);
        MX0492 = findViewById(R.id.MX0492);
        MX4264 = findViewById(R.id.MX4264);
        ME9565 = findViewById(R.id.ME9565);
        MX1080 = findViewById(R.id.MX1080);
        MX1082 = findViewById(R.id.MX1082);
        MX1083 = findViewById(R.id.MX1083);
        MX1086 = findViewById(R.id.MX1086);
        MX1088 = findViewById(R.id.MX1088);
        MX1089 = findViewById(R.id.MX1089);
        MX1091 = findViewById(R.id.MX1091);
        MX1097 = findViewById(R.id.MX1097);
        MX1099 = findViewById(R.id.MX1099);
        MX1102 = findViewById(R.id.MX1102);
        MX5894 = findViewById(R.id.MX5894);
        MX5895 = findViewById(R.id.MX5895);
        MX5896 = findViewById(R.id.MX5896);
        MX5897 = findViewById(R.id.MX5897);
        MX1603 = findViewById(R.id.MX1603);
        MX4408 = findViewById(R.id.MX4408);
        MX4342 = findViewById(R.id.MX4342);
        MX5892 = findViewById(R.id.MX5892);
        MX5893 = findViewById(R.id.MX5893);
        MX4588 = findViewById(R.id.MX4588);
        MX5678 = findViewById(R.id.MX5678);
        MX5679 = findViewById(R.id.MX5679);

        MX5836.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/1OLRbuOZl2KsmLVM8ltgx4NX1_d1YM1Yi/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX5837.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/1eT5jS6esD2HNhRnpyLhWLClNkJHgQF80/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX5838.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/1oAUse1DvGGHH6F-oshLtSe5wR0UuLOwb/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX6532.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/1uoIKTwCUzgdYW7GcaE8belI_8uoLqrdD/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX2208.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/1SC9MMklkAxpLNdPohf1WSgJCPXrBkZ8Z/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX2214.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/1q-g2cmP9pedICdHSm9sbYL-YCKGP58Lm/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX5667.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/11qBI0YISdPC9rN_OIiFQ5ww25vBfRMl-/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX5668.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/1qS7W_FlP8xgVCaRRs3EZif9oxeT4DfGK/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX5669.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/1mHRFyVP9QkyGkNINEJTDNim2CzWPrC00/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX5670.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/1gq83e2I-NiSA8D8vi6-cMNIcXbkq-L1u/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX5671.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/1aAUMyLfdrwZl-URCiakPfnR8ME50oUVt/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX5673.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/1satutl0zJQMrAK49ujgRKdmJ-xIfwI_n/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX5674.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/1XcdwH8zdOtayJTZMY-LyYu2fNOfLHDbz/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX5675.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/1luGmzNSoq2cRUtTISFmGBiJAgcFUGRUr/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });
        MX0492.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/15fbP9nDbVx6k8o4gDdfjfmw21-Coa0_E/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });
        MX4264.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/1aOVS4Q6mn3ACcqK-Mbi2lkjmsYrXETff/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });
        ME9565.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/1EeBCGJGRHmpxNQaDHupAStIDFBcNFbMW/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX1080.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/1P6VHIqQCkh5EUaxeUHJn5tWbvACCBJCX/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX1082.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/19utEN5oFdSNK4E7e82lV-ibfVZ4D9-Yx/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX1083.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/1KDtk3wFlc16EsREBPP9dsCLnI00Nxygl/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX1086.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/1wGQs04UpcJGduBVaIKoOsh17rL18J6-m/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX1088.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/1nYS9ZiTVF443UpPMYvXtl-IIPWpOYLPr/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX1089.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/11YPjsFQ0WYM5h86S9xnj7-qvv4Xa2uYz/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX1091.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/1df4Arxtx9J11RQ54QHAkD-X1NT08d8p_/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX1097.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/1VR95uwljhvz23SHdtAUE6wcJhsxkYx6m/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX1099.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/1FlDoEc2924LHFQ3F1mT_PQqMgvyOaHnvmbR56pbwpdY/edit?usp=sharing"));
                startActivity(intent);
            }
        });

        MX1102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/1e2yXqaJDed1ZzWdN5_WjulRp2FC6adRz/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX5894.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/1bevDg_ADGKo6wg9kcKDourztaDywk2YZ/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX5895.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/1f0Wln0jxYJBlkT1x_RJvlOGgoH5nGgI_/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX5896.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/1F8ZGtV0uEc_0RF2W8MD1Y4ZUuJXGuOY8/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX5897.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/1-rpwvVqx6Zst0TORFN9NW13WQPV8Ly8r/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX1603.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/12R4oavoVxlaHnyXICady1LxEPde6oyn2/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX4408.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/1keDM59qF1_f89JydAqsbs_4pwn4lNBeE/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX4342.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/12ptoZQyY_zpfgAdAD-bPx6YAgPhO-v4o/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX5892.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/1GwovIpKwdWgH0X7gO4V2AuPpredyPKUN/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX5893.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/19gbiObHI66lk0yzTxbbBEumwYyrKXqvZ/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX4588.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/1h1KdB_EIJ800Dnd1oMGo51KbZhXTMozf/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX5678.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/181Ppovj70m94aUizhH_iGJ4GBt8h2JAq/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

        MX5679.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/document/d/1JDoX7rrjUvo8auKco4HDw_NGSZzMnQWz/edit?usp=sharing&ouid=104259794850948687504&rtpof=true&sd=true"));
                startActivity(intent);
            }
        });

    }
}