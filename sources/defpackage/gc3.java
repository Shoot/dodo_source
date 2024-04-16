package defpackage;

import ru.dodopizza.backend.domain.bonus.EasyBonusApi;
/* compiled from: EasyBonusServiceImpl_Factory.java */
/* renamed from: gc3  reason: default package */
/* loaded from: classes4.dex */
public final class gc3 implements no3<fc3> {
    private final as8<EasyBonusApi> a;
    private final as8<de0> b;
    private final as8<hq3> c;

    public gc3(as8<EasyBonusApi> as8Var, as8<de0> as8Var2, as8<hq3> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static gc3 a(as8<EasyBonusApi> as8Var, as8<de0> as8Var2, as8<hq3> as8Var3) {
        return new gc3(as8Var, as8Var2, as8Var3);
    }

    public static fc3 c(EasyBonusApi easyBonusApi, de0 de0Var, hq3 hq3Var) {
        return new fc3(easyBonusApi, de0Var, hq3Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public fc3 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
