package defpackage;

import java.math.BigInteger;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.util.encoders.b;
/* renamed from: rq9  reason: default package */
/* loaded from: classes3.dex */
public class rq9 implements oka, da3 {
    private final v72 g;
    private final e23 h;
    private final t72 i;
    private la3 j;
    private jb3 k;
    private xa3 l;
    private byte[] m;

    public rq9() {
        this(mta.a, new sq9());
    }

    private void c(e23 e23Var, na3 na3Var) {
        byte[] e = na3Var.e();
        e23Var.update(e, 0, e.length);
    }

    private void d(e23 e23Var, byte[] bArr) {
        int length = bArr.length * 8;
        e23Var.update((byte) ((length >> 8) & 255));
        e23Var.update((byte) (length & 255));
        e23Var.update(bArr, 0, bArr.length);
    }

    private byte[] g() {
        byte[] bArr = new byte[this.h.getDigestSize()];
        this.h.doFinal(bArr, 0);
        i();
        return bArr;
    }

    private byte[] h(byte[] bArr) {
        this.h.reset();
        d(this.h, bArr);
        c(this.h, this.j.a().n());
        c(this.h, this.j.a().o());
        c(this.h, this.j.b().f());
        c(this.h, this.j.b().g());
        c(this.h, this.k.f());
        c(this.h, this.k.g());
        byte[] bArr2 = new byte[this.h.getDigestSize()];
        this.h.doFinal(bArr2, 0);
        return bArr2;
    }

    private boolean j(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger e = this.j.e();
        BigInteger bigInteger3 = da3.b;
        if (bigInteger.compareTo(bigInteger3) < 0 || bigInteger.compareTo(e) >= 0 || bigInteger2.compareTo(bigInteger3) < 0 || bigInteger2.compareTo(e) >= 0) {
            return false;
        }
        BigInteger e2 = e(e, g());
        BigInteger mod = bigInteger.add(bigInteger2).mod(e);
        if (mod.equals(da3.a)) {
            return false;
        }
        jb3 A = ca3.r(this.j.b(), bigInteger2, ((qb3) this.l).c(), mod).A();
        if (A.u()) {
            return false;
        }
        return e2.add(A.f().t()).mod(e).equals(bigInteger);
    }

    @Override // defpackage.oka
    public boolean a(byte[] bArr) {
        try {
            BigInteger[] a = this.i.a(this.j.e(), bArr);
            return j(a[0], a[1]);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // defpackage.oka
    public byte[] b() throws CryptoException {
        byte[] g = g();
        BigInteger e = this.j.e();
        BigInteger e2 = e(e, g);
        BigInteger c = ((nb3) this.l).c();
        bb3 f = f();
        while (true) {
            BigInteger b = this.g.b();
            BigInteger mod = e2.add(f.a(this.j.b(), b).A().f().t()).mod(e);
            BigInteger bigInteger = da3.a;
            if (!mod.equals(bigInteger) && !mod.add(b).equals(e)) {
                BigInteger mod2 = db0.j(e, c.add(da3.b)).multiply(b.subtract(mod.multiply(c)).mod(e)).mod(e);
                if (!mod2.equals(bigInteger)) {
                    try {
                        return this.i.b(this.j.e(), mod, mod2);
                    } catch (Exception e3) {
                        throw new CryptoException("unable to encode signature: " + e3.getMessage(), e3);
                    }
                }
            }
        }
    }

    protected BigInteger e(BigInteger bigInteger, byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    protected bb3 f() {
        return new ry3();
    }

    public void i() {
        this.h.reset();
        byte[] bArr = this.m;
        if (bArr != null) {
            this.h.update(bArr, 0, bArr.length);
        }
    }

    @Override // defpackage.oka
    public void init(boolean z, v71 v71Var) {
        byte[] b;
        jb3 c;
        if (v71Var instanceof oq7) {
            oq7 oq7Var = (oq7) v71Var;
            v71 b2 = oq7Var.b();
            byte[] a = oq7Var.a();
            if (a.length < 8192) {
                b = a;
                v71Var = b2;
            } else {
                throw new IllegalArgumentException("SM2 user ID must be less than 2^16 bits long");
            }
        } else {
            b = b.b("31323334353637383132333435363738");
        }
        if (z) {
            if (v71Var instanceof qq7) {
                qq7 qq7Var = (qq7) v71Var;
                xa3 xa3Var = (xa3) qq7Var.a();
                this.l = xa3Var;
                la3 b3 = xa3Var.b();
                this.j = b3;
                this.g.a(b3.e(), qq7Var.b());
            } else {
                xa3 xa3Var2 = (xa3) v71Var;
                this.l = xa3Var2;
                la3 b4 = xa3Var2.b();
                this.j = b4;
                this.g.a(b4.e(), b32.b());
            }
            c = f().a(this.j.b(), ((nb3) this.l).c()).A();
        } else {
            xa3 xa3Var3 = (xa3) v71Var;
            this.l = xa3Var3;
            this.j = xa3Var3.b();
            c = ((qb3) this.l).c();
        }
        this.k = c;
        byte[] h = h(b);
        this.m = h;
        this.h.update(h, 0, h.length);
    }

    @Override // defpackage.oka
    public void update(byte b) {
        this.h.update(b);
    }

    public rq9(t72 t72Var, e23 e23Var) {
        this.g = new c49();
        this.i = t72Var;
        this.h = e23Var;
    }

    @Override // defpackage.oka
    public void update(byte[] bArr, int i, int i2) {
        this.h.update(bArr, i, i2);
    }

    public rq9(e23 e23Var) {
        this(mta.a, e23Var);
    }
}
