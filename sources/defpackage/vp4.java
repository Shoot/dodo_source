package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import androidx.annotation.NonNull;
/* compiled from: HtmlCompat.java */
@SuppressLint({"InlinedApi"})
/* renamed from: vp4  reason: default package */
/* loaded from: classes.dex */
public final class vp4 {

    /* compiled from: HtmlCompat.java */
    /* renamed from: vp4$a */
    /* loaded from: classes.dex */
    static class a {
        static Spanned a(String str, int i) {
            return Html.fromHtml(str, i);
        }

        static Spanned b(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i, imageGetter, tagHandler);
        }

        static String c(Spanned spanned, int i) {
            return Html.toHtml(spanned, i);
        }
    }

    @NonNull
    public static Spanned a(@NonNull String str, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(str, i);
        }
        return Html.fromHtml(str);
    }
}
