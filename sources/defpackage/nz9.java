package defpackage;

import defpackage.ea3;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.util.encoders.b;
/* renamed from: nz9  reason: default package */
/* loaded from: classes3.dex */
public class nz9 extends ea3.c {
    public static final BigInteger j = pz9.h;
    private static final na3[] k = {new pz9(da3.b)};
    protected qz9 i;

    /* renamed from: nz9$a */
    /* loaded from: classes3.dex */
    class a extends g1 {
        final /* synthetic */ int a;
        final /* synthetic */ int[] b;

        a(int i, int[] iArr) {
            this.a = i;
            this.b = iArr;
        }

        private jb3 d(int[] iArr, int[] iArr2) {
            return nz9.this.i(new pz9(iArr), new pz9(iArr2), nz9.k);
        }

        @Override // defpackage.za3
        public int a() {
            return this.a;
        }

        @Override // defpackage.za3
        public jb3 b(int i) {
            int[] e = xs6.e();
            int[] e2 = xs6.e();
            int i2 = 0;
            for (int i3 = 0; i3 < this.a; i3++) {
                int i4 = ((i3 ^ i) - 1) >> 31;
                for (int i5 = 0; i5 < 7; i5++) {
                    int i6 = e[i5];
                    int[] iArr = this.b;
                    e[i5] = i6 ^ (iArr[i2 + i5] & i4);
                    e2[i5] = e2[i5] ^ (iArr[(i2 + 7) + i5] & i4);
                }
                i2 += 14;
            }
            return d(e, e2);
        }

        @Override // defpackage.za3
        public jb3 c(int i) {
            int[] e = xs6.e();
            int[] e2 = xs6.e();
            int i2 = 0;
            for (int i3 = 0; i3 < this.a; i3++) {
                int i4 = ((i3 ^ i) - 1) >> 31;
                for (int i5 = 0; i5 < 7; i5++) {
                    int i6 = e[i5];
                    int[] iArr = this.b;
                    e[i5] = i6 ^ (iArr[i2 + i5] & i4);
                    e2[i5] = e2[i5] ^ (iArr[(i2 + 7) + i5] & i4);
                }
                i2 += 14;
            }
            return d(e, e2);
        }
    }

    public nz9() {
        super(j);
        this.i = new qz9(this, null, null);
        this.b = m(da3.a);
        this.c = m(BigInteger.valueOf(5L));
        this.d = new BigInteger(1, b.b("010000000000000000000000000001DCE8D2EC6184CAF0A971769FB1F7"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.ea3.c, defpackage.ea3
    public na3 C(SecureRandom secureRandom) {
        int[] e = xs6.e();
        oz9.j(secureRandom, e);
        return new pz9(e);
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
        return new nz9();
    }

    @Override // defpackage.ea3
    public za3 e(jb3[] jb3VarArr, int i, int i2) {
        int[] iArr = new int[i2 * 14];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            jb3 jb3Var = jb3VarArr[i + i4];
            xs6.c(((pz9) jb3Var.n()).g, 0, iArr, i3);
            xs6.c(((pz9) jb3Var.o()).g, 0, iArr, i3 + 7);
            i3 += 14;
        }
        return new a(i2, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea3
    public jb3 h(na3 na3Var, na3 na3Var2) {
        return new qz9(this, na3Var, na3Var2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea3
    public jb3 i(na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
        return new qz9(this, na3Var, na3Var2, na3VarArr);
    }

    @Override // defpackage.ea3
    public na3 m(BigInteger bigInteger) {
        return new pz9(bigInteger);
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
