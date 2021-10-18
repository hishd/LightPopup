package com.hishd.lightpopup;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnSingleAction).setOnClickListener(v -> {
            new LightPopup(this)
                    .createSingleActionDialog()
                    .setCancelledOnOutside(false)
                    .setTitle("Single Action")
                    .setMessage("This is a single action dialog with containing only a single button.")
                    .setBtn1Caption("Cancel")
                    .setBtn1Color(R.color.red)
                    .setBtn1Action(Dialog::dismiss).show();
        });

        findViewById(R.id.btnDualAction).setOnClickListener(v -> {
            new LightPopup(this)
                    .createDualActionDialog()
                    .setCancelledOnOutside(false)
                    .setTitle("Apply Job")
                    .setMessage("This is a single action dialog with containing two buttons with different actions.")
                    .setBtn1Caption("Cancel")
                    .setBtn1Color(R.color.red)
                    .setBtn1Action(Dialog::dismiss)
                    .setBtn2Caption("Ok")
                    .setBtn2Color(R.color.blue_light)
                    .setBtn2Action(Dialog::dismiss).show();
        });
    }
}