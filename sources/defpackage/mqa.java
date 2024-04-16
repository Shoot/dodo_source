package defpackage;

import defpackage.or;
import java.util.Arrays;
/* compiled from: SolverVariableValues.java */
/* renamed from: mqa  reason: default package */
/* loaded from: classes.dex */
public class mqa implements or.a {
    private static float n = 0.001f;
    private final int a = -1;
    private int b = 16;
    private int c = 16;
    int[] d = new int[16];
    int[] e = new int[16];
    int[] f = new int[16];
    float[] g = new float[16];
    int[] h = new int[16];
    int[] i = new int[16];
    int j = 0;
    int k = -1;
    private final or l;
    protected final kl0 m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public mqa(or orVar, kl0 kl0Var) {
        this.l = orVar;
        this.m = kl0Var;
        clear();
    }

    private void l(lqa lqaVar, int i) {
        int[] iArr;
        int i2 = lqaVar.c % this.c;
        int[] iArr2 = this.d;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.e;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    break;
                }
                i3 = i4;
            }
            iArr[i3] = i;
        }
        this.e[i] = -1;
    }

    private void m(int i, lqa lqaVar, float f) {
        this.f[i] = lqaVar.c;
        this.g[i] = f;
        this.h[i] = -1;
        this.i[i] = -1;
        lqaVar.a(this.l);
        lqaVar.m++;
        this.j++;
    }

    private int n() {
        for (int i = 0; i < this.b; i++) {
            if (this.f[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    private void o() {
        int i = this.b * 2;
        this.f = Arrays.copyOf(this.f, i);
        this.g = Arrays.copyOf(this.g, i);
        this.h = Arrays.copyOf(this.h, i);
        this.i = Arrays.copyOf(this.i, i);
        this.e = Arrays.copyOf(this.e, i);
        for (int i2 = this.b; i2 < i; i2++) {
            this.f[i2] = -1;
            this.e[i2] = -1;
        }
        this.b = i;
    }

    private void q(int i, lqa lqaVar, float f) {
        int n2 = n();
        m(n2, lqaVar, f);
        if (i != -1) {
            this.h[n2] = i;
            int[] iArr = this.i;
            iArr[n2] = iArr[i];
            iArr[i] = n2;
        } else {
            this.h[n2] = -1;
            if (this.j > 0) {
                this.i[n2] = this.k;
                this.k = n2;
            } else {
                this.i[n2] = -1;
            }
        }
        int i2 = this.i[n2];
        if (i2 != -1) {
            this.h[i2] = n2;
        }
        l(lqaVar, n2);
    }

    private void r(lqa lqaVar) {
        int[] iArr;
        int i;
        int i2 = lqaVar.c;
        int i3 = i2 % this.c;
        int[] iArr2 = this.d;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            return;
        }
        if (this.f[i4] == i2) {
            int[] iArr3 = this.e;
            iArr2[i3] = iArr3[i4];
            iArr3[i4] = -1;
            return;
        }
        while (true) {
            iArr = this.e;
            i = iArr[i4];
            if (i == -1 || this.f[i] == i2) {
                break;
            }
            i4 = i;
        }
        if (i != -1 && this.f[i] == i2) {
            iArr[i4] = iArr[i];
            iArr[i] = -1;
        }
    }

    @Override // defpackage.or.a
    public boolean a(lqa lqaVar) {
        if (p(lqaVar) != -1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.or.a
    public lqa b(int i) {
        int i2 = this.j;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.m.d[this.f[i3]];
            }
            i3 = this.i[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // defpackage.or.a
    public void c() {
        int i = this.j;
        int i2 = this.k;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.g;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.i[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // defpackage.or.a
    public void clear() {
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            lqa b = b(i2);
            if (b != null) {
                b.i(this.l);
            }
        }
        for (int i3 = 0; i3 < this.b; i3++) {
            this.f[i3] = -1;
            this.e[i3] = -1;
        }
        for (int i4 = 0; i4 < this.c; i4++) {
            this.d[i4] = -1;
        }
        this.j = 0;
        this.k = -1;
    }

    @Override // defpackage.or.a
    public float d(or orVar, boolean z) {
        float e = e(orVar.a);
        i(orVar.a, z);
        mqa mqaVar = (mqa) orVar.e;
        int f = mqaVar.f();
        int i = 0;
        int i2 = 0;
        while (i < f) {
            int i3 = mqaVar.f[i2];
            if (i3 != -1) {
                g(this.m.d[i3], mqaVar.g[i2] * e, z);
                i++;
            }
            i2++;
        }
        return e;
    }

    @Override // defpackage.or.a
    public float e(lqa lqaVar) {
        int p = p(lqaVar);
        if (p != -1) {
            return this.g[p];
        }
        return 0.0f;
    }

    @Override // defpackage.or.a
    public int f() {
        return this.j;
    }

    @Override // defpackage.or.a
    public void g(lqa lqaVar, float f, boolean z) {
        float f2 = n;
        if (f > (-f2) && f < f2) {
            return;
        }
        int p = p(lqaVar);
        if (p == -1) {
            k(lqaVar, f);
            return;
        }
        float[] fArr = this.g;
        float f3 = fArr[p] + f;
        fArr[p] = f3;
        float f4 = n;
        if (f3 > (-f4) && f3 < f4) {
            fArr[p] = 0.0f;
            i(lqaVar, z);
        }
    }

    @Override // defpackage.or.a
    public float h(int i) {
        int i2 = this.j;
        int i3 = this.k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.g[i3];
            }
            i3 = this.i[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // defpackage.or.a
    public float i(lqa lqaVar, boolean z) {
        int p = p(lqaVar);
        if (p == -1) {
            return 0.0f;
        }
        r(lqaVar);
        float f = this.g[p];
        if (this.k == p) {
            this.k = this.i[p];
        }
        this.f[p] = -1;
        int[] iArr = this.h;
        int i = iArr[p];
        if (i != -1) {
            int[] iArr2 = this.i;
            iArr2[i] = iArr2[p];
        }
        int i2 = this.i[p];
        if (i2 != -1) {
            iArr[i2] = iArr[p];
        }
        this.j--;
        lqaVar.m--;
        if (z) {
            lqaVar.i(this.l);
        }
        return f;
    }

    @Override // defpackage.or.a
    public void j(float f) {
        int i = this.j;
        int i2 = this.k;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.g;
            fArr[i2] = fArr[i2] / f;
            i2 = this.i[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // defpackage.or.a
    public void k(lqa lqaVar, float f) {
        float f2 = n;
        if (f > (-f2) && f < f2) {
            i(lqaVar, true);
            return;
        }
        if (this.j == 0) {
            m(0, lqaVar, f);
            l(lqaVar, 0);
            this.k = 0;
            return;
        }
        int p = p(lqaVar);
        if (p != -1) {
            this.g[p] = f;
            return;
        }
        if (this.j + 1 >= this.b) {
            o();
        }
        int i = this.j;
        int i2 = this.k;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = this.f[i2];
            int i6 = lqaVar.c;
            if (i5 == i6) {
                this.g[i2] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i2;
            }
            i2 = this.i[i2];
            if (i2 == -1) {
                break;
            }
        }
        q(i3, lqaVar, f);
    }

    public int p(lqa lqaVar) {
        if (this.j != 0 && lqaVar != null) {
            int i = lqaVar.c;
            int i2 = this.d[i % this.c];
            if (i2 == -1) {
                return -1;
            }
            if (this.f[i2] == i) {
                return i2;
            }
            do {
                i2 = this.e[i2];
                if (i2 == -1) {
                    break;
                }
            } while (this.f[i2] != i);
            if (i2 != -1 && this.f[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public String toString() {
        String str;
        String str2;
        String str3 = hashCode() + " { ";
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            lqa b = b(i2);
            if (b != null) {
                String str4 = str3 + b + " = " + h(i2) + " ";
                int p = p(b);
                String str5 = str4 + "[p: ";
                if (this.h[p] != -1) {
                    str = str5 + this.m.d[this.f[this.h[p]]];
                } else {
                    str = str5 + "none";
                }
                String str6 = str + ", n: ";
                if (this.i[p] != -1) {
                    str2 = str6 + this.m.d[this.f[this.i[p]]];
                } else {
                    str2 = str6 + "none";
                }
                str3 = str2 + "]";
            }
        }
        return str3 + " }";
    }
}
