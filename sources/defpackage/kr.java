package defpackage;

import defpackage.or;
import java.util.Arrays;
/* compiled from: ArrayLinkedVariables.java */
/* renamed from: kr  reason: default package */
/* loaded from: classes.dex */
public class kr implements or.a {
    private static float l = 0.001f;
    private final or b;
    protected final kl0 c;
    int a = 0;
    private int d = 8;
    private lqa e = null;
    private int[] f = new int[8];
    private int[] g = new int[8];
    private float[] h = new float[8];
    private int i = -1;
    private int j = -1;
    private boolean k = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public kr(or orVar, kl0 kl0Var) {
        this.b = orVar;
        this.c = kl0Var;
    }

    @Override // defpackage.or.a
    public boolean a(lqa lqaVar) {
        int i = this.i;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.f[i] == lqaVar.c) {
                return true;
            }
            i = this.g[i];
        }
        return false;
    }

    @Override // defpackage.or.a
    public lqa b(int i) {
        int i2 = this.i;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.c.d[this.f[i2]];
            }
            i2 = this.g[i2];
        }
        return null;
    }

    @Override // defpackage.or.a
    public void c() {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            float[] fArr = this.h;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.g[i];
        }
    }

    @Override // defpackage.or.a
    public final void clear() {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            lqa lqaVar = this.c.d[this.f[i]];
            if (lqaVar != null) {
                lqaVar.i(this.b);
            }
            i = this.g[i];
        }
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.a = 0;
    }

    @Override // defpackage.or.a
    public float d(or orVar, boolean z) {
        float e = e(orVar.a);
        i(orVar.a, z);
        or.a aVar = orVar.e;
        int f = aVar.f();
        for (int i = 0; i < f; i++) {
            lqa b = aVar.b(i);
            g(b, aVar.e(b) * e, z);
        }
        return e;
    }

    @Override // defpackage.or.a
    public final float e(lqa lqaVar) {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.f[i] == lqaVar.c) {
                return this.h[i];
            }
            i = this.g[i];
        }
        return 0.0f;
    }

    @Override // defpackage.or.a
    public int f() {
        return this.a;
    }

    @Override // defpackage.or.a
    public void g(lqa lqaVar, float f, boolean z) {
        float f2 = l;
        if (f > (-f2) && f < f2) {
            return;
        }
        int i = this.i;
        if (i == -1) {
            this.i = 0;
            this.h[0] = f;
            this.f[0] = lqaVar.c;
            this.g[0] = -1;
            lqaVar.m++;
            lqaVar.a(this.b);
            this.a++;
            if (!this.k) {
                int i2 = this.j + 1;
                this.j = i2;
                int[] iArr = this.f;
                if (i2 >= iArr.length) {
                    this.k = true;
                    this.j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.a; i4++) {
            int i5 = this.f[i];
            int i6 = lqaVar.c;
            if (i5 == i6) {
                float[] fArr = this.h;
                float f3 = fArr[i] + f;
                float f4 = l;
                if (f3 > (-f4) && f3 < f4) {
                    f3 = 0.0f;
                }
                fArr[i] = f3;
                if (f3 == 0.0f) {
                    if (i == this.i) {
                        this.i = this.g[i];
                    } else {
                        int[] iArr2 = this.g;
                        iArr2[i3] = iArr2[i];
                    }
                    if (z) {
                        lqaVar.i(this.b);
                    }
                    if (this.k) {
                        this.j = i;
                    }
                    lqaVar.m--;
                    this.a--;
                    return;
                }
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.g[i];
        }
        int i7 = this.j;
        int i8 = i7 + 1;
        if (this.k) {
            int[] iArr3 = this.f;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.f;
        if (i7 >= iArr4.length && this.a < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f;
                if (i9 >= iArr5.length) {
                    break;
                } else if (iArr5[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr6 = this.f;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.d * 2;
            this.d = i10;
            this.k = false;
            this.j = i7 - 1;
            this.h = Arrays.copyOf(this.h, i10);
            this.f = Arrays.copyOf(this.f, this.d);
            this.g = Arrays.copyOf(this.g, this.d);
        }
        this.f[i7] = lqaVar.c;
        this.h[i7] = f;
        if (i3 != -1) {
            int[] iArr7 = this.g;
            iArr7[i7] = iArr7[i3];
            iArr7[i3] = i7;
        } else {
            this.g[i7] = this.i;
            this.i = i7;
        }
        lqaVar.m++;
        lqaVar.a(this.b);
        this.a++;
        if (!this.k) {
            this.j++;
        }
        int i11 = this.j;
        int[] iArr8 = this.f;
        if (i11 >= iArr8.length) {
            this.k = true;
            this.j = iArr8.length - 1;
        }
    }

    @Override // defpackage.or.a
    public float h(int i) {
        int i2 = this.i;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.h[i2];
            }
            i2 = this.g[i2];
        }
        return 0.0f;
    }

    @Override // defpackage.or.a
    public final float i(lqa lqaVar, boolean z) {
        if (this.e == lqaVar) {
            this.e = null;
        }
        int i = this.i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.a) {
            if (this.f[i] == lqaVar.c) {
                if (i == this.i) {
                    this.i = this.g[i];
                } else {
                    int[] iArr = this.g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    lqaVar.i(this.b);
                }
                lqaVar.m--;
                this.a--;
                this.f[i] = -1;
                if (this.k) {
                    this.j = i;
                }
                return this.h[i];
            }
            i2++;
            i3 = i;
            i = this.g[i];
        }
        return 0.0f;
    }

    @Override // defpackage.or.a
    public void j(float f) {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            float[] fArr = this.h;
            fArr[i] = fArr[i] / f;
            i = this.g[i];
        }
    }

    @Override // defpackage.or.a
    public final void k(lqa lqaVar, float f) {
        if (f == 0.0f) {
            i(lqaVar, true);
            return;
        }
        int i = this.i;
        if (i == -1) {
            this.i = 0;
            this.h[0] = f;
            this.f[0] = lqaVar.c;
            this.g[0] = -1;
            lqaVar.m++;
            lqaVar.a(this.b);
            this.a++;
            if (!this.k) {
                int i2 = this.j + 1;
                this.j = i2;
                int[] iArr = this.f;
                if (i2 >= iArr.length) {
                    this.k = true;
                    this.j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.a; i4++) {
            int i5 = this.f[i];
            int i6 = lqaVar.c;
            if (i5 == i6) {
                this.h[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.g[i];
        }
        int i7 = this.j;
        int i8 = i7 + 1;
        if (this.k) {
            int[] iArr2 = this.f;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f;
        if (i7 >= iArr3.length && this.a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f;
                if (i9 >= iArr4.length) {
                    break;
                } else if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr5 = this.f;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.d * 2;
            this.d = i10;
            this.k = false;
            this.j = i7 - 1;
            this.h = Arrays.copyOf(this.h, i10);
            this.f = Arrays.copyOf(this.f, this.d);
            this.g = Arrays.copyOf(this.g, this.d);
        }
        this.f[i7] = lqaVar.c;
        this.h[i7] = f;
        if (i3 != -1) {
            int[] iArr6 = this.g;
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            this.g[i7] = this.i;
            this.i = i7;
        }
        lqaVar.m++;
        lqaVar.a(this.b);
        int i11 = this.a + 1;
        this.a = i11;
        if (!this.k) {
            this.j++;
        }
        int[] iArr7 = this.f;
        if (i11 >= iArr7.length) {
            this.k = true;
        }
        if (this.j >= iArr7.length) {
            this.k = true;
            this.j = iArr7.length - 1;
        }
    }

    public String toString() {
        int i = this.i;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            str = ((str + " -> ") + this.h[i] + " : ") + this.c.d[this.f[i]];
            i = this.g[i];
        }
        return str;
    }
}
