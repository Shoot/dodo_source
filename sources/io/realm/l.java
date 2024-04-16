package io.realm;

import io.realm.e0;
import io.realm.internal.core.NativeRealmAny;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmAnyOperator.java */
/* loaded from: classes3.dex */
public final class l extends b0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public l(NativeRealmAny nativeRealmAny) {
        super(Double.valueOf(nativeRealmAny.asDouble()), e0.a.DOUBLE, nativeRealmAny);
    }

    @Override // io.realm.h0
    protected NativeRealmAny a() {
        return new NativeRealmAny((Double) super.g(Double.class));
    }
}
