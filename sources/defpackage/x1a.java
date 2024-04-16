package defpackage;

import defpackage.ea3;
import java.math.BigInteger;
import org.bouncycastle.util.encoders.b;
/* renamed from: x1a  reason: default package */
/* loaded from: classes3.dex */
public class x1a extends ea3.b {
    private static final na3[] k = {new w1a(da3.b)};
    protected y1a j;

    /* renamed from: x1a$a */
    /* loaded from: classes3.dex */
    class a extends g1 {
        final /* synthetic */ int a;
        final /* synthetic */ long[] b;

        a(int i, long[] jArr) {
            this.a = i;
            this.b = jArr;
        }

        private jb3 d(long[] jArr, long[] jArr2) {
            return x1a.this.i(new w1a(jArr), new w1a(jArr2), x1a.k);
        }

        @Override // defpackage.za3
        public int a() {
            return this.a;
        }

        @Override // defpackage.za3
        public jb3 b(int i) {
            long[] c = zs6.c();
            long[] c2 = zs6.c();
            int i2 = 0;
            for (int i3 = 0; i3 < this.a; i3++) {
                long j = ((i3 ^ i) - 1) >> 31;
                for (int i4 = 0; i4 < 5; i4++) {
                    long j2 = c[i4];
                    long[] jArr = this.b;
                    c[i4] = j2 ^ (jArr[i2 + i4] & j);
                    c2[i4] = c2[i4] ^ (jArr[(i2 + 5) + i4] & j);
                }
                i2 += 10;
            }
            return d(c, c2);
        }

        @Override // defpackage.za3
        public jb3 c(int i) {
            long[] c = zs6.c();
            long[] c2 = zs6.c();
            int i2 = i * 10;
            for (int i3 = 0; i3 < 5; i3++) {
                long[] jArr = this.b;
                c[i3] = jArr[i2 + i3];
                c2[i3] = jArr[5 + i2 + i3];
            }
            return d(c, c2);
        }
    }

    public x1a() {
        super(283, 5, 7, 12);
        this.j = new y1a(this, null, null);
        this.b = m(BigInteger.valueOf(0L));
        this.c = m(BigInteger.valueOf(1L));
        this.d = new BigInteger(1, b.b("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE9AE2ED07577265DFF7F94451E061E163C61"));
        this.e = BigInteger.valueOf(4L);
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
        return true;
    }

    @Override // defpackage.ea3
    protected ea3 c() {
        return new x1a();
    }

    @Override // defpackage.ea3
    public za3 e(jb3[] jb3VarArr, int i, int i2) {
        long[] jArr = new long[i2 * 10];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            jb3 jb3Var = jb3VarArr[i + i4];
            zs6.a(((w1a) jb3Var.n()).g, 0, jArr, i3);
            zs6.a(((w1a) jb3Var.o()).g, 0, jArr, i3 + 5);
            i3 += 10;
        }
        return new a(i2, jArr);
    }

    @Override // defpackage.ea3
    protected bb3 f() {
        return new s2c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea3
    public jb3 h(na3 na3Var, na3 na3Var2) {
        return new y1a(this, na3Var, na3Var2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea3
    public jb3 i(na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
        return new y1a(this, na3Var, na3Var2, na3VarArr);
    }

    @Override // defpackage.ea3
    public na3 m(BigInteger bigInteger) {
        return new w1a(bigInteger);
    }

    @Override // defpackage.ea3
    public int t() {
        return 283;
    }

    @Override // defpackage.ea3
    public jb3 u() {
        return this.j;
    }
}
