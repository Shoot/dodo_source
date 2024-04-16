package defpackage;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;
/* renamed from: qcc  reason: default package */
/* loaded from: classes3.dex */
public class qcc implements yc0 {
    @Override // defpackage.yc0
    public int a(byte[] bArr) throws InvalidCipherTextException {
        int length = bArr.length;
        while (length > 0 && bArr[length - 1] == 0) {
            length--;
        }
        return bArr.length - length;
    }

    @Override // defpackage.yc0
    public int c(byte[] bArr, int i) {
        int length = bArr.length - i;
        while (i < bArr.length) {
            bArr[i] = 0;
            i++;
        }
        return length;
    }

    @Override // defpackage.yc0
    public void b(SecureRandom secureRandom) throws IllegalArgumentException {
    }
}
