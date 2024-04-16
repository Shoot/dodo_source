package defpackage;
/* compiled from: MapTileAreaBorderComputer.java */
/* renamed from: z66  reason: default package */
/* loaded from: classes3.dex */
public class z66 implements a76 {
    private final int a;

    public z66(int i) {
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
        int x = y66Var.x() - this.a;
        int A = y66Var.A();
        int i = this.a;
        int i2 = A - i;
        int i3 = (i * 2) - 1;
        y66Var2.E(y66Var.C(), x, i2, y66Var.B() + x + i3, y66Var.w() + i2 + i3);
        return y66Var2;
    }
}
