package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: uoc  reason: default package */
/* loaded from: classes2.dex */
public final class uoc implements bpc {
    @Override // defpackage.bpc
    public final bpc c() {
        return bpc.L4;
    }

    @Override // defpackage.bpc
    public final Boolean d() {
        return Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof uoc;
    }

    @Override // defpackage.bpc
    public final Double f() {
        return Double.valueOf(0.0d);
    }

    @Override // defpackage.bpc
    public final String g() {
        return "null";
    }

    @Override // defpackage.bpc
    public final Iterator<bpc> h() {
        return null;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // defpackage.bpc
    public final bpc t(String str, xzc xzcVar, List<bpc> list) {
        throw new IllegalStateException(String.format("null has no function %s", str));
    }
}
