package defpackage;

import android.graphics.Color;
import android.util.TimingLogger;
import defpackage.xp7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ColorCutQuantizer.java */
/* renamed from: vc1  reason: default package */
/* loaded from: classes.dex */
public final class vc1 {
    private static final Comparator<b> g = new a();
    final int[] a;
    final int[] b;
    final List<xp7.d> c;
    final xp7.c[] e;
    private final float[] f = new float[3];
    final TimingLogger d = null;

    /* compiled from: ColorCutQuantizer.java */
    /* renamed from: vc1$a */
    /* loaded from: classes.dex */
    static class a implements Comparator<b> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(b bVar, b bVar2) {
            return bVar2.g() - bVar.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ColorCutQuantizer.java */
    /* renamed from: vc1$b */
    /* loaded from: classes.dex */
    public class b {
        private int a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;

        b(int i, int i2) {
            this.a = i;
            this.b = i2;
            c();
        }

        final boolean a() {
            if (e() > 1) {
                return true;
            }
            return false;
        }

        final int b() {
            int f = f();
            vc1 vc1Var = vc1.this;
            int[] iArr = vc1Var.a;
            int[] iArr2 = vc1Var.b;
            vc1.e(iArr, f, this.a, this.b);
            Arrays.sort(iArr, this.a, this.b + 1);
            vc1.e(iArr, f, this.a, this.b);
            int i = this.c / 2;
            int i2 = this.a;
            int i3 = 0;
            while (true) {
                int i4 = this.b;
                if (i2 <= i4) {
                    i3 += iArr2[iArr[i2]];
                    if (i3 >= i) {
                        return Math.min(i4 - 1, i2);
                    }
                    i2++;
                } else {
                    return this.a;
                }
            }
        }

        final void c() {
            vc1 vc1Var = vc1.this;
            int[] iArr = vc1Var.a;
            int[] iArr2 = vc1Var.b;
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            int i7 = 0;
            for (int i8 = this.a; i8 <= this.b; i8++) {
                int i9 = iArr[i8];
                i7 += iArr2[i9];
                int k = vc1.k(i9);
                int j = vc1.j(i9);
                int i10 = vc1.i(i9);
                if (k > i4) {
                    i4 = k;
                }
                if (k < i) {
                    i = k;
                }
                if (j > i5) {
                    i5 = j;
                }
                if (j < i2) {
                    i2 = j;
                }
                if (i10 > i6) {
                    i6 = i10;
                }
                if (i10 < i3) {
                    i3 = i10;
                }
            }
            this.d = i;
            this.e = i4;
            this.f = i2;
            this.g = i5;
            this.h = i3;
            this.i = i6;
            this.c = i7;
        }

        final xp7.d d() {
            vc1 vc1Var = vc1.this;
            int[] iArr = vc1Var.a;
            int[] iArr2 = vc1Var.b;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = this.a; i5 <= this.b; i5++) {
                int i6 = iArr[i5];
                int i7 = iArr2[i6];
                i2 += i7;
                i += vc1.k(i6) * i7;
                i3 += vc1.j(i6) * i7;
                i4 += i7 * vc1.i(i6);
            }
            float f = i2;
            return new xp7.d(vc1.b(Math.round(i / f), Math.round(i3 / f), Math.round(i4 / f)), i2);
        }

        final int e() {
            return (this.b + 1) - this.a;
        }

        final int f() {
            int i = this.e - this.d;
            int i2 = this.g - this.f;
            int i3 = this.i - this.h;
            if (i >= i2 && i >= i3) {
                return -3;
            }
            if (i2 >= i && i2 >= i3) {
                return -2;
            }
            return -1;
        }

        final int g() {
            return ((this.e - this.d) + 1) * ((this.g - this.f) + 1) * ((this.i - this.h) + 1);
        }

        final b h() {
            if (a()) {
                int b = b();
                b bVar = new b(b + 1, this.b);
                this.b = b;
                c();
                return bVar;
            }
            throw new IllegalStateException("Can not split a box with only 1 color");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public vc1(int[] iArr, int i, xp7.c[] cVarArr) {
        this.e = cVarArr;
        int[] iArr2 = new int[32768];
        this.b = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int g2 = g(iArr[i2]);
            iArr[i2] = g2;
            iArr2[g2] = iArr2[g2] + 1;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 32768; i4++) {
            if (iArr2[i4] > 0 && l(i4)) {
                iArr2[i4] = 0;
            }
            if (iArr2[i4] > 0) {
                i3++;
            }
        }
        int[] iArr3 = new int[i3];
        this.a = iArr3;
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                iArr3[i5] = i6;
                i5++;
            }
        }
        if (i3 <= i) {
            this.c = new ArrayList();
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = iArr3[i7];
                this.c.add(new xp7.d(a(i8), iArr2[i8]));
            }
            return;
        }
        this.c = h(i);
    }

    private static int a(int i) {
        return b(k(i), j(i), i(i));
    }

    static int b(int i, int i2, int i3) {
        return Color.rgb(f(i, 5, 8), f(i2, 5, 8), f(i3, 5, 8));
    }

    private List<xp7.d> c(Collection<b> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (b bVar : collection) {
            xp7.d d = bVar.d();
            if (!n(d)) {
                arrayList.add(d);
            }
        }
        return arrayList;
    }

    static void e(int[] iArr, int i, int i2, int i3) {
        if (i != -2) {
            if (i == -1) {
                while (i2 <= i3) {
                    int i4 = iArr[i2];
                    iArr[i2] = k(i4) | (i(i4) << 10) | (j(i4) << 5);
                    i2++;
                }
                return;
            }
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = i(i5) | (j(i5) << 10) | (k(i5) << 5);
            i2++;
        }
    }

    private static int f(int i, int i2, int i3) {
        int i4;
        if (i3 > i2) {
            i4 = i << (i3 - i2);
        } else {
            i4 = i >> (i2 - i3);
        }
        return i4 & ((1 << i3) - 1);
    }

    private static int g(int i) {
        return f(Color.blue(i), 8, 5) | (f(Color.red(i), 8, 5) << 10) | (f(Color.green(i), 8, 5) << 5);
    }

    private List<xp7.d> h(int i) {
        PriorityQueue<b> priorityQueue = new PriorityQueue<>(i, g);
        priorityQueue.offer(new b(0, this.a.length - 1));
        o(priorityQueue, i);
        return c(priorityQueue);
    }

    static int i(int i) {
        return i & 31;
    }

    static int j(int i) {
        return (i >> 5) & 31;
    }

    static int k(int i) {
        return (i >> 10) & 31;
    }

    private boolean l(int i) {
        int a2 = a(i);
        qf1.h(a2, this.f);
        return m(a2, this.f);
    }

    private boolean m(int i, float[] fArr) {
        xp7.c[] cVarArr = this.e;
        if (cVarArr != null && cVarArr.length > 0) {
            int length = cVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!this.e[i2].a(i, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean n(xp7.d dVar) {
        return m(dVar.e(), dVar.c());
    }

    private void o(PriorityQueue<b> priorityQueue, int i) {
        b poll;
        while (priorityQueue.size() < i && (poll = priorityQueue.poll()) != null && poll.a()) {
            priorityQueue.offer(poll.h());
            priorityQueue.offer(poll);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<xp7.d> d() {
        return this.c;
    }
}
