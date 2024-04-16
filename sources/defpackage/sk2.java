package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SessionEvent.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0017"}, d2 = {"Lsk2;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lrk2;", "a", "Lrk2;", "b", "()Lrk2;", "performance", "crashlytics", "", c.a, "D", "()D", "sessionSamplingRate", "<init>", "(Lrk2;Lrk2;D)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* renamed from: sk2  reason: default package */
/* loaded from: classes2.dex */
public final class sk2 {
    private final rk2 a;
    private final rk2 b;
    private final double c;

    public sk2() {
        this(null, null, 0.0d, 7, null);
    }

    public final rk2 a() {
        return this.b;
    }

    public final rk2 b() {
        return this.a;
    }

    public final double c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk2)) {
            return false;
        }
        sk2 sk2Var = (sk2) obj;
        if (this.a == sk2Var.a && this.b == sk2Var.b && z65.c(Double.valueOf(this.c), Double.valueOf(sk2Var.c))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + nkb.a(this.c);
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.a + ", crashlytics=" + this.b + ", sessionSamplingRate=" + this.c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public sk2(rk2 rk2Var, rk2 rk2Var2, double d) {
        z65.h(rk2Var, "performance");
        z65.h(rk2Var2, "crashlytics");
        this.a = rk2Var;
        this.b = rk2Var2;
        this.c = d;
    }

    public /* synthetic */ sk2(rk2 rk2Var, rk2 rk2Var2, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? rk2.COLLECTION_SDK_NOT_INSTALLED : rk2Var, (i & 2) != 0 ? rk2.COLLECTION_SDK_NOT_INSTALLED : rk2Var2, (i & 4) != 0 ? 1.0d : d);
    }
}
