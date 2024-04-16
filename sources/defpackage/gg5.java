package defpackage;

import android.app.Dialog;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: KeyboardUtils.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0000\u001a\f\u0010\n\u001a\u00020\t*\u00020\u0000H\u0002¨\u0006\u000b"}, d2 = {"Landroid/view/View;", "", "f", c.a, "Landroid/app/Dialog;", "dialog", e.a, DateTokenConverter.CONVERTER_KEY, "a", "Landroid/view/inputmethod/InputMethodManager;", "b", "android_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: gg5  reason: default package */
/* loaded from: classes.dex */
public final class gg5 {
    public static final void a(View view) {
        z65.h(view, "<this>");
        view.clearFocus();
        c(view);
    }

    private static final InputMethodManager b(View view) {
        Object systemService = view.getContext().getSystemService("input_method");
        z65.f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) systemService;
    }

    public static final void c(View view) {
        z65.h(view, "<this>");
        b(view).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static final void d(View view) {
        z65.h(view, "<this>");
        view.requestFocus();
        f(view);
    }

    public static final void e(View view, Dialog dialog) {
        Window window;
        z65.h(view, "<this>");
        view.requestFocus();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(4);
        }
    }

    public static final void f(View view) {
        z65.h(view, "<this>");
        b(view).showSoftInput(view, 1);
    }
}
