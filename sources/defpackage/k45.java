package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* compiled from: InsecureNonceXChaCha20Poly1305.java */
/* renamed from: k45  reason: default package */
/* loaded from: classes2.dex */
public final class k45 extends i45 {
    public k45(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // defpackage.i45
    public /* bridge */ /* synthetic */ byte[] a(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return super.a(byteBuffer, bArr, bArr2);
    }

    @Override // defpackage.i45
    public /* bridge */ /* synthetic */ void b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        super.b(byteBuffer, bArr, bArr2, bArr3);
    }

    @Override // defpackage.i45
    g45 e(byte[] bArr, int i) throws InvalidKeyException {
        return new j45(bArr, i);
    }
}
