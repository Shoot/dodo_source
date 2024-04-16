package defpackage;
/* compiled from: MapTileAreaZoomComputer.java */
/* renamed from: c76  reason: default package */
/* loaded from: classes3.dex */
public class c76 implements a76 {
    private final int a;

    public c76(int i) {
        this.a = i;
    }

    @Override // defpackage.a76
    public y66 a(y66 y66Var, y66 y66Var2) {
        if (y66Var2 == null) {
            y66Var2 = new y66();
        }
        if (y66Var.size() == 0) {
            y66Var2.D();
            return y66Var2;
        }
        int C = y66Var.C();
        int i = this.a;
        int i2 = C + i;
        if (i2 >= 0 && i2 <= k76.a) {
            if (i <= 0) {
                y66Var2.E(i2, y66Var.x() >> (-this.a), y66Var.A() >> (-this.a), y66Var.z() >> (-this.a), y66Var.v() >> (-this.a));
                return y66Var2;
            }
            y66Var2.E(i2, y66Var.x() << this.a, y66Var.A() << this.a, ((y66Var.z() + 1) << this.a) - 1, ((y66Var.v() + 1) << this.a) - 1);
            return y66Var2;
        }
        y66Var2.D();
        return y66Var2;
    }
}
