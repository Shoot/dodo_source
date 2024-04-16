package defpackage;
/* renamed from: sq7  reason: default package */
/* loaded from: classes3.dex */
public class sq7 implements v71 {
    private byte[] a;
    private v71 b;

    public sq7(v71 v71Var, byte[] bArr) {
        this(v71Var, bArr, 0, bArr.length);
    }

    public v71 a() {
        return this.b;
    }

    public byte[] b() {
        return this.a;
    }

    public sq7(v71 v71Var, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.a = bArr2;
        this.b = v71Var;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }
}
