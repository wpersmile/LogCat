package com.example.wper_smile.logcat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=(Button)findViewById(R.id.setButton);
        final TextView tex=(TextView)findViewById(R.id.showTextView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str="我改变了";
                /*这里我想看下str是否被赋值*/
                Log.v("logcat","str="+str);
                Log.d("logcat","str="+str);
                Log.i("logcat","str="+str);
                Log.w("logcat","str="+str);
                Log.e("logcat","str="+str);
                tex.setText(str);
            }
        });

    }
}
