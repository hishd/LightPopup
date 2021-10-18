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
                    .setBackgroundColor(R.color.white)
                    .setTitleColor(R.color.blue_light)
                    .setMessageColor(R.color.black)
                    .setBtn1CaptionColor(R.color.white)
                    .setBtn1AllCaps(false)
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
                    .setBackgroundColor(R.color.white)
                    .setTitleColor(R.color.blue_light)
                    .setMessageColor(R.color.black)
                    .setBtn1CaptionColor(R.color.white)
                    .setBtn2CaptionColor(R.color.white)
                    .setBtn1AllCaps(false)
                    .setBtn2AllCaps(false)
                    .setCancelledOnOutside(false)
                    .setTitle("Dual Action")
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