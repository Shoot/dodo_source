package defpackage;

import defpackage.ea3;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.util.encoders.b;
/* renamed from: d0a  reason: default package */
/* loaded from: classes3.dex */
public class d0a extends ea3.c {
    public static final BigInteger j = f0a.h;
    private static final na3[] k = {new f0a(da3.b)};
    protected g0a i;

    /* renamed from: d0a$a */
    /* loaded from: classes3.dex */
    class a extends g1 {
        final /* synthetic */ int a;
        final /* synthetic */ int[] b;

        a(int i, int[] iArr) {
            this.a = i;
            this.b = iArr;
        }

        private jb3 d(int[] iArr, int[] iArr2) {
            return d0a.this.i(new f0a(iArr), new f0a(iArr2), d0a.k);
        }

        @Override // defpackage.za3
        public int a() {
            return this.a;
        }

        @Override // defpackage.za3
        public jb3 b(int i) {
            int[] k = et6.k(12);
            int[] k2 = et6.k(12);
            int i2 = 0;
            for (int i3 = 0; i3 < this.a; i3++) {
                int i4 = ((i3 ^ i) - 1) >> 31;
                for (int i5 = 0; i5 < 12; i5++) {
                    int i6 = k[i5];
                    int[] iArr = this.b;
                    k[i5] = i6 ^ (iArr[i2 + i5] & i4);
                    k2[i5] = k2[i5] ^ (iArr[(i2 + 12) + i5] & i4);
                }
                i2 += 24;
            }
            return d(k, k2);
        }

        @Override // defpackage.za3
        public jb3 c(int i) {
            int[] k = et6.k(12);
            int[] k2 = et6.k(12);
            int i2 = i * 24;
            for (int i3 = 0; i3 < 12; i3++) {
                int[] iArr = this.b;
                k[i3] = iArr[i2 + i3];
                k2[i3] = iArr[i2 + 12 + i3];
            }
            return d(k, k2);
        }
    }

    public d0a() {
        super(j);
        this.i = new g0a(this, null, null);
        this.b = m(new BigInteger(1, b.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC")));
        this.c = m(new BigInteger(1, b.b("B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF")));
        this.d = new BigInteger(1, b.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.ea3.c, defpackage.ea3
    public na3 C(SecureRandom secureRandom) {
        int[] k2 = et6.k(12);
        e0a.k(secureRandom, k2);
        return new f0a(k2);
    }

    @Override // defpackage.ea3
    public boolean D(int i) {
        if (i != 2) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ea3
    protected ea3 c() {
        return new d0a();
    }

    @Override // defpackage.ea3
    public za3 e(jb3[] jb3VarArr, int i, int i2) {
        int[] iArr = new int[i2 * 24];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            jb3 jb3Var = jb3VarArr[i + i4];
            et6.j(12, ((f0a) jb3Var.n()).g, 0, iArr, i3);
            et6.j(12, ((f0a) jb3Var.o()).g, 0, iArr, i3 + 12);
            i3 += 24;
        }
        return new a(i2, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea3
    public jb3 h(na3 na3Var, na3 na3Var2) {
        return new g0a(this, na3Var, na3Var2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea3
    public jb3 i(na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
        return new g0a(this, na3Var, na3Var2, na3VarArr);
    }

    @Override // defpackage.ea3
    public na3 m(BigInteger bigInteger) {
        return new f0a(bigInteger);
    }

    @Override // defpackage.ea3
    public int t() {
        return j.bitLength();
    }

    @Override // defpackage.ea3
    public jb3 u() {
        return this.i;
    }
}
