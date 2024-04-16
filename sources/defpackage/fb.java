package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: certificates.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0013"}, d2 = {"Lfb;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "algorithm", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "parameters", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
/* renamed from: fb  reason: default package */
/* loaded from: classes3.dex */
public final class fb {
    private final String a;
    private final Object b;

    public fb(String str, Object obj) {
        z65.h(str, "algorithm");
        this.a = str;
        this.b = obj;
    }

    public final String a() {
        return this.a;
    }

    public final Object b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb)) {
            return false;
        }
        fb fbVar = (fb) obj;
        if (z65.c(this.a, fbVar.a) && z65.c(this.b, fbVar.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Object obj = this.b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "AlgorithmIdentifier(algorithm=" + this.a + ", parameters=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
