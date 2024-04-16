package defpackage;

import defpackage.ea3;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.util.encoders.b;
/* renamed from: o32  reason: default package */
/* loaded from: classes3.dex */
public class o32 extends ea3.c {
    public static final BigInteger j = q32.h;
    private static final BigInteger k;
    private static final BigInteger l;
    private static final na3[] m;
    protected r32 i;

    /* renamed from: o32$a */
    /* loaded from: classes3.dex */
    class a extends g1 {
        final /* synthetic */ int a;
        final /* synthetic */ int[] b;

        a(int i, int[] iArr) {
            this.a = i;
            this.b = iArr;
        }

        private jb3 d(int[] iArr, int[] iArr2) {
            return o32.this.i(new q32(iArr), new q32(iArr2), o32.m);
        }

        @Override // defpackage.za3
        public int a() {
            return this.a;
        }

        @Override // defpackage.za3
        public jb3 b(int i) {
            int[] i2 = ys6.i();
            int[] i3 = ys6.i();
            int i4 = 0;
            for (int i5 = 0; i5 < this.a; i5++) {
                int i6 = ((i5 ^ i) - 1) >> 31;
                for (int i7 = 0; i7 < 8; i7++) {
                    int i8 = i2[i7];
                    int[] iArr = this.b;
                    i2[i7] = i8 ^ (iArr[i4 + i7] & i6);
                    i3[i7] = i3[i7] ^ (iArr[(i4 + 8) + i7] & i6);
                }
                i4 += 16;
            }
            return d(i2, i3);
        }

        @Override // defpackage.za3
        public jb3 c(int i) {
            int[] i2 = ys6.i();
            int[] i3 = ys6.i();
            int i4 = i * 16;
            for (int i5 = 0; i5 < 8; i5++) {
                int[] iArr = this.b;
                i2[i5] = iArr[i4 + i5];
                i3[i5] = iArr[8 + i4 + i5];
            }
            return d(i2, i3);
        }
    }

    static {
        BigInteger bigInteger = new BigInteger(1, b.b("2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144"));
        k = bigInteger;
        l = new BigInteger(1, b.b("7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864"));
        m = new na3[]{new q32(da3.b), new q32(bigInteger)};
    }

    public o32() {
        super(j);
        this.i = new r32(this, null, null);
        this.b = m(k);
        this.c = m(l);
        this.d = new BigInteger(1, b.b("1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"));
        this.e = BigInteger.valueOf(8L);
        this.f = 4;
    }

    @Override // defpackage.ea3.c, defpackage.ea3
    public na3 C(SecureRandom secureRandom) {
        int[] i = ys6.i();
        p32.k(secureRandom, i);
        return new q32(i);
    }

    @Override // defpackage.ea3
    public boolean D(int i) {
        if (i != 4) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ea3
    protected ea3 c() {
        return new o32();
    }

    @Override // defpackage.ea3
    public za3 e(jb3[] jb3VarArr, int i, int i2) {
        int[] iArr = new int[i2 * 16];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            jb3 jb3Var = jb3VarArr[i + i4];
            ys6.f(((q32) jb3Var.n()).g, 0, iArr, i3);
            ys6.f(((q32) jb3Var.o()).g, 0, iArr, i3 + 8);
            i3 += 16;
        }
        return new a(i2, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea3
    public jb3 h(na3 na3Var, na3 na3Var2) {
        return new r32(this, na3Var, na3Var2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea3
    public jb3 i(na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
        return new r32(this, na3Var, na3Var2, na3VarArr);
    }

    @Override // defpackage.ea3
    public na3 m(BigInteger bigInteger) {
        return new q32(bigInteger);
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
