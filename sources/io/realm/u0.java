package io.realm;

import io.realm.e0;
import io.realm.internal.core.NativeRealmAny;
import java.util.UUID;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmAnyOperator.java */
/* loaded from: classes3.dex */
public final class u0 extends b0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public u0(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asUUID(), e0.a.UUID, nativeRealmAny);
    }

    @Override // io.realm.h0
    protected NativeRealmAny a() {
        return new NativeRealmAny((UUID) super.g(UUID.class));
    }
}
