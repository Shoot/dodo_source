package defpackage;
/* renamed from: ym7  reason: default package */
/* loaded from: classes3.dex */
public abstract class ym7 {
    protected byte[] a;
    protected byte[] b;
    protected int c;

    public static byte[] a(char[] cArr) {
        if (cArr != null && cArr.length > 0) {
            byte[] bArr = new byte[(cArr.length + 1) * 2];
            for (int i = 0; i != cArr.length; i++) {
                int i2 = i * 2;
                char c = cArr[i];
                bArr[i2] = (byte) (c >>> '\b');
                bArr[i2 + 1] = (byte) c;
            }
            return bArr;
        }
        return new byte[0];
    }

    public static byte[] b(char[] cArr) {
        if (cArr != null) {
            int length = cArr.length;
            byte[] bArr = new byte[length];
            for (int i = 0; i != length; i++) {
                bArr[i] = (byte) cArr[i];
            }
            return bArr;
        }
        return new byte[0];
    }

    public static byte[] c(char[] cArr) {
        if (cArr != null) {
            return a0b.i(cArr);
        }
        return new byte[0];
    }

    public abstract v71 d(int i);

    public abstract v71 e(int i);

    public abstract v71 f(int i, int i2);

    public void g(byte[] bArr, byte[] bArr2, int i) {
        this.a = bArr;
        this.b = bArr2;
        this.c = i;
    }
}
