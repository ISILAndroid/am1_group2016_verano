package com.isil.examplesandroidjava.fundamentals;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.isil.examplesandroidjava.R;

/**
 * Fundamentos de Java
 * Referencia:
 *      http://www.java-examples.com/java-language-fundamentals
 *      https://docs.oracle.com/javase/tutorial/java/nutsandbolts/
 *      https://github.com/vhf/free-programming-books/blob/master/free-programming-books-es.md#java
 */
public class JavaFundamentalsActivity extends AppCompatActivity {

    private static final String TAG = "JavaFundamentalsA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_fundamentals);
        app();
    }

    private void app() {
        //TODO escribir código aquí

    }

    private void writeLine(Object object)
    {
        Log.v(TAG, "--> " + object);
    }
}
