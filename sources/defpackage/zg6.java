package defpackage;
/* compiled from: MenuSectionRepositoryV5_Factory.java */
/* renamed from: zg6  reason: default package */
/* loaded from: classes4.dex */
public final class zg6 implements no3<yg6> {
    private final as8<zf6> a;
    private final as8<pe6> b;
    private final as8<we6> c;

    public zg6(as8<zf6> as8Var, as8<pe6> as8Var2, as8<we6> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static zg6 a(as8<zf6> as8Var, as8<pe6> as8Var2, as8<we6> as8Var3) {
        return new zg6(as8Var, as8Var2, as8Var3);
    }

    public static yg6 c(zf6 zf6Var, pe6 pe6Var, we6 we6Var) {
        return new yg6(zf6Var, pe6Var, we6Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public yg6 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
