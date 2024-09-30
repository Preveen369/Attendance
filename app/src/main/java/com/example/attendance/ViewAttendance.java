package com.example.attendance;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class ViewAttendance extends AppCompatActivity {

    ListView present,absent;
    ArrayList<String> arr1=new ArrayList<>();
    ArrayList<String> arr2=new ArrayList<>();

    DatabaseReference dref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_attendance);

        present=findViewById(R.id.ls1);
        absent=findViewById(R.id.ls2);

        ArrayAdapter arrayAdapter1=new ArrayAdapter(ViewAttendance.this, android.R.layout.simple_list_item_1,arr1);
        ArrayAdapter arrayAdapter2=new ArrayAdapter(ViewAttendance.this, android.R.layout.simple_list_item_1,arr2);

        dref= FirebaseDatabase.getInstance().getReference();
        dref.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                String name=snapshot.getKey();
                String status=snapshot.getValue().toString();

                if(status.equalsIgnoreCase("Present")){
                    arr1.add(name);
                    arrayAdapter1.notifyDataSetChanged();
                }
                else {
                    arr2.add(name);
                    arrayAdapter2.notifyDataSetChanged();
                }
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                arrayAdapter1.notifyDataSetChanged();
                arrayAdapter2.notifyDataSetChanged();

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        present.setAdapter(arrayAdapter1);
        absent.setAdapter(arrayAdapter2);

    }
}