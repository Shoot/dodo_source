package defpackage;
/* renamed from: xb4  reason: default package */
/* loaded from: classes3.dex */
public final class xb4 extends wb4 {
    private static final byte[] m = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

    public xb4() {
        super(m);
    }

    @Override // defpackage.sc6
    public sc6 a() {
        return new xb4(this);
    }

    @Override // defpackage.wb4, defpackage.e23
    public int doFinal(byte[] bArr, int i) {
        byte[] bArr2 = new byte[64];
        super.doFinal(bArr2, 0);
        System.arraycopy(bArr2, 32, bArr, i, 32);
        return 32;
    }

    @Override // defpackage.e23
    public String getAlgorithmName() {
        return "GOST3411-2012-256";
    }

    @Override // defpackage.e23
    public int getDigestSize() {
        return 32;
    }

    public xb4(xb4 xb4Var) {
        super(m);
        b(xb4Var);
    }
}
