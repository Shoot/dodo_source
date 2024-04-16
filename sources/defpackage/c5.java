package defpackage;

import com.dodopizza.activeorder.feature.activeorderwidget.presentation.a;
/* compiled from: ActiveOrderConverterImpl_Factory.java */
/* renamed from: c5  reason: default package */
/* loaded from: classes.dex */
public final class c5 implements no3<a> {
    private final as8<jgb> a;
    private final as8<f5b> b;
    private final as8<hq3> c;

    public c5(as8<jgb> as8Var, as8<f5b> as8Var2, as8<hq3> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static c5 a(as8<jgb> as8Var, as8<f5b> as8Var2, as8<hq3> as8Var3) {
        return new c5(as8Var, as8Var2, as8Var3);
    }

    public static a c(jgb jgbVar, f5b f5bVar, hq3 hq3Var) {
        return new a(jgbVar, f5bVar, hq3Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public a get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
