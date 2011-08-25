/*
 * Copyright 2011 MITIAN Technology, Co., Ltd. All rights reserved.
 */
package com.toby;

import android.app.Activity;
import android.os.Bundle;
import android.widget.DatePicker;

/**
 * UserInputActivity.java
 * 
 * @author baojun
 */
public class UserInputActivity extends Activity {

    private DatePicker datePicker;

    /*
     * (non-Javadoc)
     * @see android.app.Activity#onCreate(android.os.Bundle)
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_dialog);
        datePicker = (DatePicker) findViewById(R.id.datePicker1);
    }

}
