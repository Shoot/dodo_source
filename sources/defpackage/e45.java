package defpackage;

import defpackage.fhb;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: InsecureNonceAesGcmJce.java */
/* renamed from: e45  reason: default package */
/* loaded from: classes2.dex */
public final class e45 {
    public static final fhb.b c = fhb.b.b;
    private static final ThreadLocal<Cipher> d = new a();
    private final SecretKey a;
    private final boolean b;

    /* compiled from: InsecureNonceAesGcmJce.java */
    /* renamed from: e45$a */
    /* loaded from: classes2.dex */
    class a extends ThreadLocal<Cipher> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return yh3.e.a("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public e45(byte[] bArr, boolean z) throws GeneralSecurityException {
        if (c.a()) {
            zvb.a(bArr.length);
            this.a = new SecretKeySpec(bArr, "AES");
            this.b = z;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    private static AlgorithmParameterSpec c(byte[] bArr) throws GeneralSecurityException {
        return d(bArr, 0, bArr.length);
    }

    private static AlgorithmParameterSpec d(byte[] bArr, int i, int i2) throws GeneralSecurityException {
        if (p1b.b() && p1b.a() <= 19) {
            return new IvParameterSpec(bArr, i, i2);
        }
        return new GCMParameterSpec(128, bArr, i, i2);
    }

    public byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        int i;
        int length;
        if (bArr.length == 12) {
            boolean z = this.b;
            if (z) {
                i = 28;
            } else {
                i = 16;
            }
            if (bArr2.length >= i) {
                int i2 = 0;
                if (z && !ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
                    throw new GeneralSecurityException("iv does not match prepended iv");
                }
                AlgorithmParameterSpec c2 = c(bArr);
                ThreadLocal<Cipher> threadLocal = d;
                threadLocal.get().init(2, this.a, c2);
                if (bArr3 != null && bArr3.length != 0) {
                    threadLocal.get().updateAAD(bArr3);
                }
                boolean z2 = this.b;
                if (z2) {
                    i2 = 12;
                }
                if (z2) {
                    length = bArr2.length - 12;
                } else {
                    length = bArr2.length;
                }
                return threadLocal.get().doFinal(bArr2, i2, length);
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }

    public byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        int length;
        int i;
        if (bArr.length == 12) {
            if (bArr2.length <= 2147483619) {
                boolean z = this.b;
                if (z) {
                    length = bArr2.length + 28;
                } else {
                    length = bArr2.length + 16;
                }
                byte[] bArr4 = new byte[length];
                if (z) {
                    System.arraycopy(bArr, 0, bArr4, 0, 12);
                }
                AlgorithmParameterSpec c2 = c(bArr);
                ThreadLocal<Cipher> threadLocal = d;
                threadLocal.get().init(1, this.a, c2);
                if (bArr3 != null && bArr3.length != 0) {
                    threadLocal.get().updateAAD(bArr3);
                }
                if (this.b) {
                    i = 12;
                } else {
                    i = 0;
                }
                int doFinal = threadLocal.get().doFinal(bArr2, 0, bArr2.length, bArr4, i);
                if (doFinal == bArr2.length + 16) {
                    return bArr4;
                }
                throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - bArr2.length)));
            }
            throw new GeneralSecurityException("plaintext too long");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }
}
