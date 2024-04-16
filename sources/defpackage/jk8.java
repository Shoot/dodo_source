package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: PrizotekaLevel.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\n\u0010\u0011¨\u0006\u0016"}, d2 = {"Ljk8;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "D", "b", "()D", "minCartValue", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", "progressDescription", "giftDescription", "<init>", "(DLjava/lang/String;Ljava/lang/String;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jk8  reason: default package */
/* loaded from: classes2.dex */
public final class jk8 {
    private final double a;
    private final String b;
    private final String c;

    public jk8(double d, String str, String str2) {
        z65.h(str, "progressDescription");
        z65.h(str2, "giftDescription");
        this.a = d;
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        return this.c;
    }

    public final double b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jk8)) {
            return false;
        }
        jk8 jk8Var = (jk8) obj;
        if (Double.compare(this.a, jk8Var.a) == 0 && z65.c(this.b, jk8Var.b) && z65.c(this.c, jk8Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((nkb.a(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        double d = this.a;
        String str = this.b;
        String str2 = this.c;
        return "PrizotekaLevel(minCartValue=" + d + ", progressDescription=" + str + ", giftDescription=" + str2 + ")";
    }
}
