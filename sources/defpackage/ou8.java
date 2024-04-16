package defpackage;
/* renamed from: ou8  reason: default package */
/* loaded from: classes3.dex */
public final class ou8 extends ux {
    private int b;
    private byte[] c;

    public ou8(int i, byte[] bArr) {
        super(true);
        if (bArr.length == qu8.b(i)) {
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
