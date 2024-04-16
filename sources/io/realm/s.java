package io.realm;

import io.realm.e0;
import io.realm.internal.core.NativeRealmAny;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmAnyOperator.java */
/* loaded from: classes3.dex */
public final class s extends b0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public s(NativeRealmAny nativeRealmAny) {
        super(Long.valueOf(nativeRealmAny.asLong()), e0.a.INTEGER, nativeRealmAny);
    }

    @Override // io.realm.h0
    protected NativeRealmAny a() {
        return new NativeRealmAny((Number) super.g(Number.class));
    }

    @Override // io.realm.b0
    public boolean equals(Object obj) {
        if (obj == null || !s.class.equals(obj.getClass()) || ((Number) g(Number.class)).longValue() != ((Number) ((h0) obj).g(Number.class)).longValue()) {
            return false;
        }
        return true;
    }
}
