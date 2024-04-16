package defpackage;

import defpackage.ea3;
import java.math.BigInteger;
import org.bouncycastle.util.encoders.b;
/* renamed from: p0a  reason: default package */
/* loaded from: classes3.dex */
public class p0a extends ea3.b {
    private static final na3[] k = {new m0a(da3.b)};
    protected q0a j;

    /* renamed from: p0a$a */
    /* loaded from: classes3.dex */
    class a extends g1 {
        final /* synthetic */ int a;
        final /* synthetic */ long[] b;

        a(int i, long[] jArr) {
            this.a = i;
            this.b = jArr;
        }

        private jb3 d(long[] jArr, long[] jArr2) {
            return p0a.this.i(new m0a(jArr), new m0a(jArr2), p0a.k);
        }

        @Override // defpackage.za3
        public int a() {
            return this.a;
        }

        @Override // defpackage.za3
        public jb3 b(int i) {
            long[] g = us6.g();
            long[] g2 = us6.g();
            int i2 = 0;
            for (int i3 = 0; i3 < this.a; i3++) {
                long j = ((i3 ^ i) - 1) >> 31;
                for (int i4 = 0; i4 < 2; i4++) {
                    long j2 = g[i4];
                    long[] jArr = this.b;
                    g[i4] = j2 ^ (jArr[i2 + i4] & j);
                    g2[i4] = g2[i4] ^ (jArr[(i2 + 2) + i4] & j);
                }
                i2 += 4;
            }
            return d(g, g2);
        }

        @Override // defpackage.za3
        public jb3 c(int i) {
            long[] g = us6.g();
            long[] g2 = us6.g();
            int i2 = i * 4;
            for (int i3 = 0; i3 < 2; i3++) {
                long[] jArr = this.b;
                g[i3] = jArr[i2 + i3];
                g2[i3] = jArr[2 + i2 + i3];
            }
            return d(g, g2);
        }
    }

    public p0a() {
        super(113, 9, 0, 0);
        this.j = new q0a(this, null, null);
        this.b = m(new BigInteger(1, b.b("00689918DBEC7E5A0DD6DFC0AA55C7")));
        this.c = m(new BigInteger(1, b.b("0095E9A9EC9B297BD4BF36E059184F")));
        this.d = new BigInteger(1, b.b("010000000000000108789B2496AF93"));
        this.e = BigInteger.valueOf(2L);
        this.f = 6;
    }

    @Override // defpackage.ea3
    public boolean D(int i) {
        if (i != 6) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ea3.b
    public boolean I() {
        return false;
    }

    @Override // defpackage.ea3
    protected ea3 c() {
        return new p0a();
    }

    @Override // defpackage.ea3
    public za3 e(jb3[] jb3VarArr, int i, int i2) {
        long[] jArr = new long[i2 * 4];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            jb3 jb3Var = jb3VarArr[i + i4];
            us6.d(((m0a) jb3Var.n()).g, 0, jArr, i3);
            us6.d(((m0a) jb3Var.o()).g, 0, jArr, i3 + 2);
            i3 += 4;
        }
        return new a(i2, jArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea3
    public jb3 h(na3 na3Var, na3 na3Var2) {
        return new q0a(this, na3Var, na3Var2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea3
    public jb3 i(na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
        return new q0a(this, na3Var, na3Var2, na3VarArr);
    }

    @Override // defpackage.ea3
    public na3 m(BigInteger bigInteger) {
        return new m0a(bigInteger);
    }

    @Override // defpackage.ea3
    public int t() {
        return 113;
    }

    @Override // defpackage.ea3
    public jb3 u() {
        return this.j;
    }
}
