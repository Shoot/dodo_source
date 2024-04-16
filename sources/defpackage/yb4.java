package defpackage;
/* renamed from: yb4  reason: default package */
/* loaded from: classes3.dex */
public class yb4 extends wb4 {
    private static final byte[] m = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public yb4() {
        super(m);
    }

    @Override // defpackage.sc6
    public sc6 a() {
        return new yb4(this);
    }

    @Override // defpackage.e23
    public String getAlgorithmName() {
        return "GOST3411-2012-512";
    }

    @Override // defpackage.e23
    public int getDigestSize() {
        return 64;
    }

    public yb4(yb4 yb4Var) {
        super(m);
        b(yb4Var);
    }
}
