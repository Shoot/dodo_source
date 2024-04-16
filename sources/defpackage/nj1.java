package defpackage;

import ru.dodopizza.app.domain.DodopizzaApi;
/* compiled from: CommonAddressModule_ProvideAddAddressInteractorFactory.java */
/* renamed from: nj1  reason: default package */
/* loaded from: classes3.dex */
public final class nj1 implements no3<r6> {
    private final as8<ava> a;
    private final as8<dua> b;
    private final as8<j9a> c;
    private final as8<DodopizzaApi> d;

    public nj1(as8<ava> as8Var, as8<dua> as8Var2, as8<j9a> as8Var3, as8<DodopizzaApi> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static nj1 a(as8<ava> as8Var, as8<dua> as8Var2, as8<j9a> as8Var3, as8<DodopizzaApi> as8Var4) {
        return new nj1(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static r6 c(ava avaVar, dua duaVar, j9a j9aVar, DodopizzaApi dodopizzaApi) {
        return (r6) jh8.e(mj1.a.a(avaVar, duaVar, j9aVar, dodopizzaApi));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public r6 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
