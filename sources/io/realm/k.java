package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManagedListOperator.java */
/* loaded from: classes3.dex */
public final class k extends u<Double> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public k(a aVar, OsList osList, Class<Double> cls) {
        super(aVar, osList, cls);
    }

    @Override // io.realm.u
    public void c(Object obj) {
        this.b.e(((Number) obj).doubleValue());
    }

    @Override // io.realm.u
    protected void e(Object obj) {
        if (obj == null || (obj instanceof Number)) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.lang.Number", obj.getClass().getName()));
    }

    @Override // io.realm.u
    public void j(int i, Object obj) {
        this.b.x(i, ((Number) obj).doubleValue());
    }

    @Override // io.realm.u
    protected void q(int i, Object obj) {
        this.b.O(i, ((Number) obj).doubleValue());
    }

    @Override // io.realm.u
    /* renamed from: s */
    public Double g(int i) {
        return (Double) this.b.s(i);
    }
}
