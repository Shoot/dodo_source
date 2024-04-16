package defpackage;

import java.io.IOException;
import java.util.HashMap;
/* compiled from: StdArraySerializers.java */
/* renamed from: uwa  reason: default package */
/* loaded from: classes2.dex */
public class uwa {
    protected static final HashMap<String, gc5<?>> a;

    /* compiled from: StdArraySerializers.java */
    @o85
    /* renamed from: uwa$a */
    /* loaded from: classes2.dex */
    public static class a extends pr<boolean[]> {
        private static final y85 e = rnb.S().Z(Boolean.class);

        public a() {
            super(boolean[].class);
        }

        @Override // defpackage.pr
        public gc5<?> L(ia0 ia0Var, Boolean bool) {
            return new a(this, ia0Var, bool);
        }

        @Override // defpackage.gc5
        /* renamed from: N */
        public boolean d(bda bdaVar, boolean[] zArr) {
            if (zArr.length == 0) {
                return true;
            }
            return false;
        }

        @Override // defpackage.cxa, defpackage.gc5
        /* renamed from: P */
        public final void f(boolean[] zArr, ua5 ua5Var, bda bdaVar) throws IOException {
            int length = zArr.length;
            if (length == 1 && K(bdaVar)) {
                M(zArr, ua5Var, bdaVar);
                return;
            }
            ua5Var.f1(zArr, length);
            M(zArr, ua5Var, bdaVar);
            ua5Var.W();
        }

        @Override // defpackage.pr
        /* renamed from: Q */
        public void M(boolean[] zArr, ua5 ua5Var, bda bdaVar) throws IOException {
            for (boolean z : zArr) {
                ua5Var.T(z);
            }
        }

        protected a(a aVar, ia0 ia0Var, Boolean bool) {
            super(aVar, ia0Var, bool);
        }

        @Override // defpackage.ct1
        public ct1<?> G(bob bobVar) {
            return this;
        }
    }

    /* compiled from: StdArraySerializers.java */
    @o85
    /* renamed from: uwa$b */
    /* loaded from: classes2.dex */
    public static class b extends cxa<char[]> {
        public b() {
            super(char[].class);
        }

        private final void G(ua5 ua5Var, char[] cArr) throws IOException {
            int length = cArr.length;
            for (int i = 0; i < length; i++) {
                ua5Var.s1(cArr, i, 1);
            }
        }

        @Override // defpackage.gc5
        /* renamed from: H */
        public boolean d(bda bdaVar, char[] cArr) {
            if (cArr.length == 0) {
                return true;
            }
            return false;
        }

