package com.isil.examplesjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG, "Hola ISIL Android");

        AssigningValues assigningValues= new AssigningValues();
        showMessage(assigningValues.getMessage());

        BooleanType booleanType= new BooleanType();
        showMessage(booleanType.getMessage());
    }

    public void showMessage(String message)
    {
        Log.v(TAG, message);
    }
}
