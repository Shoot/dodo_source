package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* compiled from: EncryptThenAuthenticate.java */
/* renamed from: fh3  reason: default package */
/* loaded from: classes2.dex */
public final class fh3 implements l9 {
    private final e05 a;
    private final y36 b;
    private final int c;

    public fh3(e05 e05Var, y36 y36Var, int i) {
        this.a = e05Var;
        this.b = y36Var;
        this.c = i;
    }

    @Override // defpackage.l9
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.c;
        if (length >= i) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.c, bArr.length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            this.b.a(copyOfRange2, nk0.a(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
            return this.a.b(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // defpackage.l9
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] a = this.a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return nk0.a(a, this.b.b(nk0.a(bArr2, a, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }
}
