package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Locale;
import kotlin.Metadata;
/* compiled from: LocaleVO.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0013\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\t\u0010\u0018¨\u0006\u001c"}, d2 = {"Lct5;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, c.a, "nameCurrentLanguage", "Z", e.a, "()Z", "isSelected", DateTokenConverter.CONVERTER_KEY, "showNameCurrentLanguage", "Ljava/util/Locale;", "Ljava/util/Locale;", "()Ljava/util/Locale;", "locale", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Locale;)V", "profile_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ct5  reason: default package */
/* loaded from: classes2.dex */
public final class ct5 {
    private final String a;
    private final String b;
    private final boolean c;
    private final boolean d;
    private final Locale e;

    public ct5(String str, String str2, boolean z, boolean z2, Locale locale) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(str2, "nameCurrentLanguage");
        z65.h(locale, "locale");
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = locale;
    }

    public final Locale a() {
        return this.e;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct5)) {
            return false;
        }
        ct5 ct5Var = (ct5) obj;
        if (z65.c(this.a, ct5Var.a) && z65.c(this.b, ct5Var.b) && this.c == ct5Var.c && this.d == ct5Var.d && z65.c(this.e, ct5Var.e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a91.a(this.c)) * 31) + a91.a(this.d)) * 31) + this.e.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        Locale locale = this.e;
        return "LocaleVO(name=" + str + ", nameCurrentLanguage=" + str2 + ", isSelected=" + z + ", showNameCurrentLanguage=" + z2 + ", locale=" + locale + ")";
    }
}
