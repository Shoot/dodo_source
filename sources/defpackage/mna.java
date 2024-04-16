package defpackage;

import ch.qos.logback.core.net.SyslogConstants;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: mna  reason: default package */
/* loaded from: classes3.dex */
public class mna implements sc6 {
    private static final Hashtable j = new Hashtable();
    final pfb a;
    private final int b;
    long[] c;
    private long[] d;
    private byte[] e;
    private b[] f;
    private b[] g;
    private final c h;
    private final byte[] i;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mna$a */
    /* loaded from: classes3.dex */
    public static class a {
        private byte[] a;

        public a(long j) {
            byte[] bArr = new byte[32];
            this.a = bArr;
            bArr[0] = 83;
            bArr[1] = 72;
            bArr[2] = 65;
            bArr[3] = 51;
            bArr[4] = 1;
            bArr[5] = 0;
            pfb.m(j, bArr, 8);
        }

        public byte[] a() {
            return this.a;
        }
    }

    /* renamed from: mna$b */
    /* loaded from: classes3.dex */
    public static class b {
        private int a;
        private byte[] b;

        public b(int i, byte[] bArr) {
            this.a = i;
            this.b = bArr;
        }

        public int a() {
            return this.a;
        }

        public byte[] b() {
            return this.b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mna$c */
    /* loaded from: classes3.dex */
    public class c {
        private final d a = new d();
        private byte[] b;
        private int c;
        private long[] d;

        public c(int i) {
            byte[] bArr = new byte[i];
            this.b = bArr;
            this.d = new long[bArr.length / 8];
        }

        private void b(long[] jArr) {
            long[] jArr2;
            mna mnaVar = mna.this;
            mnaVar.a.h(true, mnaVar.c, this.a.c());
            int i = 0;
            while (true) {
                jArr2 = this.d;
                if (i >= jArr2.length) {
                    break;
                }
                jArr2[i] = pfb.g(this.b, i * 8);
                i++;
            }
            mna.this.a.i(jArr2, jArr);
            for (int i2 = 0; i2 < jArr.length; i2++) {
                jArr[i2] = jArr[i2] ^ this.d[i2];
            }
        }

        public void a(long[] jArr) {
            int i = this.c;
            while (true) {
                byte[] bArr = this.b;
                if (i < bArr.length) {
                    bArr[i] = 0;
                    i++;
                } else {
                    this.a.h(true);
                    b(jArr);
                    return;
                }
            }
        }

        public void c(int i) {
            this.a.f();
            this.a.j(i);
            this.c = 0;
        }

        public void d(c cVar) {
            this.b = tr.i(cVar.b, this.b);
            this.c = cVar.c;
            this.d = tr.m(cVar.d, this.d);
            this.a.g(cVar.a);
        }

        public void e(byte[] bArr, int i, int i2, long[] jArr) {
            int i3 = 0;
            while (i2 > i3) {
                if (this.c == this.b.length) {
                    b(jArr);
                    this.a.i(false);
                    this.c = 0;
                }
                int min = Math.min(i2 - i3, this.b.length - this.c);
                System.arraycopy(bArr, i + i3, this.b, this.c, min);
                i3 += min;
                this.c += min;
                this.a.a(min);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mna$d */
    /* loaded from: classes3.dex */
    public static class d {
        private long[] a = new long[2];
        private boolean b;

        public d() {
            f();
        }

        public void a(int i) {
            if (this.b) {
                long[] jArr = new long[3];
                long[] jArr2 = this.a;
                jArr[0] = jArr2[0] & 4294967295L;
                jArr[1] = (jArr2[0] >>> 32) & 4294967295L;
                jArr[2] = jArr2[1] & 4294967295L;
                long j = i;
                for (int i2 = 0; i2 < 3; i2++) {
                    long j2 = j + jArr[i2];
                    jArr[i2] = j2;
                    j = j2 >>> 32;
                }
                long[] jArr3 = this.a;
                jArr3[0] = ((jArr[1] & 4294967295L) << 32) | (jArr[0] & 4294967295L);
                jArr3[1] = (jArr[2] & 4294967295L) | (jArr3[1] & (-4294967296L));
                return;
            }
            long[] jArr4 = this.a;
            long j3 = jArr4[0] + i;
            jArr4[0] = j3;
            if (j3 > 9223372034707292160L) {
                this.b = true;
            }
        }

        public int b() {
            return (int) ((this.a[1] >>> 56) & 63);
        }

        public long[] c() {
            return this.a;
        }

        public boolean d() {
            if ((this.a[1] & Long.MIN_VALUE) != 0) {
                return true;
            }
            return false;
        }

        public boolean e() {
            if ((this.a[1] & 4611686018427387904L) != 0) {
                return true;
            }
            return false;
        }

        public void f() {
            long[] jArr = this.a;
            jArr[0] = 0;
            jArr[1] = 0;
            this.b = false;
            i(true);
        }

        public void g(d dVar) {
            this.a = tr.m(dVar.a, this.a);
            this.b = dVar.b;
        }

        public void h(boolean z) {
            if (z) {
                long[] jArr = this.a;
                jArr[1] = jArr[1] | Long.MIN_VALUE;
                return;
            }
            long[] jArr2 = this.a;
            jArr2[1] = jArr2[1] & Long.MAX_VALUE;
        }

        public void i(boolean z) {
            if (z) {
                long[] jArr = this.a;
                jArr[1] = jArr[1] | 4611686018427387904L;
                return;
            }
            long[] jArr2 = this.a;
            jArr2[1] = jArr2[1] & (-4611686018427387905L);
        }

        public void j(int i) {
            long[] jArr = this.a;
            jArr[1] = (jArr[1] & (-274877906944L)) | ((i & 63) << 56);
        }

        public String toString() {
            return b() + " first: " + e() + ", final: " + d();
        }
    }

    static {
        l(256, 128, new long[]{-2228972824489528736L, -8629553674646093540L, 1155188648486244218L, -3677226592081559102L});
        l(256, SyslogConstants.LOG_LOCAL4, new long[]{1450197650740764312L, 3081844928540042640L, -3136097061834271170L, 3301952811952417661L});
        l(256, 224, new long[]{-4176654842910610933L, -8688192972455077604L, -7364642305011795836L, 4056579644589979102L});
        l(256, 256, new long[]{-243853671043386295L, 3443677322885453875L, -5531612722399640561L, 7662005193972177513L});
        l(512, 128, new long[]{-6288014694233956526L, 2204638249859346602L, 3502419045458743507L, -4829063503441264548L, 983504137758028059L, 1880512238245786339L, -6715892782214108542L, 7602827311880509485L});
        l(512, SyslogConstants.LOG_LOCAL4, new long[]{2934123928682216849L, -4399710721982728305L, 1684584802963255058L, 5744138295201861711L, 2444857010922934358L, -2807833639722848072L, -5121587834665610502L, 118355523173251694L});
        l(512, 224, new long[]{-3688341020067007964L, -3772225436291745297L, -8300862168937575580L, 4146387520469897396L, 1106145742801415120L, 7455425944880474941L, -7351063101234211863L, -7048981346965512457L});
        l(512, 384, new long[]{-6631894876634615969L, -5692838220127733084L, -7099962856338682626L, -2911352911530754598L, 2000907093792408677L, 9140007292425499655L, 6093301768906360022L, 2769176472213098488L});
        l(512, 512, new long[]{5261240102383538638L, 978932832955457283L, -8083517948103779378L, -7339365279355032399L, 6752626034097301424L, -1531723821829733388L, -7417126464950782685L, -5901786942805128141L});
    }

    public mna(int i, int i2) {
        this.i = new byte[1];
        if (i2 % 8 != 0) {
            throw new IllegalArgumentException("Output size must be a multiple of 8 bits. :" + i2);
        }
        this.b = i2 / 8;
        pfb pfbVar = new pfb(i);
        this.a = pfbVar;
        this.h = new c(pfbVar.a());
    }

    private void c() {
        if (this.h != null) {
            return;
        }
        throw new IllegalArgumentException("Skein engine is not initialised.");
    }

    private static b[] d(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null) {
            return null;
        }
        if (bVarArr2 == null || bVarArr2.length != bVarArr.length) {
            bVarArr2 = new b[bVarArr.length];
        }
        System.arraycopy(bVarArr, 0, bVarArr2, 0, bVarArr2.length);
        return bVarArr2;
    }

    private void e(mna mnaVar) {
        this.h.d(mnaVar.h);
        this.c = tr.m(mnaVar.c, this.c);
        this.d = tr.m(mnaVar.d, this.d);
        this.e = tr.i(mnaVar.e, this.e);
        this.f = d(mnaVar.f, this.f);
        this.g = d(mnaVar.g, this.g);
    }

    private void f() {
        long[] jArr = (long[]) j.get(u(h(), i()));
        int i = 0;
        if (this.e == null && jArr != null) {
            this.c = tr.l(jArr);
        } else {
            this.c = new long[h() / 8];
            byte[] bArr = this.e;
            if (bArr != null) {
                p(0, bArr);
            }
            p(4, new a(this.b * 8).a());
        }
        if (this.f != null) {
            while (true) {
                b[] bVarArr = this.f;
                if (i >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i];
                p(bVar.a(), bVar.b());
                i++;
            }
        }
        this.d = tr.l(this.c);
    }

    private void k(Hashtable hashtable) {
        Enumeration keys = hashtable.keys();
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        while (keys.hasMoreElements()) {
            Integer num = (Integer) keys.nextElement();
            byte[] bArr = (byte[]) hashtable.get(num);
            if (num.intValue() == 0) {
                this.e = bArr;
            } else if (num.intValue() < 48) {
                vector.addElement(new b(num.intValue(), bArr));
            } else {
                vector2.addElement(new b(num.intValue(), bArr));
            }
        }
        b[] bVarArr = new b[vector.size()];
        this.f = bVarArr;
        vector.copyInto(bVarArr);
        o(this.f);
        b[] bVarArr2 = new b[vector2.size()];
        this.g = bVarArr2;
        vector2.copyInto(bVarArr2);
        o(this.g);
    }

    private static void l(int i, int i2, long[] jArr) {
        j.put(u(i / 8, i2 / 8), jArr);
    }

    private void m(long j2, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[8];
        pfb.m(j2, bArr2, 0);
        long[] jArr = new long[this.c.length];
        r(63);
        this.h.e(bArr2, 0, 8, jArr);
        this.h.a(jArr);
        int i3 = (i2 + 7) / 8;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i4 * 8;
            int min = Math.min(8, i2 - i5);
            if (min == 8) {
                pfb.m(jArr[i4], bArr, i5 + i);
            } else {
                pfb.m(jArr[i4], bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i5 + i, min);
            }
        }
    }

    private static void o(b[] bVarArr) {
        if (bVarArr == null) {
            return;
        }
        for (int i = 1; i < bVarArr.length; i++) {
            b bVar = bVarArr[i];
            int i2 = i;
            while (i2 > 0) {
                int i3 = i2 - 1;
                if (bVar.a() < bVarArr[i3].a()) {
                    bVarArr[i2] = bVarArr[i3];
                    i2 = i3;
                }
            }
            bVarArr[i2] = bVar;
        }
    }

    private void p(int i, byte[] bArr) {
        r(i);
        this.h.e(bArr, 0, bArr.length, this.c);
        q();
    }

    private void q() {
        this.h.a(this.c);
    }

    private void r(int i) {
        this.h.c(i);
    }

    private static Integer u(int i, int i2) {
        return g65.d(i | (i2 << 16));
    }

    @Override // defpackage.sc6
    public sc6 a() {
        return new mna(this);
    }

    @Override // defpackage.sc6
    public void b(sc6 sc6Var) {
        mna mnaVar = (mna) sc6Var;
        if (h() == mnaVar.h() && this.b == mnaVar.b) {
            e(mnaVar);
            return;
        }
        throw new IllegalArgumentException("Incompatible parameters in provided SkeinEngine.");
    }

    public int g(byte[] bArr, int i) {
        c();
        if (bArr.length >= this.b + i) {
            q();
            if (this.g != null) {
                int i2 = 0;
                while (true) {
                    b[] bVarArr = this.g;
                    if (i2 >= bVarArr.length) {
                        break;
                    }
                    b bVar = bVarArr[i2];
                    p(bVar.a(), bVar.b());
                    i2++;
                }
            }
            int h = h();
            int i3 = ((this.b + h) - 1) / h;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = i4 * h;
                m(i4, bArr, i + i5, Math.min(h, this.b - i5));
            }
            n();
            return this.b;
        }
        throw new OutputLengthException("Output buffer is too short to hold output");
    }

    public int h() {
        return this.a.a();
    }

    public int i() {
        return this.b;
    }

    public void j(pna pnaVar) {
        this.c = null;
        this.e = null;
        this.f = null;
        this.g = null;
        if (pnaVar != null) {
            if (pnaVar.a().length >= 16) {
                k(pnaVar.b());
            } else {
                throw new IllegalArgumentException("Skein key must be at least 128 bits.");
            }
        }
        f();
        r(48);
    }

    public void n() {
        long[] jArr = this.d;
        long[] jArr2 = this.c;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        r(48);
    }

    public void s(byte b2) {
        byte[] bArr = this.i;
        bArr[0] = b2;
        t(bArr, 0, 1);
    }

    public void t(byte[] bArr, int i, int i2) {
        c();
        this.h.e(bArr, i, i2, this.c);
    }

    public mna(mna mnaVar) {
        this(mnaVar.h() * 8, mnaVar.i() * 8);
        e(mnaVar);
    }
}
