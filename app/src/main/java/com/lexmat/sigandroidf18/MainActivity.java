package com.lexmat.sigandroidf18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onChangeText(View view) {
        TextView t = findViewById(R.id.textView);
        t.setText("Woah you pressed my button!");
    }

    public void moveToList(View view) {
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }

    public void moveToEdit(View view) {
        Intent intent = new Intent(this, EditActivity.class);
        startActivity(intent);
    }

    public void moveToFragment(View view) {
        Intent intent = new Intent(this, FragmentActivity.class);
        startActivity(intent);
    }
}
