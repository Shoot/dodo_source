package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManagedListOperator.java */
/* loaded from: classes3.dex */
public final class r0 extends u<String> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(a aVar, OsList osList, Class<String> cls) {
        super(aVar, osList, cls);
    }

    @Override // io.realm.u
    public void c(Object obj) {
        this.b.l((String) obj);
    }

    @Override // io.realm.u
    protected void e(Object obj) {
        if (obj == null || (obj instanceof String)) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.lang.String", obj.getClass().getName()));
    }

    @Override // io.realm.u
    public void j(int i, Object obj) {
        this.b.E(i, (String) obj);
    }

    @Override // io.realm.u
    protected void q(int i, Object obj) {
        this.b.V(i, (String) obj);
    }

    @Override // io.realm.u
    /* renamed from: s */
    public String g(int i) {
        return (String) this.b.s(i);
    }
}
