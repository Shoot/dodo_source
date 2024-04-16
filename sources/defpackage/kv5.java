package defpackage;

import ru.dodopizza.app.domain.locality.LocalityServiceImpl;
import ru.dodopizza.backend.domain.locality.LocalityAPI;
/* compiled from: LocalityServiceImpl_Factory.java */
/* renamed from: kv5  reason: default package */
/* loaded from: classes4.dex */
public final class kv5 implements no3<LocalityServiceImpl> {
    private final as8<LocalityAPI> a;
    private final as8<dv5> b;
    private final as8<c63> c;
    private final as8<mh0> d;
    private final as8<yjb> e;

    public kv5(as8<LocalityAPI> as8Var, as8<dv5> as8Var2, as8<c63> as8Var3, as8<mh0> as8Var4, as8<yjb> as8Var5) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
    }

    public static kv5 a(as8<LocalityAPI> as8Var, as8<dv5> as8Var2, as8<c63> as8Var3, as8<mh0> as8Var4, as8<yjb> as8Var5) {
        return new kv5(as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static LocalityServiceImpl c(as8<LocalityAPI> as8Var, dv5 dv5Var, c63 c63Var, mh0 mh0Var, yjb yjbVar) {
        return new LocalityServiceImpl(as8Var, dv5Var, c63Var, mh0Var, yjbVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public LocalityServiceImpl get() {
        return c(this.a, this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
