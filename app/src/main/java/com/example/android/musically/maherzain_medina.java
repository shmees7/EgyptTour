package com.example.android.musically;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class maherzain_medina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maherzain_medina);
    }
    public void back(View view) {
        Intent intent = new Intent(this,shakera_lalala.class);
        startActivity(intent);
        finish();
    }
    public void forward(View view) {
        Intent intent = new Intent(this,eminem_notafraid.class);
        startActivity(intent);
        finish();
    }
    public void main(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
