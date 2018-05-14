package com.example.captain.myfirstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class WritingTheName extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_writing_the_name);

        TextView textView = findViewById(R.id.textView3);
        String s = getIntent().getStringExtra("HENT_NAVNET");
        textView.setText(s);


    }








/*
    public void onClick(View view){
        TextView textView = findViewById(R.id.textView3);
        //til at hente

        startActivityForResult(new Intent("com.example.captain.myfirstapplication.MainActivity"),1);
    }
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        if(requestCode==1){
            if (resultCode==RESULT_OK){
                Toast.makeText(this,data.getData().toString(), Toast.LENGTH_SHORT).show();
                String hello= "";
                hello = data.getData().toString();
                Log.d("hello","Hello World");
            }
        }
    }*/
}
