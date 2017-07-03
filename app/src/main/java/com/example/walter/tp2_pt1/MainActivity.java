package com.example.walter.tp2_pt1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Mensaje(View v){
        text = (EditText)findViewById(R.id.Nom);
        Toast toast = Toast.makeText(getApplicationContext(), "Hola " +text.getText().toString(), Toast.LENGTH_LONG);
        toast.show();
    }
}
