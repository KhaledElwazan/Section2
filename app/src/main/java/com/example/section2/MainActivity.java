package com.example.section2;

import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submitButton = findViewById(R.id.submit_button);
        EditText fullName = findViewById(R.id.full_name);

        submitButton.setOnClickListener(e -> {

            String name = fullName.getText().toString();
            System.out.println("Name: " + name);

        });

    }
}