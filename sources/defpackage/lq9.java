package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;
/* renamed from: lq9  reason: default package */
/* loaded from: classes3.dex */
public class lq9 {
    private final e23 a;
    private final b b;
    private boolean c;
    private xa3 d;
    private la3 e;
    private int f;
    private SecureRandom g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lq9$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.C1C3C2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: lq9$b */
    /* loaded from: classes3.dex */
    public enum b {
        C1C2C3,
        C1C3C2
    }

    public lq9() {
        this(new sq9());
    }

    private void a(e23 e23Var, na3 na3Var) {
        byte[] b2 = db0.b(this.f, na3Var.t());
        e23Var.update(b2, 0, b2.length);
    }

    private byte[] c(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        int i3;
        int i4 = (this.f * 2) + 1;
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, i, bArr2, 0, i4);
        jb3 j = this.e.a().j(bArr2);
        if (!j.y(this.e.c()).u()) {
            jb3 A = j.y(((nb3) this.d).c()).A();
            int digestSize = this.a.getDigestSize();
            int i5 = (i2 - i4) - digestSize;
            byte[] bArr3 = new byte[i5];
            b bVar = this.b;
            b bVar2 = b.C1C3C2;
            if (bVar == bVar2) {
                System.arraycopy(bArr, i + i4 + digestSize, bArr3, 0, i5);
            } else {
                System.arraycopy(bArr, i + i4, bArr3, 0, i5);
            }
            g(this.a, A, bArr3);
            int digestSize2 = this.a.getDigestSize();
            byte[] bArr4 = new byte[digestSize2];
            a(this.a, A.f());
            this.a.update(bArr3, 0, i5);
            a(this.a, A.g());
            this.a.doFinal(bArr4, 0);
            if (this.b == bVar2) {
                i3 = 0;
                for (int i6 = 0; i6 != digestSize2; i6++) {
                    i3 |= bArr4[i6] ^ bArr[(i + i4) + i6];
                }
            } else {
                i3 = 0;
                for (int i7 = 0; i7 != digestSize2; i7++) {
                    i3 |= bArr4[i7] ^ bArr[((i + i4) + i5) + i7];
                }
            }
            tr.y(bArr2, (byte) 0);
            tr.y(bArr4, (byte) 0);
            if (i3 == 0) {
                return bArr3;
            }
            tr.y(bArr3, (byte) 0);
            throw new InvalidCipherTextException("invalid cipher text");
        }
        throw new InvalidCipherTextException("[h]C1 at infinity");
    }

    private byte[] d(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        byte[] l;
        jb3 A;
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        bb3 b2 = b();
        do {
            BigInteger h = h();
            l = b2.a(this.e.b(), h).A().l(false);
            A = ((qb3) this.d).c().y(h).A();
            g(this.a, A, bArr2);
        } while (i(bArr2, bArr, i));
        byte[] bArr3 = new byte[this.a.getDigestSize()];
        a(this.a, A.f());
        this.a.update(bArr, i, i2);
        a(this.a, A.g());
        this.a.doFinal(bArr3, 0);
        if (a.a[this.b.ordinal()] != 1) {
            return tr.q(l, bArr2, bArr3);
        }
        return tr.q(l, bArr3, bArr2);
    }

    private void g(e23 e23Var, jb3 jb3Var, byte[] bArr) {
        sc6 sc6Var;
        sc6 sc6Var2;
        int digestSize = e23Var.getDigestSize();
        byte[] bArr2 = new byte[Math.max(4, digestSize)];
        if (e23Var instanceof sc6) {
            a(e23Var, jb3Var.f());
            a(e23Var, jb3Var.g());
            sc6Var = (sc6) e23Var;
            sc6Var2 = sc6Var.a();
        } else {
            sc6Var = null;
            sc6Var2 = null;
        }
        int i = 0;
        int i2 = 0;
        while (i < bArr.length) {
            if (sc6Var != null) {
                sc6Var.b(sc6Var2);
            } else {
                a(e23Var, jb3Var.f());
                a(e23Var, jb3Var.g());
            }
            i2++;
            mo7.f(i2, bArr2, 0);
            e23Var.update(bArr2, 0, 4);
            e23Var.doFinal(bArr2, 0);
            int min = Math.min(digestSize, bArr.length - i);
            k(bArr, bArr2, i, min);
            i += min;
        }
    }

    private BigInteger h() {
        int bitLength = this.e.e().bitLength();
        while (true) {
            BigInteger e = db0.e(bitLength, this.g);
            if (!e.equals(db0.a) && e.compareTo(this.e.e()) < 0) {
                return e;
            }
        }
    }

    private boolean i(byte[] bArr, byte[] bArr2, int i) {
        for (int i2 = 0; i2 != bArr.length; i2++) {
            if (bArr[i2] != bArr2[i + i2]) {
                return false;
            }
        }
        return true;
    }

    private void k(byte[] bArr, byte[] bArr2, int i, int i2) {
        for (int i3 = 0; i3 != i2; i3++) {
            int i4 = i + i3;
            bArr[i4] = (byte) (bArr[i4] ^ bArr2[i3]);
        }
    }

    protected bb3 b() {
        return new ry3();
    }

    public int e(int i) {
        return (this.f * 2) + 1 + i + this.a.getDigestSize();
    }

    public void f(boolean z, v71 v71Var) {
        this.c = z;
        if (z) {
            qq7 qq7Var = (qq7) v71Var;
            xa3 xa3Var = (xa3) qq7Var.a();
            this.d = xa3Var;
            this.e = xa3Var.b();
            if (!((qb3) this.d).c().y(this.e.c()).u()) {
                this.g = qq7Var.b();
            } else {
                throw new IllegalArgumentException("invalid key: [h]Q at infinity");
            }
        } else {
            xa3 xa3Var2 = (xa3) v71Var;
            this.d = xa3Var2;
            this.e = xa3Var2.b();
        }
        this.f = (this.e.a().t() + 7) / 8;
    }

    public byte[] j(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        if (this.c) {
            return d(bArr, i, i2);
        }
        return c(bArr, i, i2);
    }

    public lq9(e23 e23Var) {
        this(e23Var, b.C1C2C3);
    }

    public lq9(e23 e23Var, b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("mode cannot be NULL");
        }
        this.a = e23Var;
        this.b = bVar;
    }
}
