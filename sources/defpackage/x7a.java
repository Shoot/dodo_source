package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: SelectPizzeriaFragmentData.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u0013\u0012\u0006\u0010\u001c\u001a\u00020\u0018\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010$\u001a\u00020!¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\n\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010 \u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010$\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b\u000f\u0010#¨\u0006'"}, d2 = {"Lx7a;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "I", DateTokenConverter.CONVERTER_KEY, "()I", "resultId", "b", "Z", "()Z", "closeOnPizzeriaSelected", "Ldt5;", c.a, "Ldt5;", "()Ldt5;", "locality", "Ln8a;", "Ln8a;", "f", "()Ln8a;", KustoStorage.KustoTable.COLUMN_SOURCE, e.a, "Ljava/lang/String;", "()Ljava/lang/String;", "selectedPizzeriaId", "Lgn3;", "Lgn3;", "()Lgn3;", "expectedPizzeriaType", "<init>", "(IZLdt5;Ln8a;Ljava/lang/String;Lgn3;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: x7a  reason: default package */
/* loaded from: classes4.dex */
public final class x7a implements Serializable {
    private final int a;
    private final boolean b;
    private final dt5 c;
    private final n8a d;
    private final String e;
    private final gn3 f;

    public x7a(int i, boolean z, dt5 dt5Var, n8a n8aVar, String str, gn3 gn3Var) {
        z65.h(dt5Var, "locality");
        z65.h(n8aVar, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(gn3Var, "expectedPizzeriaType");
        this.a = i;
        this.b = z;
        this.c = dt5Var;
        this.d = n8aVar;
        this.e = str;
        this.f = gn3Var;
    }

    public final boolean a() {
        return this.b;
    }

    public final gn3 b() {
        return this.f;
    }

    public final dt5 c() {
        return this.c;
    }

    public final int d() {
        return this.a;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7a)) {
            return false;
        }
        x7a x7aVar = (x7a) obj;
        if (this.a == x7aVar.a && this.b == x7aVar.b && z65.c(this.c, x7aVar.c) && this.d == x7aVar.d && z65.c(this.e, x7aVar.e) && this.f == x7aVar.f) {
            return true;
        }
        return false;
    }

    public final n8a f() {
        return this.d;
    }

    public int hashCode() {
        int hashCode;
        int a = ((((((this.a * 31) + a91.a(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((a + hashCode) * 31) + this.f.hashCode();
    }

    public String toString() {
        int i = this.a;
        boolean z = this.b;
        dt5 dt5Var = this.c;
        n8a n8aVar = this.d;
        String str = this.e;
        gn3 gn3Var = this.f;
        return "SelectPizzeriaFragmentData(resultId=" + i + ", closeOnPizzeriaSelected=" + z + ", locality=" + dt5Var + ", source=" + n8aVar + ", selectedPizzeriaId=" + str + ", expectedPizzeriaType=" + gn3Var + ")";
    }
}
