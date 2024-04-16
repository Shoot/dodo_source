package defpackage;
/* renamed from: r2c  reason: default package */
/* loaded from: classes3.dex */
final class r2c {
    private final byte[][] a;

    /* JADX INFO: Access modifiers changed from: protected */
    public r2c(q2c q2cVar, byte[][] bArr) {
        if (q2cVar != null) {
            if (bArr != null) {
                if (!sbc.k(bArr)) {
                    if (bArr.length == q2cVar.a()) {
                        for (byte[] bArr2 : bArr) {
                            if (bArr2.length != q2cVar.c()) {
                                throw new IllegalArgumentException("wrong publicKey format");
                            }
                        }
                        this.a = sbc.d(bArr);
                        return;
                    }
                    throw new IllegalArgumentException("wrong publicKey size");
                }
                throw new NullPointerException("publicKey byte array == null");
            }
            throw new NullPointerException("publicKey == null");
        }
        throw new NullPointerException("params == null");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[][] a() {
        return sbc.d(this.a);
    }
}
