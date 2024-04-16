package defpackage;

import ru.dodopizza.backend.domain.locality.LocalityAPI;
/* compiled from: LocalityInfoService_Factory.java */
/* renamed from: st5  reason: default package */
/* loaded from: classes4.dex */
public final class st5 implements no3<rt5> {
    private final as8<LocalityAPI> a;
    private final as8<nt5> b;
    private final as8<kt5> c;

    public st5(as8<LocalityAPI> as8Var, as8<nt5> as8Var2, as8<kt5> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static st5 a(as8<LocalityAPI> as8Var, as8<nt5> as8Var2, as8<kt5> as8Var3) {
        return new st5(as8Var, as8Var2, as8Var3);
    }

    public static rt5 c(LocalityAPI localityAPI, nt5 nt5Var, kt5 kt5Var) {
        return new rt5(localityAPI, nt5Var, kt5Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public rt5 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
