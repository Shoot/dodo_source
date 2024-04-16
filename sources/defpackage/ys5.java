package defpackage;

import android.os.LocaleList;
import java.util.Locale;
/* compiled from: LocaleListPlatformWrapper.java */
/* renamed from: ys5  reason: default package */
/* loaded from: classes.dex */
final class ys5 implements us5 {
    private final LocaleList a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ys5(Object obj) {
        this.a = ws5.a(obj);
    }

    @Override // defpackage.us5
    public Object a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        boolean equals;
        equals = this.a.equals(((us5) obj).a());
        return equals;
    }

    @Override // defpackage.us5
    public Locale get(int i) {
        Locale locale;
        locale = this.a.get(i);
        return locale;
    }

    public int hashCode() {
        int hashCode;
        hashCode = this.a.hashCode();
        return hashCode;
    }

    @Override // defpackage.us5
    public int size() {
        int size;
        size = this.a.size();
        return size;
    }

    public String toString() {
        String localeList;
        localeList = this.a.toString();
        return localeList;
    }
}
