package com.example.easylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFCivil2Opener extends AppCompatActivity {

    PDFView myPDFViewer1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfcivil2_opener);

        myPDFViewer1 = (PDFView) findViewById(R.id.pdfViewer1);
        String getItem = getIntent().getStringExtra("pdfFileName");

        if(getItem.equals("Building Technology and Materials")){
            myPDFViewer1.fromAsset("Advances in Civil Engineering and Building Materials IV By Shuenn-Yih Chang and Suad Khalid Al Bahar and Adel Abdulmajeed M Husain and Jingying Zhao.pdf").load();
        }

        if(getItem.equals("Fluid Mechanics I")){
            myPDFViewer1.fromAsset("Advances in Fluid Mechanics IX.pdf").load();
        }

        if(getItem.equals("Geotechnical Engineering")){
            myPDFViewer1.fromAsset("C._Venkataramaiah_Geotechnical_Engineer.pdf").load();
        }


    }
}
