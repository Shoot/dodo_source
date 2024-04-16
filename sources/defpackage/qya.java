package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: qya  reason: default package */
/* loaded from: classes3.dex */
public abstract class qya implements xc0, rya {
    private final xc0 a;

    /* JADX INFO: Access modifiers changed from: protected */
    public qya(xc0 xc0Var) {
        this.a = xc0Var;
    }

    protected abstract byte c(byte b);

    public xc0 d() {
        return this.a;
    }

    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        int i4 = i + i2;
        if (i4 <= bArr.length) {
            if (i3 + i2 <= bArr2.length) {
                while (i < i4) {
                    bArr2[i3] = c(bArr[i]);
                    i3++;
                    i++;
                }
                return i2;
            }
            throw new OutputLengthException("output buffer too short");
        }
        throw new DataLengthException("input buffer too small");
    }
}
