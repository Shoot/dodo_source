package defpackage;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
/* renamed from: ra4  reason: default package */
/* loaded from: classes3.dex */
public class ra4 implements x36 {
    private final z94 a;
    private final int b = 128;

    public ra4(z94 z94Var) {
        this.a = z94Var;
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
        return this.a.getUnderlyingCipher().getAlgorithmName() + "-GMAC";
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
        throw new IllegalArgumentException("GMAC requires ParametersWithIV");
    }

    @Override // defpackage.x36
    public void reset() {
        this.a.m();
    }

    @Override // defpackage.x36
    public void update(byte b) throws IllegalStateException {
        this.a.j(b);
    }

    @Override // defpackage.x36
    public void update(byte[] bArr, int i, int i2) throws DataLengthException, IllegalStateException {
        this.a.b(bArr, i, i2);
    }
}
