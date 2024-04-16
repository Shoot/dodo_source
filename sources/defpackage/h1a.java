package defpackage;

import defpackage.ea3;
import java.math.BigInteger;
import org.bouncycastle.util.encoders.b;
/* renamed from: h1a  reason: default package */
/* loaded from: classes3.dex */
public class h1a extends ea3.b {
    private static final na3[] k = {new g1a(da3.b)};
    protected i1a j;

    /* renamed from: h1a$a */
    /* loaded from: classes3.dex */
    class a extends g1 {
        final /* synthetic */ int a;
        final /* synthetic */ long[] b;

        a(int i, long[] jArr) {
            this.a = i;
            this.b = jArr;
        }

        private jb3 d(long[] jArr, long[] jArr2) {
            return h1a.this.i(new g1a(jArr), new g1a(jArr2), h1a.k);
        }

        @Override // defpackage.za3
        public int a() {
            return this.a;
        }

        @Override // defpackage.za3
        public jb3 b(int i) {
            long[] j = ys6.j();
            long[] j2 = ys6.j();
            int i2 = 0;
            for (int i3 = 0; i3 < this.a; i3++) {
                long j3 = ((i3 ^ i) - 1) >> 31;
                for (int i4 = 0; i4 < 4; i4++) {
                    long j4 = j[i4];
                    long[] jArr = this.b;
                    j[i4] = j4 ^ (jArr[i2 + i4] & j3);
                    j2[i4] = j2[i4] ^ (jArr[(i2 + 4) + i4] & j3);
                }
                i2 += 8;
            }
            return d(j, j2);
        }

        @Override // defpackage.za3
        public jb3 c(int i) {
            long[] j = ys6.j();
            long[] j2 = ys6.j();
            int i2 = i * 8;
            for (int i3 = 0; i3 < 4; i3++) {
                long[] jArr = this.b;
                j[i3] = jArr[i2 + i3];
                j2[i3] = jArr[4 + i2 + i3];
            }
            return d(j, j2);
        }
    }

    public h1a() {
        super(193, 15, 0, 0);
        this.j = new i1a(this, null, null);
        this.b = m(new BigInteger(1, b.b("0017858FEB7A98975169E171F77B4087DE098AC8A911DF7B01")));
        this.c = m(new BigInteger(1, b.b("00FDFB49BFE6C3A89FACADAA7A1E5BBC7CC1C2E5D831478814")));
        this.d = new BigInteger(1, b.b("01000000000000000000000000C7F34A778F443ACC920EBA49"));
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
        return new h1a();
    }

    @Override // defpackage.ea3
    public za3 e(jb3[] jb3VarArr, int i, int i2) {
        long[] jArr = new long[i2 * 8];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            jb3 jb3Var = jb3VarArr[i + i4];
            ys6.g(((g1a) jb3Var.n()).g, 0, jArr, i3);
            ys6.g(((g1a) jb3Var.o()).g, 0, jArr, i3 + 4);
            i3 += 8;
        }
        return new a(i2, jArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea3
    public jb3 h(na3 na3Var, na3 na3Var2) {
        return new i1a(this, na3Var, na3Var2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea3
    public jb3 i(na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
        return new i1a(this, na3Var, na3Var2, na3VarArr);
    }

    @Override // defpackage.ea3
    public na3 m(BigInteger bigInteger) {
        return new g1a(bigInteger);
    }

    @Override // defpackage.ea3
    public int t() {
        return 193;
    }

    @Override // defpackage.ea3
    public jb3 u() {
        return this.j;
    }
}
