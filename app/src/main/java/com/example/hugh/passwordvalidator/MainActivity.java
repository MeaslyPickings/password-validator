package com.example.hugh.passwordvalidator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void testPassword(View view) {
        EditText editText = (EditText) findViewById(R.id.editText2);
        String password = editText.getText().toString();
        PassValidator passVal = new PassValidator();
        int numPass = passVal.validate(password);
        if (numPass < 3){
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText("Weak Password");
        }
        else if(numPass == 3){
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText("Medium Password");
        }
        else if(numPass == 4) {
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText("Strong Password");
        }
        else {
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText("Very Strong Password");
        }
    }
}
