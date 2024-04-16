package defpackage;

import ru.dodopizza.app.presentation.addresslist.d;
import ru.dodopizza.app.presentation.addresslist.i;
/* compiled from: AddressListModule_ProvideInteractorFactory.java */
/* renamed from: v8  reason: default package */
/* loaded from: classes3.dex */
public final class v8 implements no3<d> {
    private final as8<x42> a;
    private final as8<j9a> b;
    private final as8<pu2> c;
    private final as8<gc> d;
    private final as8<vg7> e;
    private final as8<s8> f;
    private final as8<i> g;

    public v8(as8<x42> as8Var, as8<j9a> as8Var2, as8<pu2> as8Var3, as8<gc> as8Var4, as8<vg7> as8Var5, as8<s8> as8Var6, as8<i> as8Var7) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
    }

    public static v8 a(as8<x42> as8Var, as8<j9a> as8Var2, as8<pu2> as8Var3, as8<gc> as8Var4, as8<vg7> as8Var5, as8<s8> as8Var6, as8<i> as8Var7) {
        return new v8(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7);
    }

    public static d c(x42 x42Var, j9a j9aVar, pu2 pu2Var, gc gcVar, vg7 vg7Var, s8 s8Var, i iVar) {
        return (d) jh8.e(t8.a.b(x42Var, j9aVar, pu2Var, gcVar, vg7Var, s8Var, iVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public d get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
