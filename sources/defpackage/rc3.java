package defpackage;

import java.security.SecureRandom;
/* renamed from: rc3  reason: default package */
/* loaded from: classes3.dex */
public final class rc3 extends ux {
    private final byte[] b;
    private sc3 c;

    public rc3(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[57];
        this.b = bArr;
        oc3.t(secureRandom, bArr);
    }

    private static byte[] d(byte[] bArr) {
        if (bArr.length == 57) {
            return bArr;
        }
        throw new IllegalArgumentException("'buf' must have length 57");
    }

    public sc3 b() {
        sc3 sc3Var;
        synchronized (this.b) {
            try {
                if (this.c == null) {
                    byte[] bArr = new byte[57];
                    oc3.u(this.b, 0, bArr, 0);
                    this.c = new sc3(bArr, 0);
                }
                sc3Var = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sc3Var;
    }

    public void c(int i, byte[] bArr, byte[] bArr2, int i2, int i3, byte[] bArr3, int i4) {
        byte[] bArr4 = new byte[57];
        b().b(bArr4, 0);
        if (i != 0) {
            if (i == 1) {
                if (64 == i3) {
                    oc3.Q(this.b, 0, bArr4, 0, bArr, bArr2, i2, bArr3, i4);
                    return;
                }
                throw new IllegalArgumentException("msgLen");
            }
            throw new IllegalArgumentException("algorithm");
        }
        oc3.P(this.b, 0, bArr4, 0, bArr, bArr2, i2, i3, bArr3, i4);
    }

    public byte[] getEncoded() {
        return tr.h(this.b);
    }

    public rc3(byte[] bArr) {
        this(d(bArr), 0);
    }

    public rc3(byte[] bArr, int i) {
        super(true);
        byte[] bArr2 = new byte[57];
        this.b = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, 57);
    }
}
