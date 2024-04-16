package defpackage;
/* renamed from: lf5  reason: default package */
/* loaded from: classes3.dex */
public class lf5 implements v71 {
    private byte[] a;

    public lf5(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public byte[] a() {
        return this.a;
    }

    public lf5(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.a = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }
}
