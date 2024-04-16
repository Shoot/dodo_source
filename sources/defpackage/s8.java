package defpackage;

import com.dodopizza.kustoworker.KustoStorage;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: AddressListFragmentData.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Ls8;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "I", "()I", "resultId", "Lz8;", "b", "Lz8;", "()Lz8;", KustoStorage.KustoTable.COLUMN_SOURCE, "<init>", "(ILz8;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: s8  reason: default package */
/* loaded from: classes4.dex */
public final class s8 implements Serializable {
    private final int a;
    private final z8 b;

    public s8(int i, z8 z8Var) {
        z65.h(z8Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        this.a = i;
        this.b = z8Var;
    }

    public final int a() {
        return this.a;
    }

    public final z8 b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8)) {
            return false;
        }
        s8 s8Var = (s8) obj;
        if (this.a == s8Var.a && this.b == s8Var.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public String toString() {
        int i = this.a;
        z8 z8Var = this.b;
        return "AddressListFragmentData(resultId=" + i + ", source=" + z8Var + ")";
    }
}
