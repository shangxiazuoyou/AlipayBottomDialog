package com.shangxiazuoyou.alipaybottomdialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import library.shangxiazuoyou.alipaybottomdialog.PayPassDialog;
import library.shangxiazuoyou.alipaybottomdialog.PayPassView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnOpen = findViewById(R.id.btn_open);
        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                payDialog();
            }
        });
    }

    private void payDialog() {
        final PayPassDialog payPassDialog = new PayPassDialog(this);
        payPassDialog.setOutColse(true);
        payPassDialog.getPayViewPass()
                .setPayClickListener(new PayPassView.OnPayClickListener() {

                    @Override
                    public void onPassFinish(String passContent) {

                    }

                    @Override
                    public void onPayClose() {
                        payPassDialog.dismiss();
                    }

                    @Override
                    public void onPayForget() {

                    }
                });
    }
}
