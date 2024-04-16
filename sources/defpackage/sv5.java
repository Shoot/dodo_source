package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: LocationIcons.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\t\u0010\u0010¨\u0006\u0015"}, d2 = {"Lsv5;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "b", "()I", "iconType", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", "lightThemeUrl", "darkThemeUrl", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: sv5  reason: default package */
/* loaded from: classes4.dex */
public final class sv5 {
    private final int a;
    private final String b;
    private final String c;

    public sv5(int i, String str, String str2) {
        z65.h(str, "lightThemeUrl");
        z65.h(str2, "darkThemeUrl");
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        return this.c;
    }

    public final int b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv5)) {
            return false;
        }
        sv5 sv5Var = (sv5) obj;
        if (this.a == sv5Var.a && z65.c(this.b, sv5Var.b) && z65.c(this.c, sv5Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        int i = this.a;
        String str = this.b;
        String str2 = this.c;
        return "LocationIcons(iconType=" + i + ", lightThemeUrl=" + str + ", darkThemeUrl=" + str2 + ")";
    }
}
