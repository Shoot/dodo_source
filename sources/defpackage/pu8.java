package defpackage;
/* renamed from: pu8  reason: default package */
/* loaded from: classes3.dex */
public final class pu8 extends ux {
    private int b;
    private byte[] c;

    public pu8(int i, byte[] bArr) {
        super(false);
        if (bArr.length == qu8.c(i)) {
            this.b = i;
            this.c = tr.h(bArr);
            return;
        }
        throw new IllegalArgumentException("invalid key size for security category");
    }

    public byte[] b() {
        return tr.h(this.c);
    }

    public int c() {
        return this.b;
    }
}
