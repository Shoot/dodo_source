package defpackage;
/* renamed from: b65  reason: default package */
/* loaded from: classes3.dex */
public final class b65 {
    public static int[] a(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public static boolean b(int[] iArr, int[] iArr2) {
        boolean z;
        if (iArr.length != iArr2.length) {
            return false;
        }
        boolean z2 = true;
        for (int length = iArr.length - 1; length >= 0; length--) {
            if (iArr[length] == iArr2[length]) {
                z = true;
            } else {
                z = false;
            }
            z2 &= z;
        }
        return z2;
    }
}
