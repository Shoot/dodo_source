package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* compiled from: ChaCha20Poly1305.java */
/* renamed from: mu0  reason: default package */
/* loaded from: classes2.dex */
public final class mu0 implements l9 {
    private final h45 a;

    public mu0(byte[] bArr) throws GeneralSecurityException {
        this.a = new h45(bArr);
    }

    @Override // defpackage.l9
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length >= 28) {
            byte[] copyOf = Arrays.copyOf(bArr, 12);
            return this.a.a(ByteBuffer.wrap(bArr, 12, bArr.length - 12), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // defpackage.l9
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] c = a49.c(12);
        allocate.put(c);
        this.a.b(allocate, c, bArr, bArr2);
        return allocate.array();
    }
}
