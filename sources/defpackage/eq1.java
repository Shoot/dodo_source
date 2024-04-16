package defpackage;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.NonNull;
/* compiled from: ConfigurationCompat.java */
/* renamed from: eq1  reason: default package */
/* loaded from: classes.dex */
public final class eq1 {

    /* compiled from: ConfigurationCompat.java */
    /* renamed from: eq1$a */
    /* loaded from: classes.dex */
    static class a {
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    @NonNull
    public static os5 a(@NonNull Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return os5.e(a.a(configuration));
        }
        return os5.a(configuration.locale);
    }
}
