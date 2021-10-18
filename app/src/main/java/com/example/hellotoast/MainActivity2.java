package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        set_count();

}
    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.text_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }
    public void set_count(){
        textView =(TextView) findViewById(R.id.text_message);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        if(textView!=null) {textView.setText(message);}
    }
}