package com.example.easylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFCE2Opener extends AppCompatActivity {

    PDFView myPDFViewer1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfce2_opener);

        myPDFViewer1 = (PDFView) findViewById(R.id.pdfViewer1);
        String getItem = getIntent().getStringExtra("pdfFileName");

        if(getItem.equals("Discrete Mathematics")){
            myPDFViewer1.fromAsset("Discrete_Math_6th_edition.pdf").load();
        }

        if(getItem.equals("Digital Electronics & Logical Design")){
            myPDFViewer1.fromAsset("Modern Digital Electronics by RP Jain.pdf").load();
        }

        if(getItem.equals("Data Structure & Algorithms")){
            myPDFViewer1.fromAsset("ebe2b24635f8fd9555bee411cf1bd405f008.pdf").load();
        }

        if(getItem.equals("Computer Organization & Architecture")){
            myPDFViewer1.fromAsset("ComputerOrganizationAndDesign5thEdition2014.pdf").load();
        }

        if(getItem.equals("Object Oriented Programming")){
            myPDFViewer1.fromAsset("e_balagurusamy-object_oriented_programming_with_c.pdf").load();
        }

    }

}

