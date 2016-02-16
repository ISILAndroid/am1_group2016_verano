package com.isil.samplelist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.isil.samplelist.ui.activity.LCompuestaActivity;
import com.isil.samplelist.ui.activity.LSimpleActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnSimple, btnCompuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSimple= (Button)findViewById(R.id.btnSimple);
        btnCompuesta= (Button)findViewById(R.id.btnCompuesta);

        //eventos

        btnSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LSimpleActivity.class));
            }
        });

        btnCompuesta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LCompuestaActivity.class));
            }
        });

    }
}
