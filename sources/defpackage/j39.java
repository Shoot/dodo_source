package defpackage;

import java.math.BigInteger;
import org.bouncycastle.crypto.DataLengthException;
/* renamed from: j39  reason: default package */
/* loaded from: classes3.dex */
class j39 {
    private n39 a;
    private boolean b;

    public BigInteger a(byte[] bArr, int i, int i2) {
        if (i2 <= c() + 1) {
            if (i2 == c() + 1 && !this.b) {
                throw new DataLengthException("input too large for RSA cipher.");
            }
            if (i != 0 || i2 != bArr.length) {
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, i, bArr2, 0, i2);
                bArr = bArr2;
            }
            BigInteger bigInteger = new BigInteger(1, bArr);
            if (bigInteger.compareTo(this.a.c()) < 0) {
                return bigInteger;
            }
            throw new DataLengthException("input too large for RSA cipher.");
        }
        throw new DataLengthException("input too large for RSA cipher.");
    }

    public byte[] b(BigInteger bigInteger) {
        byte[] bArr;
        byte[] byteArray = bigInteger.toByteArray();
        if (this.b) {
            if (byteArray[0] == 0 && byteArray.length > d()) {
                int length = byteArray.length - 1;
                byte[] bArr2 = new byte[length];
                System.arraycopy(byteArray, 1, bArr2, 0, length);
                return bArr2;
            } else if (byteArray.length < d()) {
                int d = d();
                byte[] bArr3 = new byte[d];
                System.arraycopy(byteArray, 0, bArr3, d - byteArray.length, byteArray.length);
                return bArr3;
            } else {
                return byteArray;
            }
        }
        if (byteArray[0] == 0) {
            int length2 = byteArray.length - 1;
            bArr = new byte[length2];
            System.arraycopy(byteArray, 1, bArr, 0, length2);
        } else {
            int length3 = byteArray.length;
            bArr = new byte[length3];
            System.arraycopy(byteArray, 0, bArr, 0, length3);
        }
        tr.y(byteArray, (byte) 0);
        return bArr;
    }

    public int c() {
        int bitLength = (this.a.c().bitLength() + 7) / 8;
        if (this.b) {
            return bitLength - 1;
        }
        return bitLength;
    }

    public int d() {
        int bitLength = (this.a.c().bitLength() + 7) / 8;
        if (this.b) {
            return bitLength;
        }
        return bitLength - 1;
    }

    public void e(boolean z, v71 v71Var) {
        if (v71Var instanceof qq7) {
            v71Var = ((qq7) v71Var).a();
        }
        this.a = (n39) v71Var;
        this.b = z;
    }

    public BigInteger f(BigInteger bigInteger) {
        n39 n39Var = this.a;
        if (n39Var instanceof o39) {
            o39 o39Var = (o39) n39Var;
            BigInteger g = o39Var.g();
            BigInteger i = o39Var.i();
            BigInteger e = o39Var.e();
            BigInteger f = o39Var.f();
            BigInteger j = o39Var.j();
            BigInteger modPow = bigInteger.remainder(g).modPow(e, g);
            BigInteger modPow2 = bigInteger.remainder(i).modPow(f, i);
            return modPow.subtract(modPow2).multiply(j).mod(g).multiply(i).add(modPow2);
        }
        return bigInteger.modPow(n39Var.b(), this.a.c());
    }
}
