package complete.ex.cfcav2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnCto1;
    private Button btnCto2;
    private Button btnCto3;
    private Button btnCto4a;
    private Button btnCto4b;

    private Button btnCto6;
    private Button btnCto7;
    private Button btnCto8;
    private Button btnCto9;
    private Button btnCto10;
    private Button btnCto11;
    private Button btnCto12;
    private Button btnCto13;
    private Button btnCto14;
    private Button btnCto15;

    private Button btnCto2_8;
    private Button btnCto4_7;
    private Button btnCto4_7_8;
    private Button btnCto4_7_8_2;
    private Button btnCto4_7_9;
    private Button btnCto4_7_10;
    private Button btnCto4a_10;
    private Button btnCto4a_13;
    private Button btnCto10_13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCto1 = (Button) findViewById(R.id.btnCto1);
        btnCto2 = (Button) findViewById(R.id.btnCto2);
        btnCto3 = (Button) findViewById(R.id.btnCto3);
        btnCto4a = (Button) findViewById(R.id.btnCto4a);
        btnCto4b = (Button) findViewById(R.id.btnCto4b);

        btnCto6 = (Button) findViewById(R.id.btnCto6);
        btnCto7 = (Button) findViewById(R.id.btnCto7);
        btnCto8 = (Button) findViewById(R.id.btnCto8);
        btnCto9 = (Button) findViewById(R.id.btnCto9);
        btnCto10 = (Button) findViewById(R.id.btnCto10);
        btnCto11 = (Button) findViewById(R.id.btnCto11);
        btnCto12 = (Button) findViewById(R.id.btnCto12);
        btnCto13 = (Button) findViewById(R.id.btnCto13);
        btnCto14 = (Button) findViewById(R.id.btnCto14);
        btnCto15 = (Button) findViewById(R.id.btnCto15);

        btnCto2_8 = (Button) findViewById(R.id.btnCto2_8);
        btnCto4_7 = (Button) findViewById(R.id.btnCto4_7);
        btnCto4_7_8 = (Button) findViewById(R.id.btnCto4_7_8);
        btnCto4_7_8_2 = (Button) findViewById(R.id.btnCto4_7_8_2);
        btnCto4_7_9 = (Button) findViewById(R.id.btnCto4_7_9);
        btnCto4_7_10 = (Button) findViewById(R.id.btnCto4_7_10);
        btnCto4a_10 = (Button) findViewById(R.id.btnCto4a_10);
        btnCto4a_13 = (Button) findViewById(R.id.btnCto4a_13);
        btnCto10_13 = (Button) findViewById(R.id.btnCto10_13);


        btnCto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick1();
            }

        });

        btnCto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick2();
            }

        });

        btnCto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick3();
            }

        });

        btnCto4a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick4a();
            }

        });

        btnCto4b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick4b();
            }

        });

        btnCto6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick6();
            }

        });

        btnCto7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick7();
            }

        });

        btnCto8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick8();
            }

        });

        btnCto9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick9();
            }

        });

        btnCto10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick10();
            }

        });

        btnCto12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick12();
            }

        });

        btnCto13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick13();
            }

        });

        btnCto14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick14();
            }

        });

        btnCto15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick15();
            }

        });

        btnCto2_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick2_8();
            }

        });

        btnCto4_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick4_7();
            }

        });
        btnCto4_7_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick4_7_8();
            }

        });
        btnCto4_7_8_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick4_7_8_2();
            }

        });

        btnCto4_7_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick4_7_9();
            }

        });

        btnCto4_7_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick4_7_10();
            }

        });

        btnCto4a_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick4a_10();
            }

        });

        btnCto4a_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick4a_13();
            }

        });

        btnCto10_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick10_13();
            }

        });

    }

    public void onClick1() {

    }

    public void onClick2() {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://goo.gl/maps/8X41jJYvyEtbmzTp8"));
        startActivity(intent);
    }

    public void onClick3() {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://goo.gl/maps/EmcQ6vrS9bCTmrFC8"));
        startActivity(intent);
    }

    public void onClick4a() {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://goo.gl/maps/pB2V5Xn9qLrV9gvU7"));
        startActivity(intent);
    }

    public void onClick4b() {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://goo.gl/maps/6VqNRtJB87cMcBeSA"));
        startActivity(intent);
    }

    public void onClick6() {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://goo.gl/maps/pCJo2pXnbDUgMpZV6"));
        startActivity(intent);
    }

    public void onClick7() {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://goo.gl/maps/aj5DycNrcLmJB2aX6"));
        startActivity(intent);
    }

    public void onClick8() {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://goo.gl/maps/aSKmdnLT2RQrUQiz8"));
        startActivity(intent);
    }

    public void onClick9() {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://goo.gl/maps/4efmGXE3nEveorfJA"));
        startActivity(intent);
    }

    public void onClick10() {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://goo.gl/maps/anvjBpVKKVeSUbm27"));
        startActivity(intent);
    }

    public void onClick12() {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://goo.gl/maps/Yc2uAXh5bhSSwMtf6"));
        startActivity(intent);
    }

    public void onClick13() {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://goo.gl/maps/mJRW3uTKh9L6KqKY8"));
        startActivity(intent);
    }

    public void onClick14() {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://goo.gl/maps/F8Arp848XUBgNjXR6"));
        startActivity(intent);
    }

    public void onClick15() {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://goo.gl/maps/QCD16RXXhiJW2HX69"));
        startActivity(intent);
    }

    public void onClick2_8() {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://goo.gl/maps/uCtUmCLLR3jCiNM7A"));
        startActivity(intent);
    }

    public void onClick4_7() {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://goo.gl/maps/ixsw4XokNJWush3q7"));
        startActivity(intent);
    }

    public void onClick4_7_8() {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://goo.gl/maps/VPv6qTUJ6HGLpDdi8"));
        startActivity(intent);
    }

    public void onClick4_7_8_2() {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://goo.gl/maps/1ZcYmdL7mDDJj26d7"));
        startActivity(intent);
    }

    public void onClick4_7_9() {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://goo.gl/maps/FJAGEDzobcnZd4Gu6"));
        startActivity(intent);
    }

    public void onClick4_7_10() {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://goo.gl/maps/DgBVC7oLVqXKrNg87"));
        startActivity(intent);
    }

    public void onClick4a_10() {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://goo.gl/maps/WeqwqGZgdY62QAQK9"));
        startActivity(intent);
    }

    public void onClick4a_13() {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://goo.gl/maps/F7ceHKQX8DzQfQBb7"));
        startActivity(intent);
    }

    public void onClick10_13() {
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("https://goo.gl/maps/xPRbey7PozAF2TRG7"));
        startActivity(intent);
    }

}