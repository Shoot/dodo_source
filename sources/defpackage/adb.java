package defpackage;

import android.text.TextUtils;
import java.util.Locale;
/* compiled from: TextUtilsCompat.java */
/* renamed from: adb  reason: default package */
/* loaded from: classes.dex */
public final class adb {
    private static final Locale a = new Locale("", "");

    /* compiled from: TextUtilsCompat.java */
    /* renamed from: adb$a */
    /* loaded from: classes.dex */
    static class a {
        static int a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    public static int a(Locale locale) {
        return a.a(locale);
    }
}
