package defpackage;
/* compiled from: IntReader.java */
/* renamed from: v55  reason: default package */
/* loaded from: classes3.dex */
final class v55 {
    private byte[] a;
    private int[] b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(v55 v55Var, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int[] iArr = v55Var.b;
            byte[] bArr = v55Var.a;
            int i3 = i2 * 4;
            iArr[i2] = ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(v55 v55Var, byte[] bArr, int[] iArr) {
        v55Var.a = bArr;
        v55Var.b = iArr;
    }
}
