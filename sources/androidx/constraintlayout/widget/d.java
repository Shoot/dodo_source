package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: ConstraintSet.java */
/* loaded from: classes.dex */
public class d {
    private static final int[] h = {0, 4, 8};
    private static SparseIntArray i = new SparseIntArray();
    private static SparseIntArray j = new SparseIntArray();
    private boolean a;
    public String b;
    public String c = "";
    public int d = 0;
    private HashMap<String, androidx.constraintlayout.widget.a> e = new HashMap<>();
    private boolean f = true;
    private HashMap<Integer, a> g = new HashMap<>();

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class a {
        int a;
        String b;
        public final C0027d c = new C0027d();
        public final c d = new c();
        public final b e = new b();
        public final e f = new e();
        public HashMap<String, androidx.constraintlayout.widget.a> g = new HashMap<>();
        C0026a h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ConstraintSet.java */
        /* renamed from: androidx.constraintlayout.widget.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0026a {
            int[] a = new int[10];
            int[] b = new int[10];
            int c = 0;
            int[] d = new int[10];
            float[] e = new float[10];
            int f = 0;
            int[] g = new int[5];
            String[] h = new String[5];
            int i = 0;
            int[] j = new int[4];
            boolean[] k = new boolean[4];
            int l = 0;

            C0026a() {
            }

            void a(int i, float f) {
                int i2 = this.f;
                int[] iArr = this.d;
                if (i2 >= iArr.length) {
                    this.d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.e;
                    this.e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.d;
                int i3 = this.f;
                iArr2[i3] = i;
                float[] fArr2 = this.e;
                this.f = i3 + 1;
                fArr2[i3] = f;
            }

            void b(int i, int i2) {
                int i3 = this.c;
                int[] iArr = this.a;
                if (i3 >= iArr.length) {
                    this.a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.b;
                    this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.a;
                int i4 = this.c;
                iArr3[i4] = i;
                int[] iArr4 = this.b;
                this.c = i4 + 1;
                iArr4[i4] = i2;
            }

            void c(int i, String str) {
                int i2 = this.i;
                int[] iArr = this.g;
                if (i2 >= iArr.length) {
                    this.g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.h;
                    this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.g;
                int i3 = this.i;
                iArr2[i3] = i;
                String[] strArr2 = this.h;
                this.i = i3 + 1;
                strArr2[i3] = str;
            }

            void d(int i, boolean z) {
                int i2 = this.l;
                int[] iArr = this.j;
                if (i2 >= iArr.length) {
                    this.j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.k;
                    this.k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.j;
                int i3 = this.l;
                iArr2[i3] = i;
                boolean[] zArr2 = this.k;
                this.l = i3 + 1;
                zArr2[i3] = z;
            }

            void e(a aVar) {
                for (int i = 0; i < this.c; i++) {
                    d.P(aVar, this.a[i], this.b[i]);
                }
                for (int i2 = 0; i2 < this.f; i2++) {
                    d.O(aVar, this.d[i2], this.e[i2]);
                }
                for (int i3 = 0; i3 < this.i; i3++) {
                    d.Q(aVar, this.g[i3], this.h[i3]);
                }
                for (int i4 = 0; i4 < this.l; i4++) {
                    d.R(aVar, this.j[i4], this.k[i4]);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(int i, ConstraintLayout.b bVar) {
            this.a = i;
            b bVar2 = this.e;
            bVar2.i = bVar.d;
            bVar2.j = bVar.e;
            bVar2.k = bVar.f;
            bVar2.l = bVar.g;
            bVar2.m = bVar.h;
            bVar2.n = bVar.i;
            bVar2.o = bVar.j;
            bVar2.p = bVar.k;
            bVar2.q = bVar.l;
            bVar2.r = bVar.m;
            bVar2.s = bVar.n;
            bVar2.t = bVar.r;
            bVar2.u = bVar.s;
            bVar2.v = bVar.t;
            bVar2.w = bVar.u;
            bVar2.x = bVar.F;
            bVar2.y = bVar.G;
            bVar2.z = bVar.H;
            bVar2.A = bVar.o;
            bVar2.B = bVar.p;
            bVar2.C = bVar.q;
            bVar2.D = bVar.W;
            bVar2.E = bVar.X;
            bVar2.F = bVar.Y;
            bVar2.h = bVar.c;
            bVar2.f = bVar.a;
            bVar2.g = bVar.b;
            bVar2.d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.G = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.H = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.I = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.J = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.M = bVar.C;
            bVar2.U = bVar.L;
            bVar2.V = bVar.K;
            bVar2.X = bVar.N;
            bVar2.W = bVar.M;
            bVar2.m0 = bVar.Z;
            bVar2.n0 = bVar.a0;
            bVar2.Y = bVar.O;
            bVar2.Z = bVar.P;
            bVar2.a0 = bVar.S;
            bVar2.b0 = bVar.T;
            bVar2.c0 = bVar.Q;
            bVar2.d0 = bVar.R;
            bVar2.e0 = bVar.U;
            bVar2.f0 = bVar.V;
            bVar2.l0 = bVar.b0;
            bVar2.O = bVar.w;
            bVar2.Q = bVar.y;
            bVar2.N = bVar.v;
            bVar2.P = bVar.x;
            bVar2.S = bVar.z;
            bVar2.R = bVar.A;
            bVar2.T = bVar.B;
            bVar2.p0 = bVar.c0;
            bVar2.K = bVar.getMarginEnd();
            this.e.L = bVar.getMarginStart();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(int i, e.a aVar) {
            g(i, aVar);
            this.c.d = aVar.w0;
            e eVar = this.f;
            eVar.b = aVar.z0;
            eVar.c = aVar.A0;
            eVar.d = aVar.B0;
            eVar.e = aVar.C0;
            eVar.f = aVar.D0;
            eVar.g = aVar.E0;
            eVar.h = aVar.F0;
            eVar.j = aVar.G0;
            eVar.k = aVar.H0;
            eVar.l = aVar.I0;
            eVar.n = aVar.y0;
            eVar.m = aVar.x0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i(androidx.constraintlayout.widget.b bVar, int i, e.a aVar) {
            h(i, aVar);
            if (bVar instanceof Barrier) {
                b bVar2 = this.e;
                bVar2.i0 = 1;
                Barrier barrier = (Barrier) bVar;
                bVar2.g0 = barrier.getType();
                this.e.j0 = barrier.getReferencedIds();
                this.e.h0 = barrier.getMargin();
            }
        }

        public void d(a aVar) {
            C0026a c0026a = this.h;
            if (c0026a != null) {
                c0026a.e(aVar);
            }
        }

        public void e(ConstraintLayout.b bVar) {
            b bVar2 = this.e;
            bVar.d = bVar2.i;
            bVar.e = bVar2.j;
            bVar.f = bVar2.k;
            bVar.g = bVar2.l;
            bVar.h = bVar2.m;
            bVar.i = bVar2.n;
            bVar.j = bVar2.o;
            bVar.k = bVar2.p;
            bVar.l = bVar2.q;
            bVar.m = bVar2.r;
            bVar.n = bVar2.s;
            bVar.r = bVar2.t;
            bVar.s = bVar2.u;
            bVar.t = bVar2.v;
            bVar.u = bVar2.w;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.G;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.H;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.I;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.J;
            bVar.z = bVar2.S;
            bVar.A = bVar2.R;
            bVar.w = bVar2.O;
            bVar.y = bVar2.Q;
            bVar.F = bVar2.x;
            bVar.G = bVar2.y;
            bVar.o = bVar2.A;
            bVar.p = bVar2.B;
            bVar.q = bVar2.C;
            bVar.H = bVar2.z;
            bVar.W = bVar2.D;
            bVar.X = bVar2.E;
            bVar.L = bVar2.U;
            bVar.K = bVar2.V;
            bVar.N = bVar2.X;
            bVar.M = bVar2.W;
            bVar.Z = bVar2.m0;
            bVar.a0 = bVar2.n0;
            bVar.O = bVar2.Y;
            bVar.P = bVar2.Z;
            bVar.S = bVar2.a0;
            bVar.T = bVar2.b0;
            bVar.Q = bVar2.c0;
            bVar.R = bVar2.d0;
            bVar.U = bVar2.e0;
            bVar.V = bVar2.f0;
            bVar.Y = bVar2.F;
            bVar.c = bVar2.h;
            bVar.a = bVar2.f;
            bVar.b = bVar2.g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.e;
            String str = bVar2.l0;
            if (str != null) {
                bVar.b0 = str;
            }
            bVar.c0 = bVar2.p0;
            bVar.setMarginStart(bVar2.L);
            bVar.setMarginEnd(this.e.K);
            bVar.b();
        }

        /* renamed from: f */
        public a clone() {
            a aVar = new a();
            aVar.e.a(this.e);
            aVar.d.a(this.d);
            aVar.c.a(this.c);
            aVar.f.a(this.f);
            aVar.a = this.a;
            aVar.h = this.h;
            return aVar;
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class b {
        private static SparseIntArray q0;
        public int d;
        public int e;
        public int[] j0;
        public String k0;
        public String l0;
        public boolean a = false;
        public boolean b = false;
        public boolean c = false;
        public int f = -1;
        public int g = -1;
        public float h = -1.0f;
        public int i = -1;
        public int j = -1;
        public int k = -1;
        public int l = -1;
        public int m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public int v = -1;
        public int w = -1;
        public float x = 0.5f;
        public float y = 0.5f;
        public String z = null;
        public int A = -1;
        public int B = 0;
        public float C = 0.0f;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = Integer.MIN_VALUE;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public float U = -1.0f;
        public float V = -1.0f;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;
        public int a0 = -1;
        public int b0 = -1;
        public int c0 = -1;
        public int d0 = -1;
        public float e0 = 1.0f;
        public float f0 = 1.0f;
        public int g0 = -1;
        public int h0 = 0;
        public int i0 = -1;
        public boolean m0 = false;
        public boolean n0 = false;
        public boolean o0 = true;
        public int p0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            q0 = sparseIntArray;
            sparseIntArray.append(g29.L7, 24);
            q0.append(g29.M7, 25);
            q0.append(g29.O7, 28);
            q0.append(g29.P7, 29);
            q0.append(g29.U7, 35);
            q0.append(g29.T7, 34);
            q0.append(g29.v7, 4);
            q0.append(g29.u7, 3);
            q0.append(g29.s7, 1);
            q0.append(g29.a8, 6);
            q0.append(g29.b8, 7);
            q0.append(g29.C7, 17);
            q0.append(g29.D7, 18);
            q0.append(g29.E7, 19);
            q0.append(g29.b7, 26);
            q0.append(g29.Q7, 31);
            q0.append(g29.R7, 32);
            q0.append(g29.B7, 10);
            q0.append(g29.A7, 9);
            q0.append(g29.e8, 13);
            q0.append(g29.h8, 16);
            q0.append(g29.f8, 14);
            q0.append(g29.c8, 11);
            q0.append(g29.g8, 15);
            q0.append(g29.d8, 12);
            q0.append(g29.X7, 38);
            q0.append(g29.J7, 37);
            q0.append(g29.I7, 39);
            q0.append(g29.W7, 40);
            q0.append(g29.H7, 20);
            q0.append(g29.V7, 36);
            q0.append(g29.z7, 5);
            q0.append(g29.K7, 76);
            q0.append(g29.S7, 76);
            q0.append(g29.N7, 76);
            q0.append(g29.t7, 76);
            q0.append(g29.r7, 76);
            q0.append(g29.e7, 23);
            q0.append(g29.g7, 27);
            q0.append(g29.i7, 30);
            q0.append(g29.j7, 8);
            q0.append(g29.f7, 33);
            q0.append(g29.h7, 2);
            q0.append(g29.c7, 22);
            q0.append(g29.d7, 21);
            q0.append(g29.Y7, 41);
            q0.append(g29.F7, 42);
            q0.append(g29.q7, 41);
            q0.append(g29.p7, 42);
            q0.append(g29.i8, 97);
            q0.append(g29.w7, 61);
            q0.append(g29.y7, 62);
            q0.append(g29.x7, 63);
            q0.append(g29.Z7, 69);
            q0.append(g29.G7, 70);
            q0.append(g29.n7, 71);
            q0.append(g29.l7, 72);
            q0.append(g29.m7, 73);
            q0.append(g29.o7, 74);
            q0.append(g29.k7, 75);
        }

        public void a(b bVar) {
            this.a = bVar.a;
            this.d = bVar.d;
            this.b = bVar.b;
            this.e = bVar.e;
            this.f = bVar.f;
            this.g = bVar.g;
            this.h = bVar.h;
            this.i = bVar.i;
            this.j = bVar.j;
            this.k = bVar.k;
            this.l = bVar.l;
            this.m = bVar.m;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
            this.q = bVar.q;
            this.r = bVar.r;
            this.s = bVar.s;
            this.t = bVar.t;
            this.u = bVar.u;
            this.v = bVar.v;
            this.w = bVar.w;
            this.x = bVar.x;
            this.y = bVar.y;
            this.z = bVar.z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.a0 = bVar.a0;
            this.b0 = bVar.b0;
            this.c0 = bVar.c0;
            this.d0 = bVar.d0;
            this.e0 = bVar.e0;
            this.f0 = bVar.f0;
            this.g0 = bVar.g0;
            this.h0 = bVar.h0;
            this.i0 = bVar.i0;
            this.l0 = bVar.l0;
            int[] iArr = bVar.j0;
            if (iArr != null) {
                this.j0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.j0 = null;
            }
            this.k0 = bVar.k0;
            this.m0 = bVar.m0;
            this.n0 = bVar.n0;
            this.o0 = bVar.o0;
            this.p0 = bVar.p0;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g29.a7);
            this.b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = q0.get(index);
                if (i2 != 80) {
                    if (i2 != 81) {
                        if (i2 != 97) {
                            switch (i2) {
                                case 1:
                                    this.q = d.G(obtainStyledAttributes, index, this.q);
                                    continue;
                                case 2:
                                    this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                                    continue;
                                case 3:
                                    this.p = d.G(obtainStyledAttributes, index, this.p);
                                    continue;
                                case 4:
                                    this.o = d.G(obtainStyledAttributes, index, this.o);
                                    continue;
                                case 5:
                                    this.z = obtainStyledAttributes.getString(index);
                                    continue;
                                case 6:
                                    this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                                    continue;
                                case 7:
                                    this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                                    continue;
                                case 8:
                                    this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                                    continue;
                                case 9:
                                    this.w = d.G(obtainStyledAttributes, index, this.w);
                                    continue;
                                case 10:
                                    this.v = d.G(obtainStyledAttributes, index, this.v);
                                    continue;
                                case 11:
                                    this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                                    continue;
                                case 12:
                                    this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                                    continue;
                                case 13:
                                    this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                                    continue;
                                case 14:
                                    this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                                    continue;
                                case 15:
                                    this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                                    continue;
                                case 16:
                                    this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                                    continue;
                                case 17:
                                    this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                                    continue;
                                case 18:
                                    this.g = obtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                                    continue;
                                case 19:
                                    this.h = obtainStyledAttributes.getFloat(index, this.h);
                                    continue;
                                case 20:
                                    this.x = obtainStyledAttributes.getFloat(index, this.x);
                                    continue;
                                case 21:
                                    this.e = obtainStyledAttributes.getLayoutDimension(index, this.e);
                                    continue;
                                case 22:
                                    this.d = obtainStyledAttributes.getLayoutDimension(index, this.d);
                                    continue;
                                case 23:
                                    this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                                    continue;
                                case 24:
                                    this.i = d.G(obtainStyledAttributes, index, this.i);
                                    continue;
                                case 25:
                                    this.j = d.G(obtainStyledAttributes, index, this.j);
                                    continue;
                                case 26:
                                    this.F = obtainStyledAttributes.getInt(index, this.F);
                                    continue;
                                case 27:
                                    this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                                    continue;
                                case 28:
                                    this.k = d.G(obtainStyledAttributes, index, this.k);
                                    continue;
                                case 29:
                                    this.l = d.G(obtainStyledAttributes, index, this.l);
                                    continue;
                                case 30:
                                    this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                                    continue;
                                case 31:
                                    this.t = d.G(obtainStyledAttributes, index, this.t);
                                    continue;
                                case 32:
                                    this.u = d.G(obtainStyledAttributes, index, this.u);
                                    continue;
                                case 33:
                                    this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                                    continue;
                                case 34:
                                    this.n = d.G(obtainStyledAttributes, index, this.n);
                                    continue;
                                case 35:
                                    this.m = d.G(obtainStyledAttributes, index, this.m);
                                    continue;
                                case 36:
                                    this.y = obtainStyledAttributes.getFloat(index, this.y);
                                    continue;
                                case 37:
                                    this.V = obtainStyledAttributes.getFloat(index, this.V);
                                    continue;
                                case 38:
                                    this.U = obtainStyledAttributes.getFloat(index, this.U);
                                    continue;
                                case 39:
                                    this.W = obtainStyledAttributes.getInt(index, this.W);
                                    continue;
                                case 40:
                                    this.X = obtainStyledAttributes.getInt(index, this.X);
                                    continue;
                                case 41:
                                    d.H(this, obtainStyledAttributes, index, 0);
                                    continue;
                                case 42:
                                    d.H(this, obtainStyledAttributes, index, 1);
                                    continue;
                                default:
                                    switch (i2) {
                                        case 54:
                                            this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                            continue;
                                        case 55:
                                            this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                            continue;
                                        case 56:
                                            this.a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.a0);
                                            continue;
                                        case 57:
                                            this.b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                            continue;
                                        case 58:
                                            this.c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                            continue;
                                        case 59:
                                            this.d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.d0);
                                            continue;
                                        default:
                                            switch (i2) {
                                                case 61:
                                                    this.A = d.G(obtainStyledAttributes, index, this.A);
                                                    continue;
                                                case 62:
                                                    this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                                    continue;
                                                case 63:
                                                    this.C = obtainStyledAttributes.getFloat(index, this.C);
                                                    continue;
                                                default:
                                                    switch (i2) {
                                                        case 69:
                                                            this.e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                            continue;
                                                        case 70:
                                                            this.f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                            continue;
                                                        case 71:
                                                            Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                            continue;
                                                        case 72:
                                                            this.g0 = obtainStyledAttributes.getInt(index, this.g0);
                                                            continue;
                                                        case 73:
                                                            this.h0 = obtainStyledAttributes.getDimensionPixelSize(index, this.h0);
                                                            continue;
                                                        case 74:
                                                            this.k0 = obtainStyledAttributes.getString(index);
                                                            continue;
                                                        case 75:
                                                            this.o0 = obtainStyledAttributes.getBoolean(index, this.o0);
                                                            continue;
                                                        case 76:
                                                            Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + q0.get(index));
                                                            continue;
                                                        case 77:
                                                            this.l0 = obtainStyledAttributes.getString(index);
                                                            continue;
                                                        default:
                                                            switch (i2) {
                                                                case 91:
                                                                    this.r = d.G(obtainStyledAttributes, index, this.r);
                                                                    continue;
                                                                case 92:
                                                                    this.s = d.G(obtainStyledAttributes, index, this.s);
                                                                    continue;
                                                                case 93:
                                                                    this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                                                    continue;
                                                                case 94:
                                                                    this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                                                                    continue;
                                                                default:
                                                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + q0.get(index));
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                                    continue;
                                                            }
                                                    }
                                            }
                                    }
                            }
                        } else {
                            this.p0 = obtainStyledAttributes.getInt(index, this.p0);
                        }
                    } else {
                        this.n0 = obtainStyledAttributes.getBoolean(index, this.n0);
                    }
                } else {
                    this.m0 = obtainStyledAttributes.getBoolean(index, this.m0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class c {
        private static SparseIntArray o;
        public boolean a = false;
        public int b = -1;
        public int c = 0;
        public String d = null;
        public int e = -1;
        public int f = 0;
        public float g = Float.NaN;
        public int h = -1;
        public float i = Float.NaN;
        public float j = Float.NaN;
        public int k = -1;
        public String l = null;
        public int m = -3;
        public int n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            o = sparseIntArray;
            sparseIntArray.append(g29.u8, 1);
            o.append(g29.w8, 2);
            o.append(g29.A8, 3);
            o.append(g29.t8, 4);
            o.append(g29.s8, 5);
            o.append(g29.r8, 6);
            o.append(g29.v8, 7);
            o.append(g29.z8, 8);
            o.append(g29.y8, 9);
            o.append(g29.x8, 10);
        }

        public void a(c cVar) {
            this.a = cVar.a;
            this.b = cVar.b;
            this.d = cVar.d;
            this.e = cVar.e;
            this.f = cVar.f;
            this.i = cVar.i;
            this.g = cVar.g;
            this.h = cVar.h;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g29.q8);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (o.get(index)) {
                    case 1:
                        this.i = obtainStyledAttributes.getFloat(index, this.i);
                        break;
                    case 2:
                        this.e = obtainStyledAttributes.getInt(index, this.e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.d = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.d = yb3.c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.b = d.G(obtainStyledAttributes, index, this.b);
                        break;
                    case 6:
                        this.c = obtainStyledAttributes.getInteger(index, this.c);
                        break;
                    case 7:
                        this.g = obtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 8:
                        this.k = obtainStyledAttributes.getInteger(index, this.k);
                        break;
                    case 9:
                        this.j = obtainStyledAttributes.getFloat(index, this.j);
                        break;
                    case 10:
                        int i2 = obtainStyledAttributes.peekValue(index).type;
                        if (i2 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.n = resourceId;
                            if (resourceId != -1) {
                                this.m = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i2 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.l = string;
                            if (string.indexOf("/") > 0) {
                                this.n = obtainStyledAttributes.getResourceId(index, -1);
                                this.m = -2;
                                break;
                            } else {
                                this.m = -1;
                                break;
                            }
                        } else {
                            this.m = obtainStyledAttributes.getInteger(index, this.n);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* renamed from: androidx.constraintlayout.widget.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0027d {
        public boolean a = false;
        public int b = 0;
        public int c = 0;
        public float d = 1.0f;
        public float e = Float.NaN;

        public void a(C0027d c0027d) {
            this.a = c0027d.a;
            this.b = c0027d.b;
            this.d = c0027d.d;
            this.e = c0027d.e;
            this.c = c0027d.c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g29.q9);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == g29.s9) {
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                } else if (index == g29.r9) {
                    this.b = obtainStyledAttributes.getInt(index, this.b);
                    this.b = d.h[this.b];
                } else if (index == g29.u9) {
                    this.c = obtainStyledAttributes.getInt(index, this.c);
                } else if (index == g29.t9) {
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class e {
        private static SparseIntArray o;
        public boolean a = false;
        public float b = 0.0f;
        public float c = 0.0f;
        public float d = 0.0f;
        public float e = 1.0f;
        public float f = 1.0f;
        public float g = Float.NaN;
        public float h = Float.NaN;
        public int i = -1;
        public float j = 0.0f;
        public float k = 0.0f;
        public float l = 0.0f;
        public boolean m = false;
        public float n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            o = sparseIntArray;
            sparseIntArray.append(g29.Q9, 1);
            o.append(g29.R9, 2);
            o.append(g29.S9, 3);
            o.append(g29.O9, 4);
            o.append(g29.P9, 5);
            o.append(g29.K9, 6);
            o.append(g29.L9, 7);
            o.append(g29.M9, 8);
            o.append(g29.N9, 9);
            o.append(g29.T9, 10);
            o.append(g29.U9, 11);
            o.append(g29.V9, 12);
        }

        public void a(e eVar) {
            this.a = eVar.a;
            this.b = eVar.b;
            this.c = eVar.c;
            this.d = eVar.d;
            this.e = eVar.e;
            this.f = eVar.f;
            this.g = eVar.g;
            this.h = eVar.h;
            this.i = eVar.i;
            this.j = eVar.j;
            this.k = eVar.k;
            this.l = eVar.l;
            this.m = eVar.m;
            this.n = eVar.n;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g29.J9);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (o.get(index)) {
                    case 1:
                        this.b = obtainStyledAttributes.getFloat(index, this.b);
                        break;
                    case 2:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 3:
                        this.d = obtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 4:
                        this.e = obtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 5:
                        this.f = obtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 6:
                        this.g = obtainStyledAttributes.getDimension(index, this.g);
                        break;
                    case 7:
                        this.h = obtainStyledAttributes.getDimension(index, this.h);
                        break;
                    case 8:
                        this.j = obtainStyledAttributes.getDimension(index, this.j);
                        break;
                    case 9:
                        this.k = obtainStyledAttributes.getDimension(index, this.k);
                        break;
                    case 10:
                        this.l = obtainStyledAttributes.getDimension(index, this.l);
                        break;
                    case 11:
                        this.m = true;
                        this.n = obtainStyledAttributes.getDimension(index, this.n);
                        break;
                    case 12:
                        this.i = d.G(obtainStyledAttributes, index, this.i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        i.append(g29.z0, 25);
        i.append(g29.A0, 26);
        i.append(g29.C0, 29);
        i.append(g29.D0, 30);
        i.append(g29.J0, 36);
        i.append(g29.I0, 35);
        i.append(g29.g0, 4);
        i.append(g29.f0, 3);
        i.append(g29.b0, 1);
        i.append(g29.d0, 91);
        i.append(g29.c0, 92);
        i.append(g29.S0, 6);
        i.append(g29.T0, 7);
        i.append(g29.n0, 17);
        i.append(g29.o0, 18);
        i.append(g29.p0, 19);
        i.append(g29.u, 27);
        i.append(g29.E0, 32);
        i.append(g29.F0, 33);
        i.append(g29.m0, 10);
        i.append(g29.l0, 9);
        i.append(g29.W0, 13);
        i.append(g29.Z0, 16);
        i.append(g29.X0, 14);
        i.append(g29.U0, 11);
        i.append(g29.Y0, 15);
        i.append(g29.V0, 12);
        i.append(g29.M0, 40);
        i.append(g29.x0, 39);
        i.append(g29.w0, 41);
        i.append(g29.L0, 42);
        i.append(g29.v0, 20);
        i.append(g29.K0, 37);
        i.append(g29.k0, 5);
        i.append(g29.y0, 87);
        i.append(g29.H0, 87);
        i.append(g29.B0, 87);
        i.append(g29.e0, 87);
        i.append(g29.a0, 87);
        i.append(g29.z, 24);
        i.append(g29.B, 28);
        i.append(g29.N, 31);
        i.append(g29.O, 8);
        i.append(g29.A, 34);
        i.append(g29.C, 2);
        i.append(g29.x, 23);
        i.append(g29.y, 21);
        i.append(g29.N0, 95);
        i.append(g29.q0, 96);
        i.append(g29.w, 22);
        i.append(g29.D, 43);
        i.append(g29.Q, 44);
        i.append(g29.L, 45);
        i.append(g29.M, 46);
        i.append(g29.K, 60);
        i.append(g29.I, 47);
        i.append(g29.J, 48);
        i.append(g29.E, 49);
        i.append(g29.F, 50);
        i.append(g29.G, 51);
        i.append(g29.H, 52);
        i.append(g29.P, 53);
        i.append(g29.O0, 54);
        i.append(g29.r0, 55);
        i.append(g29.P0, 56);
        i.append(g29.s0, 57);
        i.append(g29.Q0, 58);
        i.append(g29.t0, 59);
        i.append(g29.h0, 61);
        i.append(g29.j0, 62);
        i.append(g29.i0, 63);
        i.append(g29.R, 64);
        i.append(g29.j1, 65);
        i.append(g29.X, 66);
        i.append(g29.k1, 67);
        i.append(g29.c1, 79);
        i.append(g29.v, 38);
        i.append(g29.b1, 68);
        i.append(g29.R0, 69);
        i.append(g29.u0, 70);
        i.append(g29.a1, 97);
        i.append(g29.V, 71);
        i.append(g29.T, 72);
        i.append(g29.U, 73);
        i.append(g29.W, 74);
        i.append(g29.S, 75);
        i.append(g29.d1, 76);
        i.append(g29.G0, 77);
        i.append(g29.l1, 78);
        i.append(g29.Z, 80);
        i.append(g29.Y, 81);
        i.append(g29.e1, 82);
        i.append(g29.i1, 83);
        i.append(g29.h1, 84);
        i.append(g29.g1, 85);
        i.append(g29.f1, 86);
        SparseIntArray sparseIntArray = j;
        int i2 = g29.o4;
        sparseIntArray.append(i2, 6);
        j.append(i2, 7);
        j.append(g29.j3, 27);
        j.append(g29.r4, 13);
        j.append(g29.u4, 16);
        j.append(g29.s4, 14);
        j.append(g29.p4, 11);
        j.append(g29.t4, 15);
        j.append(g29.q4, 12);
        j.append(g29.i4, 40);
        j.append(g29.b4, 39);
        j.append(g29.a4, 41);
        j.append(g29.h4, 42);
        j.append(g29.Z3, 20);
        j.append(g29.g4, 37);
        j.append(g29.T3, 5);
        j.append(g29.c4, 87);
        j.append(g29.f4, 87);
        j.append(g29.d4, 87);
        j.append(g29.Q3, 87);
        j.append(g29.P3, 87);
        j.append(g29.o3, 24);
        j.append(g29.q3, 28);
        j.append(g29.C3, 31);
        j.append(g29.D3, 8);
        j.append(g29.p3, 34);
        j.append(g29.r3, 2);
        j.append(g29.m3, 23);
        j.append(g29.n3, 21);
        j.append(g29.j4, 95);
        j.append(g29.U3, 96);
        j.append(g29.l3, 22);
        j.append(g29.s3, 43);
        j.append(g29.F3, 44);
        j.append(g29.A3, 45);
        j.append(g29.B3, 46);
        j.append(g29.z3, 60);
        j.append(g29.x3, 47);
        j.append(g29.y3, 48);
        j.append(g29.t3, 49);
        j.append(g29.u3, 50);
        j.append(g29.v3, 51);
        j.append(g29.w3, 52);
        j.append(g29.E3, 53);
        j.append(g29.k4, 54);
        j.append(g29.V3, 55);
        j.append(g29.l4, 56);
        j.append(g29.W3, 57);
        j.append(g29.m4, 58);
        j.append(g29.X3, 59);
        j.append(g29.S3, 62);
        j.append(g29.R3, 63);
        j.append(g29.G3, 64);
        j.append(g29.F4, 65);
        j.append(g29.M3, 66);
        j.append(g29.G4, 67);
        j.append(g29.x4, 79);
        j.append(g29.k3, 38);
        j.append(g29.y4, 98);
        j.append(g29.w4, 68);
        j.append(g29.n4, 69);
        j.append(g29.Y3, 70);
        j.append(g29.K3, 71);
        j.append(g29.I3, 72);
        j.append(g29.J3, 73);
        j.append(g29.L3, 74);
        j.append(g29.H3, 75);
        j.append(g29.z4, 76);
        j.append(g29.e4, 77);
        j.append(g29.H4, 78);
        j.append(g29.O3, 80);
        j.append(g29.N3, 81);
        j.append(g29.A4, 82);
        j.append(g29.E4, 83);
        j.append(g29.D4, 84);
        j.append(g29.C4, 85);
        j.append(g29.B4, 86);
        j.append(g29.v4, 97);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int G(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        if (resourceId == -1) {
            return typedArray.getInt(i2, -1);
        }
        return resourceId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r4 == (-1)) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void H(java.lang.Object r3, android.content.res.TypedArray r4, int r5, int r6) {
        /*
            if (r3 != 0) goto L3
            return
        L3:
            android.util.TypedValue r0 = r4.peekValue(r5)
            int r0 = r0.type
            r1 = 3
            if (r0 == r1) goto L6f
            r1 = 5
            r2 = 0
            if (r0 == r1) goto L28
            int r4 = r4.getInt(r5, r2)
            r5 = -4
            r0 = -2
            if (r4 == r5) goto L24
            r5 = -3
            if (r4 == r5) goto L20
            if (r4 == r0) goto L22
            r5 = -1
            if (r4 == r5) goto L22
        L20:
            r4 = 0
            goto L2d
        L22:
            r2 = r4
            goto L20
        L24:
            r2 = 1
            r4 = 1
            r2 = -2
            goto L2d
        L28:
            int r4 = r4.getDimensionPixelSize(r5, r2)
            goto L22
        L2d:
            boolean r5 = r3 instanceof androidx.constraintlayout.widget.ConstraintLayout.b
            if (r5 == 0) goto L3f
            androidx.constraintlayout.widget.ConstraintLayout$b r3 = (androidx.constraintlayout.widget.ConstraintLayout.b) r3
            if (r6 != 0) goto L3a
            r3.width = r2
            r3.Z = r4
            goto L6e
        L3a:
            r3.height = r2
            r3.a0 = r4
            goto L6e
        L3f:
            boolean r5 = r3 instanceof androidx.constraintlayout.widget.d.b
            if (r5 == 0) goto L51
            androidx.constraintlayout.widget.d$b r3 = (androidx.constraintlayout.widget.d.b) r3
            if (r6 != 0) goto L4c
            r3.d = r2
            r3.m0 = r4
            goto L6e
        L4c:
            r3.e = r2
            r3.n0 = r4
            goto L6e
        L51:
            boolean r5 = r3 instanceof androidx.constraintlayout.widget.d.a.C0026a
            if (r5 == 0) goto L6e
            androidx.constraintlayout.widget.d$a$a r3 = (androidx.constraintlayout.widget.d.a.C0026a) r3
            if (r6 != 0) goto L64
            r5 = 23
            r3.b(r5, r2)
            r5 = 80
            r3.d(r5, r4)
            goto L6e
        L64:
            r5 = 21
            r3.b(r5, r2)
            r5 = 81
            r3.d(r5, r4)
        L6e:
            return
        L6f:
            java.lang.String r4 = r4.getString(r5)
            I(r3, r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.H(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    static void I(Object obj, String str, int i2) {
        if (str == null) {
            return;
        }
        int indexOf = str.indexOf(61);
        int length = str.length();
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            String substring2 = str.substring(indexOf + 1);
            if (substring2.length() > 0) {
                String trim = substring.trim();
                String trim2 = substring2.trim();
                if ("ratio".equalsIgnoreCase(trim)) {
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                        }
                        J(bVar, trim2);
                        return;
                    } else if (obj instanceof b) {
                        ((b) obj).z = trim2;
                        return;
                    } else if (obj instanceof a.C0026a) {
                        ((a.C0026a) obj).c(5, trim2);
                        return;
                    } else {
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(trim)) {
                        float parseFloat = Float.parseFloat(trim2);
                        if (obj instanceof ConstraintLayout.b) {
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                                bVar2.K = parseFloat;
                            } else {
                                ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                                bVar2.L = parseFloat;
                            }
                        } else if (obj instanceof b) {
                            b bVar3 = (b) obj;
                            if (i2 == 0) {
                                bVar3.d = 0;
                                bVar3.V = parseFloat;
                            } else {
                                bVar3.e = 0;
                                bVar3.U = parseFloat;
                            }
                        } else if (obj instanceof a.C0026a) {
                            a.C0026a c0026a = (a.C0026a) obj;
                            if (i2 == 0) {
                                c0026a.b(23, 0);
                                c0026a.a(39, parseFloat);
                            } else {
                                c0026a.b(21, 0);
                                c0026a.a(40, parseFloat);
                            }
                        }
                    } else if ("parent".equalsIgnoreCase(trim)) {
                        float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                        if (obj instanceof ConstraintLayout.b) {
                            ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                                bVar4.U = max;
                                bVar4.O = 2;
                            } else {
                                ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                                bVar4.V = max;
                                bVar4.P = 2;
                            }
                        } else if (obj instanceof b) {
                            b bVar5 = (b) obj;
                            if (i2 == 0) {
                                bVar5.d = 0;
                                bVar5.e0 = max;
                                bVar5.Y = 2;
                            } else {
                                bVar5.e = 0;
                                bVar5.f0 = max;
                                bVar5.Z = 2;
                            }
                        } else if (obj instanceof a.C0026a) {
                            a.C0026a c0026a2 = (a.C0026a) obj;
                            if (i2 == 0) {
                                c0026a2.b(23, 0);
                                c0026a2.b(54, 2);
                            } else {
                                c0026a2.b(21, 0);
                                c0026a2.b(55, 2);
                            }
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void J(ConstraintLayout.b bVar, String str) {
        float f = Float.NaN;
        int i2 = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i3 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i2 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i2 = 1;
                }
                i3 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                    String substring2 = str.substring(i3, indexOf2);
                    String substring3 = str.substring(indexOf2 + 1);
                    if (substring2.length() > 0 && substring3.length() > 0) {
                        float parseFloat = Float.parseFloat(substring2);
                        float parseFloat2 = Float.parseFloat(substring3);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f = i2 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    }
                } else {
                    String substring4 = str.substring(i3);
                    if (substring4.length() > 0) {
                        f = Float.parseFloat(substring4);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.H = str;
        bVar.I = f;
        bVar.J = i2;
    }

    private void K(Context context, a aVar, TypedArray typedArray, boolean z) {
        if (z) {
            L(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            if (index != g29.v && g29.N != index && g29.O != index) {
                aVar.d.a = true;
                aVar.e.b = true;
                aVar.c.a = true;
                aVar.f.a = true;
            }
            switch (i.get(index)) {
                case 1:
                    b bVar = aVar.e;
                    bVar.q = G(typedArray, index, bVar.q);
                    break;
                case 2:
                    b bVar2 = aVar.e;
                    bVar2.J = typedArray.getDimensionPixelSize(index, bVar2.J);
                    break;
                case 3:
                    b bVar3 = aVar.e;
                    bVar3.p = G(typedArray, index, bVar3.p);
                    break;
                case 4:
                    b bVar4 = aVar.e;
                    bVar4.o = G(typedArray, index, bVar4.o);
                    break;
                case 5:
                    aVar.e.z = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.e;
                    bVar5.D = typedArray.getDimensionPixelOffset(index, bVar5.D);
                    break;
                case 7:
                    b bVar6 = aVar.e;
                    bVar6.E = typedArray.getDimensionPixelOffset(index, bVar6.E);
                    break;
                case 8:
                    b bVar7 = aVar.e;
                    bVar7.K = typedArray.getDimensionPixelSize(index, bVar7.K);
                    break;
                case 9:
                    b bVar8 = aVar.e;
                    bVar8.w = G(typedArray, index, bVar8.w);
                    break;
                case 10:
                    b bVar9 = aVar.e;
                    bVar9.v = G(typedArray, index, bVar9.v);
                    break;
                case 11:
                    b bVar10 = aVar.e;
                    bVar10.Q = typedArray.getDimensionPixelSize(index, bVar10.Q);
                    break;
                case 12:
                    b bVar11 = aVar.e;
                    bVar11.R = typedArray.getDimensionPixelSize(index, bVar11.R);
                    break;
                case 13:
                    b bVar12 = aVar.e;
                    bVar12.N = typedArray.getDimensionPixelSize(index, bVar12.N);
                    break;
                case 14:
                    b bVar13 = aVar.e;
                    bVar13.P = typedArray.getDimensionPixelSize(index, bVar13.P);
                    break;
                case 15:
                    b bVar14 = aVar.e;
                    bVar14.S = typedArray.getDimensionPixelSize(index, bVar14.S);
                    break;
                case 16:
                    b bVar15 = aVar.e;
                    bVar15.O = typedArray.getDimensionPixelSize(index, bVar15.O);
                    break;
                case 17:
                    b bVar16 = aVar.e;
                    bVar16.f = typedArray.getDimensionPixelOffset(index, bVar16.f);
                    break;
                case 18:
                    b bVar17 = aVar.e;
                    bVar17.g = typedArray.getDimensionPixelOffset(index, bVar17.g);
                    break;
                case 19:
                    b bVar18 = aVar.e;
                    bVar18.h = typedArray.getFloat(index, bVar18.h);
                    break;
                case 20:
                    b bVar19 = aVar.e;
                    bVar19.x = typedArray.getFloat(index, bVar19.x);
                    break;
                case 21:
                    b bVar20 = aVar.e;
                    bVar20.e = typedArray.getLayoutDimension(index, bVar20.e);
                    break;
                case 22:
                    C0027d c0027d = aVar.c;
                    c0027d.b = typedArray.getInt(index, c0027d.b);
                    C0027d c0027d2 = aVar.c;
                    c0027d2.b = h[c0027d2.b];
                    break;
                case 23:
                    b bVar21 = aVar.e;
                    bVar21.d = typedArray.getLayoutDimension(index, bVar21.d);
                    break;
                case 24:
                    b bVar22 = aVar.e;
                    bVar22.G = typedArray.getDimensionPixelSize(index, bVar22.G);
                    break;
                case 25:
                    b bVar23 = aVar.e;
                    bVar23.i = G(typedArray, index, bVar23.i);
                    break;
                case 26:
                    b bVar24 = aVar.e;
                    bVar24.j = G(typedArray, index, bVar24.j);
                    break;
                case 27:
                    b bVar25 = aVar.e;
                    bVar25.F = typedArray.getInt(index, bVar25.F);
                    break;
                case 28:
                    b bVar26 = aVar.e;
                    bVar26.H = typedArray.getDimensionPixelSize(index, bVar26.H);
                    break;
                case 29:
                    b bVar27 = aVar.e;
                    bVar27.k = G(typedArray, index, bVar27.k);
                    break;
                case 30:
                    b bVar28 = aVar.e;
                    bVar28.l = G(typedArray, index, bVar28.l);
                    break;
                case 31:
                    b bVar29 = aVar.e;
                    bVar29.L = typedArray.getDimensionPixelSize(index, bVar29.L);
                    break;
                case 32:
                    b bVar30 = aVar.e;
                    bVar30.t = G(typedArray, index, bVar30.t);
                    break;
                case 33:
                    b bVar31 = aVar.e;
                    bVar31.u = G(typedArray, index, bVar31.u);
                    break;
                case 34:
                    b bVar32 = aVar.e;
                    bVar32.I = typedArray.getDimensionPixelSize(index, bVar32.I);
                    break;
                case 35:
                    b bVar33 = aVar.e;
                    bVar33.n = G(typedArray, index, bVar33.n);
                    break;
                case 36:
                    b bVar34 = aVar.e;
                    bVar34.m = G(typedArray, index, bVar34.m);
                    break;
                case 37:
                    b bVar35 = aVar.e;
                    bVar35.y = typedArray.getFloat(index, bVar35.y);
                    break;
                case 38:
                    aVar.a = typedArray.getResourceId(index, aVar.a);
                    break;
                case 39:
                    b bVar36 = aVar.e;
                    bVar36.V = typedArray.getFloat(index, bVar36.V);
                    break;
                case 40:
                    b bVar37 = aVar.e;
                    bVar37.U = typedArray.getFloat(index, bVar37.U);
                    break;
                case 41:
                    b bVar38 = aVar.e;
                    bVar38.W = typedArray.getInt(index, bVar38.W);
                    break;
                case 42:
                    b bVar39 = aVar.e;
                    bVar39.X = typedArray.getInt(index, bVar39.X);
                    break;
                case 43:
                    C0027d c0027d3 = aVar.c;
                    c0027d3.d = typedArray.getFloat(index, c0027d3.d);
                    break;
                case 44:
                    e eVar = aVar.f;
                    eVar.m = true;
                    eVar.n = typedArray.getDimension(index, eVar.n);
                    break;
                case 45:
                    e eVar2 = aVar.f;
                    eVar2.c = typedArray.getFloat(index, eVar2.c);
                    break;
                case 46:
                    e eVar3 = aVar.f;
                    eVar3.d = typedArray.getFloat(index, eVar3.d);
                    break;
                case 47:
                    e eVar4 = aVar.f;
                    eVar4.e = typedArray.getFloat(index, eVar4.e);
                    break;
                case 48:
                    e eVar5 = aVar.f;
                    eVar5.f = typedArray.getFloat(index, eVar5.f);
                    break;
                case 49:
                    e eVar6 = aVar.f;
                    eVar6.g = typedArray.getDimension(index, eVar6.g);
                    break;
                case 50:
                    e eVar7 = aVar.f;
                    eVar7.h = typedArray.getDimension(index, eVar7.h);
                    break;
                case 51:
                    e eVar8 = aVar.f;
                    eVar8.j = typedArray.getDimension(index, eVar8.j);
                    break;
                case 52:
                    e eVar9 = aVar.f;
                    eVar9.k = typedArray.getDimension(index, eVar9.k);
                    break;
                case 53:
                    e eVar10 = aVar.f;
                    eVar10.l = typedArray.getDimension(index, eVar10.l);
                    break;
                case 54:
                    b bVar40 = aVar.e;
                    bVar40.Y = typedArray.getInt(index, bVar40.Y);
                    break;
                case 55:
                    b bVar41 = aVar.e;
                    bVar41.Z = typedArray.getInt(index, bVar41.Z);
                    break;
                case 56:
                    b bVar42 = aVar.e;
                    bVar42.a0 = typedArray.getDimensionPixelSize(index, bVar42.a0);
                    break;
                case 57:
                    b bVar43 = aVar.e;
                    bVar43.b0 = typedArray.getDimensionPixelSize(index, bVar43.b0);
                    break;
                case 58:
                    b bVar44 = aVar.e;
                    bVar44.c0 = typedArray.getDimensionPixelSize(index, bVar44.c0);
                    break;
                case 59:
                    b bVar45 = aVar.e;
                    bVar45.d0 = typedArray.getDimensionPixelSize(index, bVar45.d0);
                    break;
                case 60:
                    e eVar11 = aVar.f;
                    eVar11.b = typedArray.getFloat(index, eVar11.b);
                    break;
                case 61:
                    b bVar46 = aVar.e;
                    bVar46.A = G(typedArray, index, bVar46.A);
                    break;
                case 62:
                    b bVar47 = aVar.e;
                    bVar47.B = typedArray.getDimensionPixelSize(index, bVar47.B);
                    break;
                case 63:
                    b bVar48 = aVar.e;
                    bVar48.C = typedArray.getFloat(index, bVar48.C);
                    break;
                case 64:
                    c cVar = aVar.d;
                    cVar.b = G(typedArray, index, cVar.b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.d.d = typedArray.getString(index);
                        break;
                    } else {
                        aVar.d.d = yb3.c[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.d.f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.d;
                    cVar2.i = typedArray.getFloat(index, cVar2.i);
                    break;
                case 68:
                    C0027d c0027d4 = aVar.c;
                    c0027d4.e = typedArray.getFloat(index, c0027d4.e);
                    break;
                case 69:
                    aVar.e.e0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.e.f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.e;
                    bVar49.g0 = typedArray.getInt(index, bVar49.g0);
                    break;
                case 73:
                    b bVar50 = aVar.e;
                    bVar50.h0 = typedArray.getDimensionPixelSize(index, bVar50.h0);
                    break;
                case 74:
                    aVar.e.k0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.e;
                    bVar51.o0 = typedArray.getBoolean(index, bVar51.o0);
                    break;
                case 76:
                    c cVar3 = aVar.d;
                    cVar3.e = typedArray.getInt(index, cVar3.e);
                    break;
                case 77:
                    aVar.e.l0 = typedArray.getString(index);
                    break;
                case 78:
                    C0027d c0027d5 = aVar.c;
                    c0027d5.c = typedArray.getInt(index, c0027d5.c);
                    break;
                case 79:
                    c cVar4 = aVar.d;
                    cVar4.g = typedArray.getFloat(index, cVar4.g);
                    break;
                case 80:
                    b bVar52 = aVar.e;
                    bVar52.m0 = typedArray.getBoolean(index, bVar52.m0);
                    break;
                case 81:
                    b bVar53 = aVar.e;
                    bVar53.n0 = typedArray.getBoolean(index, bVar53.n0);
                    break;
                case 82:
                    c cVar5 = aVar.d;
                    cVar5.c = typedArray.getInteger(index, cVar5.c);
                    break;
                case 83:
                    e eVar12 = aVar.f;
                    eVar12.i = G(typedArray, index, eVar12.i);
                    break;
                case 84:
                    c cVar6 = aVar.d;
                    cVar6.k = typedArray.getInteger(index, cVar6.k);
                    break;
                case 85:
                    c cVar7 = aVar.d;
                    cVar7.j = typedArray.getFloat(index, cVar7.j);
                    break;
                case 86:
                    int i3 = typedArray.peekValue(index).type;
                    if (i3 == 1) {
                        aVar.d.n = typedArray.getResourceId(index, -1);
                        c cVar8 = aVar.d;
                        if (cVar8.n != -1) {
                            cVar8.m = -2;
                            break;
                        } else {
                            break;
                        }
                    } else if (i3 == 3) {
                        aVar.d.l = typedArray.getString(index);
                        if (aVar.d.l.indexOf("/") > 0) {
                            aVar.d.n = typedArray.getResourceId(index, -1);
                            aVar.d.m = -2;
                            break;
                        } else {
                            aVar.d.m = -1;
                            break;
                        }
                    } else {
                        c cVar9 = aVar.d;
                        cVar9.m = typedArray.getInteger(index, cVar9.n);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + i.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + i.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.e;
                    bVar54.r = G(typedArray, index, bVar54.r);
                    break;
                case 92:
                    b bVar55 = aVar.e;
                    bVar55.s = G(typedArray, index, bVar55.s);
                    break;
                case 93:
                    b bVar56 = aVar.e;
                    bVar56.M = typedArray.getDimensionPixelSize(index, bVar56.M);
                    break;
                case 94:
                    b bVar57 = aVar.e;
                    bVar57.T = typedArray.getDimensionPixelSize(index, bVar57.T);
                    break;
                case 95:
                    H(aVar.e, typedArray, index, 0);
                    break;
                case 96:
                    H(aVar.e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.e;
                    bVar58.p0 = typedArray.getInt(index, bVar58.p0);
                    break;
            }
        }
    }

    private static void L(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0026a c0026a = new a.C0026a();
        aVar.h = c0026a;
        aVar.d.a = false;
        aVar.e.b = false;
        aVar.c.a = false;
        aVar.f.a = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            switch (j.get(index)) {
                case 2:
                    c0026a.b(2, typedArray.getDimensionPixelSize(index, aVar.e.J));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + i.get(index));
                    break;
                case 5:
                    c0026a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    c0026a.b(6, typedArray.getDimensionPixelOffset(index, aVar.e.D));
                    break;
                case 7:
                    c0026a.b(7, typedArray.getDimensionPixelOffset(index, aVar.e.E));
                    break;
                case 8:
                    c0026a.b(8, typedArray.getDimensionPixelSize(index, aVar.e.K));
                    break;
                case 11:
                    c0026a.b(11, typedArray.getDimensionPixelSize(index, aVar.e.Q));
                    break;
                case 12:
                    c0026a.b(12, typedArray.getDimensionPixelSize(index, aVar.e.R));
                    break;
                case 13:
                    c0026a.b(13, typedArray.getDimensionPixelSize(index, aVar.e.N));
                    break;
                case 14:
                    c0026a.b(14, typedArray.getDimensionPixelSize(index, aVar.e.P));
                    break;
                case 15:
                    c0026a.b(15, typedArray.getDimensionPixelSize(index, aVar.e.S));
                    break;
                case 16:
                    c0026a.b(16, typedArray.getDimensionPixelSize(index, aVar.e.O));
                    break;
                case 17:
                    c0026a.b(17, typedArray.getDimensionPixelOffset(index, aVar.e.f));
                    break;
                case 18:
                    c0026a.b(18, typedArray.getDimensionPixelOffset(index, aVar.e.g));
                    break;
                case 19:
                    c0026a.a(19, typedArray.getFloat(index, aVar.e.h));
                    break;
                case 20:
                    c0026a.a(20, typedArray.getFloat(index, aVar.e.x));
                    break;
                case 21:
                    c0026a.b(21, typedArray.getLayoutDimension(index, aVar.e.e));
                    break;
                case 22:
                    c0026a.b(22, h[typedArray.getInt(index, aVar.c.b)]);
                    break;
                case 23:
                    c0026a.b(23, typedArray.getLayoutDimension(index, aVar.e.d));
                    break;
                case 24:
                    c0026a.b(24, typedArray.getDimensionPixelSize(index, aVar.e.G));
                    break;
                case 27:
                    c0026a.b(27, typedArray.getInt(index, aVar.e.F));
                    break;
                case 28:
                    c0026a.b(28, typedArray.getDimensionPixelSize(index, aVar.e.H));
                    break;
                case 31:
                    c0026a.b(31, typedArray.getDimensionPixelSize(index, aVar.e.L));
                    break;
                case 34:
                    c0026a.b(34, typedArray.getDimensionPixelSize(index, aVar.e.I));
                    break;
                case 37:
                    c0026a.a(37, typedArray.getFloat(index, aVar.e.y));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.a);
                    aVar.a = resourceId;
                    c0026a.b(38, resourceId);
                    break;
                case 39:
                    c0026a.a(39, typedArray.getFloat(index, aVar.e.V));
                    break;
                case 40:
                    c0026a.a(40, typedArray.getFloat(index, aVar.e.U));
                    break;
                case 41:
                    c0026a.b(41, typedArray.getInt(index, aVar.e.W));
                    break;
                case 42:
                    c0026a.b(42, typedArray.getInt(index, aVar.e.X));
                    break;
                case 43:
                    c0026a.a(43, typedArray.getFloat(index, aVar.c.d));
                    break;
                case 44:
                    c0026a.d(44, true);
                    c0026a.a(44, typedArray.getDimension(index, aVar.f.n));
                    break;
                case 45:
                    c0026a.a(45, typedArray.getFloat(index, aVar.f.c));
                    break;
                case 46:
                    c0026a.a(46, typedArray.getFloat(index, aVar.f.d));
                    break;
                case 47:
                    c0026a.a(47, typedArray.getFloat(index, aVar.f.e));
                    break;
                case 48:
                    c0026a.a(48, typedArray.getFloat(index, aVar.f.f));
                    break;
                case 49:
                    c0026a.a(49, typedArray.getDimension(index, aVar.f.g));
                    break;
                case 50:
                    c0026a.a(50, typedArray.getDimension(index, aVar.f.h));
                    break;
                case 51:
                    c0026a.a(51, typedArray.getDimension(index, aVar.f.j));
                    break;
                case 52:
                    c0026a.a(52, typedArray.getDimension(index, aVar.f.k));
                    break;
                case 53:
                    c0026a.a(53, typedArray.getDimension(index, aVar.f.l));
                    break;
                case 54:
                    c0026a.b(54, typedArray.getInt(index, aVar.e.Y));
                    break;
                case 55:
                    c0026a.b(55, typedArray.getInt(index, aVar.e.Z));
                    break;
                case 56:
                    c0026a.b(56, typedArray.getDimensionPixelSize(index, aVar.e.a0));
                    break;
                case 57:
                    c0026a.b(57, typedArray.getDimensionPixelSize(index, aVar.e.b0));
                    break;
                case 58:
                    c0026a.b(58, typedArray.getDimensionPixelSize(index, aVar.e.c0));
                    break;
                case 59:
                    c0026a.b(59, typedArray.getDimensionPixelSize(index, aVar.e.d0));
                    break;
                case 60:
                    c0026a.a(60, typedArray.getFloat(index, aVar.f.b));
                    break;
                case 62:
                    c0026a.b(62, typedArray.getDimensionPixelSize(index, aVar.e.B));
                    break;
                case 63:
                    c0026a.a(63, typedArray.getFloat(index, aVar.e.C));
                    break;
                case 64:
                    c0026a.b(64, G(typedArray, index, aVar.d.b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0026a.c(65, typedArray.getString(index));
                        break;
                    } else {
                        c0026a.c(65, yb3.c[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    c0026a.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0026a.a(67, typedArray.getFloat(index, aVar.d.i));
                    break;
                case 68:
                    c0026a.a(68, typedArray.getFloat(index, aVar.c.e));
                    break;
                case 69:
                    c0026a.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0026a.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0026a.b(72, typedArray.getInt(index, aVar.e.g0));
                    break;
                case 73:
                    c0026a.b(73, typedArray.getDimensionPixelSize(index, aVar.e.h0));
                    break;
                case 74:
                    c0026a.c(74, typedArray.getString(index));
                    break;
                case 75:
                    c0026a.d(75, typedArray.getBoolean(index, aVar.e.o0));
                    break;
                case 76:
                    c0026a.b(76, typedArray.getInt(index, aVar.d.e));
                    break;
                case 77:
                    c0026a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0026a.b(78, typedArray.getInt(index, aVar.c.c));
                    break;
                case 79:
                    c0026a.a(79, typedArray.getFloat(index, aVar.d.g));
                    break;
                case 80:
                    c0026a.d(80, typedArray.getBoolean(index, aVar.e.m0));
                    break;
                case 81:
                    c0026a.d(81, typedArray.getBoolean(index, aVar.e.n0));
                    break;
                case 82:
                    c0026a.b(82, typedArray.getInteger(index, aVar.d.c));
                    break;
                case 83:
                    c0026a.b(83, G(typedArray, index, aVar.f.i));
                    break;
                case 84:
                    c0026a.b(84, typedArray.getInteger(index, aVar.d.k));
                    break;
                case 85:
                    c0026a.a(85, typedArray.getFloat(index, aVar.d.j));
                    break;
                case 86:
                    int i3 = typedArray.peekValue(index).type;
                    if (i3 == 1) {
                        aVar.d.n = typedArray.getResourceId(index, -1);
                        c0026a.b(89, aVar.d.n);
                        c cVar = aVar.d;
                        if (cVar.n != -1) {
                            cVar.m = -2;
                            c0026a.b(88, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (i3 == 3) {
                        aVar.d.l = typedArray.getString(index);
                        c0026a.c(90, aVar.d.l);
                        if (aVar.d.l.indexOf("/") > 0) {
                            aVar.d.n = typedArray.getResourceId(index, -1);
                            c0026a.b(89, aVar.d.n);
                            aVar.d.m = -2;
                            c0026a.b(88, -2);
                            break;
                        } else {
                            aVar.d.m = -1;
                            c0026a.b(88, -1);
                            break;
                        }
                    } else {
                        c cVar2 = aVar.d;
                        cVar2.m = typedArray.getInteger(index, cVar2.n);
                        c0026a.b(88, aVar.d.m);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + i.get(index));
                    break;
                case 93:
                    c0026a.b(93, typedArray.getDimensionPixelSize(index, aVar.e.M));
                    break;
                case 94:
                    c0026a.b(94, typedArray.getDimensionPixelSize(index, aVar.e.T));
                    break;
                case 95:
                    H(c0026a, typedArray, index, 0);
                    break;
                case 96:
                    H(c0026a, typedArray, index, 1);
                    break;
                case 97:
                    c0026a.b(97, typedArray.getInt(index, aVar.e.p0));
                    break;
                case 98:
                    if (MotionLayout.Q5) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.a);
                        aVar.a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.b = typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.b = typedArray.getString(index);
                        break;
                    } else {
                        aVar.a = typedArray.getResourceId(index, aVar.a);
                        break;
                    }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void O(a aVar, int i2, float f) {
        if (i2 != 19) {
            if (i2 != 20) {
                if (i2 != 37) {
                    if (i2 != 60) {
                        if (i2 != 63) {
                            if (i2 != 79) {
                                if (i2 != 85) {
                                    if (i2 != 87) {
                                        if (i2 != 39) {
                                            if (i2 != 40) {
                                                switch (i2) {
                                                    case 43:
                                                        aVar.c.d = f;
                                                        return;
                                                    case 44:
                                                        e eVar = aVar.f;
                                                        eVar.n = f;
                                                        eVar.m = true;
                                                        return;
                                                    case 45:
                                                        aVar.f.c = f;
                                                        return;
                                                    case 46:
                                                        aVar.f.d = f;
                                                        return;
                                                    case 47:
                                                        aVar.f.e = f;
                                                        return;
                                                    case 48:
                                                        aVar.f.f = f;
                                                        return;
                                                    case 49:
                                                        aVar.f.g = f;
                                                        return;
                                                    case 50:
                                                        aVar.f.h = f;
                                                        return;
                                                    case 51:
                                                        aVar.f.j = f;
                                                        return;
                                                    case 52:
                                                        aVar.f.k = f;
                                                        return;
                                                    case 53:
                                                        aVar.f.l = f;
                                                        return;
                                                    default:
                                                        switch (i2) {
                                                            case 67:
                                                                aVar.d.i = f;
                                                                return;
                                                            case 68:
                                                                aVar.c.e = f;
                                                                return;
                                                            case 69:
                                                                aVar.e.e0 = f;
                                                                return;
                                                            case 70:
                                                                aVar.e.f0 = f;
                                                                return;
                                                            default:
                                                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                                                return;
                                                        }
                                                }
                                            }
                                            aVar.e.U = f;
                                            return;
                                        }
                                        aVar.e.V = f;
                                        return;
                                    }
                                    return;
                                }
                                aVar.d.j = f;
                                return;
                            }
                            aVar.d.g = f;
                            return;
                        }
                        aVar.e.C = f;
                        return;
                    }
                    aVar.f.b = f;
                    return;
                }
                aVar.e.y = f;
                return;
            }
            aVar.e.x = f;
            return;
        }
        aVar.e.h = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void P(a aVar, int i2, int i3) {
        if (i2 != 6) {
            if (i2 != 7) {
                if (i2 != 8) {
                    if (i2 != 27) {
                        if (i2 != 28) {
                            if (i2 != 41) {
                                if (i2 != 42) {
                                    if (i2 != 61) {
                                        if (i2 != 62) {
                                            if (i2 != 72) {
                                                if (i2 != 73) {
                                                    switch (i2) {
                                                        case 2:
                                                            aVar.e.J = i3;
                                                            return;
                                                        case 11:
                                                            aVar.e.Q = i3;
                                                            return;
                                                        case 12:
                                                            aVar.e.R = i3;
                                                            return;
                                                        case 13:
                                                            aVar.e.N = i3;
                                                            return;
                                                        case 14:
                                                            aVar.e.P = i3;
                                                            return;
                                                        case 15:
                                                            aVar.e.S = i3;
                                                            return;
                                                        case 16:
                                                            aVar.e.O = i3;
                                                            return;
                                                        case 17:
                                                            aVar.e.f = i3;
                                                            return;
                                                        case 18:
                                                            aVar.e.g = i3;
                                                            return;
                                                        case 31:
                                                            aVar.e.L = i3;
                                                            return;
                                                        case 34:
                                                            aVar.e.I = i3;
                                                            return;
                                                        case 38:
                                                            aVar.a = i3;
                                                            return;
                                                        case 64:
                                                            aVar.d.b = i3;
                                                            return;
                                                        case 66:
                                                            aVar.d.f = i3;
                                                            return;
                                                        case 76:
                                                            aVar.d.e = i3;
                                                            return;
                                                        case 78:
                                                            aVar.c.c = i3;
                                                            return;
                                                        case 93:
                                                            aVar.e.M = i3;
                                                            return;
                                                        case 94:
                                                            aVar.e.T = i3;
                                                            return;
                                                        case 97:
                                                            aVar.e.p0 = i3;
                                                            return;
                                                        default:
                                                            switch (i2) {
                                                                case 21:
                                                                    aVar.e.e = i3;
                                                                    return;
                                                                case 22:
                                                                    aVar.c.b = i3;
                                                                    return;
                                                                case 23:
                                                                    aVar.e.d = i3;
                                                                    return;
                                                                case 24:
                                                                    aVar.e.G = i3;
                                                                    return;
                                                                default:
                                                                    switch (i2) {
                                                                        case 54:
                                                                            aVar.e.Y = i3;
                                                                            return;
                                                                        case 55:
                                                                            aVar.e.Z = i3;
                                                                            return;
                                                                        case 56:
                                                                            aVar.e.a0 = i3;
                                                                            return;
                                                                        case 57:
                                                                            aVar.e.b0 = i3;
                                                                            return;
                                                                        case 58:
                                                                            aVar.e.c0 = i3;
                                                                            return;
                                                                        case 59:
                                                                            aVar.e.d0 = i3;
                                                                            return;
                                                                        default:
                                                                            switch (i2) {
                                                                                case 82:
                                                                                    aVar.d.c = i3;
                                                                                    return;
                                                                                case 83:
                                                                                    aVar.f.i = i3;
                                                                                    return;
                                                                                case 84:
                                                                                    aVar.d.k = i3;
                                                                                    return;
                                                                                default:
                                                                                    switch (i2) {
                                                                                        case 87:
                                                                                            return;
                                                                                        case 88:
                                                                                            aVar.d.m = i3;
                                                                                            return;
                                                                                        case 89:
                                                                                            aVar.d.n = i3;
                                                                                            return;
                                                                                        default:
                                                                                            Log.w("ConstraintSet", "Unknown attribute 0x");
                                                                                            return;
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                                }
                                                aVar.e.h0 = i3;
                                                return;
                                            }
                                            aVar.e.g0 = i3;
                                            return;
                                        }
                                        aVar.e.B = i3;
                                        return;
                                    }
                                    aVar.e.A = i3;
                                    return;
                                }
                                aVar.e.X = i3;
                                return;
                            }
                            aVar.e.W = i3;
                            return;
                        }
                        aVar.e.H = i3;
                        return;
                    }
                    aVar.e.F = i3;
                    return;
                }
                aVar.e.K = i3;
                return;
            }
            aVar.e.E = i3;
            return;
        }
        aVar.e.D = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Q(a aVar, int i2, String str) {
        if (i2 != 5) {
            if (i2 != 65) {
                if (i2 != 74) {
                    if (i2 != 77) {
                        if (i2 != 87) {
                            if (i2 != 90) {
                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                return;
                            } else {
                                aVar.d.l = str;
                                return;
                            }
                        }
                        return;
                    }
                    aVar.e.l0 = str;
                    return;
                }
                aVar.e.k0 = str;
                return;
            }
            aVar.d.d = str;
            return;
        }
        aVar.e.z = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void R(a aVar, int i2, boolean z) {
        if (i2 != 44) {
            if (i2 != 75) {
                if (i2 != 87) {
                    if (i2 != 80) {
                        if (i2 != 81) {
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                            return;
                        } else {
                            aVar.e.n0 = z;
                            return;
                        }
                    }
                    aVar.e.m0 = z;
                    return;
                }
                return;
            }
            aVar.e.o0 = z;
            return;
        }
        aVar.f.m = z;
    }

    private String U(int i2) {
        switch (i2) {
            case 1:
                return ElementGenerator.TEXT_ALIGN_LEFT;
            case 2:
                return ElementGenerator.TEXT_ALIGN_RIGHT;
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public static a m(Context context, XmlPullParser xmlPullParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, g29.i3);
        L(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private int[] u(View view, String str) {
        int i2;
        Object designInformation;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i3 = 0;
        int i4 = 0;
        while (i3 < split.length) {
            String trim = split[i3].trim();
            try {
                i2 = py8.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i2 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i2 = ((Integer) designInformation).intValue();
            }
            iArr[i4] = i2;
            i3++;
            i4++;
        }
        if (i4 != split.length) {
            return Arrays.copyOf(iArr, i4);
        }
        return iArr;
    }

    private a v(Context context, AttributeSet attributeSet, boolean z) {
        int[] iArr;
        a aVar = new a();
        if (z) {
            iArr = g29.i3;
        } else {
            iArr = g29.t;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        K(context, aVar, obtainStyledAttributes, z);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private a w(int i2) {
        if (!this.g.containsKey(Integer.valueOf(i2))) {
            this.g.put(Integer.valueOf(i2), new a());
        }
        return this.g.get(Integer.valueOf(i2));
    }

    public a A(int i2) {
        return w(i2);
    }

    public int B(int i2) {
        return w(i2).c.b;
    }

    public int C(int i2) {
        return w(i2).c.c;
    }

    public int D(int i2) {
        return w(i2).e.d;
    }

    public void E(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType != 2) {
                        continue;
                    } else {
                        String name = xml.getName();
                        a v = v(context, Xml.asAttributeSet(xml), false);
                        if (name.equalsIgnoreCase("Guideline")) {
                            v.e.a = true;
                        }
                        this.g.put(Integer.valueOf(v.a), v);
                        continue;
                    }
                } else {
                    xml.getName();
                    continue;
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x01cf, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void F(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.F(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public void M(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.g.containsKey(Integer.valueOf(id))) {
                this.g.put(Integer.valueOf(id), new a());
            }
            a aVar = this.g.get(Integer.valueOf(id));
            if (aVar != null) {
                if (!aVar.e.b) {
                    aVar.g(id, bVar);
                    if (childAt instanceof androidx.constraintlayout.widget.b) {
                        aVar.e.j0 = ((androidx.constraintlayout.widget.b) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            aVar.e.o0 = barrier.getAllowsGoneWidget();
                            aVar.e.g0 = barrier.getType();
                            aVar.e.h0 = barrier.getMargin();
                        }
                    }
                    aVar.e.b = true;
                }
                C0027d c0027d = aVar.c;
                if (!c0027d.a) {
                    c0027d.b = childAt.getVisibility();
                    aVar.c.d = childAt.getAlpha();
                    aVar.c.a = true;
                }
                e eVar = aVar.f;
                if (!eVar.a) {
                    eVar.a = true;
                    eVar.b = childAt.getRotation();
                    aVar.f.c = childAt.getRotationX();
                    aVar.f.d = childAt.getRotationY();
                    aVar.f.e = childAt.getScaleX();
                    aVar.f.f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        e eVar2 = aVar.f;
                        eVar2.g = pivotX;
                        eVar2.h = pivotY;
                    }
                    aVar.f.j = childAt.getTranslationX();
                    aVar.f.k = childAt.getTranslationY();
                    aVar.f.l = childAt.getTranslationZ();
                    e eVar3 = aVar.f;
                    if (eVar3.m) {
                        eVar3.n = childAt.getElevation();
                    }
                }
            }
        }
    }

    public void N(d dVar) {
        for (Integer num : dVar.g.keySet()) {
            int intValue = num.intValue();
            a aVar = dVar.g.get(num);
            if (!this.g.containsKey(Integer.valueOf(intValue))) {
                this.g.put(Integer.valueOf(intValue), new a());
            }
            a aVar2 = this.g.get(Integer.valueOf(intValue));
            if (aVar2 != null) {
                b bVar = aVar2.e;
                if (!bVar.b) {
                    bVar.a(aVar.e);
                }
                C0027d c0027d = aVar2.c;
                if (!c0027d.a) {
                    c0027d.a(aVar.c);
                }
                e eVar = aVar2.f;
                if (!eVar.a) {
                    eVar.a(aVar.f);
                }
                c cVar = aVar2.d;
                if (!cVar.a) {
                    cVar.a(aVar.d);
                }
                for (String str : aVar.g.keySet()) {
                    if (!aVar2.g.containsKey(str)) {
                        aVar2.g.put(str, aVar.g.get(str));
                    }
                }
            }
        }
    }

    public void S(boolean z) {
        this.f = z;
    }

    public void T(boolean z) {
        this.a = z;
    }

    public void g(ConstraintLayout constraintLayout) {
        a aVar;
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!this.g.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + ln2.d(childAt));
            } else if (this.f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (this.g.containsKey(Integer.valueOf(id)) && (aVar = this.g.get(Integer.valueOf(id))) != null) {
                    androidx.constraintlayout.widget.a.j(childAt, aVar.g);
                }
            }
        }
    }

    public void h(d dVar) {
        for (a aVar : dVar.g.values()) {
            if (aVar.h != null) {
                if (aVar.b != null) {
                    for (Integer num : this.g.keySet()) {
                        a x = x(num.intValue());
                        String str = x.e.l0;
                        if (str != null && aVar.b.matches(str)) {
                            aVar.h.e(x);
                            x.g.putAll((HashMap) aVar.g.clone());
                        }
                    }
                } else {
                    aVar.h.e(x(aVar.a));
                }
            }
        }
    }

    public void i(ConstraintLayout constraintLayout) {
        k(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void j(androidx.constraintlayout.widget.b bVar, lr1 lr1Var, ConstraintLayout.b bVar2, SparseArray<lr1> sparseArray) {
        a aVar;
        int id = bVar.getId();
        if (this.g.containsKey(Integer.valueOf(id)) && (aVar = this.g.get(Integer.valueOf(id))) != null && (lr1Var instanceof eo4)) {
            bVar.q(aVar, (eo4) lr1Var, bVar2, sparseArray);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.g.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!this.g.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + ln2.d(childAt));
            } else if (this.f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id != -1) {
                    if (this.g.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = this.g.get(Integer.valueOf(id));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                aVar.e.i0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(aVar.e.g0);
                                barrier.setMargin(aVar.e.h0);
                                barrier.setAllowsGoneWidget(aVar.e.o0);
                                b bVar = aVar.e;
                                int[] iArr = bVar.j0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.k0;
                                    if (str != null) {
                                        bVar.j0 = u(barrier, str);
                                        barrier.setReferencedIds(aVar.e.j0);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.b();
                            aVar.e(bVar2);
                            if (z) {
                                androidx.constraintlayout.widget.a.j(childAt, aVar.g);
                            }
                            childAt.setLayoutParams(bVar2);
                            C0027d c0027d = aVar.c;
                            if (c0027d.c == 0) {
                                childAt.setVisibility(c0027d.b);
                            }
                            childAt.setAlpha(aVar.c.d);
                            childAt.setRotation(aVar.f.b);
                            childAt.setRotationX(aVar.f.c);
                            childAt.setRotationY(aVar.f.d);
                            childAt.setScaleX(aVar.f.e);
                            childAt.setScaleY(aVar.f.f);
                            e eVar = aVar.f;
                            if (eVar.i != -1) {
                                View findViewById = ((View) childAt.getParent()).findViewById(aVar.f.i);
                                if (findViewById != null) {
                                    float top = (findViewById.getTop() + findViewById.getBottom()) / 2.0f;
                                    float left = (findViewById.getLeft() + findViewById.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - childAt.getLeft());
                                        childAt.setPivotY(top - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.g)) {
                                    childAt.setPivotX(aVar.f.g);
                                }
                                if (!Float.isNaN(aVar.f.h)) {
                                    childAt.setPivotY(aVar.f.h);
                                }
                            }
                            childAt.setTranslationX(aVar.f.j);
                            childAt.setTranslationY(aVar.f.k);
                            childAt.setTranslationZ(aVar.f.l);
                            e eVar2 = aVar.f;
                            if (eVar2.m) {
                                childAt.setElevation(eVar2.n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = this.g.get(num);
            if (aVar2 != null) {
                if (aVar2.e.i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar3 = aVar2.e;
                    int[] iArr2 = bVar3.j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.k0;
                        if (str2 != null) {
                            bVar3.j0 = u(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.e.j0);
                        }
                    }
                    barrier2.setType(aVar2.e.g0);
                    barrier2.setMargin(aVar2.e.h0);
                    ConstraintLayout.b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.x();
                    aVar2.e(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (aVar2.e.a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.e(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = constraintLayout.getChildAt(i3);
            if (childAt2 instanceof androidx.constraintlayout.widget.b) {
                ((androidx.constraintlayout.widget.b) childAt2).k(constraintLayout);
            }
        }
    }

    public void l(int i2, ConstraintLayout.b bVar) {
        a aVar;
        if (this.g.containsKey(Integer.valueOf(i2)) && (aVar = this.g.get(Integer.valueOf(i2))) != null) {
            aVar.e(bVar);
        }
    }

    public void n(int i2, int i3) {
        a aVar;
        if (!this.g.containsKey(Integer.valueOf(i2)) || (aVar = this.g.get(Integer.valueOf(i2))) == null) {
            return;
        }
        switch (i3) {
            case 1:
                b bVar = aVar.e;
                bVar.j = -1;
                bVar.i = -1;
                bVar.G = -1;
                bVar.N = Integer.MIN_VALUE;
                return;
            case 2:
                b bVar2 = aVar.e;
                bVar2.l = -1;
                bVar2.k = -1;
                bVar2.H = -1;
                bVar2.P = Integer.MIN_VALUE;
                return;
            case 3:
                b bVar3 = aVar.e;
                bVar3.n = -1;
                bVar3.m = -1;
                bVar3.I = 0;
                bVar3.O = Integer.MIN_VALUE;
                return;
            case 4:
                b bVar4 = aVar.e;
                bVar4.o = -1;
                bVar4.p = -1;
                bVar4.J = 0;
                bVar4.Q = Integer.MIN_VALUE;
                return;
            case 5:
                b bVar5 = aVar.e;
                bVar5.q = -1;
                bVar5.r = -1;
                bVar5.s = -1;
                bVar5.M = 0;
                bVar5.T = Integer.MIN_VALUE;
                return;
            case 6:
                b bVar6 = aVar.e;
                bVar6.t = -1;
                bVar6.u = -1;
                bVar6.L = 0;
                bVar6.S = Integer.MIN_VALUE;
                return;
            case 7:
                b bVar7 = aVar.e;
                bVar7.v = -1;
                bVar7.w = -1;
                bVar7.K = 0;
                bVar7.R = Integer.MIN_VALUE;
                return;
            case 8:
                b bVar8 = aVar.e;
                bVar8.C = -1.0f;
                bVar8.B = -1;
                bVar8.A = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void o(Context context, int i2) {
        p((ConstraintLayout) LayoutInflater.from(context).inflate(i2, (ViewGroup) null));
    }

    public void p(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.g.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.g.containsKey(Integer.valueOf(id))) {
                this.g.put(Integer.valueOf(id), new a());
            }
            a aVar = this.g.get(Integer.valueOf(id));
            if (aVar != null) {
                aVar.g = androidx.constraintlayout.widget.a.c(this.e, childAt);
                aVar.g(id, bVar);
                aVar.c.b = childAt.getVisibility();
                aVar.c.d = childAt.getAlpha();
                aVar.f.b = childAt.getRotation();
                aVar.f.c = childAt.getRotationX();
                aVar.f.d = childAt.getRotationY();
                aVar.f.e = childAt.getScaleX();
                aVar.f.f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f;
                    eVar.g = pivotX;
                    eVar.h = pivotY;
                }
                aVar.f.j = childAt.getTranslationX();
                aVar.f.k = childAt.getTranslationY();
                aVar.f.l = childAt.getTranslationZ();
                e eVar2 = aVar.f;
                if (eVar2.m) {
                    eVar2.n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.e.o0 = barrier.getAllowsGoneWidget();
                    aVar.e.j0 = barrier.getReferencedIds();
                    aVar.e.g0 = barrier.getType();
                    aVar.e.h0 = barrier.getMargin();
                }
            }
        }
    }

    public void q(d dVar) {
        this.g.clear();
        for (Integer num : dVar.g.keySet()) {
            a aVar = dVar.g.get(num);
            if (aVar != null) {
                this.g.put(num, aVar.clone());
            }
        }
    }

    public void r(androidx.constraintlayout.widget.e eVar) {
        int childCount = eVar.getChildCount();
        this.g.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = eVar.getChildAt(i2);
            e.a aVar = (e.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.g.containsKey(Integer.valueOf(id))) {
                this.g.put(Integer.valueOf(id), new a());
            }
            a aVar2 = this.g.get(Integer.valueOf(id));
            if (aVar2 != null) {
                if (childAt instanceof androidx.constraintlayout.widget.b) {
                    aVar2.i((androidx.constraintlayout.widget.b) childAt, id, aVar);
                }
                aVar2.h(id, aVar);
            }
        }
    }

    public void s(int i2, int i3, int i4, int i5, int i6) {
        if (!this.g.containsKey(Integer.valueOf(i2))) {
            this.g.put(Integer.valueOf(i2), new a());
        }
        a aVar = this.g.get(Integer.valueOf(i2));
        if (aVar == null) {
            return;
        }
        switch (i3) {
            case 1:
                if (i5 == 1) {
                    b bVar = aVar.e;
                    bVar.i = i4;
                    bVar.j = -1;
                } else if (i5 == 2) {
                    b bVar2 = aVar.e;
                    bVar2.j = i4;
                    bVar2.i = -1;
                } else {
                    throw new IllegalArgumentException("Left to " + U(i5) + " undefined");
                }
                aVar.e.G = i6;
                return;
            case 2:
                if (i5 == 1) {
                    b bVar3 = aVar.e;
                    bVar3.k = i4;
                    bVar3.l = -1;
                } else if (i5 == 2) {
                    b bVar4 = aVar.e;
                    bVar4.l = i4;
                    bVar4.k = -1;
                } else {
                    throw new IllegalArgumentException("right to " + U(i5) + " undefined");
                }
                aVar.e.H = i6;
                return;
            case 3:
                if (i5 == 3) {
                    b bVar5 = aVar.e;
                    bVar5.m = i4;
                    bVar5.n = -1;
                    bVar5.q = -1;
                    bVar5.r = -1;
                    bVar5.s = -1;
                } else if (i5 == 4) {
                    b bVar6 = aVar.e;
                    bVar6.n = i4;
                    bVar6.m = -1;
                    bVar6.q = -1;
                    bVar6.r = -1;
                    bVar6.s = -1;
                } else {
                    throw new IllegalArgumentException("right to " + U(i5) + " undefined");
                }
                aVar.e.I = i6;
                return;
            case 4:
                if (i5 == 4) {
                    b bVar7 = aVar.e;
                    bVar7.p = i4;
                    bVar7.o = -1;
                    bVar7.q = -1;
                    bVar7.r = -1;
                    bVar7.s = -1;
                } else if (i5 == 3) {
                    b bVar8 = aVar.e;
                    bVar8.o = i4;
                    bVar8.p = -1;
                    bVar8.q = -1;
                    bVar8.r = -1;
                    bVar8.s = -1;
                } else {
                    throw new IllegalArgumentException("right to " + U(i5) + " undefined");
                }
                aVar.e.J = i6;
                return;
            case 5:
                if (i5 == 5) {
                    b bVar9 = aVar.e;
                    bVar9.q = i4;
                    bVar9.p = -1;
                    bVar9.o = -1;
                    bVar9.m = -1;
                    bVar9.n = -1;
                    return;
                } else if (i5 == 3) {
                    b bVar10 = aVar.e;
                    bVar10.r = i4;
                    bVar10.p = -1;
                    bVar10.o = -1;
                    bVar10.m = -1;
                    bVar10.n = -1;
                    return;
                } else if (i5 == 4) {
                    b bVar11 = aVar.e;
                    bVar11.s = i4;
                    bVar11.p = -1;
                    bVar11.o = -1;
                    bVar11.m = -1;
                    bVar11.n = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + U(i5) + " undefined");
                }
            case 6:
                if (i5 == 6) {
                    b bVar12 = aVar.e;
                    bVar12.u = i4;
                    bVar12.t = -1;
                } else if (i5 == 7) {
                    b bVar13 = aVar.e;
                    bVar13.t = i4;
                    bVar13.u = -1;
                } else {
                    throw new IllegalArgumentException("right to " + U(i5) + " undefined");
                }
                aVar.e.L = i6;
                return;
            case 7:
                if (i5 == 7) {
                    b bVar14 = aVar.e;
                    bVar14.w = i4;
                    bVar14.v = -1;
                } else if (i5 == 6) {
                    b bVar15 = aVar.e;
                    bVar15.v = i4;
                    bVar15.w = -1;
                } else {
                    throw new IllegalArgumentException("right to " + U(i5) + " undefined");
                }
                aVar.e.K = i6;
                return;
            default:
                throw new IllegalArgumentException(U(i3) + " to " + U(i5) + " unknown");
        }
    }

    public void t(int i2, int i3, int i4, float f) {
        b bVar = w(i2).e;
        bVar.A = i3;
        bVar.B = i4;
        bVar.C = f;
    }

    public a x(int i2) {
        if (this.g.containsKey(Integer.valueOf(i2))) {
            return this.g.get(Integer.valueOf(i2));
        }
        return null;
    }

    public int y(int i2) {
        return w(i2).e.e;
    }

    public int[] z() {
        Integer[] numArr = (Integer[]) this.g.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = numArr[i2].intValue();
        }
        return iArr;
    }
}
