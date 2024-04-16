package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.DataLengthException;
/* renamed from: ae3  reason: default package */
/* loaded from: classes3.dex */
public class ae3 implements rx {
    private static final BigInteger e = BigInteger.valueOf(0);
    private static final BigInteger f = BigInteger.valueOf(1);
    private static final BigInteger g = BigInteger.valueOf(2);
    private ee3 a;
    private SecureRandom b;
    private boolean c;
    private int d;

    @Override // defpackage.rx
    public int a() {
        if (this.c) {
            return ((this.d + 7) / 8) * 2;
        }
        return (this.d - 1) / 8;
    }

    @Override // defpackage.rx
    public int b() {
        if (this.c) {
            return (this.d - 1) / 8;
        }
        return ((this.d + 7) / 8) * 2;
    }

    @Override // defpackage.rx
    public byte[] c(byte[] bArr, int i, int i2) {
        int b;
        BigInteger e2;
        if (this.a != null) {
            if (this.c) {
                b = (this.d + 6) / 8;
            } else {
                b = b();
            }
            if (i2 <= b) {
                BigInteger c = this.a.b().c();
                if (this.a instanceof le3) {
                    int i3 = i2 / 2;
                    byte[] bArr2 = new byte[i3];
                    byte[] bArr3 = new byte[i3];
                    System.arraycopy(bArr, i, bArr2, 0, i3);
                    System.arraycopy(bArr, i + i3, bArr3, 0, i3);
                    BigInteger bigInteger = new BigInteger(1, bArr2);
                    return db0.c(bigInteger.modPow(c.subtract(f).subtract(((le3) this.a).c()), c).multiply(new BigInteger(1, bArr3)).mod(c));
                }
                if (i != 0 || i2 != bArr.length) {
                    byte[] bArr4 = new byte[i2];
                    System.arraycopy(bArr, i, bArr4, 0, i2);
                    bArr = bArr4;
                }
                BigInteger bigInteger2 = new BigInteger(1, bArr);
                if (bigInteger2.compareTo(c) < 0) {
                    oe3 oe3Var = (oe3) this.a;
                    int bitLength = c.bitLength();
                    while (true) {
                        e2 = db0.e(bitLength, this.b);
                        if (!e2.equals(e) && e2.compareTo(c.subtract(g)) <= 0) {
                            break;
                        }
                    }
                    BigInteger modPow = this.a.b().a().modPow(e2, c);
                    BigInteger mod = bigInteger2.multiply(oe3Var.c().modPow(e2, c)).mod(c);
                    byte[] byteArray = modPow.toByteArray();
                    byte[] byteArray2 = mod.toByteArray();
                    int a = a();
                    byte[] bArr5 = new byte[a];
                    int i4 = a / 2;
                    if (byteArray.length > i4) {
                        System.arraycopy(byteArray, 1, bArr5, i4 - (byteArray.length - 1), byteArray.length - 1);
                    } else {
                        System.arraycopy(byteArray, 0, bArr5, i4 - byteArray.length, byteArray.length);
                    }
                    if (byteArray2.length > i4) {
                        System.arraycopy(byteArray2, 1, bArr5, a - (byteArray2.length - 1), byteArray2.length - 1);
                    } else {
                        System.arraycopy(byteArray2, 0, bArr5, a - byteArray2.length, byteArray2.length);
                    }
                    return bArr5;
                }
                throw new DataLengthException("input too large for ElGamal cipher.\n");
            }
            throw new DataLengthException("input too large for ElGamal cipher.\n");
        }
        throw new IllegalStateException("ElGamal engine not initialised");
    }

    @Override // defpackage.rx
    public void init(boolean z, v71 v71Var) {
        SecureRandom b;
        if (v71Var instanceof qq7) {
            qq7 qq7Var = (qq7) v71Var;
            this.a = (ee3) qq7Var.a();
            b = qq7Var.b();
        } else {
            this.a = (ee3) v71Var;
            b = b32.b();
        }
        this.b = b;
        this.c = z;
        this.d = this.a.b().c().bitLength();
        if (z) {
            if (!(this.a instanceof oe3)) {
                throw new IllegalArgumentException("ElGamalPublicKeyParameters are required for encryption.");
            }
        } else if (this.a instanceof le3) {
        } else {
            throw new IllegalArgumentException("ElGamalPrivateKeyParameters are required for decryption.");
        }
    }
}
