package defpackage;

import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: AssistantSharingData.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lbw;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lnt;", "a", "Lnt;", "()Lnt;", "result", "<init>", "(Lnt;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: bw  reason: default package */
/* loaded from: classes2.dex */
public final class bw implements Serializable {
    private final nt a;

    public bw(nt ntVar) {
        z65.h(ntVar, "result");
        this.a = ntVar;
    }

    public final nt a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof bw) && z65.c(this.a, ((bw) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        nt ntVar = this.a;
        return "AssistantSharingData(result=" + ntVar + ")";
    }
}
