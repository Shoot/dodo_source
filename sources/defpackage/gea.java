package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: SessionEvent.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\n\u0010\u0016¨\u0006\u001a"}, d2 = {"Lgea;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lll3;", "a", "Lll3;", "b", "()Lll3;", "eventType", "Llea;", "Llea;", c.a, "()Llea;", "sessionData", "Lop;", "Lop;", "()Lop;", "applicationInfo", "<init>", "(Lll3;Llea;Lop;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* renamed from: gea  reason: default package */
/* loaded from: classes2.dex */
public final class gea {
    private final ll3 a;
    private final lea b;
    private final op c;

    public gea(ll3 ll3Var, lea leaVar, op opVar) {
        z65.h(ll3Var, "eventType");
        z65.h(leaVar, "sessionData");
        z65.h(opVar, "applicationInfo");
        this.a = ll3Var;
        this.b = leaVar;
        this.c = opVar;
    }

    public final op a() {
        return this.c;
    }

    public final ll3 b() {
        return this.a;
    }

    public final lea c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gea)) {
            return false;
        }
        gea geaVar = (gea) obj;
        if (this.a == geaVar.a && z65.c(this.b, geaVar.b) && z65.c(this.c, geaVar.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "SessionEvent(eventType=" + this.a + ", sessionData=" + this.b + ", applicationInfo=" + this.c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
