package defpackage;

import defpackage.jb3;
import defpackage.na3;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Hashtable;
import java.util.Random;
/* renamed from: ea3  reason: default package */
/* loaded from: classes3.dex */
public abstract class ea3 {
    protected iv3 a;
    protected na3 b;
    protected na3 c;
    protected BigInteger d;
    protected BigInteger e;
    protected int f = 0;
    protected ma3 g = null;
    protected bb3 h = null;

    /* renamed from: ea3$a */
    /* loaded from: classes3.dex */
    class a extends g1 {
        final /* synthetic */ int a;
        final /* synthetic */ int b;
        final /* synthetic */ byte[] c;

        a(int i, int i2, byte[] bArr) {
            this.a = i;
            this.b = i2;
            this.c = bArr;
        }

        private jb3 d(byte[] bArr, byte[] bArr2) {
            ea3 ea3Var = ea3.this;
            return ea3Var.h(ea3Var.m(new BigInteger(1, bArr)), ea3.this.m(new BigInteger(1, bArr2)));
        }

        @Override // defpackage.za3
        public int a() {
            return this.a;
        }

        @Override // defpackage.za3
        public jb3 b(int i) {
            int i2;
            int i3 = this.b;
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < this.a; i5++) {
                int i6 = ((i5 ^ i) - 1) >> 31;
                int i7 = 0;
                while (true) {
                    i2 = this.b;
                    if (i7 < i2) {
                        byte b = bArr[i7];
                        byte[] bArr3 = this.c;
                        bArr[i7] = (byte) (b ^ (bArr3[i4 + i7] & i6));
                        bArr2[i7] = (byte) ((bArr3[(i2 + i4) + i7] & i6) ^ bArr2[i7]);
                        i7++;
                    }
                }
                i4 += i2 * 2;
            }
            return d(bArr, bArr2);
        }

