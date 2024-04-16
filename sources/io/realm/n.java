package io.realm;

import io.realm.internal.Table;
import io.realm.internal.core.NativeRealmAny;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmAnyOperator.java */
/* loaded from: classes3.dex */
public final class n extends m0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public n(a aVar, NativeRealmAny nativeRealmAny) {
        super(i(aVar, nativeRealmAny));
    }

    private static <T extends o89> T i(a aVar, NativeRealmAny nativeRealmAny) {
        return (T) aVar.q(DynamicRealmObject.class, Table.h(nativeRealmAny.getRealmModelTableName(aVar.x())), nativeRealmAny.getRealmModelRowKey());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.realm.m0, io.realm.h0
    public Class<?> f() {
        return DynamicRealmObject.class;
    }
}
