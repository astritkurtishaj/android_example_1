package com.example.projekti_1_zhvillim_app;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ConfirmationActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        String text = getIntent().getStringExtra("test");
        System.out.println("Stringu ne ardhje: "+ text);

        button = findViewById(R.id.btnSubmitPayment);
        textView = findViewById(R.id.tvInformation);
        editText = findViewById(R.id.etEmail);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String string = editText.getText().toString();
                textView.setText(string);

            }
        });
    }



}