package defpackage;

import defpackage.ea3;
import java.math.BigInteger;
import org.bouncycastle.util.encoders.b;
/* renamed from: z0a  reason: default package */
/* loaded from: classes3.dex */
public class z0a extends ea3.b {
    private static final na3[] k = {new y0a(da3.b)};
    protected a1a j;

    /* renamed from: z0a$a */
    /* loaded from: classes3.dex */
    class a extends g1 {
        final /* synthetic */ int a;
        final /* synthetic */ long[] b;

        a(int i, long[] jArr) {
            this.a = i;
            this.b = jArr;
        }

        private jb3 d(long[] jArr, long[] jArr2) {
            return z0a.this.i(new y0a(jArr), new y0a(jArr2), z0a.k);
        }

        @Override // defpackage.za3
        public int a() {
            return this.a;
        }

        @Override // defpackage.za3
        public jb3 b(int i) {
            long[] i2 = ws6.i();
            long[] i3 = ws6.i();
            int i4 = 0;
            for (int i5 = 0; i5 < this.a; i5++) {
                long j = ((i5 ^ i) - 1) >> 31;
                for (int i6 = 0; i6 < 3; i6++) {
                    long j2 = i2[i6];
                    long[] jArr = this.b;
                    i2[i6] = j2 ^ (jArr[i4 + i6] & j);
                    i3[i6] = i3[i6] ^ (jArr[(i4 + 3) + i6] & j);
                }
                i4 += 6;
            }
            return d(i2, i3);
        }

        @Override // defpackage.za3
        public jb3 c(int i) {
            long[] i2 = ws6.i();
            long[] i3 = ws6.i();
            int i4 = i * 6;
            for (int i5 = 0; i5 < 3; i5++) {
                long[] jArr = this.b;
                i2[i5] = jArr[i4 + i5];
                i3[i5] = jArr[3 + i4 + i5];
            }
            return d(i2, i3);
        }
    }

    public z0a() {
        super(163, 3, 6, 7);
        this.j = new a1a(this, null, null);
        na3 m = m(BigInteger.valueOf(1L));
        this.b = m;
        this.c = m;
        this.d = new BigInteger(1, b.b("04000000000000000000020108A2E0CC0D99F8A5EF"));
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
        return true;
    }

    @Override // defpackage.ea3
    protected ea3 c() {
        return new z0a();
    }

    @Override // defpackage.ea3
    public za3 e(jb3[] jb3VarArr, int i, int i2) {
        long[] jArr = new long[i2 * 6];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            jb3 jb3Var = jb3VarArr[i + i4];
            ws6.f(((y0a) jb3Var.n()).g, 0, jArr, i3);
            ws6.f(((y0a) jb3Var.o()).g, 0, jArr, i3 + 3);
            i3 += 6;
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
        return new a1a(this, na3Var, na3Var2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea3
    public jb3 i(na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
        return new a1a(this, na3Var, na3Var2, na3VarArr);
    }

    @Override // defpackage.ea3
    public na3 m(BigInteger bigInteger) {
        return new y0a(bigInteger);
    }

    @Override // defpackage.ea3
    public int t() {
        return 163;
    }

    @Override // defpackage.ea3
    public jb3 u() {
        return this.j;
    }
}
