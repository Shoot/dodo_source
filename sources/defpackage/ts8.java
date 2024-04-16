package defpackage;
/* compiled from: PushMessagingController_Factory.java */
/* renamed from: ts8  reason: default package */
/* loaded from: classes3.dex */
public final class ts8 implements no3<ss8> {
    private final as8<n27> a;
    private final as8<mt8> b;
    private final as8<st8> c;
    private final as8<ok6> d;
    private final as8<qx1> e;

    public ts8(as8<n27> as8Var, as8<mt8> as8Var2, as8<st8> as8Var3, as8<ok6> as8Var4, as8<qx1> as8Var5) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
        this.e = as8Var5;
    }

    public static ts8 a(as8<n27> as8Var, as8<mt8> as8Var2, as8<st8> as8Var3, as8<ok6> as8Var4, as8<qx1> as8Var5) {
        return new ts8(as8Var, as8Var2, as8Var3, as8Var4, as8Var5);
    }

    public static ss8 c(n27 n27Var, mt8 mt8Var, st8 st8Var, ok6 ok6Var, qx1 qx1Var) {
        return new ss8(n27Var, mt8Var, st8Var, ok6Var, qx1Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ss8 get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
