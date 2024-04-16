package defpackage;
/* compiled from: DeliveryLocationDetailsModule_ProvideDeliveryLocationDetailsInteractorFactory.java */
/* renamed from: xx2  reason: default package */
/* loaded from: classes3.dex */
public final class xx2 implements no3<sx2> {
    private final vx2 a;
    private final as8<re4> b;
    private final as8<cy2> c;
    private final as8<h7> d;
    private final as8<ay1> e;

    public xx2(vx2 vx2Var, as8<re4> as8Var, as8<cy2> as8Var2, as8<h7> as8Var3, as8<ay1> as8Var4) {
        this.a = vx2Var;
        this.b = as8Var;
        this.c = as8Var2;
        this.d = as8Var3;
        this.e = as8Var4;
    }

    public static xx2 a(vx2 vx2Var, as8<re4> as8Var, as8<cy2> as8Var2, as8<h7> as8Var3, as8<ay1> as8Var4) {
        return new xx2(vx2Var, as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static sx2 c(vx2 vx2Var, re4 re4Var, cy2 cy2Var, h7 h7Var, ay1 ay1Var) {
        return (sx2) jh8.e(vx2Var.a(re4Var, cy2Var, h7Var, ay1Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public sx2 get() {
        return c(this.a, this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
