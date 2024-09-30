package com.example.attendance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    Button mark,absent;
    EditText name;
    private DatabaseReference mdatabaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mark=findViewById(R.id.btn);
        absent=findViewById(R.id.btn2);
        name=findViewById(R.id.name);
        mdatabaseReference=FirebaseDatabase.getInstance().getReference();

        mark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mname=name.getText().toString();
                mdatabaseReference.child(mname).setValue("Present");
                Toast.makeText(MainActivity.this, "Attendance Marked", Toast.LENGTH_SHORT).show();
            }
        });
        absent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mname=name.getText().toString();
                mdatabaseReference.child(mname).setValue("Absent");
                Toast.makeText(MainActivity.this, "Attendance Marked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

