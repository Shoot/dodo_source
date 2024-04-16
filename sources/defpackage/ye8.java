package defpackage;
/* renamed from: ye8  reason: default package */
/* loaded from: classes3.dex */
public class ye8 {
    private ka4 a;
    private we8 b;
    protected we8[] c;
    protected we8[] d;

    public ye8(ka4 ka4Var, we8 we8Var) {
        this.a = ka4Var;
        this.b = we8Var;
        b();
        a();
    }

    private void a() {
        int f;
        int g = this.b.g();
        we8[] we8VarArr = new we8[g];
        int i = g - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            we8VarArr[i2] = new we8(this.c[i2]);
        }
        this.d = new we8[g];
        while (i >= 0) {
            this.d[i] = new we8(this.a, i);
            i--;
        }
        for (int i3 = 0; i3 < g; i3++) {
            if (we8VarArr[i3].f(i3) == 0) {
                int i4 = i3 + 1;
                boolean z = false;
                while (i4 < g) {
                    if (we8VarArr[i4].f(i3) != 0) {
                        d(we8VarArr, i3, i4);
                        d(this.d, i3, i4);
                        i4 = g;
                        z = true;
                    }
                    i4++;
                }
                if (!z) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            int f2 = this.a.f(we8VarArr[i3].f(i3));
            we8VarArr[i3].m(f2);
            this.d[i3].m(f2);
            for (int i5 = 0; i5 < g; i5++) {
                if (i5 != i3 && (f = we8VarArr[i5].f(i3)) != 0) {
                    we8 n = we8VarArr[i3].n(f);
                    we8 n2 = this.d[i3].n(f);
                    we8VarArr[i5].b(n);
                    this.d[i5].b(n2);
                }
            }
        }
    }

    private void b() {
        int i;
        int g = this.b.g();
        this.c = new we8[g];
        int i2 = 0;
        while (true) {
            i = g >> 1;
            if (i2 >= i) {
                break;
            }
            int i3 = i2 << 1;
            int[] iArr = new int[i3 + 1];
            iArr[i3] = 1;
            this.c[i2] = new we8(this.a, iArr);
            i2++;
        }
        while (i < g) {
            int i4 = i << 1;
            int[] iArr2 = new int[i4 + 1];
            iArr2[i4] = 1;
            this.c[i] = new we8(this.a, iArr2).k(this.b);
            i++;
        }
    }

    private static void d(we8[] we8VarArr, int i, int i2) {
        we8 we8Var = we8VarArr[i];
        we8VarArr[i] = we8VarArr[i2];
        we8VarArr[i2] = we8Var;
    }

    public we8[] c() {
        return this.d;
    }
}
