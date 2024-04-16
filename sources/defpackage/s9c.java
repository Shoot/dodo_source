package defpackage;
/* renamed from: s9c  reason: default package */
/* loaded from: classes3.dex */
public final class s9c extends ux {
    private final byte[] b;

    public s9c(byte[] bArr) {
        this(c(bArr), 0);
    }

    private static byte[] c(byte[] bArr) {
        if (bArr.length == 56) {
            return bArr;
        }
        throw new IllegalArgumentException("'buf' must have length 56");
    }

    public void b(byte[] bArr, int i) {
        System.arraycopy(this.b, 0, bArr, i, 56);
    }

    public byte[] getEncoded() {
        return tr.h(this.b);
    }

    public s9c(byte[] bArr, int i) {
        super(false);
        byte[] bArr2 = new byte[56];
        this.b = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, 56);
    }
}
