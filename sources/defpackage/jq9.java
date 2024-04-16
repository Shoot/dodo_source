package defpackage;
/* renamed from: jq9  reason: default package */
/* loaded from: classes3.dex */
public class jq9 extends qe5 implements acc {
    public jq9() {
        this(128);
    }

    private static int m(int i) {
        if (i != 128 && i != 256) {
            throw new IllegalArgumentException("'bitLength' " + i + " not supported for SHAKE");
        }
        return i;
    }

    @Override // defpackage.acc
    public int c(byte[] bArr, int i, int i2) {
        int n = n(bArr, i, i2);
        reset();
        return n;
    }

    @Override // defpackage.qe5, defpackage.e23
    public int doFinal(byte[] bArr, int i) {
        return c(bArr, i, getDigestSize());
    }

    @Override // defpackage.qe5, defpackage.e23
    public String getAlgorithmName() {
        return "SHAKE" + this.e;
    }

    @Override // defpackage.qe5, defpackage.e23
    public int getDigestSize() {
        return this.e / 4;
    }

    public int n(byte[] bArr, int i, int i2) {
        if (!this.f) {
            g(15, 4);
        }
        l(bArr, i, i2 * 8);
        return i2;
    }

    public jq9(int i) {
        super(m(i));
    }

    public jq9(jq9 jq9Var) {
        super(jq9Var);
    }
}
