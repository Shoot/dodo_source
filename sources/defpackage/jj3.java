package defpackage;
/* renamed from: jj3  reason: default package */
/* loaded from: classes3.dex */
public class jj3 {
    public static byte[] a(hj3 hj3Var, int i) {
        byte[] bArr = new byte[i];
        if (i * 8 <= hj3Var.entropySize()) {
            System.arraycopy(hj3Var.getEntropy(), 0, bArr, 0, i);
        } else {
            int entropySize = hj3Var.entropySize() / 8;
            for (int i2 = 0; i2 < i; i2 += entropySize) {
                byte[] entropy = hj3Var.getEntropy();
                int i3 = i - i2;
                if (entropy.length <= i3) {
                    System.arraycopy(entropy, 0, bArr, i2, entropy.length);
                } else {
                    System.arraycopy(entropy, 0, bArr, i2, i3);
                }
            }
        }
        return bArr;
    }
}
