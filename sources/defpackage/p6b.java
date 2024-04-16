package defpackage;
/* compiled from: Target.java */
/* renamed from: p6b  reason: default package */
/* loaded from: classes.dex */
public final class p6b {
    public static final p6b e;
    public static final p6b f;
    public static final p6b g;
    public static final p6b h;
    public static final p6b i;
    public static final p6b j;
    final float[] a;
    final float[] b;
    final float[] c = new float[3];
    boolean d = true;

    static {
        p6b p6bVar = new p6b();
        e = p6bVar;
        m(p6bVar);
        p(p6bVar);
        p6b p6bVar2 = new p6b();
        f = p6bVar2;
        o(p6bVar2);
        p(p6bVar2);
        p6b p6bVar3 = new p6b();
        g = p6bVar3;
        l(p6bVar3);
        p(p6bVar3);
        p6b p6bVar4 = new p6b();
        h = p6bVar4;
        m(p6bVar4);
        n(p6bVar4);
        p6b p6bVar5 = new p6b();
        i = p6bVar5;
        o(p6bVar5);
        n(p6bVar5);
        p6b p6bVar6 = new p6b();
        j = p6bVar6;
        l(p6bVar6);
        n(p6bVar6);
    }

    p6b() {
        float[] fArr = new float[3];
        this.a = fArr;
        float[] fArr2 = new float[3];
        this.b = fArr2;
        r(fArr);
        r(fArr2);
        q();
    }

    private static void l(p6b p6bVar) {
        float[] fArr = p6bVar.b;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    private static void m(p6b p6bVar) {
        float[] fArr = p6bVar.b;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    private static void n(p6b p6bVar) {
        float[] fArr = p6bVar.a;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    private static void o(p6b p6bVar) {
        float[] fArr = p6bVar.b;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    private static void p(p6b p6bVar) {
        float[] fArr = p6bVar.a;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    private void q() {
        float[] fArr = this.c;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }

    private static void r(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    public float a() {
        return this.c[1];
    }

    public float b() {
        return this.b[2];
    }

    public float c() {
        return this.a[2];
    }

    public float d() {
        return this.b[0];
    }

    public float e() {
        return this.a[0];
    }

    public float f() {
        return this.c[2];
    }

    public float g() {
        return this.c[0];
    }

    public float h() {
        return this.b[1];
    }

    public float i() {
        return this.a[1];
    }

    public boolean j() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        int length = this.c.length;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < length; i2++) {
            float f3 = this.c[i2];
            if (f3 > 0.0f) {
                f2 += f3;
            }
        }
        if (f2 != 0.0f) {
            int length2 = this.c.length;
            for (int i3 = 0; i3 < length2; i3++) {
                float[] fArr = this.c;
                float f4 = fArr[i3];
                if (f4 > 0.0f) {
                    fArr[i3] = f4 / f2;
                }
            }
        }
    }
}
