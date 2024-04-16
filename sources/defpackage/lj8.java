package defpackage;

import defpackage.fhb;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: PrfAesCmac.java */
/* renamed from: lj8  reason: default package */
/* loaded from: classes2.dex */
public final class lj8 implements kj8 {
    public static final fhb.b d = fhb.b.a;
    private final SecretKey a;
    private byte[] b;
    private byte[] c;

    public lj8(byte[] bArr) throws GeneralSecurityException {
        zvb.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
        b();
    }

    private void b() throws GeneralSecurityException {
        Cipher c = c();
        c.init(1, this.a);
        byte[] b = ab.b(c.doFinal(new byte[16]));
        this.b = b;
        this.c = ab.b(b);
    }

    private static Cipher c() throws GeneralSecurityException {
        if (d.a()) {
            return yh3.e.a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // defpackage.kj8
    public byte[] a(byte[] bArr, int i) throws GeneralSecurityException {
        byte[] e;
        if (i <= 16) {
            Cipher c = c();
            c.init(1, this.a);
            int max = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
            if (max * 16 == bArr.length) {
                e = nk0.d(bArr, (max - 1) * 16, this.b, 0, 16);
            } else {
                e = nk0.e(ab.a(Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length)), this.c);
            }
            byte[] bArr2 = new byte[16];
            for (int i2 = 0; i2 < max - 1; i2++) {
                bArr2 = c.doFinal(nk0.d(bArr2, 0, bArr, i2 * 16, 16));
            }
            return Arrays.copyOf(c.doFinal(nk0.e(e, bArr2)), i);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
