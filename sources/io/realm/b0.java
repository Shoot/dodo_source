package io.realm;

import io.realm.e0;
import io.realm.internal.core.NativeRealmAny;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmAnyOperator.java */
/* loaded from: classes3.dex */
public abstract class b0 extends h0 {
    private final Object c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0(Object obj, e0.a aVar) {
        super(aVar);
        this.c = obj;
    }

    public boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        Object obj2 = this.c;
        Object obj3 = ((b0) obj).c;
        if (obj2 == null) {
            if (obj3 != null) {
                return false;
            }
            return true;
        }
        return obj2.equals(obj3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.realm.h0
    public <T> T g(Class<T> cls) {
        return cls.cast(this.c);
    }

    public final int hashCode() {
        Object obj = this.c;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return this.c.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0(Object obj, e0.a aVar, NativeRealmAny nativeRealmAny) {
        super(aVar, nativeRealmAny);
        this.c = obj;
    }
}
