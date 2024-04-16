package defpackage;

import ru.dodopizza.backend.domain.bonus.BonusActionApi;
/* compiled from: SpecialOfferServiceImpl_Factory.java */
/* renamed from: sra  reason: default package */
/* loaded from: classes4.dex */
public final class sra implements no3<rra> {
    private final as8<BonusActionApi> a;
    private final as8<de0> b;
    private final as8<hq3> c;

    public sra(as8<BonusActionApi> as8Var, as8<de0> as8Var2, as8<hq3> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static sra a(as8<BonusActionApi> as8Var, as8<de0> as8Var2, as8<hq3> as8Var3) {
        return new sra(as8Var, as8Var2, as8Var3);
    }

    public static rra c(BonusActionApi bonusActionApi, de0 de0Var, hq3 hq3Var) {
        return new rra(bonusActionApi, de0Var, hq3Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public rra get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
