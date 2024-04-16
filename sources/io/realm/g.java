package io.realm;

import io.realm.internal.OsList;
import java.util.Date;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManagedListOperator.java */
/* loaded from: classes3.dex */
public final class g extends u<Date> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public g(a aVar, OsList osList, Class<Date> cls) {
        super(aVar, osList, cls);
    }

    @Override // io.realm.u
    public void c(Object obj) {
        this.b.c((Date) obj);
    }

    @Override // io.realm.u
    protected void e(Object obj) {
        if (obj == null || (obj instanceof Date)) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "java.util.Date", obj.getClass().getName()));
    }

    @Override // io.realm.u
    public void j(int i, Object obj) {
        this.b.v(i, (Date) obj);
    }

    @Override // io.realm.u
    protected void q(int i, Object obj) {
        this.b.M(i, (Date) obj);
    }

    @Override // io.realm.u
    /* renamed from: s */
    public Date g(int i) {
        return (Date) this.b.s(i);
    }
}
