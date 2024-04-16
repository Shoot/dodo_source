package defpackage;

import java.security.SecureRandom;
/* renamed from: lc3  reason: default package */
/* loaded from: classes3.dex */
public final class lc3 extends ux {
    private final byte[] b;
    private mc3 c;

    public lc3(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[32];
        this.b = bArr;
        ic3.s(secureRandom, bArr);
    }

    private static byte[] d(byte[] bArr) {
        if (bArr.length == 32) {
            return bArr;
        }
        throw new IllegalArgumentException("'buf' must have length 32");
    }

    public mc3 b() {
        mc3 mc3Var;
        synchronized (this.b) {
            try {
                if (this.c == null) {
                    byte[] bArr = new byte[32];
                    ic3.t(this.b, 0, bArr, 0);
                    this.c = new mc3(bArr, 0);
                }
                mc3Var = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mc3Var;
    }

    public void c(int i, byte[] bArr, byte[] bArr2, int i2, int i3, byte[] bArr3, int i4) {
        byte[] bArr4 = new byte[32];
        b().b(bArr4, 0);
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    if (64 == i3) {
                        ic3.V(this.b, 0, bArr4, 0, bArr, bArr2, i2, bArr3, i4);
                        return;
                    }
                    throw new IllegalArgumentException("msgLen");
                }
                throw new IllegalArgumentException("algorithm");
            }
            ic3.U(this.b, 0, bArr4, 0, bArr, bArr2, i2, i3, bArr3, i4);
        } else if (bArr == null) {
            ic3.T(this.b, 0, bArr4, 0, bArr2, i2, i3, bArr3, i4);
        } else {
            throw new IllegalArgumentException("ctx");
        }
    }

    public byte[] getEncoded() {
        return tr.h(this.b);
    }

    public lc3(byte[] bArr) {
        this(d(bArr), 0);
    }

    public lc3(byte[] bArr, int i) {
        super(true);
        byte[] bArr2 = new byte[32];
        this.b = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, 32);
    }
}
