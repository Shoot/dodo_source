package com.inappstory.sdk.stories.ui.views;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.inappstory.sdk.InAppStoryManager;
import com.inappstory.sdk.R;
import com.inappstory.sdk.stories.api.models.logs.WebConsoleLog;
import java.util.UUID;
/* loaded from: classes3.dex */
public class IASWebView extends WebView {
    public IASWebView(@NonNull Context context) {
        super(context);
        init();
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(@NonNull String str, ValueCallback<String> valueCallback) {
        Log.d("InAppStory_SDK_Game", str);
        super.evaluateJavascript(str, valueCallback);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void init() {
        getSettings().setCacheMode(2);
        setBackgroundColor(getResources().getColor(R.color.black));
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setLayerType(2, null);
        getSettings().setTextZoom(100);
        getSettings().setAllowContentAccess(true);
        getSettings().setAllowFileAccess(true);
        if (Build.VERSION.SDK_INT >= 23) {
            getSettings().setOffscreenPreRaster(true);
        }
        setClickable(true);
        getSettings().setJavaScriptEnabled(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String injectUnselectableStyle(String str) {
        return str.replace("<head>", "<head><style>*{-webkit-touch-callout: none;-webkit-user-select: none;-khtml-user-select: none;-moz-user-select: none;-ms-user-select: none;user-select: none;} </style>");
    }

    public void sendWebConsoleLog(ConsoleMessage consoleMessage, String str, int i) {
        WebConsoleLog webConsoleLog = new WebConsoleLog();
        webConsoleLog.timestamp = System.currentTimeMillis();
        webConsoleLog.id = UUID.randomUUID().toString();
        webConsoleLog.logType = consoleMessage.messageLevel().name();
        webConsoleLog.message = consoleMessage.message();
        webConsoleLog.sourceId = consoleMessage.sourceId();
        webConsoleLog.lineNumber = consoleMessage.lineNumber();
        webConsoleLog.storyId = str;
        webConsoleLog.slideIndex = i;
        InAppStoryManager.sendWebConsoleLog(webConsoleLog);
    }

    public String setDir(String str) {
        String str2;
        try {
            if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
                str2 = "rtl";
            } else {
                str2 = "ltr";
            }
            return str.replace("{{%dir}}", str2);
        } catch (Exception unused) {
            return str;
        }
    }

    public IASWebView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public IASWebView(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
