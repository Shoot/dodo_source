package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* compiled from: InsecureNonceChaCha20.java */
/* renamed from: f45  reason: default package */
/* loaded from: classes2.dex */
public class f45 extends g45 {
    public f45(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    @Override // defpackage.g45
    public int[] b(int[] iArr, int i) {
        if (iArr.length == e() / 4) {
            int[] iArr2 = new int[16];
            qu0.c(iArr2, this.a);
            iArr2[12] = i;
            System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
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
    public int e() {
        return 12;
    }
}
