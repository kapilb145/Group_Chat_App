package com.google.firebase.kapil.friendlychat;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private EditText userName, userPassword;
    private Button login;
    private String name = "Text", password = "Text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userName = (EditText) findViewById(R.id.userName);
        userPassword = (EditText) findViewById(R.id.userPassword);
        login = (Button) findViewById(R.id.loginButton);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (data()) {
                    if (userName.getText().toString().equals("Text") && userPassword.getText().toString().equals("Text")) {
                        startActivity(new Intent(LoginActivity.this, feesList.class));
                        finish();
                    } else {

                        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(LoginActivity.this, R.style.MyDialogTheme);

                        dialogBuilder
                                .setTitle("Wrong Credentials")
                                .setMessage("Please put valid user name & password")

                                // Specifying a listener allows you to take an action before dismissing the dialog.
                                // The dialog is automatically dismissed when a dialog button is clicked.
                                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        // Continue with delete operation
                                        dialog.cancel();
                                    }
                                })

                                // A null listener allows the button to dismiss the dialog and take no further action.
//                                .setNegativeButton(android.R.string.no, null)
                                .setIcon(android.R.drawable.ic_dialog_alert)
                                .show();
                    }
                }
            }
        });

    }

    private boolean data() {
        name = userName.getText().toString();
        password = userPassword.getText().toString();

        if (TextUtils.isEmpty(name)) {
            userName.setError("Name can't be blank");
            userName.requestFocus();
            return  false;
        } else if (TextUtils.isEmpty(password)) {
            userPassword.setError("Password can't be blank");
            userPassword.requestFocus();
            return false;
        } else {
            return true;
        }
    }
}