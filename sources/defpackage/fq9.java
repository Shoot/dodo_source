package defpackage;
/* renamed from: fq9  reason: default package */
/* loaded from: classes3.dex */
public class fq9 extends qe5 {
    public fq9() {
        this(256);
    }

    private static int m(int i) {
        if (i != 224 && i != 256 && i != 384 && i != 512) {
            throw new IllegalArgumentException("'bitLength' " + i + " not supported for SHA-3");
        }
        return i;
    }

    @Override // defpackage.qe5, defpackage.e23
    public int doFinal(byte[] bArr, int i) {
        g(2, 2);
        return super.doFinal(bArr, i);
    }

    @Override // defpackage.qe5, defpackage.e23
    public String getAlgorithmName() {
        return "SHA3-" + this.e;
    }

    public fq9(int i) {
        super(m(i));
    }

    public fq9(fq9 fq9Var) {
        super(fq9Var);
    }
}
