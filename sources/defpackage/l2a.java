package defpackage;

import defpackage.ea3;
import java.math.BigInteger;
import org.bouncycastle.util.encoders.b;
/* renamed from: l2a  reason: default package */
/* loaded from: classes3.dex */
public class l2a extends ea3.b {
    private static final na3[] k = {new i2a(da3.b)};
    static final i2a l;
    static final i2a m;
    protected m2a j;

    /* renamed from: l2a$a */
    /* loaded from: classes3.dex */
    class a extends g1 {
        final /* synthetic */ int a;
        final /* synthetic */ long[] b;

        a(int i, long[] jArr) {
            this.a = i;
            this.b = jArr;
        }

        private jb3 d(long[] jArr, long[] jArr2) {
            return l2a.this.i(new i2a(jArr), new i2a(jArr2), l2a.k);
        }

        @Override // defpackage.za3
        public int a() {
            return this.a;
        }

        @Override // defpackage.za3
        public jb3 b(int i) {
            long[] c = dt6.c();
            long[] c2 = dt6.c();
            int i2 = 0;
            for (int i3 = 0; i3 < this.a; i3++) {
                long j = ((i3 ^ i) - 1) >> 31;
                for (int i4 = 0; i4 < 9; i4++) {
                    long j2 = c[i4];
                    long[] jArr = this.b;
                    c[i4] = j2 ^ (jArr[i2 + i4] & j);
                    c2[i4] = c2[i4] ^ (jArr[(i2 + 9) + i4] & j);
                }
                i2 += 18;
            }
            return d(c, c2);
        }

        @Override // defpackage.za3
        public jb3 c(int i) {
            long[] c = dt6.c();
            long[] c2 = dt6.c();
            int i2 = i * 18;
            for (int i3 = 0; i3 < 9; i3++) {
                long[] jArr = this.b;
                c[i3] = jArr[i2 + i3];
                c2[i3] = jArr[9 + i2 + i3];
            }
            return d(c, c2);
        }
    }

    static {
        i2a i2aVar = new i2a(new BigInteger(1, b.b("02F40E7E2221F295DE297117B7F3D62F5C6A97FFCB8CEFF1CD6BA8CE4A9A18AD84FFABBD8EFA59332BE7AD6756A66E294AFD185A78FF12AA520E4DE739BACA0C7FFEFF7F2955727A")));
        l = i2aVar;
        m = (i2a) i2aVar.n();
    }

    public l2a() {
        super(571, 2, 5, 10);
        this.j = new m2a(this, null, null);
        this.b = m(BigInteger.valueOf(1L));
        this.c = l;
        this.d = new BigInteger(1, b.b("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE661CE18FF55987308059B186823851EC7DD9CA1161DE93D5174D66E8382E9BB2FE84E47"));
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
        return new l2a();
    }

    @Override // defpackage.ea3
    public za3 e(jb3[] jb3VarArr, int i, int i2) {
        long[] jArr = new long[i2 * 18];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            jb3 jb3Var = jb3VarArr[i + i4];
            dt6.a(((i2a) jb3Var.n()).g, 0, jArr, i3);
            dt6.a(((i2a) jb3Var.o()).g, 0, jArr, i3 + 9);
            i3 += 18;
        }
        return new a(i2, jArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea3
    public jb3 h(na3 na3Var, na3 na3Var2) {
        return new m2a(this, na3Var, na3Var2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea3
    public jb3 i(na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
        return new m2a(this, na3Var, na3Var2, na3VarArr);
    }

    @Override // defpackage.ea3
    public na3 m(BigInteger bigInteger) {
        return new i2a(bigInteger);
    }

    @Override // defpackage.ea3
    public int t() {
        return 571;
    }

    @Override // defpackage.ea3
    public jb3 u() {
        return this.j;
    }
}
