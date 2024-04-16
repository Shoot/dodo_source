package defpackage;

import ch.qos.logback.core.net.SyslogConstants;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.util.encoders.b;
/* renamed from: c82  reason: default package */
/* loaded from: classes3.dex */
public class c82 {
    private static final BigInteger i = BigInteger.valueOf(0);
    private static final BigInteger j = BigInteger.valueOf(1);
    private static final BigInteger k = BigInteger.valueOf(2);
    private e23 a;
    private int b;
    private int c;
    private int d;
    private int e;
    private SecureRandom f;
    private boolean g;
    private int h;

    public c82() {
        this(f23.b());
    }

    private static BigInteger a(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        BigInteger modPow;
        BigInteger divide = bigInteger.subtract(j).divide(bigInteger2);
        BigInteger subtract = bigInteger.subtract(k);
        do {
            modPow = db0.f(k, subtract, secureRandom).modPow(divide, bigInteger);
        } while (modPow.bitLength() <= 1);
        return modPow;
    }

    private static BigInteger b(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        return a(bigInteger, bigInteger2, secureRandom);
    }

    private static BigInteger c(e23 e23Var, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, int i2) {
        BigInteger divide = bigInteger.subtract(j).divide(bigInteger2);
        byte[] b = b.b("6767656E");
        int length = bArr.length + b.length;
        byte[] bArr2 = new byte[length + 3];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(b, 0, bArr2, bArr.length, b.length);
        bArr2[length] = (byte) i2;
        byte[] bArr3 = new byte[e23Var.getDigestSize()];
        for (int i3 = 1; i3 < 65536; i3++) {
            j(bArr2);
            i(e23Var, bArr2, bArr3, 0);
            BigInteger modPow = new BigInteger(1, bArr3).modPow(divide, bigInteger);
            if (modPow.compareTo(k) >= 0) {
                return modPow;
            }
        }
        return null;
    }

    private b82 e() {
        int i2 = 20;
        byte[] bArr = new byte[20];
        byte[] bArr2 = new byte[20];
        byte[] bArr3 = new byte[20];
        byte[] bArr4 = new byte[20];
        int i3 = this.b;
        int i4 = (i3 - 1) / SyslogConstants.LOG_LOCAL4;
        int i5 = i3 / 8;
        byte[] bArr5 = new byte[i5];
        if (!(this.a instanceof bq9)) {
            throw new IllegalStateException("can only use SHA-1 for generating FIPS 186-2 parameters");
        }
        while (true) {
            this.f.nextBytes(bArr);
            i(this.a, bArr, bArr2, 0);
            System.arraycopy(bArr, 0, bArr3, 0, i2);
            j(bArr3);
            i(this.a, bArr3, bArr3, 0);
            for (int i6 = 0; i6 != i2; i6++) {
                bArr4[i6] = (byte) (bArr2[i6] ^ bArr3[i6]);
            }
            bArr4[0] = (byte) (bArr4[0] | Byte.MIN_VALUE);
            bArr4[19] = (byte) (bArr4[19] | 1);
            BigInteger bigInteger = new BigInteger(1, bArr4);
            if (m(bigInteger)) {
                byte[] h = tr.h(bArr);
                j(h);
                int i7 = 0;
                while (i7 < 4096) {
                    for (int i8 = 1; i8 <= i4; i8++) {
                        j(h);
                        i(this.a, h, bArr5, i5 - (i8 * 20));
                    }
                    int i9 = i5 - (i4 * 20);
                    j(h);
                    i(this.a, h, bArr2, 0);
                    System.arraycopy(bArr2, 20 - i9, bArr5, 0, i9);
                    bArr5[0] = (byte) (bArr5[0] | Byte.MIN_VALUE);
                    BigInteger bigInteger2 = new BigInteger(1, bArr5);
                    BigInteger subtract = bigInteger2.subtract(bigInteger2.mod(bigInteger.shiftLeft(1)).subtract(j));
                    if (subtract.bitLength() == this.b && m(subtract)) {
                        return new b82(subtract, bigInteger, a(subtract, bigInteger, this.f), new g82(bArr, i7));
                    }
                    i7++;
                    i2 = 20;
                }
                continue;
            }
        }
    }

