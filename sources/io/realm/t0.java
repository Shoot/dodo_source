package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;
import java.util.UUID;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManagedListOperator.java */
/* loaded from: classes3.dex */
public final class t0 extends u<UUID> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public t0(a aVar, OsList osList, Class<UUID> cls) {
        super(aVar, osList, cls);
    }

    @Override // io.realm.u
    public void c(Object obj) {
        this.b.m((UUID) obj);
    }

    @Override // io.realm.u
    protected void e(Object obj) {
        if (obj == null || (obj instanceof UUID)) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.util.UUID", obj.getClass().getName()));
    }

    @Override // io.realm.u
    public void j(int i, Object obj) {
        this.b.F(i, (UUID) obj);
    }

    @Override // io.realm.u
    protected void q(int i, Object obj) {
        this.b.W(i, (UUID) obj);
    }

    @Override // io.realm.u
    /* renamed from: s */
    public UUID g(int i) {
        return (UUID) this.b.s(i);
    }
}
