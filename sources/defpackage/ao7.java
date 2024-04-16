package defpackage;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;
/* renamed from: ao7  reason: default package */
/* loaded from: classes3.dex */
public class ao7 implements yc0 {
    @Override // defpackage.yc0
    public int a(byte[] bArr) throws InvalidCipherTextException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = bArr[bArr.length - 1] & 255;
        byte b = (byte) i;
        if (i > bArr.length) {
            z = true;
        } else {
            z = false;
        }
        if (i == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z | z2;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (bArr.length - i2 <= i) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bArr[i2] != b) {
                z4 = true;
            } else {
                z4 = false;
            }
            z5 |= z3 & z4;
        }
        if (!z5) {
            return i;
        }
        throw new InvalidCipherTextException("pad block corrupted");
    }

    @Override // defpackage.yc0
    public int c(byte[] bArr, int i) {
        byte length = (byte) (bArr.length - i);
        while (i < bArr.length) {
            bArr[i] = length;
            i++;
        }
        return length;
    }

    @Override // defpackage.yc0
    public void b(SecureRandom secureRandom) throws IllegalArgumentException {
    }
}
