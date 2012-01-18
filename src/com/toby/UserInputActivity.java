/*
 * Copyright 2011 MITIAN Technology, Co., Ltd. All rights reserved.
 */
package com.toby;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.DatePicker;
import android.widget.EditText;

/**
 * UserInputActivity.java
 * 
 * @author baojun
 */
public class UserInputActivity extends Activity {

    private DatePicker datePicker;
    private EditText dateTime;

    /*
     * (non-Javadoc)
     * @see android.app.Activity#onCreate(android.os.Bundle)
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_dialog);
        datePicker = (DatePicker) findViewById(R.id.datePicker1);
        dateTime = (EditText) findViewById(R.id.editText2);
        dateTime.setOnFocusChangeListener(new OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {

                }

            }
        });

    }
}
