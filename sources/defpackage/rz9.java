package defpackage;

import defpackage.ea3;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.util.encoders.b;
/* renamed from: rz9  reason: default package */
/* loaded from: classes3.dex */
public class rz9 extends ea3.c {
    public static final BigInteger j = tz9.h;
    private static final na3[] k = {new tz9(da3.b)};
    protected uz9 i;

    /* renamed from: rz9$a */
    /* loaded from: classes3.dex */
    class a extends g1 {
        final /* synthetic */ int a;
        final /* synthetic */ int[] b;

        a(int i, int[] iArr) {
            this.a = i;
            this.b = iArr;
        }

        private jb3 d(int[] iArr, int[] iArr2) {
            return rz9.this.i(new tz9(iArr), new tz9(iArr2), rz9.k);
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
            int i2 = i * 14;
            for (int i3 = 0; i3 < 7; i3++) {
                int[] iArr = this.b;
                e[i3] = iArr[i2 + i3];
                e2[i3] = iArr[7 + i2 + i3];
            }
            return d(e, e2);
        }
    }

    public rz9() {
        super(j);
        this.i = new uz9(this, null, null);
        this.b = m(new BigInteger(1, b.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE")));
        this.c = m(new BigInteger(1, b.b("B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4")));
        this.d = new BigInteger(1, b.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.ea3.c, defpackage.ea3
    public na3 C(SecureRandom secureRandom) {
        int[] e = xs6.e();
        sz9.k(secureRandom, e);
        return new tz9(e);
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
        return new rz9();
    }

    @Override // defpackage.ea3
    public za3 e(jb3[] jb3VarArr, int i, int i2) {
        int[] iArr = new int[i2 * 14];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            jb3 jb3Var = jb3VarArr[i + i4];
            xs6.c(((tz9) jb3Var.n()).g, 0, iArr, i3);
            xs6.c(((tz9) jb3Var.o()).g, 0, iArr, i3 + 7);
            i3 += 14;
        }
        return new a(i2, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea3
    public jb3 h(na3 na3Var, na3 na3Var2) {
        return new uz9(this, na3Var, na3Var2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea3
    public jb3 i(na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
        return new uz9(this, na3Var, na3Var2, na3VarArr);
    }

    @Override // defpackage.ea3
    public na3 m(BigInteger bigInteger) {
        return new tz9(bigInteger);
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
