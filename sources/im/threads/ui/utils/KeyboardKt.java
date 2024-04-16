package im.threads.ui.utils;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import im.threads.ui.utils.KeyboardKt;
import kotlin.Metadata;
/* compiled from: Keyboard.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"hideKeyboard", "", "Landroid/view/View;", "delayMills", "", "showKeyboard", "threads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KeyboardKt {
    public static final void hideKeyboard(View view) {
        z65.h(view, "<this>");
        Object systemService = view.getContext().getSystemService("input_method");
        z65.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideKeyboard$lambda$0(View view) {
        z65.h(view, "$this_hideKeyboard");
        hideKeyboard(view);
    }

    public static final void showKeyboard(View view) {
        z65.h(view, "<this>");
        view.requestFocus();
        Object systemService = view.getContext().getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showKeyboard$lambda$1(View view) {
        z65.h(view, "$this_showKeyboard");
        showKeyboard(view);
    }

    public static final void hideKeyboard(final View view, long j) {
        z65.h(view, "<this>");
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: eg5
            @Override // java.lang.Runnable
            public final void run() {
                KeyboardKt.hideKeyboard$lambda$0(view);
            }
        }, j);
    }

    public static final void showKeyboard(final View view, long j) {
        z65.h(view, "<this>");
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: dg5
            @Override // java.lang.Runnable
            public final void run() {
                KeyboardKt.showKeyboard$lambda$1(view);
            }
        }, j);
    }
}
