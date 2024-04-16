package defpackage;

import defpackage.fhb;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* compiled from: AesGcmJce.java */
/* renamed from: na  reason: default package */
/* loaded from: classes2.dex */
public final class na implements l9 {
    public static final fhb.b b = fhb.b.b;
    private final e45 a;

    public na(byte[] bArr) throws GeneralSecurityException {
        if (b.a()) {
            this.a = new e45(bArr, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // defpackage.l9
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.a.a(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }

    @Override // defpackage.l9
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.a.b(a49.c(12), bArr, bArr2);
    }
}
