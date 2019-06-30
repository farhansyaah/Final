package com.dimas.projectpi;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Mulai extends AppCompatActivity {
    Pertanyaan Libray = new Pertanyaan();
    Button tbl1, tbl2, tbl3, tbl4;
    TextView prty;
    int nomor = 0;
    TextView skor;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulai);
        skor = (TextView) findViewById(R.id.skor);
        tbl1 = (Button) findViewById(R.id.btnTombol1);
        tbl2 = (Button) findViewById(R.id.btnTombol2);
        tbl3 = (Button) findViewById(R.id.btnTombol3);
        tbl4 = (Button) findViewById(R.id.btnTombol4);
        prty = (TextView) findViewById(R.id.txtPertanyaan);

        skor.setText(" " + i);

        updateQuestion(nomor);
        updatePilihan(nomor);

        tbl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tbl1.getText() == Libray.getAnswer(nomor))
                {
                    Toast.makeText(Mulai.this, "JAWABAN KAMU BENAR", Toast.LENGTH_SHORT).show();
                    nomor++ ;
                    i +=100;
                    skor.setText(" " + i);
                    updateQuestion(nomor);
                    updatePilihan(nomor);

                } else {

                    Toast.makeText(Mulai.this, "Jawaban Anda Salah !!! ", Toast.LENGTH_SHORT).show();
                    nomor++;
                    i -=50;
                    skor.setText(" " + i);
                   gameOver();
                }
            }
        });

        tbl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tbl2.getText() == Libray.getAnswer(nomor)) {
                    Toast.makeText(Mulai.this, "JAWABAN KAMU BENAR", Toast.LENGTH_SHORT).show();
                    nomor++;
                    i +=100;
                    skor.setText(" " + i);
                    updateQuestion(nomor);
                    updatePilihan(nomor);

                } else {

                    Toast.makeText(Mulai.this, "Jawaban Anda Salah !!! ", Toast.LENGTH_SHORT).show();
                    nomor++;
                    i -=50;
                    skor.setText(" " + i);
                    gameOver();
                }
            }


        });

        tbl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tbl3.getText() == Libray.getAnswer(nomor)) {
                    Toast.makeText(Mulai.this, "JAWABAN KAMU BENAR", Toast.LENGTH_SHORT).show();
                    nomor++;
                    i +=100;
                    skor.setText(" " + i);
                    updateQuestion(nomor);
                    updatePilihan(nomor);

                } else {

                    Toast.makeText(Mulai.this, "Jawaban Anda Salah !!! ", Toast.LENGTH_SHORT).show();
                    nomor++;
                    i -=50;
                    skor.setText(" " + i);
                    gameOver();
                }
            }


        });

        tbl4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tbl4.getText() == Libray.getAnswer(nomor)) {
                    Toast.makeText(Mulai.this, "JAWABAN KAMU BENAR", Toast.LENGTH_SHORT).show();
                    nomor++;
                    i +=100;
                    skor.setText(" " + i);
                    updateQuestion(nomor);
                    updatePilihan(nomor);


                } else {

                    Toast.makeText(Mulai.this, "Jawaban Anda Salah !!! ", Toast.LENGTH_SHORT).show();
                    nomor++;
                    i -=50;
                    skor.setText(" " + i);
                    gameOver();
                }
            }


        });

    }

    private void updatePilihan(int order) {

        tbl1.setText(Libray.getChoice1(order));
        tbl2.setText(Libray.getChoice2(order));
        tbl3.setText(Libray.getChoice3(order));
        tbl4.setText(Libray.getChoice4(order));
    }

    private void updateQuestion(int order) {
        prty.setText(Libray.getQuestion(order));
        Libray.getQuestion(order);
    }

    //INI ADALAH DIALOG BUILDER


    public void gameOver() {
        AlertDialog.Builder allertDialogBuilder = new AlertDialog.Builder(Mulai.this);
        allertDialogBuilder
                .setMessage("GAME OVER ! Skor Kamu Adalah " + i + " POINTS.")
                .setCancelable(false)
                .setPositiveButton("Bermain Lagi",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                startActivity(new Intent(getApplicationContext(),Mulai.class));
                                finish();
                            }
                        })

                .setNegativeButton("KELUAR",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                finish();
                            }
                        });
        AlertDialog alertDialog = allertDialogBuilder.create();
        alertDialog.show();
    }

}
