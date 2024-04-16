package defpackage;

import defpackage.ea3;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.util.encoders.b;
/* renamed from: ry9  reason: default package */
/* loaded from: classes3.dex */
public class ry9 extends ea3.c {
    public static final BigInteger j = ty9.h;
    private static final na3[] k = {new ty9(da3.b)};
    protected uy9 i;

    /* renamed from: ry9$a */
    /* loaded from: classes3.dex */
    class a extends g1 {
        final /* synthetic */ int a;
        final /* synthetic */ int[] b;

        a(int i, int[] iArr) {
            this.a = i;
            this.b = iArr;
        }

        private jb3 d(int[] iArr, int[] iArr2) {
            return ry9.this.i(new ty9(iArr), new ty9(iArr2), ry9.k);
        }

        @Override // defpackage.za3
        public int a() {
            return this.a;
        }

        @Override // defpackage.za3
        public jb3 b(int i) {
            int[] f = us6.f();
            int[] f2 = us6.f();
            int i2 = 0;
            for (int i3 = 0; i3 < this.a; i3++) {
                int i4 = ((i3 ^ i) - 1) >> 31;
                for (int i5 = 0; i5 < 4; i5++) {
                    int i6 = f[i5];
                    int[] iArr = this.b;
                    f[i5] = i6 ^ (iArr[i2 + i5] & i4);
                    f2[i5] = f2[i5] ^ (iArr[(i2 + 4) + i5] & i4);
                }
                i2 += 8;
            }
            return d(f, f2);
        }

        @Override // defpackage.za3
        public jb3 c(int i) {
            int[] f = us6.f();
            int[] f2 = us6.f();
            int i2 = i * 8;
            for (int i3 = 0; i3 < 4; i3++) {
                int[] iArr = this.b;
                f[i3] = iArr[i2 + i3];
                f2[i3] = iArr[4 + i2 + i3];
            }
            return d(f, f2);
        }
    }

    public ry9() {
        super(j);
        this.i = new uy9(this, null, null);
        this.b = m(new BigInteger(1, b.b("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.c = m(new BigInteger(1, b.b("E87579C11079F43DD824993C2CEE5ED3")));
        this.d = new BigInteger(1, b.b("FFFFFFFE0000000075A30D1B9038A115"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.ea3.c, defpackage.ea3
    public na3 C(SecureRandom secureRandom) {
        int[] f = us6.f();
        sy9.k(secureRandom, f);
        return new ty9(f);
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
        return new ry9();
    }

    @Override // defpackage.ea3
    public za3 e(jb3[] jb3VarArr, int i, int i2) {
        int[] iArr = new int[i2 * 8];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            jb3 jb3Var = jb3VarArr[i + i4];
            us6.c(((ty9) jb3Var.n()).g, 0, iArr, i3);
            us6.c(((ty9) jb3Var.o()).g, 0, iArr, i3 + 4);
            i3 += 8;
        }
        return new a(i2, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea3
    public jb3 h(na3 na3Var, na3 na3Var2) {
        return new uy9(this, na3Var, na3Var2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea3
    public jb3 i(na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
        return new uy9(this, na3Var, na3Var2, na3VarArr);
    }

    @Override // defpackage.ea3
    public na3 m(BigInteger bigInteger) {
        return new ty9(bigInteger);
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
