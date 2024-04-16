package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
/* renamed from: x62  reason: default package */
/* loaded from: classes3.dex */
public class x62 implements nf5 {
    private h72 a;

    public x62(h72 h72Var) {
        this.a = h72Var;
    }

    @Override // defpackage.nf5
    public ux a(InputStream inputStream) throws IOException {
        int bitLength = (this.a.f().bitLength() + 7) / 8;
        byte[] bArr = new byte[bitLength];
        aza.d(inputStream, bArr, 0, bitLength);
        return new l72(new BigInteger(1, bArr), this.a);
    }
}
