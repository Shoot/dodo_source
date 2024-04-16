package defpackage;

import java.util.Arrays;
/* compiled from: ArcCurveFit.java */
/* renamed from: rq  reason: default package */
/* loaded from: classes.dex */
public class rq extends s32 {
    private final double[] a;
    a[] b;
    private boolean c = true;

    /* compiled from: ArcCurveFit.java */
    /* renamed from: rq$a */
    /* loaded from: classes.dex */
    private static class a {
        private static double[] s = new double[91];
        double[] a;
        double b;
        double c;
        double d;
        double e;
        double f;
        double g;
        double h;
        double i;
        double j;
        double k;
        double l;
        double m;
        double n;
        double o;
        double p;
        boolean q;
        boolean r;

        a(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            int i2;
            double d7;
            double d8;
            this.r = false;
            this.q = i == 1;
            this.c = d;
            this.d = d2;
            this.i = 1.0d / (d2 - d);
            if (3 == i) {
                this.r = true;
            }
            double d9 = d5 - d3;
            double d10 = d6 - d4;
            if (!this.r && Math.abs(d9) >= 0.001d && Math.abs(d10) >= 0.001d) {
                this.a = new double[101];
                boolean z = this.q;
                if (z) {
                    i2 = -1;
                } else {
                    i2 = 1;
                }
                this.j = d9 * i2;
                this.k = d10 * (z ? 1 : -1);
                if (z) {
                    d7 = d5;
                } else {
                    d7 = d3;
                }
                this.l = d7;
                if (z) {
                    d8 = d4;
                } else {
                    d8 = d6;
                }
                this.m = d8;
                a(d3, d4, d5, d6);
                this.n = this.b * this.i;
                return;
            }
            this.r = true;
            this.e = d3;
            this.f = d5;
            this.g = d4;
            this.h = d6;
            double hypot = Math.hypot(d10, d9);
            this.b = hypot;
            this.n = hypot * this.i;
            double d11 = this.d;
            double d12 = this.c;
            this.l = d9 / (d11 - d12);
            this.m = d10 / (d11 - d12);
        }

