package defpackage;
/* compiled from: Utils.java */
/* renamed from: mvb  reason: default package */
/* loaded from: classes3.dex */
final class mvb {
    private static final byte[] a = new byte[1024];
    private static final int[] b = new int[1024];

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int min = Math.min(i3 + 1024, i2) - i3;
            System.arraycopy(a, 0, bArr, i + i3, min);
            i3 += min;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(int[] iArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int min = Math.min(i3 + 1024, i2) - i3;
            System.arraycopy(b, 0, iArr, i + i3, min);
            i3 += min;
        }
    }
}
