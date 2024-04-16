package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
/* compiled from: certificates.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, d2 = {"Lc90;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Z", "()Z", "ca", "", "b", "Ljava/lang/Long;", "()Ljava/lang/Long;", "maxIntermediateCas", "<init>", "(ZLjava/lang/Long;)V", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
@IgnoreJRERequirement
/* renamed from: c90  reason: default package */
/* loaded from: classes3.dex */
public final class c90 {
    private final boolean a;
    private final Long b;

    public c90(boolean z, Long l) {
        this.a = z;
        this.b = l;
    }

    public final boolean a() {
        return this.a;
    }

    public final Long b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c90)) {
            return false;
        }
        c90 c90Var = (c90) obj;
        if (this.a == c90Var.a && z65.c(this.b, c90Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int a = a91.a(this.a) * 31;
        Long l = this.b;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return a + hashCode;
    }

    public String toString() {
        return "BasicConstraints(ca=" + this.a + ", maxIntermediateCas=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
