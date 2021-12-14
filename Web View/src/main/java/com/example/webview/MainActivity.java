package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = findViewById(R.id.webView);
        webView.loadUrl("https://www.google.com/search?q=hello&ei=QBq4YYrOBJ2VseMPrveU2As&oq=heelo&gs_lcp=Cgdnd3Mtd2l6EAMYADIHCAAQRxCwAzIHCAAQRxCwAzIHCAAQRxCwAzIHCAAQRxCwAzIHCAAQRxCwAzIHCAAQRxCwAzIHCAAQRxCwAzIHCAAQRxCwAzIHCAAQsAMQQzIQCC4QxwEQ0QMQyAMQsAMQQzIKCC4QyAMQsAMQQzIKCC4QyAMQsAMQQ0oECEEYAEoECEYYAFAAWABgyBFoAXACeACAAQCIAQCSAQCYAQDIAQzAAQE&sclient=gws-wiz");

        // enable javascript
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setDomStorageEnabled(true);
    }
}
