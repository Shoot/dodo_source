package defpackage;

import java.security.SecureRandom;
/* renamed from: k9c  reason: default package */
/* loaded from: classes3.dex */
public final class k9c extends ux {
    private final byte[] b;

    public k9c(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[32];
        this.b = bArr;
        f9c.d(secureRandom, bArr);
    }

    private static byte[] d(byte[] bArr) {
        if (bArr.length == 32) {
            return bArr;
        }
        throw new IllegalArgumentException("'buf' must have length 32");
    }

    public l9c b() {
        byte[] bArr = new byte[32];
        f9c.e(this.b, 0, bArr, 0);
        return new l9c(bArr, 0);
    }

    public void c(l9c l9cVar, byte[] bArr, int i) {
        byte[] bArr2 = new byte[32];
        l9cVar.b(bArr2, 0);
        if (f9c.a(this.b, 0, bArr2, 0, bArr, i)) {
            return;
        }
        throw new IllegalStateException("X25519 agreement failed");
    }

    public byte[] getEncoded() {
        return tr.h(this.b);
    }

    public k9c(byte[] bArr) {
        this(d(bArr), 0);
    }

    public k9c(byte[] bArr, int i) {
        super(true);
        byte[] bArr2 = new byte[32];
        this.b = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, 32);
    }
}
