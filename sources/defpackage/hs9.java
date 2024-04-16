package defpackage;
/* compiled from: SQLiteEventStore_Factory.java */
/* renamed from: hs9  reason: default package */
/* loaded from: classes2.dex */
public final class hs9 implements oo3<gs9> {
    private final as8<x91> a;
    private final as8<x91> b;
    private final as8<fl3> c;
    private final as8<ow9> d;
    private final as8<String> e;

    public hs9(as8<x91> as8Var, as8<x91> as8Var2, as8<fl3> as8Var3, as8<ow9> as8Var4, as8<String> as8Var5) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
    }

    public static hs9 a(as8<x91> as8Var, as8<x91> as8Var2, as8<fl3> as8Var3, as8<ow9> as8Var4, as8<String> as8Var5) {
        return new hs9(as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static gs9 c(x91 x91Var, x91 x91Var2, Object obj, Object obj2, as8<String> as8Var) {
        return new gs9(x91Var, x91Var2, (fl3) obj, (ow9) obj2, as8Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public gs9 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e);
    }
}
