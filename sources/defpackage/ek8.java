package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: certificates.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016¨\u0006\u001a"}, d2 = {"Lek8;", "", "", "hashCode", "", "toString", "other", "", "equals", "", "a", "J", c.a, "()J", "version", "Lfb;", "b", "Lfb;", "()Lfb;", "algorithmIdentifier", "Llk0;", "Llk0;", "()Llk0;", "privateKey", "<init>", "(JLfb;Llk0;)V", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
/* renamed from: ek8  reason: default package */
/* loaded from: classes3.dex */
public final class ek8 {
    private final long a;
    private final fb b;
    private final lk0 c;

    public ek8(long j, fb fbVar, lk0 lk0Var) {
        z65.h(fbVar, "algorithmIdentifier");
        z65.h(lk0Var, "privateKey");
        this.a = j;
        this.b = fbVar;
        this.c = lk0Var;
    }

    public final fb a() {
        return this.b;
    }

    public final lk0 b() {
        return this.c;
    }

    public final long c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek8)) {
            return false;
        }
        ek8 ek8Var = (ek8) obj;
        if (this.a == ek8Var.a && z65.c(this.b, ek8Var.b) && z65.c(this.c, ek8Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((int) this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "PrivateKeyInfo(version=" + this.a + ", algorithmIdentifier=" + this.b + ", privateKey=" + this.c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
