package sdu.cs58.kingkan.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    //Explicit ประกาศตัวแปล
    EditText    nameEditText,usernameEditText, passwordEditText;
    Button loginButton;
    String nameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //ผูกตัวแปลบนจาวาให้รู้จักกัน element บนxml
        nameEditText = findViewById(R.id.txtName);
        usernameEditText = findViewById(R.id.txtUsername);
        passwordEditText = findViewById(R.id.txtPassword);
        loginButton = findViewById(R.id.btnLogin);


        loginButton.OnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                nameString = nameEditText.getText().toString().trim();

                Toast.makeText(getApplicationContext(), "Hello "+nameString, Toast.LENGTH_SHORT) .show();
            }

        });


    }//end method onCreate
} //end class
