package defpackage;

import defpackage.fhb;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: AesSiv.java */
/* renamed from: wa  reason: default package */
/* loaded from: classes2.dex */
public final class wa implements m13 {
    public static final fhb.b c = fhb.b.a;
    private static final Collection<Integer> d = Arrays.asList(64);
    private static final byte[] e = new byte[16];
    private static final byte[] f = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    private final lj8 a;
    private final byte[] b;

    public wa(byte[] bArr) throws GeneralSecurityException {
        if (c.a()) {
            if (d.contains(Integer.valueOf(bArr.length))) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
                this.b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
                this.a = new lj8(copyOfRange);
                return;
            }
            throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 64 bytes");
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }

    private byte[] c(byte[]... bArr) throws GeneralSecurityException {
        byte[] e2;
        if (bArr.length == 0) {
            return this.a.a(f, 16);
        }
        byte[] a = this.a.a(e, 16);
        for (int i = 0; i < bArr.length - 1; i++) {
            byte[] bArr2 = bArr[i];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            a = nk0.e(ab.b(a), this.a.a(bArr2, 16));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            e2 = nk0.f(bArr3, a);
        } else {
            e2 = nk0.e(ab.a(bArr3), ab.b(a));
        }
        return this.a.a(e2, 16);
    }

    @Override // defpackage.m13
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= 2147483631) {
            Cipher a = yh3.e.a("AES/CTR/NoPadding");
            byte[] c2 = c(bArr2, bArr);
            byte[] bArr3 = (byte[]) c2.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            a.init(1, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(bArr3));
            return nk0.a(c2, a.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // defpackage.m13
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length >= 16) {
            Cipher a = yh3.e.a("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr3 = (byte[]) copyOfRange.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            a.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(bArr3));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
            byte[] doFinal = a.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && p1b.b()) {
                doFinal = new byte[0];
            }
            if (nk0.b(copyOfRange, c(bArr2, doFinal))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }
}
