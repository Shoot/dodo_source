package defpackage;

import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.NonNull;
import java.util.Locale;
/* compiled from: LocaleListCompat.java */
/* renamed from: os5  reason: default package */
/* loaded from: classes.dex */
public final class os5 {
    private static final os5 b = a(new Locale[0]);
    private final us5 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocaleListCompat.java */
    /* renamed from: os5$a */
    /* loaded from: classes.dex */
    public static class a {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    private os5(us5 us5Var) {
        this.a = us5Var;
    }

    @NonNull
    public static os5 a(@NonNull Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e(a.a(localeArr));
        }
        return new os5(new ps5(localeArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Locale b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (str.contains("_")) {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        } else {
            return new Locale(str);
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    @NonNull
    public static os5 e(@NonNull LocaleList localeList) {
        return new os5(new ys5(localeList));
    }

    public Locale c(int i) {
        return this.a.get(i);
    }

    public int d() {
        return this.a.size();
    }

    public boolean equals(Object obj) {
        if ((obj instanceof os5) && this.a.equals(((os5) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NonNull
    public String toString() {
        return this.a.toString();
    }
}
