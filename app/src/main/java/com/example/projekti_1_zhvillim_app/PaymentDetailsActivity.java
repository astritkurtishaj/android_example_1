package com.example.projekti_1_zhvillim_app;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PaymentDetailsActivity extends AppCompatActivity {

    Button button;
    TextView textView, textViewTest, tvLoginHere;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_details);

        button = findViewById(R.id.btnNext);
        textView = findViewById(R.id.tvInfo);
        editText = findViewById(R.id.etView);

        textView.setText("Payment Information Step 1/2 changed");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(PaymentDetailsActivity.this, ConfirmationActivity.class);
                String string = "test";
                intent.putExtra("celesi", string);
                startActivity(intent);

                Toast.makeText(PaymentDetailsActivity.this, "You pressed Next", Toast.LENGTH_LONG).show();


            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(data == null){
            Toast.makeText(this, "Ska te dhena", Toast.LENGTH_SHORT).show();
            return;
        }
        if(requestCode == 1 && resultCode == RESULT_OK ){
            String result = data.getStringExtra("celesi");
            Toast.makeText(this, "Rezultati " + result, Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    public void onBackPressed(){
        showAlertDialog();

    }

    private void showAlertDialog() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        alertDialogBuilder.setTitle("Stop the program");
        alertDialogBuilder.setMessage("Do you want to close the program");
        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

        @Override
    protected void onStart(){
        super.onStart();
        System.out.println("metoda e thirrur eshte onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        System.out.println("metoda e thirrur eshte onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        System.out.println("metoda e thirrur eshte onPause");
    }

    @Override
    protected  void onStop(){
        super.onStop();
        System.out.println("metoda e thirrur eshte onStop");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        System.out.println("metoda e thirrur eshte onRestart");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        System.out.println("metoda e thirrur eshte onDestroy");
    }

}