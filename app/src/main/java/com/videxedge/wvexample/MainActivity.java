package com.videxedge.wvexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView wVmain;
    String strurl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wVmain = (WebView) findViewById(R.id.wVmain);

        wVmain.getSettings().setJavaScriptEnabled(true);
        wVmain.setWebViewClient(new MyWebViewClient());

        strurl="https://www.ynet.co.il/home/0,7340,L-8,00.html";

        wVmain.loadUrl(strurl);
    }

    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
