package im.threads.ui.activities;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.MetricAffectingSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.appcompat.app.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import im.threads.R;
import im.threads.business.imageLoading.ImageLoader;
import im.threads.business.useractivity.UserActivityTime;
import im.threads.business.useractivity.UserActivityTimeProvider;
import im.threads.ui.ChatStyle;
import im.threads.ui.config.Config;
import im.threads.ui.utils.FontUtilsKt;
import im.threads.ui.utils.ScreenSizeGetter;
import im.threads.ui.utils.TypefaceSpanEdna;
import kotlin.Metadata;
/* compiled from: BaseActivity.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0015J\b\u0010\n\u001a\u00020\u0005H\u0014J\b\u0010\u000b\u001a\u00020\u0005H\u0014J\u0012\u0010\u000e\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\fH\u0005J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0004J\u001c\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0004J*\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0004¨\u0006\""}, d2 = {"Lim/threads/ui/activities/BaseActivity;", "Landroidx/appcompat/app/c;", "Landroid/graphics/Typeface;", "Landroid/text/style/MetricAffectingSpan;", "getTypefaceSpan", "", "calculateSizeOfScreen", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onStart", "onStop", "", RemoteMessageConst.Notification.COLOR, "getColorInt", "Landroid/view/MotionEvent;", "ev", "", "dispatchTouchEvent", "isStatusBarLight", "setStatusBarColor", "", "text", "Landroid/widget/TextView;", "titleTextView", "setTitle", "textColor", "fontSize", "typeface", "Landroid/text/SpannableString;", "titleText", "applyToolbarTextStyle", "<init>", "()V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public abstract class BaseActivity extends c {
    private final void calculateSizeOfScreen() {
        Config.Companion.getInstance().setScreenSize$threads_release(new ScreenSizeGetter().getScreenSize(this));
    }

    private final MetricAffectingSpan getTypefaceSpan(Typeface typeface) {
        if (Build.VERSION.SDK_INT >= 28) {
            return FontUtilsKt.typefaceSpanCompatV28(typeface);
        }
        return new TypefaceSpanEdna(typeface);
    }

    private static final void onCreate$lambda$0() {
        throw new NullPointerException("Config instance is not initialized. Called from business logic?");
    }

    public static /* synthetic */ void setTitle$default(BaseActivity baseActivity, String str, TextView textView, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                textView = null;
            }
            baseActivity.setTitle(str, textView);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTitle");
    }

    protected final void applyToolbarTextStyle(int i, int i2, Typeface typeface, SpannableString spannableString) {
        z65.h(spannableString, "titleText");
        int length = spannableString.length();
        spannableString.setSpan(new ForegroundColorSpan(i), 0, length, 18);
        spannableString.setSpan(new AbsoluteSizeSpan(i2, false), 0, length, 33);
        if (typeface != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                spannableString.setSpan(x60.a(typeface), 0, length, 18);
            } else {
                spannableString.setSpan(getTypefaceSpan(typeface), 0, length, 18);
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        z65.h(motionEvent, "ev");
        UserActivityTime lastUserActivityTimeCounter = UserActivityTimeProvider.INSTANCE.getLastUserActivityTimeCounter();
        if (motionEvent.getAction() == 0) {
            lastUserActivityTimeCounter.updateLastUserActivityTime();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    protected final int getColorInt(int i) {
        return iu1.c(this, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, defpackage.gm1, android.app.Activity
    @SuppressLint({"SourceLockedOrientationActivity"})
    public void onCreate(Bundle bundle) {
        setRequestedOrientation(1);
        super.onCreate(bundle);
        calculateSizeOfScreen();
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.d, android.app.Activity
    protected void onStart() {
        super.onStart();
        invalidateOptionsMenu();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.c, androidx.fragment.app.d, android.app.Activity
    public void onStop() {
        ImageLoader.Companion.clearLoader();
        super.onStop();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setStatusBarColor(boolean z, int i) {
        boolean z2;
        getWindow().setStatusBarColor(i);
        if (Build.VERSION.SDK_INT >= 23) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            new z5c(getWindow(), getWindow().getDecorView()).b(z);
            z5c P = syb.P(getWindow().getDecorView());
            if (P != null) {
                P.b(!z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setTitle(String str, TextView textView) {
        Typeface createFromAsset;
        z65.h(str, "text");
        ChatStyle chatStyle = Config.Companion.getInstance().getChatStyle();
        int c = iu1.c(this, chatStyle.chatToolbarTextColorResId);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.ecc_text_big);
        String str2 = chatStyle.defaultFontRegular;
        Typeface typeface = null;
        if (str2 != null && (createFromAsset = Typeface.createFromAsset(getAssets(), str2)) != null) {
            z65.g(createFromAsset, "createFromAsset(assets, typefaceUri)");
            typeface = Typeface.create(createFromAsset, 0);
        }
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            SpannableString spannableString = new SpannableString(str);
            applyToolbarTextStyle(c, dimensionPixelSize, typeface, spannableString);
            if (textView != null) {
                textView.setText(spannableString);
            } else {
                supportActionBar.w(spannableString);
            }
        }
    }
}
