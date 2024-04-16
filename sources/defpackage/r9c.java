package defpackage;

import java.security.SecureRandom;
/* renamed from: r9c  reason: default package */
/* loaded from: classes3.dex */
public final class r9c extends ux {
    private final byte[] b;

    public r9c(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[56];
        this.b = bArr;
        m9c.d(secureRandom, bArr);
    }

    private static byte[] d(byte[] bArr) {
        if (bArr.length == 56) {
            return bArr;
        }
        throw new IllegalArgumentException("'buf' must have length 56");
    }

    public s9c b() {
        byte[] bArr = new byte[56];
        m9c.e(this.b, 0, bArr, 0);
        return new s9c(bArr, 0);
    }

    public void c(s9c s9cVar, byte[] bArr, int i) {
        byte[] bArr2 = new byte[56];
        s9cVar.b(bArr2, 0);
        if (m9c.a(this.b, 0, bArr2, 0, bArr, i)) {
            return;
        }
        throw new IllegalStateException("X448 agreement failed");
    }

    public byte[] getEncoded() {
        return tr.h(this.b);
    }

    public r9c(byte[] bArr) {
        this(d(bArr), 0);
    }

    public r9c(byte[] bArr, int i) {
        super(true);
        byte[] bArr2 = new byte[56];
        this.b = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, 56);
    }
}
