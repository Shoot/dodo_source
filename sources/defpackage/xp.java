package defpackage;

import im.threads.business.transport.MessageAttributes;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: ApplyAction.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lxp;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lyp;", "a", "Lyp;", "()Lyp;", MessageAttributes.TYPE, "b", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Lyp;Ljava/lang/String;)V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: xp  reason: default package */
/* loaded from: classes.dex */
public final class xp implements Serializable {
    private final yp a;
    private final String b;

    public xp(yp ypVar, String str) {
        z65.h(ypVar, MessageAttributes.TYPE);
        z65.h(str, "value");
        this.a = ypVar;
        this.b = str;
    }

    public final yp a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp)) {
            return false;
        }
        xp xpVar = (xp) obj;
        if (this.a == xpVar.a && z65.c(this.b, xpVar.b)) {
            return true;
        }
        return false;
    }

    public final String getValue() {
        return this.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        yp ypVar = this.a;
        String str = this.b;
        return "ApplyAction(type=" + ypVar + ", value=" + str + ")";
    }
}