    private b82 f() {
        BigInteger bit;
        int i2;
        BigInteger subtract;
        BigInteger c;
        e23 e23Var = this.a;
        int digestSize = e23Var.getDigestSize() * 8;
        byte[] bArr = new byte[this.c / 8];
        int i3 = this.b;
        int i4 = (i3 - 1) / digestSize;
        int i5 = (i3 - 1) % digestSize;
        int i6 = i3 / 8;
        byte[] bArr2 = new byte[i6];
        int digestSize2 = e23Var.getDigestSize();
        byte[] bArr3 = new byte[digestSize2];
        loop0: while (true) {
            this.f.nextBytes(bArr);
            int i7 = 0;
            i(e23Var, bArr, bArr3, 0);
            bit = new BigInteger(1, bArr3).mod(j.shiftLeft(this.c - 1)).setBit(0).setBit(this.c - 1);
            if (m(bit)) {
                byte[] h = tr.h(bArr);
                int i8 = this.b * 4;
                i2 = 0;
                while (i2 < i8) {
                    for (int i9 = 1; i9 <= i4; i9++) {
                        j(h);
                        i(e23Var, h, bArr2, i6 - (i9 * digestSize2));
                    }
                    int i10 = i6 - (i4 * digestSize2);
                    j(h);
                    i(e23Var, h, bArr3, i7);
                    System.arraycopy(bArr3, digestSize2 - i10, bArr2, i7, i10);
                    bArr2[i7] = (byte) (bArr2[i7] | Byte.MIN_VALUE);
                    BigInteger bigInteger = new BigInteger(1, bArr2);
                    subtract = bigInteger.subtract(bigInteger.mod(bit.shiftLeft(1)).subtract(j));
                    if (subtract.bitLength() == this.b && m(subtract)) {
                        break loop0;
                    }
                    i2++;
                    i7 = 0;
                }
                continue;
            }
        }
        int i11 = this.h;
        if (i11 >= 0 && (c = c(e23Var, subtract, bit, bArr, i11)) != null) {
            return new b82(subtract, bit, c, new g82(bArr, i2, this.h));
        }
        return new b82(subtract, bit, b(subtract, bit, this.f), new g82(bArr, i2));
    }

    private static int g(int i2) {
        if (i2 > 1024) {
            return 256;
        }
        return SyslogConstants.LOG_LOCAL4;
    }

    private static int h(int i2) {
        if (i2 <= 1024) {
            return 40;
        }
        return (((i2 - 1) / 1024) * 8) + 48;
    }

    private static void i(e23 e23Var, byte[] bArr, byte[] bArr2, int i2) {
        e23Var.update(bArr, 0, bArr.length);
        e23Var.doFinal(bArr2, i2);
    }

    private static void j(byte[] bArr) {
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte b = (byte) ((bArr[length] + 1) & 255);
            bArr[length] = b;
            if (b != 0) {
                return;
            }
        }
    }

    private boolean m(BigInteger bigInteger) {
        return bigInteger.isProbablePrime(this.d);
    }

    public b82 d() {
        if (this.g) {
            return f();
        }
        return e();
    }

    public void k(int i2, int i3, SecureRandom secureRandom) {
        this.b = i2;
        this.c = g(i2);
        this.d = i3;
        this.e = Math.max(h(this.b), (i3 + 1) / 2);
        this.f = secureRandom;
        this.g = false;
        this.h = -1;
    }

    public void l(a82 a82Var) {
        int b = a82Var.b();
        int c = a82Var.c();
        if (b >= 1024 && b <= 3072 && b % 1024 == 0) {
            if (b == 1024 && c != 160) {
                throw new IllegalArgumentException("N must be 160 for L = 1024");
            }
            if (b == 2048 && c != 224 && c != 256) {
                throw new IllegalArgumentException("N must be 224 or 256 for L = 2048");
            }
            if (b == 3072 && c != 256) {
                throw new IllegalArgumentException("N must be 256 for L = 3072");
            }
            if (this.a.getDigestSize() * 8 >= c) {
                this.b = b;
                this.c = c;
                this.d = a82Var.a();
                this.e = Math.max(h(b), (this.d + 1) / 2);
                this.f = a82Var.d();
                this.g = true;
                this.h = a82Var.e();
                return;
            }
            throw new IllegalStateException("Digest output size too small for value of N");
        }
        throw new IllegalArgumentException("L values must be between 1024 and 3072 and a multiple of 1024");
    }

    public c82(e23 e23Var) {
        this.a = e23Var;
    }
}
