package defpackage;

import ru.dodopizza.app.presentation.phonenumberlogin.a;
/* compiled from: PinCodeLoginInteractor_Factory.java */
/* renamed from: j68  reason: default package */
/* loaded from: classes4.dex */
public final class j68 implements no3<i68> {
    private final as8<t52> a;
    private final as8<g00> b;
    private final as8<cl6> c;
    private final as8<dua> d;
    private final as8<gc> e;
    private final as8<xda> f;
    private final as8<vg7> g;
    private final as8<a> h;
    private final as8<dt5> i;
    private final as8<ay1> j;
    private final as8<v53> k;
    private final as8<x42> l;

    public j68(as8<t52> as8Var, as8<g00> as8Var2, as8<cl6> as8Var3, as8<dua> as8Var4, as8<gc> as8Var5, as8<xda> as8Var6, as8<vg7> as8Var7, as8<a> as8Var8, as8<dt5> as8Var9, as8<ay1> as8Var10, as8<v53> as8Var11, as8<x42> as8Var12) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
        this.f = as8Var6;
        this.g = as8Var7;
        this.h = as8Var8;
        this.i = as8Var9;
        this.j = as8Var10;
        this.k = as8Var11;
        this.l = as8Var12;
    }

    public static j68 a(as8<t52> as8Var, as8<g00> as8Var2, as8<cl6> as8Var3, as8<dua> as8Var4, as8<gc> as8Var5, as8<xda> as8Var6, as8<vg7> as8Var7, as8<a> as8Var8, as8<dt5> as8Var9, as8<ay1> as8Var10, as8<v53> as8Var11, as8<x42> as8Var12) {
        return new j68(as8Var, as8Var2, as8Var3, as8Var4, as8Var5, as8Var6, as8Var7, as8Var8, as8Var9, as8Var10, as8Var11, as8Var12);
    }

    public static i68 c(t52 t52Var, g00 g00Var, cl6 cl6Var, dua duaVar, gc gcVar, xda xdaVar, vg7 vg7Var, a aVar, dt5 dt5Var, ay1 ay1Var, v53 v53Var, x42 x42Var) {
        return new i68(t52Var, g00Var, cl6Var, duaVar, gcVar, xdaVar, vg7Var, aVar, dt5Var, ay1Var, v53Var, x42Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public i68 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get());
    }
}
