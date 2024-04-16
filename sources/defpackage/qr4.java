package defpackage;
/* renamed from: qr4  reason: default package */
/* loaded from: classes3.dex */
public class qr4 implements v71 {
    private byte[] a;
    private byte[] b;
    private int c;

    public qr4(byte[] bArr, byte[] bArr2, int i) {
        this.a = tr.h(bArr);
        this.b = tr.h(bArr2);
        this.c = i;
    }

    public byte[] a() {
        return tr.h(this.a);
    }

    public byte[] b() {
        return tr.h(this.b);
    }

    public int c() {
        return this.c;
    }
}
