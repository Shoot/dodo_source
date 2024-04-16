package defpackage;
/* compiled from: GradientColor.java */
/* renamed from: th4  reason: default package */
/* loaded from: classes.dex */
public class th4 {
    private final float[] a;
    private final int[] b;

    public th4(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public int[] a() {
        return this.b;
    }

    public float[] b() {
        return this.a;
    }

    public int c() {
        return this.b.length;
    }

    public void d(th4 th4Var, th4 th4Var2, float f) {
        if (th4Var.b.length == th4Var2.b.length) {
            for (int i = 0; i < th4Var.b.length; i++) {
                this.a[i] = ql6.i(th4Var.a[i], th4Var2.a[i], f);
                this.b[i] = qc4.c(f, th4Var.b[i], th4Var2.b[i]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + th4Var.b.length + " vs " + th4Var2.b.length + ")");
    }
}
