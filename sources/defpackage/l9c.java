package defpackage;
/* renamed from: l9c  reason: default package */
/* loaded from: classes3.dex */
public final class l9c extends ux {
    private final byte[] b;

    public l9c(byte[] bArr) {
        this(c(bArr), 0);
    }

    private static byte[] c(byte[] bArr) {
        if (bArr.length == 32) {
            return bArr;
        }
        throw new IllegalArgumentException("'buf' must have length 32");
    }

    public void b(byte[] bArr, int i) {
        System.arraycopy(this.b, 0, bArr, i, 32);
    }

    public byte[] getEncoded() {
        return tr.h(this.b);
    }

    public l9c(byte[] bArr, int i) {
        super(false);
        byte[] bArr2 = new byte[32];
        this.b = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, 32);
    }
}
