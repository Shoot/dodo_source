package defpackage;
/* compiled from: SelectPizzeriaModule_ProvideInteractorFactory.java */
/* renamed from: f8a  reason: default package */
/* loaded from: classes3.dex */
public final class f8a implements no3<a8a> {
    private final d8a a;
    private final as8<x7a> b;
    private final as8<e98> c;
    private final as8<gc> d;
    private final as8<vg7> e;
    private final as8<x88> f;

    public f8a(d8a d8aVar, as8<x7a> as8Var, as8<e98> as8Var2, as8<gc> as8Var3, as8<vg7> as8Var4, as8<x88> as8Var5) {
        this.a = d8aVar;
        this.b = as8Var;
        this.c = as8Var2;
        this.d = as8Var3;
        this.e = as8Var4;
        this.f = as8Var5;
    }

    public static f8a a(d8a d8aVar, as8<x7a> as8Var, as8<e98> as8Var2, as8<gc> as8Var3, as8<vg7> as8Var4, as8<x88> as8Var5) {
        return new f8a(d8aVar, as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static a8a c(d8a d8aVar, x7a x7aVar, e98 e98Var, gc gcVar, vg7 vg7Var, x88 x88Var) {
        return (a8a) jh8.e(d8aVar.b(x7aVar, e98Var, gcVar, vg7Var, x88Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public a8a get() {
        return c(this.a, this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
