package defpackage;
/* compiled from: NotificationsPermission_Factory.java */
/* renamed from: i37  reason: default package */
/* loaded from: classes.dex */
public final class i37 implements no3<h37> {
    private final as8<gc> a;
    private final as8<hq3> b;
    private final as8<ey7> c;

    public i37(as8<gc> as8Var, as8<hq3> as8Var2, as8<ey7> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static i37 a(as8<gc> as8Var, as8<hq3> as8Var2, as8<ey7> as8Var3) {
        return new i37(as8Var, as8Var2, as8Var3);
    }

    public static h37 c(gc gcVar, hq3 hq3Var, ey7 ey7Var) {
        return new h37(gcVar, hq3Var, ey7Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public h37 get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
