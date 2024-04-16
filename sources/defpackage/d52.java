package defpackage;

import com.dodopizza.persistence.entity.address.AddressEntity;
import com.dodopizza.persistence.entity.deliverylocation.ClientDeliveryLocationProfileEntity;
/* compiled from: CustomerAppModule_ProvideCustomerAddressRepositoryFactory.java */
/* renamed from: d52  reason: default package */
/* loaded from: classes3.dex */
public final class d52 implements no3<v42> {
    private final as8<gk2<AddressEntity>> a;
    private final as8<gk2<ClientDeliveryLocationProfileEntity>> b;

    public d52(as8<gk2<AddressEntity>> as8Var, as8<gk2<ClientDeliveryLocationProfileEntity>> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static d52 a(as8<gk2<AddressEntity>> as8Var, as8<gk2<ClientDeliveryLocationProfileEntity>> as8Var2) {
        return new d52(as8Var, as8Var2);
    }

    public static v42 c(gk2<AddressEntity> gk2Var, gk2<ClientDeliveryLocationProfileEntity> gk2Var2) {
        return (v42) jh8.e(a52.a.c(gk2Var, gk2Var2));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public v42 get() {
        return c(this.a.get(), this.b.get());
    }
}
