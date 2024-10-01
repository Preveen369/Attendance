package com.example.attendance;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {

    FirebaseAuth mAuth1;
    EditText emailId1, password1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth1 = FirebaseAuth.getInstance();

        emailId1 = findViewById(R.id.email1);
        password1 = findViewById(R.id.pass1);
    }

    public void login(View view) {

        String EmailId = emailId1.getText().toString();
        String Password = password1.getText().toString();

        if (TextUtils.isEmpty(EmailId)) {
            emailId1.setError("Cannot be Empty");
            emailId1.requestFocus();
        } else if (TextUtils.isEmpty(Password)) {
            password1.setError("Cannot be Empty");
            password1.requestFocus();
        } else {
            mAuth1.signInWithEmailAndPassword(EmailId, Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(Login.this, "Logged in successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(Login.this, Home.class));
                    } else {
                        Toast.makeText(Login.this, "Failed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
    public void register(View view) {
        startActivity(new Intent(this,Register.class));
    }
}
