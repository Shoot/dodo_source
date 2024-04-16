package io.realm;

import io.realm.e0;
import io.realm.internal.core.NativeRealmAny;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmAnyOperator.java */
/* loaded from: classes3.dex */
public final class s0 extends b0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public s0(String str) {
        super(str, e0.a.STRING);
    }

    @Override // io.realm.h0
    protected NativeRealmAny a() {
        return new NativeRealmAny((String) super.g(String.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s0(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asString(), e0.a.STRING, nativeRealmAny);
    }
}
