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

public class BranchActivity extends AppCompatActivity {

    Button CSE;
    Button ME;
    Button Civil;
    Button EE;
    FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch);

        mFirebaseAuth = FirebaseAuth.getInstance();
        CSE = findViewById(R.id.button);
        ME = findViewById(R.id.button4);
        Civil = findViewById(R.id.button3);
        EE = findViewById(R.id.button5);

        CSE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intCSE = new Intent(BranchActivity.this,YearActivity.class);
                startActivity(intCSE);
            }
        });

        ME.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intME = new Intent(BranchActivity.this,YearActivity.class);
                startActivity(intME);
            }
        });

        EE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intEE = new Intent(BranchActivity.this,YearActivity.class);
                startActivity(intEE);
            }
        });

        Civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intCivil = new Intent(BranchActivity.this,YearCivilActivity.class);
                startActivity(intCivil);
            }
        });
    }

}