        @Override // defpackage.za3
        public jb3 c(int i) {
            int i2 = this.b;
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[i2];
            int i3 = i * i2 * 2;
            int i4 = 0;
            while (true) {
                int i5 = this.b;
                if (i4 < i5) {
                    byte[] bArr3 = this.c;
                    bArr[i4] = bArr3[i3 + i4];
                    bArr2[i4] = bArr3[i5 + i3 + i4];
                    i4++;
                } else {
                    return d(bArr, bArr2);
                }
            }
        }
    }

    /* renamed from: ea3$b */
    /* loaded from: classes3.dex */
    public static abstract class b extends ea3 {
        private BigInteger[] i;

        /* JADX INFO: Access modifiers changed from: protected */
        public b(int i, int i2, int i3, int i4) {
            super(F(i, i2, i3, i4));
            this.i = null;
        }

        private static iv3 F(int i, int i2, int i3, int i4) {
            if (i2 != 0) {
                if (i3 == 0) {
                    if (i4 == 0) {
                        return jv3.a(new int[]{0, i2, i});
                    }
                    throw new IllegalArgumentException("k3 must be 0 if k2 == 0");
                } else if (i3 > i2) {
                    if (i4 > i3) {
                        return jv3.a(new int[]{0, i2, i3, i4, i});
                    }
                    throw new IllegalArgumentException("k3 must be > k2");
                } else {
                    throw new IllegalArgumentException("k2 must be > k1");
                }
            }
            throw new IllegalArgumentException("k1 must be > 0");
        }

        private static BigInteger H(SecureRandom secureRandom, int i) {
            BigInteger e;
            do {
                e = db0.e(i, secureRandom);
            } while (e.signum() <= 0);
            return e;
        }

        @Override // defpackage.ea3
        public na3 C(SecureRandom secureRandom) {
            int t = t();
            return m(H(secureRandom, t)).j(m(H(secureRandom, t)));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public synchronized BigInteger[] G() {
            try {
                if (this.i == null) {
                    this.i = nhb.f(this);
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.i;
        }

        public boolean I() {
            if (this.d != null && this.e != null && this.c.h() && (this.b.i() || this.b.h())) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public na3 J(na3 na3Var) {
            na3 na3Var2;
            na3.a aVar = (na3.a) na3Var;
            boolean v = aVar.v();
            if (v && aVar.w() != 0) {
                return null;
            }
            int t = t();
            if ((t & 1) != 0) {
                na3 u = aVar.u();
                if (!v && !u.o().a(u).a(na3Var).i()) {
                    return null;
                }
                return u;
            } else if (na3Var.i()) {
                return na3Var;
            } else {
                na3 m = m(da3.a);
                Random random = new Random();
                do {
                    na3 m2 = m(new BigInteger(t, random));
                    na3 na3Var3 = na3Var;
                    na3Var2 = m;
                    for (int i = 1; i < t; i++) {
                        na3 o = na3Var3.o();
                        na3Var2 = na3Var2.o().a(o.j(m2));
                        na3Var3 = o.a(na3Var);
                    }
                    if (!na3Var3.i()) {
                        return null;
                    }
                } while (na3Var2.o().a(na3Var2).i());
                return na3Var2;
            }
        }

        @Override // defpackage.ea3
        public jb3 g(BigInteger bigInteger, BigInteger bigInteger2) {
            na3 m = m(bigInteger);
            na3 m2 = m(bigInteger2);
            int q = q();
            if (q == 5 || q == 6) {
                if (m.i()) {
                    if (!m2.o().equals(o())) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    m2 = m2.d(m).a(m);
                }
            }
            return h(m, m2);
        }

        @Override // defpackage.ea3
        protected jb3 k(int i, BigInteger bigInteger) {
            na3 na3Var;
            na3 m = m(bigInteger);
            if (m.i()) {
                na3Var = o().n();
            } else {
                na3 J = J(m.o().g().j(o()).a(n()).a(m));
                if (J != null) {
                    boolean s = J.s();
                    boolean z = true;
                    if (i != 1) {
                        z = false;
                    }
                    if (s != z) {
                        J = J.b();
                    }
                    int q = q();
                    if (q != 5 && q != 6) {
                        na3Var = J.j(m);
                    } else {
                        na3Var = J.a(m);
                    }
                } else {
                    na3Var = null;
                }
            }
            if (na3Var != null) {
                return h(m, na3Var);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }

        @Override // defpackage.ea3
        public boolean y(BigInteger bigInteger) {
            if (bigInteger != null && bigInteger.signum() >= 0 && bigInteger.bitLength() <= t()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: ea3$c */
    /* loaded from: classes3.dex */
    public static abstract class c extends ea3 {
        /* JADX INFO: Access modifiers changed from: protected */
        public c(BigInteger bigInteger) {
            super(jv3.b(bigInteger));
        }

        private static BigInteger F(SecureRandom secureRandom, BigInteger bigInteger) {
            while (true) {
                BigInteger e = db0.e(bigInteger.bitLength(), secureRandom);
                if (e.signum() > 0 && e.compareTo(bigInteger) < 0) {
                    return e;
                }
            }
        }

        @Override // defpackage.ea3
        public na3 C(SecureRandom secureRandom) {
            BigInteger b = s().b();
            return m(F(secureRandom, b)).j(m(F(secureRandom, b)));
        }

        @Override // defpackage.ea3
        protected jb3 k(int i, BigInteger bigInteger) {
            na3 m = m(bigInteger);
            na3 n = m.o().a(this.b).j(m).a(this.c).n();
            if (n != null) {
                boolean s = n.s();
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                if (s != z) {
                    n = n.m();
                }
                return h(m, n);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }

        @Override // defpackage.ea3
        public boolean y(BigInteger bigInteger) {
            if (bigInteger != null && bigInteger.signum() >= 0 && bigInteger.compareTo(s().b()) < 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: ea3$d */
    /* loaded from: classes3.dex */
    public class d {
        protected int a;
        protected ma3 b;
        protected bb3 c;

        d(int i, ma3 ma3Var, bb3 bb3Var) {
            this.a = i;
            this.b = ma3Var;
            this.c = bb3Var;
        }

        public ea3 a() {
            if (ea3.this.D(this.a)) {
                ea3 c = ea3.this.c();
                if (c != ea3.this) {
                    synchronized (c) {
                        c.f = this.a;
                        c.g = this.b;
                        c.h = this.c;
                    }
                    return c;
                }
                throw new IllegalStateException("implementation returned current curve");
            }
            throw new IllegalStateException("unsupported coordinate system");
        }

        public d b(ma3 ma3Var) {
            this.b = ma3Var;
            return this;
        }
    }

    /* renamed from: ea3$e */
    /* loaded from: classes3.dex */
    public static class e extends b {
        private int j;
        private int k;
        private int l;
        private int m;
        private jb3.d n;

        /* renamed from: ea3$e$a */
        /* loaded from: classes3.dex */
        class a extends g1 {
            final /* synthetic */ int a;
            final /* synthetic */ int b;
            final /* synthetic */ long[] c;
            final /* synthetic */ int[] d;

            a(int i, int i2, long[] jArr, int[] iArr) {
                this.a = i;
                this.b = i2;
                this.c = jArr;
                this.d = iArr;
            }

            private jb3 d(long[] jArr, long[] jArr2) {
                return e.this.h(new na3.c(e.this.j, this.d, new iy5(jArr)), new na3.c(e.this.j, this.d, new iy5(jArr2)));
            }

            @Override // defpackage.za3
            public int a() {
                return this.a;
            }

            @Override // defpackage.za3
            public jb3 b(int i) {
                int i2;
                long[] l = et6.l(this.b);
                long[] l2 = et6.l(this.b);
                int i3 = 0;
                for (int i4 = 0; i4 < this.a; i4++) {
                    long j = ((i4 ^ i) - 1) >> 31;
                    int i5 = 0;
                    while (true) {
                        i2 = this.b;
                        if (i5 < i2) {
                            long j2 = l[i5];
                            long[] jArr = this.c;
                            l[i5] = j2 ^ (jArr[i3 + i5] & j);
                            l2[i5] = l2[i5] ^ (jArr[(i2 + i3) + i5] & j);
                            i5++;
                        }
                    }
                    i3 += i2 * 2;
                }
                return d(l, l2);
            }

            @Override // defpackage.za3
            public jb3 c(int i) {
                long[] l = et6.l(this.b);
                long[] l2 = et6.l(this.b);
                int i2 = i * this.b * 2;
                int i3 = 0;
                while (true) {
                    int i4 = this.b;
                    if (i3 < i4) {
                        long[] jArr = this.c;
                        l[i3] = jArr[i2 + i3];
                        l2[i3] = jArr[i4 + i2 + i3];
                        i3++;
                    } else {
                        return d(l, l2);
                    }
                }
            }
        }

        protected e(int i, int i2, int i3, int i4, na3 na3Var, na3 na3Var2, BigInteger bigInteger, BigInteger bigInteger2) {
            super(i, i2, i3, i4);
            this.j = i;
            this.k = i2;
            this.l = i3;
            this.m = i4;
            this.d = bigInteger;
            this.e = bigInteger2;
            this.n = new jb3.d(this, null, null);
            this.b = na3Var;
            this.c = na3Var2;
            this.f = 6;
        }

        @Override // defpackage.ea3
        public boolean D(int i) {
            if (i == 0 || i == 1 || i == 6) {
                return true;
            }
            return false;
        }

        public boolean L() {
            if (this.l == 0 && this.m == 0) {
                return true;
            }
            return false;
        }

        @Override // defpackage.ea3
        protected ea3 c() {
            return new e(this.j, this.k, this.l, this.m, this.b, this.c, this.d, this.e);
        }

        @Override // defpackage.ea3
        public za3 e(jb3[] jb3VarArr, int i, int i2) {
            int[] iArr;
            int i3 = (this.j + 63) >>> 6;
            if (L()) {
                iArr = new int[]{this.k};
            } else {
                iArr = new int[]{this.k, this.l, this.m};
            }
            int[] iArr2 = iArr;
            long[] jArr = new long[i2 * i3 * 2];
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                jb3 jb3Var = jb3VarArr[i + i5];
                ((na3.c) jb3Var.n()).j.l(jArr, i4);
                int i6 = i4 + i3;
                ((na3.c) jb3Var.o()).j.l(jArr, i6);
                i4 = i6 + i3;
            }
            return new a(i2, i3, jArr, iArr2);
        }

        @Override // defpackage.ea3
        protected bb3 f() {
            if (I()) {
                return new s2c();
            }
            return super.f();
        }

        @Override // defpackage.ea3
        protected jb3 h(na3 na3Var, na3 na3Var2) {
            return new jb3.d(this, na3Var, na3Var2);
        }

        @Override // defpackage.ea3
        protected jb3 i(na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
            return new jb3.d(this, na3Var, na3Var2, na3VarArr);
        }

        @Override // defpackage.ea3
        public na3 m(BigInteger bigInteger) {
            return new na3.c(this.j, this.k, this.l, this.m, bigInteger);
        }

        @Override // defpackage.ea3
        public int t() {
            return this.j;
        }

        @Override // defpackage.ea3
        public jb3 u() {
            return this.n;
        }

        public e(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i, i2, i3, i4, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        public e(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(i, i2, i3, i4);
            this.j = i;
            this.k = i2;
            this.l = i3;
            this.m = i4;
            this.d = bigInteger3;
            this.e = bigInteger4;
            this.n = new jb3.d(this, null, null);
            this.b = m(bigInteger);
            this.c = m(bigInteger2);
            this.f = 6;
        }

        public e(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            this(i, i2, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
        }
    }

    /* renamed from: ea3$f */
    /* loaded from: classes3.dex */
    public static class f extends c {
        BigInteger i;
        BigInteger j;
        jb3.e k;

        protected f(BigInteger bigInteger, BigInteger bigInteger2, na3 na3Var, na3 na3Var2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(bigInteger);
            this.i = bigInteger;
            this.j = bigInteger2;
            this.k = new jb3.e(this, null, null);
            this.b = na3Var;
            this.c = na3Var2;
            this.d = bigInteger3;
            this.e = bigInteger4;
            this.f = 4;
        }

        @Override // defpackage.ea3
        public boolean D(int i) {
            if (i == 0 || i == 1 || i == 2 || i == 4) {
                return true;
            }
            return false;
        }

        @Override // defpackage.ea3
        protected ea3 c() {
            return new f(this.i, this.j, this.b, this.c, this.d, this.e);
        }

        @Override // defpackage.ea3
        protected jb3 h(na3 na3Var, na3 na3Var2) {
            return new jb3.e(this, na3Var, na3Var2);
        }

        @Override // defpackage.ea3
        protected jb3 i(na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
            return new jb3.e(this, na3Var, na3Var2, na3VarArr);
        }

        @Override // defpackage.ea3
        public na3 m(BigInteger bigInteger) {
            return new na3.d(this.i, this.j, bigInteger);
        }

        @Override // defpackage.ea3
        public int t() {
            return this.i.bitLength();
        }

        @Override // defpackage.ea3
        public jb3 u() {
            return this.k;
        }

        @Override // defpackage.ea3
        public jb3 x(jb3 jb3Var) {
            int q;
            if (this != jb3Var.i() && q() == 2 && !jb3Var.u() && ((q = jb3Var.i().q()) == 2 || q == 3 || q == 4)) {
                return new jb3.e(this, m(jb3Var.b.t()), m(jb3Var.c.t()), new na3[]{m(jb3Var.d[0].t())});
            }
            return super.x(jb3Var);
        }

        public f(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            this(bigInteger, bigInteger2, bigInteger3, null, null);
        }

        public f(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
            super(bigInteger);
            this.i = bigInteger;
            this.j = na3.d.u(bigInteger);
            this.k = new jb3.e(this, null, null);
            this.b = m(bigInteger2);
            this.c = m(bigInteger3);
            this.d = bigInteger4;
            this.e = bigInteger5;
            this.f = 4;
        }
    }

    protected ea3(iv3 iv3Var) {
        this.a = iv3Var;
    }

    public void A(jb3[] jb3VarArr, int i, int i2, na3 na3Var) {
        b(jb3VarArr, i, i2);
        int q = q();
        if (q != 0 && q != 5) {
            na3[] na3VarArr = new na3[i2];
            int[] iArr = new int[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = i + i4;
                jb3 jb3Var = jb3VarArr[i5];
                if (jb3Var != null && (na3Var != null || !jb3Var.v())) {
                    na3VarArr[i3] = jb3Var.s(0);
                    iArr[i3] = i5;
                    i3++;
                }
            }
            if (i3 == 0) {
                return;
            }
            ca3.p(na3VarArr, 0, i3, na3Var);
            for (int i6 = 0; i6 < i3; i6++) {
                int i7 = iArr[i6];
                jb3VarArr[i7] = jb3VarArr[i7].B(na3VarArr[i6]);
            }
        } else if (na3Var != null) {
            throw new IllegalArgumentException("'iso' not valid for affine coordinates");
        }
    }

    public ig8 B(jb3 jb3Var, String str, hg8 hg8Var) {
        Hashtable hashtable;
        ig8 a2;
        a(jb3Var);
        synchronized (jb3Var) {
            try {
                hashtable = jb3Var.e;
                if (hashtable == null) {
                    hashtable = new Hashtable(4);
                    jb3Var.e = hashtable;
                }
            } finally {
            }
        }
        synchronized (hashtable) {
            try {
                ig8 ig8Var = (ig8) hashtable.get(str);
                a2 = hg8Var.a(ig8Var);
                if (a2 != ig8Var) {
                    hashtable.put(str, a2);
                }
            } finally {
            }
        }
        return a2;
    }

    public abstract na3 C(SecureRandom secureRandom);

    public boolean D(int i) {
        if (i == 0) {
            return true;
        }
        return false;
    }

    public jb3 E(BigInteger bigInteger, BigInteger bigInteger2) {
        jb3 g = g(bigInteger, bigInteger2);
        if (g.w()) {
            return g;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    protected void a(jb3 jb3Var) {
        if (jb3Var != null && this == jb3Var.i()) {
            return;
        }
        throw new IllegalArgumentException("'point' must be non-null and on this curve");
    }

    protected void b(jb3[] jb3VarArr, int i, int i2) {
        if (jb3VarArr != null) {
            if (i >= 0 && i2 >= 0 && i <= jb3VarArr.length - i2) {
                for (int i3 = 0; i3 < i2; i3++) {
                    jb3 jb3Var = jb3VarArr[i + i3];
                    if (jb3Var != null && this != jb3Var.i()) {
                        throw new IllegalArgumentException("'points' entries must be null or on this curve");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("invalid range specified for 'points'");
        }
        throw new IllegalArgumentException("'points' cannot be null");
    }

    protected abstract ea3 c();

    public synchronized d d() {
        return new d(this.f, this.g, this.h);
    }

    public za3 e(jb3[] jb3VarArr, int i, int i2) {
        int i3;
        int t = (t() + 7) >>> 3;
        byte[] bArr = new byte[i2 * t * 2];
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            jb3 jb3Var = jb3VarArr[i + i5];
            byte[] byteArray = jb3Var.n().t().toByteArray();
            byte[] byteArray2 = jb3Var.o().t().toByteArray();
            int i6 = 1;
            if (byteArray.length > t) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            int length = byteArray.length - i3;
            if (byteArray2.length <= t) {
                i6 = 0;
            }
            int length2 = byteArray2.length - i6;
            int i7 = i4 + t;
            System.arraycopy(byteArray, i3, bArr, i7 - length, length);
            i4 = i7 + t;
            System.arraycopy(byteArray2, i6, bArr, i4 - length2, length2);
        }
        return new a(i2, t, bArr);
    }

    public boolean equals(Object obj) {
        if (this != obj && (!(obj instanceof ea3) || !l((ea3) obj))) {
            return false;
        }
        return true;
    }

    protected bb3 f() {
        ma3 ma3Var = this.g;
        if (ma3Var instanceof la4) {
            return new ma4(this, (la4) ma3Var);
        }
        return new l2c();
    }

    public jb3 g(BigInteger bigInteger, BigInteger bigInteger2) {
        return h(m(bigInteger), m(bigInteger2));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract jb3 h(na3 na3Var, na3 na3Var2);

    public int hashCode() {
        return (s().hashCode() ^ g65.c(n().t().hashCode(), 8)) ^ g65.c(o().t().hashCode(), 16);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract jb3 i(na3 na3Var, na3 na3Var2, na3[] na3VarArr);

    public jb3 j(byte[] bArr) {
        jb3 u;
        int t = (t() + 7) / 8;
        boolean z = false;
        byte b2 = bArr[0];
        if (b2 != 0) {
            if (b2 != 2 && b2 != 3) {
                if (b2 != 4) {
                    if (b2 != 6 && b2 != 7) {
                        throw new IllegalArgumentException("Invalid point encoding 0x" + Integer.toString(b2, 16));
                    } else if (bArr.length == (t * 2) + 1) {
                        BigInteger h = db0.h(bArr, 1, t);
                        BigInteger h2 = db0.h(bArr, t + 1, t);
                        boolean testBit = h2.testBit(0);
                        if (b2 == 7) {
                            z = true;
                        }
                        if (testBit == z) {
                            u = E(h, h2);
                        } else {
                            throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                        }
                    } else {
                        throw new IllegalArgumentException("Incorrect length for hybrid encoding");
                    }
                } else if (bArr.length == (t * 2) + 1) {
                    u = E(db0.h(bArr, 1, t), db0.h(bArr, t + 1, t));
                } else {
                    throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
                }
            } else if (bArr.length == t + 1) {
                u = k(b2 & 1, db0.h(bArr, 1, t));
                if (!u.t(true, true)) {
                    throw new IllegalArgumentException("Invalid point");
                }
            } else {
                throw new IllegalArgumentException("Incorrect length for compressed encoding");
            }
        } else if (bArr.length == 1) {
            u = u();
        } else {
            throw new IllegalArgumentException("Incorrect length for infinity encoding");
        }
        if (b2 != 0 && u.u()) {
            throw new IllegalArgumentException("Invalid infinity encoding");
        }
        return u;
    }

    protected abstract jb3 k(int i, BigInteger bigInteger);

    public boolean l(ea3 ea3Var) {
        if (this != ea3Var && (ea3Var == null || !s().equals(ea3Var.s()) || !n().t().equals(ea3Var.n().t()) || !o().t().equals(ea3Var.o().t()))) {
            return false;
        }
        return true;
    }

    public abstract na3 m(BigInteger bigInteger);

    public na3 n() {
        return this.b;
    }

    public na3 o() {
        return this.c;
    }

    public BigInteger p() {
        return this.e;
    }

    public int q() {
        return this.f;
    }

    public ma3 r() {
        return this.g;
    }

    public iv3 s() {
        return this.a;
    }

    public abstract int t();

    public abstract jb3 u();

    public bb3 v() {
        if (this.h == null) {
            this.h = f();
        }
        return this.h;
    }

    public BigInteger w() {
        return this.d;
    }

    public jb3 x(jb3 jb3Var) {
        if (this == jb3Var.i()) {
            return jb3Var;
        }
        if (jb3Var.u()) {
            return u();
        }
        jb3 A = jb3Var.A();
        return g(A.q().t(), A.r().t());
    }

    public abstract boolean y(BigInteger bigInteger);

    public void z(jb3[] jb3VarArr) {
        A(jb3VarArr, 0, jb3VarArr.length, null);
    }
}
