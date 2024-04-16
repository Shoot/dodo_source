package io.realm;

import io.realm.e0;
import io.realm.internal.core.NativeRealmAny;
import org.bson.types.Decimal128;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmAnyOperator.java */
/* loaded from: classes3.dex */
public final class j extends b0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public j(NativeRealmAny nativeRealmAny) {
        super(nativeRealmAny.asDecimal128(), e0.a.DECIMAL128, nativeRealmAny);
    }

    @Override // io.realm.h0
    protected NativeRealmAny a() {
        return new NativeRealmAny((Decimal128) super.g(Decimal128.class));
    }
}
