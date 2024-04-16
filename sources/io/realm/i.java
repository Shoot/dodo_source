package io.realm;

import io.realm.internal.OsList;
import java.util.Locale;
import org.bson.types.Decimal128;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManagedListOperator.java */
/* loaded from: classes3.dex */
public final class i extends u<Decimal128> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public i(a aVar, OsList osList, Class<Decimal128> cls) {
        super(aVar, osList, cls);
    }

    @Override // io.realm.u
    public void c(Object obj) {
        this.b.d((Decimal128) obj);
    }

    @Override // io.realm.u
    protected void e(Object obj) {
        if (obj == null || (obj instanceof Decimal128)) {
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Unacceptable value type. Acceptable: %1$s, actual: %2$s .", "org.bson.types.Decimal128", obj.getClass().getName()));
    }

    @Override // io.realm.u
    public void j(int i, Object obj) {
        this.b.w(i, (Decimal128) obj);
    }

    @Override // io.realm.u
    protected void q(int i, Object obj) {
        this.b.N(i, (Decimal128) obj);
    }

    @Override // io.realm.u
    /* renamed from: s */
    public Decimal128 g(int i) {
        return (Decimal128) this.b.s(i);
    }
}
