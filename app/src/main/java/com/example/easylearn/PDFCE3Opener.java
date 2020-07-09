package com.example.easylearn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFCE3Opener extends AppCompatActivity {

    PDFView myPDFViewer2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfce3_opener);

        myPDFViewer2 = (PDFView) findViewById(R.id.pdfViewer2);
        String getItem = getIntent().getStringExtra("pdfFileName");

        if(getItem.equals("Theory Of Computation")){
            myPDFViewer2.fromAsset("22_Introduction_to.pdf").load();
        }

        if(getItem.equals("Database Management System")){
            myPDFViewer2.fromAsset("epdf.pub_database-system-concepts-6th-edition.pdf").load();
        }

        if(getItem.equals("Software Engineering & Project Management")){
            myPDFViewer2.fromAsset("RPL-7th_ed_software_engineering_a_practitioners_approach_by_roger_s._pressman_.pdf").load();
        }

        if(getItem.equals("Computer Networks")){
            myPDFViewer2.fromAsset("Computer_Networks_5th_Edition_Andrew_S_T.pdf").load();
        }

        if(getItem.equals("Information Systems & Engineering Economics")){
            myPDFViewer2.fromAsset("0132775425.pdf").load();
        }

    }
}
