package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
/* renamed from: fo3  reason: default package */
/* loaded from: classes3.dex */
public abstract class fo3 {
    protected final xc0 a;
    protected boolean b;
    protected jo3 c;

    /* JADX INFO: Access modifiers changed from: protected */
    public fo3(xc0 xc0Var) {
        this.a = xc0Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] f(short[] sArr) {
        byte[] bArr = new byte[sArr.length * 2];
        for (int i = 0; i != sArr.length; i++) {
            mo7.A(sArr[i], bArr, i * 2);
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static short[] g(byte[] bArr) {
        if ((bArr.length & 1) == 0) {
            int length = bArr.length / 2;
            short[] sArr = new short[length];
            for (int i = 0; i != length; i++) {
                sArr[i] = mo7.e(bArr, i * 2);
            }
            return sArr;
        }
        throw new IllegalArgumentException("data must be an even number of bytes for a wide radix");
    }

    protected abstract int a(byte[] bArr, int i, int i2, byte[] bArr2, int i3);

    protected abstract int b(byte[] bArr, int i, int i2, byte[] bArr2, int i3);

    public abstract String c();

    public abstract void d(boolean z, v71 v71Var);

    public int e(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (this.c != null) {
            if (i2 >= 0) {
                if (bArr != null && bArr2 != null) {
                    if (bArr.length >= i + i2) {
                        if (bArr2.length >= i3 + i2) {
                            if (this.b) {
                                return b(bArr, i, i2, bArr2, i3);
                            }
                            return a(bArr, i, i2, bArr2, i3);
                        }
                        throw new OutputLengthException("output buffer too short");
                    }
                    throw new DataLengthException("input buffer too short");
                }
                throw new NullPointerException("buffer value is null");
            }
            throw new IllegalArgumentException("input length cannot be negative");
        }
        throw new IllegalStateException("FPE engine not initialized");
    }
}
