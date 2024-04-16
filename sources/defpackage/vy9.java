package defpackage;

import defpackage.ea3;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.util.encoders.b;
/* renamed from: vy9  reason: default package */
/* loaded from: classes3.dex */
public class vy9 extends ea3.c {
    public static final BigInteger j = dz9.h;
    private static final na3[] k = {new dz9(da3.b)};
    protected wy9 i;

    /* renamed from: vy9$a */
    /* loaded from: classes3.dex */
    class a extends g1 {
        final /* synthetic */ int a;
        final /* synthetic */ int[] b;

        a(int i, int[] iArr) {
            this.a = i;
            this.b = iArr;
        }

        private jb3 d(int[] iArr, int[] iArr2) {
            return vy9.this.i(new dz9(iArr), new dz9(iArr2), vy9.k);
        }

        @Override // defpackage.za3
        public int a() {
            return this.a;
        }

        @Override // defpackage.za3
        public jb3 b(int i) {
            int[] d = vs6.d();
            int[] d2 = vs6.d();
            int i2 = 0;
            for (int i3 = 0; i3 < this.a; i3++) {
                int i4 = ((i3 ^ i) - 1) >> 31;
                for (int i5 = 0; i5 < 5; i5++) {
                    int i6 = d[i5];
                    int[] iArr = this.b;
                    d[i5] = i6 ^ (iArr[i2 + i5] & i4);
                    d2[i5] = d2[i5] ^ (iArr[(i2 + 5) + i5] & i4);
                }
                i2 += 10;
            }
            return d(d, d2);
        }

        @Override // defpackage.za3
        public jb3 c(int i) {
            int[] d = vs6.d();
            int[] d2 = vs6.d();
            int i2 = i * 10;
            for (int i3 = 0; i3 < 5; i3++) {
                int[] iArr = this.b;
                d[i3] = iArr[i2 + i3];
                d2[i3] = iArr[5 + i2 + i3];
            }
            return d(d, d2);
        }
    }

    public vy9() {
        super(j);
        this.i = new wy9(this, null, null);
        this.b = m(da3.a);
        this.c = m(BigInteger.valueOf(7L));
        this.d = new BigInteger(1, b.b("0100000000000000000001B8FA16DFAB9ACA16B6B3"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.ea3.c, defpackage.ea3
    public na3 C(SecureRandom secureRandom) {
        int[] d = vs6.d();
        cz9.j(secureRandom, d);
        return new dz9(d);
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
        return new vy9();
    }

    @Override // defpackage.ea3
    public za3 e(jb3[] jb3VarArr, int i, int i2) {
        int[] iArr = new int[i2 * 10];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            jb3 jb3Var = jb3VarArr[i + i4];
            vs6.c(((dz9) jb3Var.n()).g, 0, iArr, i3);
            vs6.c(((dz9) jb3Var.o()).g, 0, iArr, i3 + 5);
            i3 += 10;
        }
        return new a(i2, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea3
    public jb3 h(na3 na3Var, na3 na3Var2) {
        return new wy9(this, na3Var, na3Var2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea3
    public jb3 i(na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
        return new wy9(this, na3Var, na3Var2, na3VarArr);
    }

    @Override // defpackage.ea3
    public na3 m(BigInteger bigInteger) {
        return new dz9(bigInteger);
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
