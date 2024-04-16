package defpackage;

import java.util.Hashtable;
/* renamed from: jvb  reason: default package */
/* loaded from: classes3.dex */
class jvb {
    static final Hashtable a;

    static {
        Hashtable hashtable = new Hashtable();
        a = hashtable;
        hashtable.put("SHA-1", g65.d(128));
        hashtable.put("SHA-224", g65.d(192));
        hashtable.put("SHA-256", g65.d(256));
        hashtable.put("SHA-384", g65.d(256));
        hashtable.put("SHA-512", g65.d(256));
        hashtable.put("SHA-512/224", g65.d(192));
        hashtable.put("SHA-512/256", g65.d(256));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(e23 e23Var) {
        return ((Integer) a.get(e23Var.getAlgorithmName())).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(x36 x36Var) {
        String algorithmName = x36Var.getAlgorithmName();
        return ((Integer) a.get(algorithmName.substring(0, algorithmName.indexOf("/")))).intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] c(e23 e23Var, byte[] bArr, int i) {
        int i2 = (i + 7) / 8;
        byte[] bArr2 = new byte[i2];
        int digestSize = i2 / e23Var.getDigestSize();
        int digestSize2 = e23Var.getDigestSize();
        byte[] bArr3 = new byte[digestSize2];
        int i3 = 1;
        int i4 = 0;
        for (int i5 = 0; i5 <= digestSize; i5++) {
            e23Var.update((byte) i3);
            e23Var.update((byte) (i >> 24));
            e23Var.update((byte) (i >> 16));
            e23Var.update((byte) (i >> 8));
            e23Var.update((byte) i);
            e23Var.update(bArr, 0, bArr.length);
            e23Var.doFinal(bArr3, 0);
            int i6 = i5 * digestSize2;
            int i7 = i2 - i6;
            if (i7 > digestSize2) {
                i7 = digestSize2;
            }
            System.arraycopy(bArr3, 0, bArr2, i6, i7);
            i3++;
        }
        int i8 = i % 8;
        if (i8 != 0) {
            int i9 = 8 - i8;
            int i10 = 0;
            while (i4 != i2) {
                int i11 = bArr2[i4] & 255;
                bArr2[i4] = (byte) ((i10 << (8 - i9)) | (i11 >>> i9));
                i4++;
                i10 = i11;
            }
        }
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(byte[] bArr, int i) {
        if (bArr != null && bArr.length > i) {
            return true;
        }
        return false;
    }
}
