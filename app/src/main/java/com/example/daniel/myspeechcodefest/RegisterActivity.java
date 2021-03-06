package com.example.daniel.myspeechcodefest;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.v4.text.TextUtilsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{

    private Button etRegister;
    private EditText editText4, editText3, etPassword, etUsername, etCPassword;
    Typeface tf1, tf2, tf3, tf4, tf5;
    private ProgressDialog progressNote;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        auth = FirebaseAuth.getInstance();
        progressNote = new ProgressDialog(this);
        etRegister = (Button)findViewById(R.id.etRegister);
        editText4 = (EditText) findViewById((R.id.editText4));
        etPassword = (EditText) findViewById(R.id.editText3);
        etRegister.setOnClickListener(this);

        tf5 = Typeface.createFromAsset(getAssets(), "Comfortaa-Bold.ttf");

        etRegister.setTypeface(tf5);
    }

    private void registerUser(){
        String email = editText4.getText().toString().trim();
        String password = etPassword.getText().toString().trim();
        if(TextUtils.isEmpty(email)){
            //Email is empty
            Toast.makeText(this, "Please enter an email", Toast.LENGTH_SHORT).show();
            //Stops function
            return;
        }
        if(TextUtils.isEmpty(password)){
            //Password is empty
            Toast.makeText(this, "Please enter a password", Toast.LENGTH_SHORT).show();
            //Stops function
            return;
        }

        //progressNote.setMessage("Registering User");
        //progressNote.show();

        auth.createUserWithEmailAndPassword(email, password)
            //If completed messages
            .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        //Successful
                        Toast.makeText(RegisterActivity.this, "Registered!", Toast.LENGTH_SHORT).show();
                        Button loginPageToSelectionScreen = (Button) findViewById(R.id.etRegister);
                        loginPageToSelectionScreen.setOnClickListener(new View.OnClickListener(){
                            @Override
                            public void onClick(View view2){
                                Intent intent2 = new Intent(RegisterActivity.this,SelectionScreen.class);
                                startActivity(intent2);
                            }
                        });

                    } else {
                        Toast.makeText(RegisterActivity.this, "On to the next step!", Toast.LENGTH_SHORT).show();
                        Button loginPageToSelectionScreen = (Button) findViewById(R.id.etRegister);
                        loginPageToSelectionScreen.setOnClickListener(new View.OnClickListener(){
                            @Override
                            public void onClick(View view2){
                                Intent intent2 = new Intent(RegisterActivity.this,SelectionScreen.class);
                                startActivity(intent2);
                            }
                        });
                    }
                }
            });
    }
    @Override
    public void onClick(View view) {
        if (view == etRegister) {
            registerUser();
        }

    }
}
