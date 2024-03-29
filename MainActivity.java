package com.dimas.projectpi;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mulai, tentang, keluar;
    ImageView gambar1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mulai =(Button)findViewById(R.id.btnMulai);
        tentang =(Button)findViewById(R.id.btnTentang);
        keluar =(Button)findViewById(R.id.btnKeluar);
    }
    public void clickMulai(View view){
        Intent masuk1 = new Intent(this,Mulai.class);
        startActivity(masuk1);
    }
    public void clickAbout (View view){
        Intent masuk2 = new Intent(this,Tentang.class);
        startActivity(masuk2);
    }
    public void clickKeluar (View view){
        Intent masuk3 = new Intent(this,Keluar.class);
        startActivity(masuk3);
        exitAja();
    }

    private void exitAja() {
        AlertDialog.Builder allertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        allertDialogBuilder
                .setMessage("Apakah Anda Yakin Ingin Keluar ?")
                .setCancelable(false)
                .setPositiveButton("Tidak",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                            }
                        })

                .setNegativeButton("Ya",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                startActivity(new Intent(getApplicationContext(),Keluar.class));
                                finish();
                            }
                        });
        AlertDialog alertDialog = allertDialogBuilder.create();
        alertDialog.show();
    }
}
