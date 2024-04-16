package io.realm;

import io.realm.e0;
import io.realm.internal.core.NativeRealmAny;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmAnyOperator.java */
/* loaded from: classes3.dex */
public final class x extends h0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public x() {
        super(e0.a.NULL);
    }

    @Override // io.realm.h0
    protected NativeRealmAny a() {
        return new NativeRealmAny();
    }

    public boolean equals(Object obj) {
        if (obj != null && x.class.equals(obj.getClass())) {
            return true;
        }
        return false;
    }

    @Override // io.realm.h0
    public <T> T g(Class<T> cls) {
        return null;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return "null";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(NativeRealmAny nativeRealmAny) {
        super(e0.a.NULL, nativeRealmAny);
    }
}
