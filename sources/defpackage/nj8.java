package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* compiled from: PrfMac.java */
/* renamed from: nj8  reason: default package */
/* loaded from: classes2.dex */
public class nj8 implements y36 {
    private final kj8 a;
    private final int b;

    public nj8(kj8 kj8Var, int i) throws GeneralSecurityException {
        this.a = kj8Var;
        this.b = i;
        if (i >= 10) {
            kj8Var.a(new byte[0], i);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    @Override // defpackage.y36
    public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (nk0.b(b(bArr2), bArr)) {
            return;
        }
        throw new GeneralSecurityException("invalid MAC");
    }

    @Override // defpackage.y36
    public byte[] b(byte[] bArr) throws GeneralSecurityException {
        return this.a.a(bArr, this.b);
    }
}
