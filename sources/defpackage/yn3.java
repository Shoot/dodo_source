package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.Metadata;
/* compiled from: Extentions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Landroid/view/View;", "", "a", "yandex-captcha_release"}, k = 2, mv = {1, 4, 2})
/* renamed from: yn3  reason: default package */
/* loaded from: classes2.dex */
public final class yn3 {
    public static final void a(View view) {
        z65.h(view, "$this$showKeyboard");
        Object systemService = view.getContext().getSystemService("input_method");
        if (systemService != null) {
            ((InputMethodManager) systemService).showSoftInput(view, 1);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }
}
