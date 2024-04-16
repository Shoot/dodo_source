package defpackage;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;
/* renamed from: ss4  reason: default package */
/* loaded from: classes3.dex */
public class ss4 implements yc0 {
    SecureRandom a;

    @Override // defpackage.yc0
    public int a(byte[] bArr) throws InvalidCipherTextException {
        int i = bArr[bArr.length - 1] & 255;
        if (i <= bArr.length) {
            return i;
        }
        throw new InvalidCipherTextException("pad block corrupted");
    }

    @Override // defpackage.yc0
    public void b(SecureRandom secureRandom) throws IllegalArgumentException {
        this.a = b32.c(secureRandom);
    }

    @Override // defpackage.yc0
    public int c(byte[] bArr, int i) {
        byte length = (byte) (bArr.length - i);
        while (i < bArr.length - 1) {
            bArr[i] = (byte) this.a.nextInt();
            i++;
        }
        bArr[i] = length;
        return length;
    }
}
