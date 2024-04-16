package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManagedListOperator.java */
/* loaded from: classes3.dex */
public final class o extends u<Float> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public o(a aVar, OsList osList, Class<Float> cls) {
        super(aVar, osList, cls);
    }

    @Override // io.realm.u
    public void c(Object obj) {
        this.b.f(((Number) obj).floatValue());
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
        this.b.y(i, ((Number) obj).floatValue());
    }

    @Override // io.realm.u
    protected void q(int i, Object obj) {
        this.b.P(i, ((Number) obj).floatValue());
    }

    @Override // io.realm.u
    /* renamed from: s */
    public Float g(int i) {
        return (Float) this.b.s(i);
    }
}
