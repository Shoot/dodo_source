package defpackage;

import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: AssistantWelcomeData.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lnw;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lss;", "a", "Lss;", "C", "()Lss;", "environment", "<init>", "(Lss;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: nw  reason: default package */
/* loaded from: classes2.dex */
public final class nw implements Serializable {
    private final ss a;

    public nw(ss ssVar) {
        z65.h(ssVar, "environment");
        this.a = ssVar;
    }

    public final ss C() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof nw) && z65.c(this.a, ((nw) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        ss ssVar = this.a;
        return "AssistantWelcomeData(environment=" + ssVar + ")";
    }
}