        private void a(double d, double d2, double d3, double d4) {
            double[] dArr;
            double[] dArr2;
            double d5;
            double d6 = d3 - d;
            double d7 = d2 - d4;
            int i = 0;
            double d8 = 0.0d;
            double d9 = 0.0d;
            double d10 = 0.0d;
            while (true) {
                if (i >= s.length) {
                    break;
                }
                double d11 = d8;
                double radians = Math.toRadians((i * 90.0d) / (dArr.length - 1));
                double sin = Math.sin(radians) * d6;
                double cos = Math.cos(radians) * d7;
                if (i > 0) {
                    d5 = Math.hypot(sin - d9, cos - d10) + d11;
                    s[i] = d5;
                } else {
                    d5 = d11;
                }
                i++;
                d10 = cos;
                d8 = d5;
                d9 = sin;
            }
            double d12 = d8;
            this.b = d12;
            int i2 = 0;
            while (true) {
                double[] dArr3 = s;
                if (i2 >= dArr3.length) {
                    break;
                }
                dArr3[i2] = dArr3[i2] / d12;
                i2++;
            }
            int i3 = 0;
            while (true) {
                if (i3 < this.a.length) {
                    double length = i3 / (dArr2.length - 1);
                    int binarySearch = Arrays.binarySearch(s, length);
                    if (binarySearch >= 0) {
                        this.a[i3] = binarySearch / (s.length - 1);
                    } else if (binarySearch == -1) {
                        this.a[i3] = 0.0d;
                    } else {
                        int i4 = -binarySearch;
                        int i5 = i4 - 2;
                        double[] dArr4 = s;
                        double d13 = dArr4[i5];
                        this.a[i3] = (i5 + ((length - d13) / (dArr4[i4 - 1] - d13))) / (dArr4.length - 1);
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }

        double b() {
            double d = this.j * this.p;
            double hypot = this.n / Math.hypot(d, (-this.k) * this.o);
            if (this.q) {
                d = -d;
            }
            return d * hypot;
        }

        double c() {
            double d = this.j * this.p;
            double d2 = (-this.k) * this.o;
            double hypot = this.n / Math.hypot(d, d2);
            if (this.q) {
                return (-d2) * hypot;
            }
            return d2 * hypot;
        }

        public double d(double d) {
            return this.l;
        }

        public double e(double d) {
            return this.m;
        }

        public double f(double d) {
            double d2 = (d - this.c) * this.i;
            double d3 = this.e;
            return d3 + (d2 * (this.f - d3));
        }

        public double g(double d) {
            double d2 = (d - this.c) * this.i;
            double d3 = this.g;
            return d3 + (d2 * (this.h - d3));
        }

        double h() {
            return this.l + (this.j * this.o);
        }

        double i() {
            return this.m + (this.k * this.p);
        }

        double j(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.a;
            double length = d * (dArr.length - 1);
            int i = (int) length;
            double d2 = length - i;
            double d3 = dArr[i];
            return d3 + (d2 * (dArr[i + 1] - d3));
        }

        void k(double d) {
            double d2;
            if (this.q) {
                d2 = this.d - d;
            } else {
                d2 = d - this.c;
            }
            double j = j(d2 * this.i) * 1.5707963267948966d;
            this.o = Math.sin(j);
            this.p = Math.cos(j);
        }
    }

    public rq(int[] iArr, double[] dArr, double[][] dArr2) {
        this.a = dArr;
        this.b = new a[dArr.length - 1];
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        while (true) {
            a[] aVarArr = this.b;
            if (i < aVarArr.length) {
                int i4 = iArr[i];
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                if (i2 == 1) {
                                    i2 = 2;
                                } else {
                                    i2 = 1;
                                }
                                i3 = i2;
                            }
                        } else {
                            i2 = 2;
                            i3 = 2;
                        }
                    } else {
                        i2 = 1;
                        i3 = 1;
                    }
                } else {
                    i3 = 3;
                }
                double d = dArr[i];
                int i5 = i + 1;
                double d2 = dArr[i5];
                double[] dArr3 = dArr2[i];
                double d3 = dArr3[0];
                double d4 = dArr3[1];
                double[] dArr4 = dArr2[i5];
                aVarArr[i] = new a(i3, d, d2, d3, d4, dArr4[0], dArr4[1]);
                i = i5;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.s32
    public double c(double d, int i) {
        double g;
        double e;
        double i2;
        double c;
        double g2;
        double e2;
        int i3 = 0;
        if (this.c) {
            a[] aVarArr = this.b;
            a aVar = aVarArr[0];
            double d2 = aVar.c;
            if (d < d2) {
                double d3 = d - d2;
                if (aVar.r) {
                    if (i == 0) {
                        g2 = aVar.f(d2);
                        e2 = this.b[0].d(d2);
                    } else {
                        g2 = aVar.g(d2);
                        e2 = this.b[0].e(d2);
                    }
                    return g2 + (d3 * e2);
                }
                aVar.k(d2);
                if (i == 0) {
                    i2 = this.b[0].h();
                    c = this.b[0].b();
                } else {
                    i2 = this.b[0].i();
                    c = this.b[0].c();
                }
                return i2 + (d3 * c);
            } else if (d > aVarArr[aVarArr.length - 1].d) {
                double d4 = aVarArr[aVarArr.length - 1].d;
                double d5 = d - d4;
                int length = aVarArr.length - 1;
                if (i == 0) {
                    g = aVarArr[length].f(d4);
                    e = this.b[length].d(d4);
                } else {
                    g = aVarArr[length].g(d4);
                    e = this.b[length].e(d4);
                }
                return g + (d5 * e);
            }
        } else {
            a[] aVarArr2 = this.b;
            double d6 = aVarArr2[0].c;
            if (d < d6) {
                d = d6;
            } else if (d > aVarArr2[aVarArr2.length - 1].d) {
                d = aVarArr2[aVarArr2.length - 1].d;
            }
        }
        while (true) {
            a[] aVarArr3 = this.b;
            if (i3 < aVarArr3.length) {
                a aVar2 = aVarArr3[i3];
                if (d <= aVar2.d) {
                    if (aVar2.r) {
                        if (i == 0) {
                            return aVar2.f(d);
                        }
                        return aVar2.g(d);
                    }
                    aVar2.k(d);
                    if (i == 0) {
                        return this.b[i3].h();
                    }
                    return this.b[i3].i();
                }
                i3++;
            } else {
                return Double.NaN;
            }
        }
    }

    @Override // defpackage.s32
    public void d(double d, double[] dArr) {
        if (this.c) {
            a[] aVarArr = this.b;
            a aVar = aVarArr[0];
            double d2 = aVar.c;
            if (d < d2) {
                double d3 = d - d2;
                if (aVar.r) {
                    dArr[0] = aVar.f(d2) + (this.b[0].d(d2) * d3);
                    dArr[1] = this.b[0].g(d2) + (d3 * this.b[0].e(d2));
                    return;
                }
                aVar.k(d2);
                dArr[0] = this.b[0].h() + (this.b[0].b() * d3);
                dArr[1] = this.b[0].i() + (d3 * this.b[0].c());
                return;
            } else if (d > aVarArr[aVarArr.length - 1].d) {
                double d4 = aVarArr[aVarArr.length - 1].d;
                double d5 = d - d4;
                int length = aVarArr.length - 1;
                a aVar2 = aVarArr[length];
                if (aVar2.r) {
                    dArr[0] = aVar2.f(d4) + (this.b[length].d(d4) * d5);
                    dArr[1] = this.b[length].g(d4) + (d5 * this.b[length].e(d4));
                    return;
                }
                aVar2.k(d);
                dArr[0] = this.b[length].h() + (this.b[length].b() * d5);
                dArr[1] = this.b[length].i() + (d5 * this.b[length].c());
                return;
            }
        } else {
            a[] aVarArr2 = this.b;
            double d6 = aVarArr2[0].c;
            if (d < d6) {
                d = d6;
            }
            if (d > aVarArr2[aVarArr2.length - 1].d) {
                d = aVarArr2[aVarArr2.length - 1].d;
            }
        }
        int i = 0;
        while (true) {
            a[] aVarArr3 = this.b;
            if (i < aVarArr3.length) {
                a aVar3 = aVarArr3[i];
                if (d <= aVar3.d) {
                    if (aVar3.r) {
                        dArr[0] = aVar3.f(d);
                        dArr[1] = this.b[i].g(d);
                        return;
                    }
                    aVar3.k(d);
                    dArr[0] = this.b[i].h();
                    dArr[1] = this.b[i].i();
                    return;
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.s32
    public void e(double d, float[] fArr) {
        if (this.c) {
            a[] aVarArr = this.b;
            a aVar = aVarArr[0];
            double d2 = aVar.c;
            if (d < d2) {
                double d3 = d - d2;
                if (aVar.r) {
                    fArr[0] = (float) (aVar.f(d2) + (this.b[0].d(d2) * d3));
                    fArr[1] = (float) (this.b[0].g(d2) + (d3 * this.b[0].e(d2)));
                    return;
                }
                aVar.k(d2);
                fArr[0] = (float) (this.b[0].h() + (this.b[0].b() * d3));
                fArr[1] = (float) (this.b[0].i() + (d3 * this.b[0].c()));
                return;
            } else if (d > aVarArr[aVarArr.length - 1].d) {
                double d4 = aVarArr[aVarArr.length - 1].d;
                double d5 = d - d4;
                int length = aVarArr.length - 1;
                a aVar2 = aVarArr[length];
                if (aVar2.r) {
                    fArr[0] = (float) (aVar2.f(d4) + (this.b[length].d(d4) * d5));
                    fArr[1] = (float) (this.b[length].g(d4) + (d5 * this.b[length].e(d4)));
                    return;
                }
                aVar2.k(d);
                fArr[0] = (float) this.b[length].h();
                fArr[1] = (float) this.b[length].i();
                return;
            }
        } else {
            a[] aVarArr2 = this.b;
            double d6 = aVarArr2[0].c;
            if (d < d6) {
                d = d6;
            } else if (d > aVarArr2[aVarArr2.length - 1].d) {
                d = aVarArr2[aVarArr2.length - 1].d;
            }
        }
        int i = 0;
        while (true) {
            a[] aVarArr3 = this.b;
            if (i < aVarArr3.length) {
                a aVar3 = aVarArr3[i];
                if (d <= aVar3.d) {
                    if (aVar3.r) {
                        fArr[0] = (float) aVar3.f(d);
                        fArr[1] = (float) this.b[i].g(d);
                        return;
                    }
                    aVar3.k(d);
                    fArr[0] = (float) this.b[i].h();
                    fArr[1] = (float) this.b[i].i();
                    return;
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.s32
    public void f(double d, double[] dArr) {
        a[] aVarArr = this.b;
        double d2 = aVarArr[0].c;
        if (d < d2) {
            d = d2;
        } else if (d > aVarArr[aVarArr.length - 1].d) {
            d = aVarArr[aVarArr.length - 1].d;
        }
        int i = 0;
        while (true) {
            a[] aVarArr2 = this.b;
            if (i < aVarArr2.length) {
                a aVar = aVarArr2[i];
                if (d <= aVar.d) {
                    if (aVar.r) {
                        dArr[0] = aVar.d(d);
                        dArr[1] = this.b[i].e(d);
                        return;
                    }
                    aVar.k(d);
                    dArr[0] = this.b[i].b();
                    dArr[1] = this.b[i].c();
                    return;
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.s32
    public double[] g() {
        return this.a;
    }
}
