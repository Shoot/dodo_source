package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* compiled from: XChaCha20Poly1305.java */
/* renamed from: pac  reason: default package */
/* loaded from: classes2.dex */
public final class pac implements l9 {
    private final k45 a;

    public pac(byte[] bArr) throws GeneralSecurityException {
        this.a = new k45(bArr);
    }

    @Override // defpackage.l9
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length >= 40) {
            byte[] copyOf = Arrays.copyOf(bArr, 24);
            return this.a.a(ByteBuffer.wrap(bArr, 24, bArr.length - 24), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // defpackage.l9
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] c = a49.c(24);
        allocate.put(c);
        this.a.b(allocate, c, bArr, bArr2);
        return allocate.array();
    }
}
