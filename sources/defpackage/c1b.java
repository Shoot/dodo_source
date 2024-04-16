package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: certificates.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lc1b;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lfb;", "a", "Lfb;", "()Lfb;", "algorithm", "Lpb0;", "b", "Lpb0;", "()Lpb0;", "subjectPublicKey", "<init>", "(Lfb;Lpb0;)V", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
/* renamed from: c1b  reason: default package */
/* loaded from: classes3.dex */
public final class c1b {
    private final fb a;
    private final pb0 b;

    public c1b(fb fbVar, pb0 pb0Var) {
        z65.h(fbVar, "algorithm");
        z65.h(pb0Var, "subjectPublicKey");
        this.a = fbVar;
        this.b = pb0Var;
    }

    public final fb a() {
        return this.a;
    }

    public final pb0 b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1b)) {
            return false;
        }
        c1b c1bVar = (c1b) obj;
        if (z65.c(this.a, c1bVar.a) && z65.c(this.b, c1bVar.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "SubjectPublicKeyInfo(algorithm=" + this.a + ", subjectPublicKey=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