        @Override // defpackage.cxa, defpackage.gc5
        /* renamed from: K */
        public void f(char[] cArr, ua5 ua5Var, bda bdaVar) throws IOException {
            if (bdaVar.M0(qca.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                ua5Var.f1(cArr, cArr.length);
                G(ua5Var, cArr);
                ua5Var.W();
                return;
            }
            ua5Var.s1(cArr, 0, cArr.length);
        }

        @Override // defpackage.gc5
        /* renamed from: L */
        public void i(char[] cArr, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
            c9c g;
            if (bdaVar.M0(qca.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                g = bobVar.g(ua5Var, bobVar.d(cArr, nc5.START_ARRAY));
                G(ua5Var, cArr);
            } else {
                g = bobVar.g(ua5Var, bobVar.d(cArr, nc5.VALUE_STRING));
                ua5Var.s1(cArr, 0, cArr.length);
            }
            bobVar.h(ua5Var, g);
        }
    }

    /* compiled from: StdArraySerializers.java */
    @o85
    /* renamed from: uwa$c */
    /* loaded from: classes2.dex */
    public static class c extends pr<double[]> {
        private static final y85 e = rnb.S().Z(Double.TYPE);

        public c() {
            super(double[].class);
        }

        @Override // defpackage.pr
        public gc5<?> L(ia0 ia0Var, Boolean bool) {
            return new c(this, ia0Var, bool);
        }

        @Override // defpackage.gc5
        /* renamed from: N */
        public boolean d(bda bdaVar, double[] dArr) {
            if (dArr.length == 0) {
                return true;
            }
            return false;
        }

        @Override // defpackage.cxa, defpackage.gc5
        /* renamed from: P */
        public final void f(double[] dArr, ua5 ua5Var, bda bdaVar) throws IOException {
            if (dArr.length == 1 && K(bdaVar)) {
                M(dArr, ua5Var, bdaVar);
            } else {
                ua5Var.H(dArr, 0, dArr.length);
            }
        }

        @Override // defpackage.pr
        /* renamed from: Q */
        public void M(double[] dArr, ua5 ua5Var, bda bdaVar) throws IOException {
            for (double d : dArr) {
                ua5Var.m0(d);
            }
        }

        protected c(c cVar, ia0 ia0Var, Boolean bool) {
            super(cVar, ia0Var, bool);
        }

        @Override // defpackage.ct1
        public ct1<?> G(bob bobVar) {
            return this;
        }
    }

    /* compiled from: StdArraySerializers.java */
    @o85
    /* renamed from: uwa$d */
    /* loaded from: classes2.dex */
    public static class d extends h<float[]> {
        private static final y85 e = rnb.S().Z(Float.TYPE);

        public d() {
            super(float[].class);
        }

        @Override // defpackage.pr
        public gc5<?> L(ia0 ia0Var, Boolean bool) {
            return new d(this, ia0Var, bool);
        }

        @Override // defpackage.gc5
        /* renamed from: N */
        public boolean d(bda bdaVar, float[] fArr) {
            if (fArr.length == 0) {
                return true;
            }
            return false;
        }

        @Override // defpackage.cxa, defpackage.gc5
        /* renamed from: P */
        public final void f(float[] fArr, ua5 ua5Var, bda bdaVar) throws IOException {
            int length = fArr.length;
            if (length == 1 && K(bdaVar)) {
                M(fArr, ua5Var, bdaVar);
                return;
            }
            ua5Var.f1(fArr, length);
            M(fArr, ua5Var, bdaVar);
            ua5Var.W();
        }

        @Override // defpackage.pr
        /* renamed from: Q */
        public void M(float[] fArr, ua5 ua5Var, bda bdaVar) throws IOException {
            for (float f : fArr) {
                ua5Var.n0(f);
            }
        }

        public d(d dVar, ia0 ia0Var, Boolean bool) {
            super(dVar, ia0Var, bool);
        }
    }

    /* compiled from: StdArraySerializers.java */
    @o85
    /* renamed from: uwa$e */
    /* loaded from: classes2.dex */
    public static class e extends pr<int[]> {
        private static final y85 e = rnb.S().Z(Integer.TYPE);

        public e() {
            super(int[].class);
        }

        @Override // defpackage.pr
        public gc5<?> L(ia0 ia0Var, Boolean bool) {
            return new e(this, ia0Var, bool);
        }

        @Override // defpackage.gc5
        /* renamed from: N */
        public boolean d(bda bdaVar, int[] iArr) {
            if (iArr.length == 0) {
                return true;
            }
            return false;
        }

        @Override // defpackage.cxa, defpackage.gc5
        /* renamed from: P */
        public final void f(int[] iArr, ua5 ua5Var, bda bdaVar) throws IOException {
            if (iArr.length == 1 && K(bdaVar)) {
                M(iArr, ua5Var, bdaVar);
            } else {
                ua5Var.K(iArr, 0, iArr.length);
            }
        }

        @Override // defpackage.pr
        /* renamed from: Q */
        public void M(int[] iArr, ua5 ua5Var, bda bdaVar) throws IOException {
            for (int i : iArr) {
                ua5Var.o0(i);
            }
        }

        protected e(e eVar, ia0 ia0Var, Boolean bool) {
            super(eVar, ia0Var, bool);
        }

        @Override // defpackage.ct1
        public ct1<?> G(bob bobVar) {
            return this;
        }
    }

    /* compiled from: StdArraySerializers.java */
    @o85
    /* renamed from: uwa$f */
    /* loaded from: classes2.dex */
    public static class f extends h<long[]> {
        private static final y85 e = rnb.S().Z(Long.TYPE);

        public f() {
            super(long[].class);
        }

        @Override // defpackage.pr
        public gc5<?> L(ia0 ia0Var, Boolean bool) {
            return new f(this, ia0Var, bool);
        }

        @Override // defpackage.gc5
        /* renamed from: N */
        public boolean d(bda bdaVar, long[] jArr) {
            if (jArr.length == 0) {
                return true;
            }
            return false;
        }

        @Override // defpackage.cxa, defpackage.gc5
        /* renamed from: P */
        public final void f(long[] jArr, ua5 ua5Var, bda bdaVar) throws IOException {
            if (jArr.length == 1 && K(bdaVar)) {
                M(jArr, ua5Var, bdaVar);
            } else {
                ua5Var.L(jArr, 0, jArr.length);
            }
        }

        @Override // defpackage.pr
        /* renamed from: Q */
        public void M(long[] jArr, ua5 ua5Var, bda bdaVar) throws IOException {
            for (long j : jArr) {
                ua5Var.p0(j);
            }
        }

        public f(f fVar, ia0 ia0Var, Boolean bool) {
            super(fVar, ia0Var, bool);
        }
    }

    /* compiled from: StdArraySerializers.java */
    @o85
    /* renamed from: uwa$g */
    /* loaded from: classes2.dex */
    public static class g extends h<short[]> {
        private static final y85 e = rnb.S().Z(Short.TYPE);

        public g() {
            super(short[].class);
        }

        @Override // defpackage.pr
        public gc5<?> L(ia0 ia0Var, Boolean bool) {
            return new g(this, ia0Var, bool);
        }

        @Override // defpackage.gc5
        /* renamed from: N */
        public boolean d(bda bdaVar, short[] sArr) {
            if (sArr.length == 0) {
                return true;
            }
            return false;
        }

        @Override // defpackage.cxa, defpackage.gc5
        /* renamed from: P */
        public final void f(short[] sArr, ua5 ua5Var, bda bdaVar) throws IOException {
            int length = sArr.length;
            if (length == 1 && K(bdaVar)) {
                M(sArr, ua5Var, bdaVar);
                return;
            }
            ua5Var.f1(sArr, length);
            M(sArr, ua5Var, bdaVar);
            ua5Var.W();
        }

        @Override // defpackage.pr
        /* renamed from: Q */
        public void M(short[] sArr, ua5 ua5Var, bda bdaVar) throws IOException {
            for (short s : sArr) {
                ua5Var.o0(s);
            }
        }

        public g(g gVar, ia0 ia0Var, Boolean bool) {
            super(gVar, ia0Var, bool);
        }
    }

    /* compiled from: StdArraySerializers.java */
    /* renamed from: uwa$h */
    /* loaded from: classes2.dex */
    protected static abstract class h<T> extends pr<T> {
        protected h(Class<T> cls) {
            super(cls);
        }

        protected h(h<T> hVar, ia0 ia0Var, Boolean bool) {
            super(hVar, ia0Var, bool);
        }

        @Override // defpackage.ct1
        public final ct1<?> G(bob bobVar) {
            return this;
        }
    }

    static {
        HashMap<String, gc5<?>> hashMap = new HashMap<>();
        a = hashMap;
        hashMap.put(boolean[].class.getName(), new a());
        hashMap.put(byte[].class.getName(), new pj0());
        hashMap.put(char[].class.getName(), new b());
        hashMap.put(short[].class.getName(), new g());
        hashMap.put(int[].class.getName(), new e());
        hashMap.put(long[].class.getName(), new f());
        hashMap.put(float[].class.getName(), new d());
        hashMap.put(double[].class.getName(), new c());
    }

    public static gc5<?> a(Class<?> cls) {
        return a.get(cls.getName());
    }
}
