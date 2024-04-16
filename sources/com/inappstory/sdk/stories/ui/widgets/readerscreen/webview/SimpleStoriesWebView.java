package com.inappstory.sdk.stories.ui.widgets.readerscreen.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import ch.qos.logback.classic.net.SyslogAppender;
import com.inappstory.sdk.InAppStoryManager;
import com.inappstory.sdk.InAppStoryService;
import com.inappstory.sdk.stories.ui.views.IASWebView;
import com.inappstory.sdk.stories.ui.views.IASWebViewClient;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.ReaderPager;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.StoriesViewManager;
import com.inappstory.sdk.stories.utils.Sizes;
/* loaded from: classes3.dex */
public class SimpleStoriesWebView extends IASWebView implements SimpleStoriesView {
    boolean clientIsSet;
    float coordinate1;
    long lastTap;
    StoriesViewManager manager;
    boolean notFirstLoading;
    boolean touchSlider;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SimpleStoriesWebView.super.loadUrl(this.a);
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        final /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SimpleStoriesWebView simpleStoriesWebView = SimpleStoriesWebView.this;
            SimpleStoriesWebView.this.loadDataWithBaseURL("file:///data/", simpleStoriesWebView.setDir(simpleStoriesWebView.injectUnselectableStyle(this.a)), "text/html; charset=utf-8", "UTF-8", null);
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {
        final /* synthetic */ String a;

        c(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            SimpleStoriesWebView.this.replaceHtml(this.a);
        }
    }

    /* loaded from: classes3.dex */
    class d extends WebChromeClient {
        d() {
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            if (super.getDefaultVideoPoster() == null) {
                Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawColor(-16777216);
                return createBitmap;
            }
            return super.getDefaultVideoPoster();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            SimpleStoriesWebView simpleStoriesWebView = SimpleStoriesWebView.this;
            StoriesViewManager storiesViewManager = simpleStoriesWebView.manager;
            if (storiesViewManager != null) {
                simpleStoriesWebView.sendWebConsoleLog(consoleMessage, Integer.toString(storiesViewManager.storyId), SimpleStoriesWebView.this.manager.index);
            }
            Log.d("InAppStory_SDK_Web", consoleMessage.messageLevel().name() + ": " + consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            if (SimpleStoriesWebView.this.getManager().getProgressBar() != null) {
                SimpleStoriesWebView.this.getManager().getProgressBar().setProgress(i, 100);
            }
        }
    }

    public SimpleStoriesWebView(Context context) {
        super(context);
        this.clientIsSet = false;
        this.notFirstLoading = false;
        this.touchSlider = false;
    }

    private boolean checkIfParentsHasCubeAnimation(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        if (viewParent instanceof ReaderPager) {
            return ((ReaderPager) viewParent).cubeAnimation;
        }
        return checkIfParentsHasCubeAnimation(viewParent.getParentForAccessibility());
    }

    private String escape(String str) {
        return str.replaceAll("\"", "\\\"").replaceAll("\b", "\\b").replaceAll("\f", "\\f").replaceAll("\n", "\\n").replaceAll("\r", "\\r").replaceAll(SyslogAppender.DEFAULT_STACKTRACE_PATTERN, "\\t");
    }

    private void logMethod(String str) {
        InAppStoryManager.showDLog("JS_method_call", this.manager.storyId + " " + this.manager.loadedIndex + " " + str);
    }

