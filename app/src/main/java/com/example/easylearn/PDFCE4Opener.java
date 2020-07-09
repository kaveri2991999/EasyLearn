package com.example.easylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.util.Constants;

public class PDFCE4Opener extends AppCompatActivity {

    PDFView myPDFViewer3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfce4_opener);

        myPDFViewer3 = (PDFView) findViewById(R.id.pdfViewer3);
        String getItem = getIntent().getStringExtra("pdfFileName");

        if(getItem.equals("High Performance Computing")){
            myPDFViewer3.fromAsset("HPC.pdf").load();
        }

        if(getItem.equals("Artificial Intelligence")){
            myPDFViewer3.fromAsset("AI.pdf").load();
        }

        if(getItem.equals("Digital Signal Processing")){
            myPDFViewer3.fromAsset("DSP.pdf").load();
        }
    }
}
