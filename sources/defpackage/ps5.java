package defpackage;

import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
/* compiled from: LocaleListCompatWrapper.java */
/* renamed from: ps5  reason: default package */
/* loaded from: classes.dex */
final class ps5 implements us5 {
    private static final Locale[] c = new Locale[0];
    private static final Locale d = new Locale("en", "XA");
    private static final Locale e = new Locale("ar", "XB");
    private static final Locale f = os5.b("en-Latn");
    private final Locale[] a;
    @NonNull
    private final String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ps5(@NonNull Locale... localeArr) {
        if (localeArr.length == 0) {
            this.a = c;
            this.b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    b(sb, locale2);
                    if (i < localeArr.length - 1) {
                        sb.append(CoreConstants.COMMA_CHAR);
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException("list[" + i + "] is null");
            }
        }
        this.a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.b = sb.toString();
    }

    static void b(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb.append(CoreConstants.DASH_CHAR);
            sb.append(locale.getCountry());
        }
    }

    @Override // defpackage.us5
    public Object a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ps5)) {
            return false;
        }
        Locale[] localeArr = ((ps5) obj).a;
        if (this.a.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.a;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    @Override // defpackage.us5
    public Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public int hashCode() {
        int i = 1;
        for (Locale locale : this.a) {
            i = (i * 31) + locale.hashCode();
        }
        return i;
    }

    @Override // defpackage.us5
    public int size() {
        return this.a.length;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.a;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < this.a.length - 1) {
                    sb.append(CoreConstants.COMMA_CHAR);
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
