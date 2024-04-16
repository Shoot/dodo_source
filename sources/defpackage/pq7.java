package defpackage;
/* renamed from: pq7  reason: default package */
/* loaded from: classes3.dex */
public class pq7 implements v71 {
    private byte[] a;
    private v71 b;

    public pq7(v71 v71Var, byte[] bArr) {
        this(v71Var, bArr, 0, bArr.length);
    }

    public byte[] a() {
        return this.a;
    }

    public v71 b() {
        return this.b;
    }

    public pq7(v71 v71Var, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.a = bArr2;
        this.b = v71Var;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }
}
