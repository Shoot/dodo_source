package defpackage;

import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LoyaltyData.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0004HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0016"}, d2 = {"Le06;", "Ljava/io/Serializable;", "Lrba;", "sender", "", "categoryId", "a", "toString", "", "hashCode", "", "other", "", "equals", "Lrba;", c.a, "()Lrba;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "<init>", "(Lrba;Ljava/lang/String;)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: e06  reason: default package */
/* loaded from: classes2.dex */
public final class e06 implements Serializable {
    private final rba a;
    private final String b;

    public e06() {
        this(null, null, 3, null);
    }

    public final e06 a(rba rbaVar, String str) {
        return new e06(rbaVar, str);
    }

    public final String b() {
        return this.b;
    }

    public final rba c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e06)) {
            return false;
        }
        e06 e06Var = (e06) obj;
        if (this.a == e06Var.a && z65.c(this.b, e06Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        rba rbaVar = this.a;
        int i = 0;
        if (rbaVar == null) {
            hashCode = 0;
        } else {
            hashCode = rbaVar.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        rba rbaVar = this.a;
        String str = this.b;
        return "LoyaltyData(sender=" + rbaVar + ", categoryId=" + str + ")";
    }

    public e06(rba rbaVar, String str) {
        this.a = rbaVar;
        this.b = str;
    }

    public /* synthetic */ e06(rba rbaVar, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : rbaVar, (i & 2) != 0 ? null : str);
    }
}