    private String oldEscape(String str) {
        return str.replaceAll("\"", "\\\\\"").replaceAll("\n", " ").replaceAll("\r", " ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void replaceHtml(String str) {
        evaluateJavascript("(function(){show_slide(\"" + oldEscape(str) + "\");})()", null);
        logMethod("show_slide");
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void cancelDialog(String str) {
        loadUrl("javascript:(function(){story_send_text_input_result(\"" + str + "\", \"\");})()");
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void changeSoundStatus() {
        if (InAppStoryService.getInstance().isSoundOn()) {
            loadUrl("javascript:(function(){story_slide_enable_audio();})()");
        } else {
            loadUrl("javascript:(function(){story_slide_disable_audio();})()");
        }
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void checkIfClientIsSet() {
        if (!this.clientIsSet) {
            addJavascriptInterface(new WebAppInterface(getContext(), getManager()), "Android");
            setWebViewClient(new IASWebViewClient());
            setWebChromeClient(new d());
        }
        this.clientIsSet = true;
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void clearSlide(int i) {
        if (i < 0) {
            return;
        }
        evaluateJavascript("(function(){clear_slide(" + i + ");})()", null);
        StringBuilder sb = new StringBuilder();
        sb.append("clear_slide ");
        sb.append(i);
        logMethod(sb.toString());
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void destroyView() {
        removeAllViews();
        clearHistory();
        clearCache(true);
        loadUrl("about:blank");
        StoriesViewManager storiesViewManager = this.manager;
        storiesViewManager.loadedId = -1;
        storiesViewManager.loadedIndex = -1;
        removeAllViews();
        destroyDrawingCache();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int dpToPxExt;
        if (checkIfParentsHasCubeAnimation(getParentForAccessibility())) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.coordinate1 = motionEvent.getX();
            if (syb.E(this) == 1) {
                if (!Sizes.isTablet()) {
                    dpToPxExt = Sizes.getScreenSize().x;
                } else {
                    dpToPxExt = Sizes.dpToPxExt(400);
                }
                this.coordinate1 = dpToPxExt - this.coordinate1;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void freezeUI() {
        this.touchSlider = true;
        getParentForAccessibility().requestDisallowInterceptTouchEvent(true);
    }

    public void gameComplete(String str) {
        if (str != null) {
            loadUrl("javascript:game_complete('" + str + "')");
        } else {
            loadUrl("javascript:game_complete()");
        }
        logMethod("game_complete " + str);
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public float getCoordinate() {
        return this.coordinate1;
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public StoriesViewManager getManager() {
        return this.manager;
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void goodsWidgetComplete(String str) {
        evaluateJavascript("goods_widget_complete(\"" + str + "\");", null);
        StringBuilder sb = new StringBuilder();
        sb.append("goods_widget_complete ");
        sb.append(str);
        logMethod(sb.toString());
    }

    @Override // com.inappstory.sdk.stories.ui.views.IASWebView
    protected void init() {
        super.init();
        StoriesViewManager storiesViewManager = new StoriesViewManager(getContext());
        this.manager = storiesViewManager;
        storiesViewManager.setStoriesView(this);
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void loadJsApiResponse(String str, String str2) {
        evaluateJavascript(str2 + "('" + str + "');", null);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        post(new a(str));
    }

    public void loadWebData(String str, String str2) {
        if (this.notFirstLoading && !str2.isEmpty()) {
            post(new c(str2));
            return;
        }
        this.notFirstLoading = true;
        post(new b(str));
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (checkIfParentsHasCubeAnimation(getParentForAccessibility())) {
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            if (System.currentTimeMillis() - this.lastTap < 1500) {
                return false;
            }
            getManager().getPageManager().pauseSlide(false);
            this.lastTap = System.currentTimeMillis();
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.touchSlider = false;
            getParentForAccessibility().requestDisallowInterceptTouchEvent(false);
        }
        if (!onInterceptTouchEvent && !this.touchSlider) {
            return false;
        }
        return true;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (checkIfParentsHasCubeAnimation(getParentForAccessibility())) {
            return false;
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            if (System.currentTimeMillis() - this.lastTap < 1500) {
                return true;
            }
        } else if (motionEvent.getAction() == 1 && Sizes.isTablet()) {
            getManager().getPageManager().resumeSlide(false);
        }
        return onTouchEvent;
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void restartVideo() {
        stopVideo();
        slideStart();
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void resumeVideo() {
        loadUrl("javascript:(function() {if ('story_slide_resume' in window) { window.story_slide_resume(); }})()");
        logMethod("story_slide_resume");
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void screenshotShare() {
        evaluateJavascript("share_slide_screenshot();", null);
        logMethod("share_slide_screenshot");
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void sendDialog(String str, String str2) {
        String replaceAll = str2.replaceAll("\n", "<br>");
        loadUrl("javascript:story_send_text_input_result(\"" + str + "\", \"" + replaceAll + "\")");
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void shareComplete(String str, boolean z) {
        if (str == null) {
            return;
        }
        loadUrl("javascript:(function(){share_complete(\"" + str + "\", " + z + ");})()");
        StringBuilder sb = new StringBuilder();
        sb.append("share_complete ");
        sb.append(str);
        sb.append(" ");
        sb.append(z);
        logMethod(sb.toString());
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void slidePause() {
        loadUrl("javascript:(function(){if ('story_slide_pause' in window) { window.story_slide_pause(); }})()");
        logMethod("story_slide_pause");
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void slideStart() {
        String str;
        if (InAppStoryService.getInstance() != null && InAppStoryService.getInstance().isSoundOn()) {
            str = "story_slide_start('{\"muted\": false}');";
        } else {
            str = "story_slide_start('{\"muted\": true}');";
        }
        loadUrl("javascript:(function(){if ('story_slide_start' in window) { window." + str + "}})()");
        logMethod("story_slide_start");
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void stopVideo() {
        loadUrl("javascript:(function(){if ('story_slide_stop' in window) { window.story_slide_stop(); }})()");
        logMethod("story_slide_stop");
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void swipeUp() {
        loadUrl("javascript:window.story_slide_swipe_up()");
        logMethod("story_slide_swipe_up");
    }

    public SimpleStoriesWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.clientIsSet = false;
        this.notFirstLoading = false;
        this.touchSlider = false;
    }

    public SimpleStoriesWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.clientIsSet = false;
        this.notFirstLoading = false;
        this.touchSlider = false;
    }

    @Override // com.inappstory.sdk.stories.ui.widgets.readerscreen.storiespager.SimpleStoriesView
    public void setStoriesView(SimpleStoriesView simpleStoriesView) {
    }
}
