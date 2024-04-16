package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: SelectPizzeriaFragmentCheckoutWrapper.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001e"}, d2 = {"Lg9a;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "I", c.a, "()I", "resultId", "Lfn3;", "b", "Lfn3;", "()Lfn3;", "expectedPizzeriaType", "Ldt5;", "Ldt5;", "()Ldt5;", "locality", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "()Ljava/lang/String;", "selectedPizzeriaId", "<init>", "(ILfn3;Ldt5;Ljava/lang/String;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: g9a  reason: default package */
/* loaded from: classes4.dex */
public final class g9a implements Serializable {
    private final int a;
    private final fn3 b;
    private final dt5 c;
    private final String d;

    public g9a(int i, fn3 fn3Var, dt5 dt5Var, String str) {
        z65.h(fn3Var, "expectedPizzeriaType");
        z65.h(dt5Var, "locality");
        this.a = i;
        this.b = fn3Var;
        this.c = dt5Var;
        this.d = str;
    }

    public final fn3 a() {
        return this.b;
    }

    public final dt5 b() {
        return this.c;
    }

    public final int c() {
        return this.a;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9a)) {
            return false;
        }
        g9a g9aVar = (g9a) obj;
        if (this.a == g9aVar.a && this.b == g9aVar.b && z65.c(this.c, g9aVar.c) && z65.c(this.d, g9aVar.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        int i = this.a;
        fn3 fn3Var = this.b;
        dt5 dt5Var = this.c;
        String str = this.d;
        return "SelectPizzeriaWrapperFragmentData(resultId=" + i + ", expectedPizzeriaType=" + fn3Var + ", locality=" + dt5Var + ", selectedPizzeriaId=" + str + ")";
    }
}
