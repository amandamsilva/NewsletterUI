package com.example.newsletter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botaoCadastro(View view) {
        Toast msg = Toast.makeText(this, R.string.msg_id2, Toast.LENGTH_LONG);
        msg.show();
    }
}