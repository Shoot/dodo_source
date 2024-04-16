package defpackage;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;
/* renamed from: us4  reason: default package */
/* loaded from: classes3.dex */
public class us4 implements yc0 {
    @Override // defpackage.yc0
    public int a(byte[] bArr) throws InvalidCipherTextException {
        int length = bArr.length - 1;
        while (length > 0 && bArr[length] == 0) {
            length--;
        }
        if (bArr[length] == Byte.MIN_VALUE) {
            return bArr.length - length;
        }
        throw new InvalidCipherTextException("pad block corrupted");
    }

    @Override // defpackage.yc0
    public int c(byte[] bArr, int i) {
        int length = bArr.length - i;
        bArr[i] = Byte.MIN_VALUE;
        while (true) {
            i++;
            if (i < bArr.length) {
                bArr[i] = 0;
            } else {
                return length;
            }
        }
    }

    @Override // defpackage.yc0
    public void b(SecureRandom secureRandom) throws IllegalArgumentException {
    }
}
