package org.pursuit.testing_revisited_creating_tests;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.pursuit.testing_revisited_creating_tests.translator.SillyTranslator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("jose", SillyTranslator.getInstance().deVowel("goodbye"));
        Log.d("jose", SillyTranslator.getInstance().deConsonant("goodbye"));
    }
}
