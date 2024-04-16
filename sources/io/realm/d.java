package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManagedListOperator.java */
/* loaded from: classes3.dex */
public final class d extends u<Boolean> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public d(a aVar, OsList osList, Class<Boolean> cls) {
        super(aVar, osList, cls);
    }

    @Override // io.realm.u
    public void c(Object obj) {
        this.b.b(((Boolean) obj).booleanValue());
    }

    @Override // io.realm.u
    protected void e(Object obj) {
        if (obj == null || (obj instanceof Boolean)) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.lang.Boolean", obj.getClass().getName()));
    }

    @Override // io.realm.u
    public void j(int i, Object obj) {
        this.b.u(i, ((Boolean) obj).booleanValue());
    }

    @Override // io.realm.u
    protected void q(int i, Object obj) {
        this.b.L(i, ((Boolean) obj).booleanValue());
    }

    @Override // io.realm.u
    /* renamed from: s */
    public Boolean g(int i) {
        return (Boolean) this.b.s(i);
    }
}
