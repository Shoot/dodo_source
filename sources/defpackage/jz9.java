package defpackage;

import defpackage.ea3;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.util.encoders.b;
/* renamed from: jz9  reason: default package */
/* loaded from: classes3.dex */
public class jz9 extends ea3.c {
    public static final BigInteger j = lz9.h;
    private static final na3[] k = {new lz9(da3.b)};
    protected mz9 i;

    /* renamed from: jz9$a */
    /* loaded from: classes3.dex */
    class a extends g1 {
        final /* synthetic */ int a;
        final /* synthetic */ int[] b;

        a(int i, int[] iArr) {
            this.a = i;
            this.b = iArr;
        }

        private jb3 d(int[] iArr, int[] iArr2) {
            return jz9.this.i(new lz9(iArr), new lz9(iArr2), jz9.k);
        }

        @Override // defpackage.za3
        public int a() {
            return this.a;
        }

        @Override // defpackage.za3
        public jb3 b(int i) {
            int[] h = ws6.h();
            int[] h2 = ws6.h();
            int i2 = 0;
            for (int i3 = 0; i3 < this.a; i3++) {
                int i4 = ((i3 ^ i) - 1) >> 31;
                for (int i5 = 0; i5 < 6; i5++) {
                    int i6 = h[i5];
                    int[] iArr = this.b;
                    h[i5] = i6 ^ (iArr[i2 + i5] & i4);
                    h2[i5] = h2[i5] ^ (iArr[(i2 + 6) + i5] & i4);
                }
                i2 += 12;
            }
            return d(h, h2);
        }

        @Override // defpackage.za3
        public jb3 c(int i) {
            int[] h = ws6.h();
            int[] h2 = ws6.h();
            int i2 = i * 12;
            for (int i3 = 0; i3 < 6; i3++) {
                int[] iArr = this.b;
                h[i3] = iArr[i2 + i3];
                h2[i3] = iArr[6 + i2 + i3];
            }
            return d(h, h2);
        }
    }

    public jz9() {
        super(j);
        this.i = new mz9(this, null, null);
        this.b = m(new BigInteger(1, b.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFC")));
        this.c = m(new BigInteger(1, b.b("64210519E59C80E70FA7E9AB72243049FEB8DEECC146B9B1")));
        this.d = new BigInteger(1, b.b("FFFFFFFFFFFFFFFFFFFFFFFF99DEF836146BC9B1B4D22831"));
        this.e = BigInteger.valueOf(1L);
        this.f = 2;
    }

    @Override // defpackage.ea3.c, defpackage.ea3
    public na3 C(SecureRandom secureRandom) {
        int[] h = ws6.h();
        kz9.k(secureRandom, h);
        return new lz9(h);
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
        return new jz9();
    }

    @Override // defpackage.ea3
    public za3 e(jb3[] jb3VarArr, int i, int i2) {
        int[] iArr = new int[i2 * 12];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            jb3 jb3Var = jb3VarArr[i + i4];
            ws6.e(((lz9) jb3Var.n()).g, 0, iArr, i3);
            ws6.e(((lz9) jb3Var.o()).g, 0, iArr, i3 + 6);
            i3 += 12;
        }
        return new a(i2, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea3
    public jb3 h(na3 na3Var, na3 na3Var2) {
        return new mz9(this, na3Var, na3Var2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ea3
    public jb3 i(na3 na3Var, na3 na3Var2, na3[] na3VarArr) {
        return new mz9(this, na3Var, na3Var2, na3VarArr);
    }

    @Override // defpackage.ea3
    public na3 m(BigInteger bigInteger) {
        return new lz9(bigInteger);
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
