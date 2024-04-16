package defpackage;

import defpackage.fhb;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: AesCtrJceCipher.java */
/* renamed from: da  reason: default package */
/* loaded from: classes2.dex */
public final class da implements e05 {
    public static final fhb.b d = fhb.b.b;
    private static final ThreadLocal<Cipher> e = new a();
    private final SecretKeySpec a;
    private final int b;
    private final int c;

    /* compiled from: AesCtrJceCipher.java */
    /* renamed from: da$a */
    /* loaded from: classes2.dex */
    class a extends ThreadLocal<Cipher> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Cipher initialValue() {
            try {
                return yh3.e.a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public da(byte[] bArr, int i) throws GeneralSecurityException {
        if (d.a()) {
            zvb.a(bArr.length);
            this.a = new SecretKeySpec(bArr, "AES");
            int blockSize = e.get().getBlockSize();
            this.c = blockSize;
            if (i >= 12 && i <= blockSize) {
                this.b = i;
                return;
            }
            throw new GeneralSecurityException("invalid IV size");
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    private void c(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) throws GeneralSecurityException {
        Cipher cipher = e.get();
        byte[] bArr4 = new byte[this.c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z) {
            cipher.init(1, this.a, ivParameterSpec);
        } else {
            cipher.init(2, this.a, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) == i2) {
            return;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }

    @Override // defpackage.e05
    public byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.b;
        if (length <= Integer.MAX_VALUE - i) {
            byte[] bArr2 = new byte[bArr.length + i];
            byte[] c = a49.c(i);
            System.arraycopy(c, 0, bArr2, 0, this.b);
            c(bArr, 0, bArr.length, bArr2, this.b, c, true);
            return bArr2;
        }
        throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - this.b));
    }

    @Override // defpackage.e05
    public byte[] b(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.b;
        if (length >= i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            int length2 = bArr.length;
            int i2 = this.b;
            byte[] bArr3 = new byte[length2 - i2];
            c(bArr, i2, bArr.length - i2, bArr3, 0, bArr2, false);
            return bArr3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
