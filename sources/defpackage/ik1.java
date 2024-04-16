package defpackage;

import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CompactHashing.java */
/* renamed from: ik1  reason: default package */
/* loaded from: classes2.dex */
public final class ik1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object a(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            if (i <= 256) {
                return new byte[i];
            }
            if (i <= 65536) {
                return new short[i];
            }
            return new int[i];
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i, int i2) {
        return i & (~i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i, int i2) {
        return i & i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(int i) {
        int i2;
        if (i < 32) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        return i2 * (i + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int c = cn4.c(obj);
        int i4 = c & i;
        int h = h(obj3, i4);
        if (h == 0) {
            return -1;
        }
        int b = b(c, i);
        int i5 = -1;
        while (true) {
            i2 = h - 1;
            i3 = iArr[i2];
            if (b(i3, i) != b || !n57.a(obj, objArr[i2]) || (objArr2 != null && !n57.a(obj2, objArr2[i2]))) {
                int c2 = c(i3, i);
                if (c2 == 0) {
                    return -1;
                }
                i5 = i2;
                h = c2;
            }
        }
        int c3 = c(i3, i);
        if (i5 == -1) {
            i(obj3, i4, c3);
        } else {
            iArr[i5] = d(iArr[i5], c3, i);
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i] & 65535;
        }
        return ((int[]) obj)[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(int i) {
        return Math.max(4, cn4.a(i + 1, 1.0d));
    }
}
