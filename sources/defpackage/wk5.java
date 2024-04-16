package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: LandingSMSFragmentData.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\n\u0010\u0011¨\u0006\u0016"}, d2 = {"Lwk5;", "", "", "toString", "", "hashCode", "other", "", "equals", "Ldt5;", "a", "Ldt5;", "b", "()Ldt5;", "locality", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", "phoneNumber", "address", "<init>", "(Ldt5;Ljava/lang/String;Ljava/lang/String;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: wk5  reason: default package */
/* loaded from: classes4.dex */
public final class wk5 {
    private final dt5 a;
    private final String b;
    private final String c;

    public wk5(dt5 dt5Var, String str, String str2) {
        z65.h(dt5Var, "locality");
        z65.h(str, "phoneNumber");
        z65.h(str2, "address");
        this.a = dt5Var;
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        return this.c;
    }

    public final dt5 b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk5)) {
            return false;
        }
        wk5 wk5Var = (wk5) obj;
        if (z65.c(this.a, wk5Var.a) && z65.c(this.b, wk5Var.b) && z65.c(this.c, wk5Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        dt5 dt5Var = this.a;
        String str = this.b;
        String str2 = this.c;
        return "LandingSMSFragmentData(locality=" + dt5Var + ", phoneNumber=" + str + ", address=" + str2 + ")";
    }
}
