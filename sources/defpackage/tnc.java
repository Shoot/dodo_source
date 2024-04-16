package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: tnc  reason: default package */
/* loaded from: classes2.dex */
public final class tnc implements bpc {
    private final boolean a;

    public tnc(Boolean bool) {
        if (bool == null) {
            this.a = false;
        } else {
            this.a = bool.booleanValue();
        }
    }

    @Override // defpackage.bpc
    public final bpc c() {
        return new tnc(Boolean.valueOf(this.a));
    }

    @Override // defpackage.bpc
    public final Boolean d() {
        return Boolean.valueOf(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof tnc) && this.a == ((tnc) obj).a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.bpc
    public final Double f() {
        double d;
        if (this.a) {
            d = 1.0d;
        } else {
            d = 0.0d;
        }
        return Double.valueOf(d);
    }

    @Override // defpackage.bpc
    public final String g() {
        return Boolean.toString(this.a);
    }

    @Override // defpackage.bpc
    public final Iterator<bpc> h() {
        return null;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.a).hashCode();
    }

    @Override // defpackage.bpc
    public final bpc t(String str, xzc xzcVar, List<bpc> list) {
        if ("toString".equals(str)) {
            return new gpc(Boolean.toString(this.a));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.a), str));
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
