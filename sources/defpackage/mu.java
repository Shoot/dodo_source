package defpackage;

import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: AssistantMoodData.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013¨\u0006\u0017"}, d2 = {"Lmu;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lss;", "a", "Lss;", "C", "()Lss;", "environment", "Lsv;", "b", "Lsv;", "()Lsv;", "settings", "<init>", "(Lss;Lsv;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: mu  reason: default package */
/* loaded from: classes2.dex */
public final class mu implements Serializable {
    private final ss a;
    private final sv b;

    public mu(ss ssVar, sv svVar) {
        z65.h(ssVar, "environment");
        z65.h(svVar, "settings");
        this.a = ssVar;
        this.b = svVar;
    }

    public final ss C() {
        return this.a;
    }

    public final sv a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu)) {
            return false;
        }
        mu muVar = (mu) obj;
        if (z65.c(this.a, muVar.a) && z65.c(this.b, muVar.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        ss ssVar = this.a;
        sv svVar = this.b;
        return "AssistantMoodData(environment=" + ssVar + ", settings=" + svVar + ")";
    }
}
