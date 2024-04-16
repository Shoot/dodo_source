package io.realm;

import io.realm.e0;
import io.realm.internal.core.NativeRealmAny;
import java.util.Date;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmAnyOperator.java */
/* loaded from: classes3.dex */
public final class h extends b0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public h(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asDate(), e0.a.DATE, nativeRealmAny);
    }

    @Override // io.realm.h0
    protected NativeRealmAny a() {
        return new NativeRealmAny((Date) super.g(Date.class));
    }
}
