package defpackage;

import com.dodopizza.persistence.entity.address.AddressEntity;
/* compiled from: CustomerAppModule_ProvideAddressDaoFactory.java */
/* renamed from: b52  reason: default package */
/* loaded from: classes3.dex */
public final class b52 implements no3<gk2<AddressEntity>> {
    private final as8<jk2> a;

    public b52(as8<jk2> as8Var) {
        this.a = as8Var;
    }

    public static b52 a(as8<jk2> as8Var) {
        return new b52(as8Var);
    }

    public static gk2<AddressEntity> c(jk2 jk2Var) {
        return (gk2) jh8.e(a52.a.a(jk2Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public gk2<AddressEntity> get() {
        return c(this.a.get());
    }
}
