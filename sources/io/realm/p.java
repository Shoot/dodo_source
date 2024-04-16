package io.realm;

import io.realm.e0;
import io.realm.internal.core.NativeRealmAny;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmAnyOperator.java */
/* loaded from: classes3.dex */
public final class p extends b0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public p(NativeRealmAny nativeRealmAny) {
        super(Float.valueOf(nativeRealmAny.asFloat()), e0.a.FLOAT, nativeRealmAny);
    }

    @Override // io.realm.h0
    protected NativeRealmAny a() {
        return new NativeRealmAny((Float) super.g(Float.class));
    }
}
