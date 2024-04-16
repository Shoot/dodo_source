package io.realm;

import io.realm.e0;
import io.realm.internal.core.NativeRealmAny;
import java.util.Collections;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RealmAnyOperator.java */
/* loaded from: classes3.dex */
public class m0 extends h0 {
    private final Class<? extends o89> c;
    private final o89 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m0(o89 o89Var) {
        super(e0.a.OBJECT);
        this.d = o89Var;
        this.c = o89Var.getClass();
    }

    private static <T extends o89> T h(a aVar, Class<T> cls, NativeRealmAny nativeRealmAny) {
        return (T) aVar.o(cls, nativeRealmAny.getRealmModelRowKey(), false, Collections.emptyList());
    }

    @Override // io.realm.h0
    protected NativeRealmAny a() {
        if (this.d instanceof r89) {
            return new NativeRealmAny((r89) g(r89.class));
        }
        throw new IllegalStateException("Native RealmAny instances only allow managed Realm objects or primitives");
    }

    public boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        o89 o89Var = this.d;
        o89 o89Var2 = ((m0) obj).d;
        if (o89Var == null) {
            if (o89Var2 != null) {
                return false;
            }
            return true;
        }
        return o89Var.equals(o89Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.realm.h0
    public Class<?> f() {
        if (r89.class.isAssignableFrom(this.c)) {
            return this.c.getSuperclass();
        }
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.realm.h0
    public <T> T g(Class<T> cls) {
        return cls.cast(this.d);
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        return this.d.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T extends o89> m0(a aVar, NativeRealmAny nativeRealmAny, Class<T> cls) {
        super(e0.a.OBJECT, nativeRealmAny);
        this.c = cls;
        this.d = h(aVar, cls, nativeRealmAny);
    }
}
