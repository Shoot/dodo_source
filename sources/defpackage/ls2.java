package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: DeferredIntervalItem.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\t\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0017\u0010\u001c\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u001e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010 \u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001a¨\u0006#"}, d2 = {"Lls2;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", e.a, "()Ljava/lang/String;", "title", "", "b", "Ljava/lang/Long;", "()Ljava/lang/Long;", "deferredTime", "Ljs2;", c.a, "Ljs2;", "()Ljs2;", "comment", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "disabled", "suggested", "f", "isCarryout", "g", "isFasterTime", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljs2;ZZZ)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ls2  reason: default package */
/* loaded from: classes4.dex */
public final class ls2 {
    private final String a;
    private final Long b;
    private final js2 c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    public ls2(String str, Long l, js2 js2Var, boolean z, boolean z2, boolean z3) {
        z65.h(str, "title");
        this.a = str;
        this.b = l;
        this.c = js2Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public final js2 a() {
        return this.c;
    }

    public final Long b() {
        return this.b;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.e;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls2)) {
            return false;
        }
        ls2 ls2Var = (ls2) obj;
        if (z65.c(this.a, ls2Var.a) && z65.c(this.b, ls2Var.b) && z65.c(this.c, ls2Var.c) && this.d == ls2Var.d && this.e == ls2Var.e && this.f == ls2Var.f) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f;
    }

    public final boolean g() {
        if (this.b == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Long l = this.b;
        int i = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        js2 js2Var = this.c;
        if (js2Var != null) {
            i = js2Var.hashCode();
        }
        return ((((((i2 + i) * 31) + a91.a(this.d)) * 31) + a91.a(this.e)) * 31) + a91.a(this.f);
    }

    public String toString() {
        String str = this.a;
        Long l = this.b;
        js2 js2Var = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        boolean z3 = this.f;
        return "DeferredIntervalItem(title=" + str + ", deferredTime=" + l + ", comment=" + js2Var + ", disabled=" + z + ", suggested=" + z2 + ", isCarryout=" + z3 + ")";
    }
}
