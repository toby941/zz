package com.toby;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class ZZActivity extends Activity {
    private WebView wv = null;
    private WebSettings ws = null;
    private Button button = null;
    private Button userInputButton = null;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.i("START", "start");
        wv = (WebView) findViewById(R.id.webView);
        ws = wv.getSettings();
        ws.setAllowFileAccess(true);// 设置允许访问文件数据
        ws.setJavaScriptEnabled(true);// 设置支持javascript脚本
        ws.setBuiltInZoomControls(true);// 设置支持缩放
        wv.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // 当有新连接时，使用当前的 WebView
                view.loadUrl(url);
                return true;
            }
        });
        // wv.loadUrl("http://www.163.com");
        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent().setClass(ZZActivity.this, MapActivity.class));
            }
        });
        userInputButton = (Button) findViewById(R.id.button2);
        userInputButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent().setClass(ZZActivity.this, UserInputActivity.class));
            }
        });
    }
}
