package defpackage;

import com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationProfileEntity;
/* compiled from: CustomerAppModule_ProvideClientDeliveryLocationProfileDaoFactory.java */
/* renamed from: c52  reason: default package */
/* loaded from: classes3.dex */
public final class c52 implements no3<gk2<ClientDeliveryLocationProfileEntity>> {
    private final as8<jk2> a;

    public c52(as8<jk2> as8Var) {
        this.a = as8Var;
    }

    public static c52 a(as8<jk2> as8Var) {
        return new c52(as8Var);
    }

    public static gk2<ClientDeliveryLocationProfileEntity> c(jk2 jk2Var) {
        return (gk2) jh8.e(a52.a.b(jk2Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public gk2<ClientDeliveryLocationProfileEntity> get() {
        return c(this.a.get());
    }
}
