package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
/* compiled from: InsecureNonceXChaCha20.java */
/* renamed from: j45  reason: default package */
/* loaded from: classes2.dex */
public class j45 extends g45 {
    public j45(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    static int[] g(int[] iArr, int[] iArr2) {
        qu0.c(r0, iArr);
        int[] iArr3 = {0, 0, 0, 0, iArr3[12], iArr3[13], iArr3[14], iArr3[15], 0, 0, 0, 0, iArr2[0], iArr2[1], iArr2[2], iArr2[3]};
        qu0.d(iArr3);
        return Arrays.copyOf(iArr3, 8);
    }

    @Override // defpackage.g45
    int[] b(int[] iArr, int i) {
        if (iArr.length == e() / 4) {
            int[] iArr2 = new int[16];
            qu0.c(iArr2, g(this.a, iArr));
            iArr2[12] = i;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
    }

    @Override // defpackage.g45
    public /* bridge */ /* synthetic */ byte[] c(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        return super.c(bArr, byteBuffer);
    }

    @Override // defpackage.g45
    public /* bridge */ /* synthetic */ void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        super.d(byteBuffer, bArr, bArr2);
    }

    @Override // defpackage.g45
    int e() {
        return 24;
    }
}
