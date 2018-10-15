package com.lexmat.sigandroidf18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
    }

    public void onClick(View view) {
        String s = ((EditText)findViewById(R.id.editText)).getText().toString();
        Intent intent = new Intent(this, RecieverActivity.class);
        intent.putExtra("editText", s);
        intent.putExtra("Number",5);
        startActivity(intent);
    }
}
