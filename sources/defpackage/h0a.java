package defpackage;

import defpackage.ea3;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.util.encoders.b;
/* renamed from: h0a  reason: default package */
/* loaded from: classes3.dex */
public class h0a extends ea3.c {
    public static final BigInteger j = j0a.h;
    private static final na3[] k = {new j0a(da3.b)};
    protected k0a i;

    /* renamed from: h0a$a */
    /* loaded from: classes3.dex */
    class a extends g1 {
        final /* synthetic */ int a;
        final /* synthetic */ int[] b;

        a(int i, int[] iArr) {
            this.a = i;
            this.b = iArr;
        }

        private jb3 d(int[] iArr, int[] iArr2) {
            return h0a.this.i(new j0a(iArr), new j0a(iArr2), h0a.k);
        }

        @Override // defpackage.za3
        public int a() {
            return this.a;
        }

        @Override // defpackage.za3
        public jb3 b(int i) {
            int[] k = et6.k(17);
            int[] k2 = et6.k(17);
            int i2 = 0;
            for (int i3 = 0; i3 < this.a; i3++) {
                int i4 = ((i3 ^ i) - 1) >> 31;
                for (int i5 = 0; i5 < 17; i5++) {
                    int i6 = k[i5];
                    int[] iArr = this.b;
                    k[i5] = i6 ^ (iArr[i2 + i5] & i4);
                    k2[i5] = k2[i5] ^ (iArr[(i2 + 17) + i5] & i4);
                }
                i2 += 34;
            }
            return d(k, k2);
        }

        @Override // defpackage.za3
        public jb3 c(int i) {
            int[] k = et6.k(17);
            int[] k2 = et6.k(17);
            int i2 = i * 34;
            for (int i3 = 0; i3 < 17; i3++) {
                int i4 = k[i3];
                int[] iArr = this.b;
                k[i3] = i4 ^ iArr[i2 + i3];
                k2[i3] = k2[i3] ^ iArr[(i2 + 17) + i3];
            }
            return d(k, k2);
        }
    }

    public h0a() {
        super(j);
        this.i = new k0a(this, null, null);
        this.b = m(new BigInteger(1, b.b("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.c = m(new BigInteger(1, b.b("0051953EB9618E1C9A1F929A21A0B68540EEA2DA725B99B315F3B8B489918EF109E156193951EC7E937B1652C0BD3BB1BF073573DF883D2C34F1EF451FD46B503F00")));
        this.d = new BigInteger(1, b.b("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFA51868783BF2F966B7FCC0148F709A5D03BB5C9B8899C47AEBB6FB71E91386409"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.ea3.c, defpackage.ea3
    public na3 C(SecureRandom secureRandom) {
        int[] k2 = et6.k(17);
        i0a.k(secureRandom, k2);
        return new j0a(k2);
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
        return new h0a();
    }

    @Override // defpackage.ea3
    public za3 e(jb3[] jb3VarArr, int i, int i2) {
        int[] iArr = new int[i2 * 34];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            jb3 jb3Var = jb3VarArr[i + i4];
            et6.j(17, ((j0a) jb3Var.n()).g, 0, iArr, i3);
            et6.j(17, ((j0a) jb3Var.o()).g, 0, iArr, i3 + 17);
            i3 += 34;
        }
        return new a(i2, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea3
    public jb3 h(na3 na3Var, na3 na3Var2) {
        return new k0a(this, na3Var, na3Var2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea3
    public jb3 i(na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
        return new k0a(this, na3Var, na3Var2, na3VarArr);
    }

    @Override // defpackage.ea3
    public na3 m(BigInteger bigInteger) {
        return new j0a(bigInteger);
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
