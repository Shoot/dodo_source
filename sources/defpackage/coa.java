package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.material.snackbar.Snackbar;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: SnackBarExtensions.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0012\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\n\u001a\u00020\u0001*\u00020\u0000\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0015\u0010\u0012\u001a\u00020\u000f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/google/android/material/snackbar/Snackbar;", "", DateTokenConverter.CONVERTER_KEY, "", "lineCounts", c.a, "", "paddingDP", e.a, "f", "g", "Landroid/view/View;", "a", "(Lcom/google/android/material/snackbar/Snackbar;)Landroid/view/View;", "contentView", "Landroidx/appcompat/widget/AppCompatTextView;", "b", "(Lcom/google/android/material/snackbar/Snackbar;)Landroidx/appcompat/widget/AppCompatTextView;", "textView", "android_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: coa  reason: default package */
/* loaded from: classes.dex */
public final class coa {
    public static final View a(Snackbar snackbar) {
        ViewGroup viewGroup;
        z65.h(snackbar, "<this>");
        View D = snackbar.D();
        if (D instanceof ViewGroup) {
            viewGroup = (ViewGroup) D;
        } else {
            viewGroup = null;
        }
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return null;
        }
        return viewGroup.getChildAt(0);
    }

    public static final AppCompatTextView b(Snackbar snackbar) {
        z65.h(snackbar, "<this>");
        View findViewById = snackbar.D().findViewById(ky8.snackbar_text);
        z65.g(findViewById, "findViewById(...)");
        return (AppCompatTextView) findViewById;
    }

    public static final void c(Snackbar snackbar, int i) {
        z65.h(snackbar, "<this>");
        b(snackbar).setMaxLines(i);
    }

    public static final void d(Snackbar snackbar) {
        z65.h(snackbar, "<this>");
        snackbar.D().setBackground(new ColorDrawable(iu1.c(snackbar.w(), 17170445)));
        View a = a(snackbar);
        if (a != null) {
            a.setBackground(iu1.e(snackbar.w(), kx8.black_6dp_rounded_corners));
        }
    }

    public static final void e(Snackbar snackbar, float f) {
        z65.h(snackbar, "<this>");
        int a = mpb.a(f, snackbar.w());
        snackbar.D().setPadding(a, a, a, a);
    }

    public static final void f(Snackbar snackbar) {
        z65.h(snackbar, "<this>");
        int a = mpb.a(16.0f, snackbar.w());
        ViewGroup.LayoutParams layoutParams = b(snackbar).getLayoutParams();
        z65.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
        b(snackbar).setLayoutParams(marginLayoutParams);
        b(snackbar).setPadding(0, 0, 0, 0);
        View a2 = a(snackbar);
        if (a2 != null) {
            a2.setPadding(a, 0, a, 0);
        }
    }

    public static final void g(Snackbar snackbar) {
        z65.h(snackbar, "<this>");
        edb.o(b(snackbar), p19.TextAppearance_Dodo_Text_M);
        b(snackbar).setTextColor(iu1.c(snackbar.w(), jw8.m));
    }
}
