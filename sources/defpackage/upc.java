package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: upc  reason: default package */
/* loaded from: classes2.dex */
public final class upc implements bpc {
    @Override // defpackage.bpc
    public final bpc c() {
        return bpc.K4;
    }

    @Override // defpackage.bpc
    public final Boolean d() {
        return Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof upc;
    }

    @Override // defpackage.bpc
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.bpc
    public final String g() {
        return "undefined";
    }

    @Override // defpackage.bpc
    public final Iterator<bpc> h() {
        return null;
    }

    @Override // defpackage.bpc
    public final bpc t(String str, xzc xzcVar, List<bpc> list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }
}
