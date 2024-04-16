package defpackage;
/* renamed from: v29  reason: default package */
/* loaded from: classes3.dex */
public class v29 implements v71 {
    private byte[] a;
    private int b;

    public v29(byte[] bArr, int i) {
        if (bArr.length <= 255) {
            byte[] bArr2 = new byte[bArr.length];
            this.a = bArr2;
            this.b = i;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return;
        }
        throw new IllegalArgumentException("RC5 key length can be no greater than 255");
    }

    public byte[] a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }
}
