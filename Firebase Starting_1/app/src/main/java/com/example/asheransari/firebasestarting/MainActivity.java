package com.example.asheransari.firebasestarting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase mFirebaseDatabase;
    DatabaseReference mReference;
    private EditText mValue;
    private Button apBtn;
Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirebaseDatabase = FirebaseDatabase.getInstance();
        mReference = mFirebaseDatabase.getReference();
//        mButton = (Button)findViewById(R.id.btn);
        apBtn = (Button)findViewById(R.id.btn);
        mValue = (EditText)findViewById(R.id.value);
        apBtn = (Button)findViewById(R.id.btn);
        mValue = (EditText)findViewById(R.id.value);
        apBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseReference reference = mReference.child("name");
//                reference.setValue("Asher Ansari");
                String value = mValue.getText().toString();
                reference.setValue(value);
            }
        });
    }
}
