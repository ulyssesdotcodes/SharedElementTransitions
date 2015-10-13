package com.ulyssesp.elementtransitions;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DialogFragment imageFragment = ImageDialogFragment.newInstance();
        imageFragment.show(getSupportFragmentManager(), ImageDialogFragment.class.getName());
    }
}
