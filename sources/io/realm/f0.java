package io.realm;

import io.realm.internal.OsList;
import io.realm.internal.core.NativeRealmAny;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManagedListOperator.java */
/* loaded from: classes3.dex */
public final class f0 extends u<e0> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(a aVar, OsList osList, Class<e0> cls) {
        super(aVar, osList, cls);
    }

    @Override // io.realm.u
    public void c(Object obj) {
        this.b.j(f.c(this.a, (e0) obj).b());
    }

    @Override // io.realm.u
    protected void e(Object obj) {
        if (obj == null || (obj instanceof e0)) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.util.RealmAny", obj.getClass().getName()));
    }

    @Override // io.realm.u
    public void j(int i, Object obj) {
        d(i);
        this.b.C(i, f.c(this.a, (e0) obj).b());
    }

    @Override // io.realm.u
    protected void q(int i, Object obj) {
        this.b.T(i, f.c(this.a, (e0) obj).b());
    }

    @Override // io.realm.u
    /* renamed from: s */
    public e0 g(int i) {
        NativeRealmAny nativeRealmAny = (NativeRealmAny) this.b.s(i);
        if (nativeRealmAny == null) {
            nativeRealmAny = new NativeRealmAny();
        }
        return new e0(h0.b(this.a, nativeRealmAny));
    }
}
