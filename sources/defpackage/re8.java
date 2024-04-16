package defpackage;
/* renamed from: re8  reason: default package */
/* loaded from: classes3.dex */
public class re8 extends t71 {
    public static void c(byte[] bArr) {
        if (bArr.length == 32) {
            bArr[3] = (byte) (bArr[3] & 15);
            bArr[7] = (byte) (bArr[7] & 15);
            bArr[11] = (byte) (bArr[11] & 15);
            bArr[15] = (byte) (bArr[15] & 15);
            bArr[4] = (byte) (bArr[4] & (-4));
            bArr[8] = (byte) (bArr[8] & (-4));
            bArr[12] = (byte) (bArr[12] & (-4));
            return;
        }
        throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
    }

    @Override // defpackage.t71
    public byte[] a() {
        byte[] a = super.a();
        c(a);
        return a;
    }

    @Override // defpackage.t71
    public void b(ff5 ff5Var) {
        super.b(new ff5(ff5Var.a(), 256));
    }
}
