package com.example.easylearn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.firebase.auth.FirebaseUser;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;


public class YearActivity extends AppCompatActivity {

    Button FE;
    Button SE;
    Button TE;
    Button BE;
    FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year);

        mFirebaseAuth = FirebaseAuth.getInstance();
        FE = findViewById(R.id.button6);
        SE = findViewById(R.id.button7);
        TE = findViewById(R.id.button8);
        BE = findViewById(R.id.button9);

        FE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intFE = new Intent(YearActivity.this,PdfActivity.class);
                startActivity(intFE);
            }
        });

        SE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intSE = new Intent(YearActivity.this,PdfCE2Activity.class);
                startActivity(intSE);
            }
        });

        TE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intTE = new Intent(YearActivity.this,PDFCE3Activity.class);
                startActivity(intTE);
            }
        });

        BE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intBE = new Intent(YearActivity.this,PDFCE4Activity.class);
                startActivity(intBE);
            }
        });
    }

}
