package com.example.nomorepleze;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {
    EditText emailId, password;
    Button btnSignIn;
    TextView txtSignUp;
    FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        mFirebaseAuth = FirebaseAuth.getInstance();
        emailId = findViewById(R.id.email_login);
        password = findViewById(R.id.password_login);
        txtSignUp = findViewById(R.id.forget_login);
        btnSignIn = findViewById(R.id.signin_login);

        mAuthStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser mFirebaseUser = mFirebaseAuth.getCurrentUser();
                if(mFirebaseUser != null){
                    Toast.makeText(LoginActivity.this, "You are logged in", Toast.LENGTH_SHORT).show();
                    //Intent i = new Intent(LoginActivity.this, HomeActivity.class);
                    //startActivity(i);
                    finish();
                }
                else
                {
                    Toast.makeText(LoginActivity.this, "Please Login!", Toast.LENGTH_SHORT).show();
                }
            }
        };

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailId.getText().toString();
                String pass = password.getText().toString();

                if(!(email.isEmpty() && pass.isEmpty())){
                    mFirebaseAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(!task.isSuccessful()){
                                Toast.makeText(LoginActivity.this, "Login Error! Please Login Again.", Toast.LENGTH_SHORT);
                            }
                            else
                            {
                                //Intent intentToHome = new Intent(LoginActivity.this, HomeActivity.class);
                                finish();
                                //startActivity(intentToHome);
                            }
                        }
                    });
                }
                else if(email.isEmpty() && pass.isEmpty())
                {
                    Toast.makeText(LoginActivity.this, "Fields Are Empty!", Toast.LENGTH_SHORT);
                }
                else if(email.isEmpty()){
                    emailId.setError("Please enter email ID!");
                    emailId.requestFocus();
                }
                else if(pass.isEmpty()) {
                    password.setError("Please enter your password!");
                    password.requestFocus();
                }
                else{
                    Toast.makeText(LoginActivity.this, "Error Occurred!", Toast.LENGTH_SHORT);
                }
            }
        });

        txtSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSignup = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intentSignup);
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        mFirebaseAuth.addAuthStateListener(mAuthStateListener);
    }
}
