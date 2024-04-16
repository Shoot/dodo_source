package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManagedListOperator.java */
/* loaded from: classes3.dex */
public final class t<T> extends u<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public t(a aVar, OsList osList, Class<T> cls) {
        super(aVar, osList, cls);
    }

    @Override // io.realm.u
    public void c(Object obj) {
        this.b.g(((Number) obj).longValue());
    }

    @Override // io.realm.u
    protected void e(Object obj) {
        if (obj == null || (obj instanceof Number)) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.lang.Long, java.lang.Integer, java.lang.Short, java.lang.Byte", obj.getClass().getName()));
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.Long] */
    @Override // io.realm.u
    public T g(int i) {
        ?? r4 = (T) ((Long) this.b.s(i));
        if (r4 == 0) {
            return null;
        }
        Class<T> cls = this.c;
        if (cls == Long.class) {
            return r4;
        }
        if (cls == Integer.class) {
            return cls.cast(Integer.valueOf(r4.intValue()));
        }
        if (cls == Short.class) {
            return cls.cast(Short.valueOf(r4.shortValue()));
        }
        if (cls == Byte.class) {
            return cls.cast(Byte.valueOf(r4.byteValue()));
        }
        throw new IllegalStateException("Unexpected element type: " + this.c.getName());
    }

    @Override // io.realm.u
    public void j(int i, Object obj) {
        this.b.z(i, ((Number) obj).longValue());
    }

    @Override // io.realm.u
    protected void q(int i, Object obj) {
        this.b.Q(i, ((Number) obj).longValue());
    }
}
