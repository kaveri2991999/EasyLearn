package com.example.easylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFOpener extends AppCompatActivity {

    PDFView myPDFViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfopener);

        myPDFViewer = (PDFView) findViewById(R.id.pdfViewer);
        String getItem = getIntent().getStringExtra("pdfFileName");

        if(getItem.equals("Engineering Mathematics-1")){
            myPDFViewer.fromAsset("ADVANCED ENGINEERING MATHEMATICS BY ERWIN ERESZIG1.pdf").load();
        }

        if(getItem.equals("Engineering Physics")){
            myPDFViewer.fromAsset("Halliday_-_Fundamentals_of_Physics_Exten.pdf").load();
        }

        if(getItem.equals("Engineering Mechanics")){
            myPDFViewer.fromAsset("Mechanics.pdf").load();
        }

        if(getItem.equals("Basic Electrical Engineering")){
            myPDFViewer.fromAsset("Electrical.pdf").load();
        }

        if(getItem.equals("Python")){
            myPDFViewer.fromAsset("[Romano,_Fabrizio]_Learning_Python___learn_to_code(z-lib.org).pdf").load();
        }

    }

}
