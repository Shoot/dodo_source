package defpackage;
/* renamed from: sc3  reason: default package */
/* loaded from: classes3.dex */
public final class sc3 extends ux {
    private final byte[] b;

    public sc3(byte[] bArr) {
        this(c(bArr), 0);
    }

    private static byte[] c(byte[] bArr) {
        if (bArr.length == 57) {
            return bArr;
        }
        throw new IllegalArgumentException("'buf' must have length 57");
    }

    public void b(byte[] bArr, int i) {
        System.arraycopy(this.b, 0, bArr, i, 57);
    }

    public byte[] getEncoded() {
        return tr.h(this.b);
    }

    public sc3(byte[] bArr, int i) {
        super(false);
        byte[] bArr2 = new byte[57];
        this.b = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, 57);
    }
}
