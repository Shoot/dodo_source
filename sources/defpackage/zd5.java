package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
/* renamed from: zd5  reason: default package */
/* loaded from: classes3.dex */
public class zd5 implements x36 {
    private final ud5 a;
    private final int b;

    public zd5(ud5 ud5Var, int i) {
        this.a = ud5Var;
        this.b = i;
    }

    @Override // defpackage.x36
    public int doFinal(byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        try {
            return this.a.doFinal(bArr, i);
        } catch (InvalidCipherTextException e) {
            throw new IllegalStateException(e.toString());
        }
    }

    @Override // defpackage.x36
    public String getAlgorithmName() {
        return this.a.getUnderlyingCipher().getAlgorithmName() + "-KGMAC";
    }

    @Override // defpackage.x36
    public int getMacSize() {
        return this.b / 8;
    }

    @Override // defpackage.x36
    public void init(v71 v71Var) throws IllegalArgumentException {
        if (v71Var instanceof pq7) {
            pq7 pq7Var = (pq7) v71Var;
            this.a.init(true, new p((lf5) pq7Var.b(), this.b, pq7Var.a()));
            return;
        }
        throw new IllegalArgumentException("KGMAC requires ParametersWithIV");
    }

    @Override // defpackage.x36
    public void reset() {
        this.a.g();
    }

    @Override // defpackage.x36
    public void update(byte b) throws IllegalStateException {
        this.a.f(b);
    }

    @Override // defpackage.x36
    public void update(byte[] bArr, int i, int i2) throws DataLengthException, IllegalStateException {
        this.a.b(bArr, i, i2);
    }
}
