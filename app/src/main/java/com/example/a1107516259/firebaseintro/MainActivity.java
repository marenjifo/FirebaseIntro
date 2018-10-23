package com.example.a1107516259.firebaseintro;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        auth=FirebaseAuth.getInstance();

        auth.createUserWithEmailAndPassword("mar@hotmail.com","12345678").addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(!task.isSuccessful()){

                }else{
                    Toast.makeText(MainActivity.this,"ERROR: "+task.getException(),Toast.LENGTH_SHORT).show();
                } Toast.makeText(MainActivity.this,"Registro existoso",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
