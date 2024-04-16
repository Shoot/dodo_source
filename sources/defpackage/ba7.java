package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: OngoingPaymentState.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\n\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0016\u0010\u0011¨\u0006\u001a"}, d2 = {"Lba7;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lca7;", "a", "Lca7;", DateTokenConverter.CONVERTER_KEY, "()Lca7;", "status", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "navigateUrl", c.a, "md", "paReq", e.a, "termUrl", "<init>", "(Lca7;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ba7  reason: default package */
/* loaded from: classes2.dex */
public final class ba7 {
    private final ca7 a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    public ba7(ca7 ca7Var, String str, String str2, String str3, String str4) {
        z65.h(ca7Var, "status");
        z65.h(str, "navigateUrl");
        z65.h(str2, "md");
        z65.h(str3, "paReq");
        z65.h(str4, "termUrl");
        this.a = ca7Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.d;
    }

    public final ca7 d() {
        return this.a;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba7)) {
            return false;
        }
        ba7 ba7Var = (ba7) obj;
        if (this.a == ba7Var.a && z65.c(this.b, ba7Var.b) && z65.c(this.c, ba7Var.c) && z65.c(this.d, ba7Var.d) && z65.c(this.e, ba7Var.e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        ca7 ca7Var = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.e;
        return "OngoingPaymentState(status=" + ca7Var + ", navigateUrl=" + str + ", md=" + str2 + ", paReq=" + str3 + ", termUrl=" + str4 + ")";
    }
}
