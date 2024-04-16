package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManagedListOperator.java */
/* loaded from: classes3.dex */
public final class b extends u<byte[]> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar, OsList osList, Class<byte[]> cls) {
        super(aVar, osList, cls);
    }

    @Override // io.realm.u
    public void c(Object obj) {
        this.b.a((byte[]) obj);
    }

    @Override // io.realm.u
    protected void e(Object obj) {
        if (obj == null || (obj instanceof byte[])) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "byte[]", obj.getClass().getName()));
    }

    @Override // io.realm.u
    public void j(int i, Object obj) {
        this.b.t(i, (byte[]) obj);
    }

    @Override // io.realm.u
    protected void q(int i, Object obj) {
        this.b.K(i, (byte[]) obj);
    }

    @Override // io.realm.u
    /* renamed from: s */
    public byte[] g(int i) {
        return (byte[]) this.b.s(i);
    }
}
