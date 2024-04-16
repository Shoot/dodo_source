package defpackage;

import defpackage.ea3;
import java.math.BigInteger;
import org.bouncycastle.util.encoders.b;
/* renamed from: v0a  reason: default package */
/* loaded from: classes3.dex */
public class v0a extends ea3.b {
    private static final na3[] k = {new s0a(da3.b)};
    protected w0a j;

    /* renamed from: v0a$a */
    /* loaded from: classes3.dex */
    class a extends g1 {
        final /* synthetic */ int a;
        final /* synthetic */ long[] b;

        a(int i, long[] jArr) {
            this.a = i;
            this.b = jArr;
        }

        private jb3 d(long[] jArr, long[] jArr2) {
            return v0a.this.i(new s0a(jArr), new s0a(jArr2), v0a.k);
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

    public v0a() {
        super(131, 2, 3, 8);
        this.j = new w0a(this, null, null);
        this.b = m(new BigInteger(1, b.b("03E5A88919D7CAFCBF415F07C2176573B2")));
        this.c = m(new BigInteger(1, b.b("04B8266A46C55657AC734CE38F018F2192")));
        this.d = new BigInteger(1, b.b("0400000000000000016954A233049BA98F"));
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
        return new v0a();
    }

    @Override // defpackage.ea3
    public za3 e(jb3[] jb3VarArr, int i, int i2) {
        long[] jArr = new long[i2 * 6];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            jb3 jb3Var = jb3VarArr[i + i4];
            ws6.f(((s0a) jb3Var.n()).g, 0, jArr, i3);
            ws6.f(((s0a) jb3Var.o()).g, 0, jArr, i3 + 3);
            i3 += 6;
        }
        return new a(i2, jArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea3
    public jb3 h(na3 na3Var, na3 na3Var2) {
        return new w0a(this, na3Var, na3Var2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea3
    public jb3 i(na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
        return new w0a(this, na3Var, na3Var2, na3VarArr);
    }

    @Override // defpackage.ea3
    public na3 m(BigInteger bigInteger) {
        return new s0a(bigInteger);
    }

    @Override // defpackage.ea3
    public int t() {
        return 131;
    }

    @Override // defpackage.ea3
    public jb3 u() {
        return this.j;
    }
}
