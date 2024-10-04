package com.example.attendance;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity {

    FirebaseAuth mAuth;
    EditText emailId,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mAuth = FirebaseAuth.getInstance();

        emailId=findViewById(R.id.email);
        password=findViewById(R.id.pass);
    }

    public void register(View view) {

        String EmailId=emailId.getText().toString();
        String Password=password.getText().toString();

        if(TextUtils.isEmpty(EmailId)){
            emailId.setError("Cannot be Empty");
            emailId.requestFocus();
        }
        else if(TextUtils.isEmpty(Password)){
            password.setError("Cannot be Empty");
            password.requestFocus();
        }

        else {
            mAuth.createUserWithEmailAndPassword(EmailId,Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful())
                    {
                        Toast.makeText(Register.this, "Account registered successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(Register.this,Home.class));
                    }
                    else{
                        Toast.makeText(Register.this, "Failed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
    public void login(View view) {
        startActivity(new Intent(this,Login.class));
    }
}
