package io.realm;

import io.realm.e0;
import io.realm.internal.core.NativeRealmAny;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmAnyOperator.java */
/* loaded from: classes3.dex */
public final class e extends b0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public e(NativeRealmAny nativeRealmAny) {
        super(Boolean.valueOf(nativeRealmAny.asBoolean()), e0.a.BOOLEAN, nativeRealmAny);
    }

    @Override // io.realm.h0
    protected NativeRealmAny a() {
        return new NativeRealmAny((Boolean) super.g(Boolean.class));
    }
}
