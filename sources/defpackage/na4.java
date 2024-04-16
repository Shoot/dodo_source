package defpackage;

import java.math.BigInteger;
/* renamed from: na4  reason: default package */
/* loaded from: classes3.dex */
public class na4 implements la4 {
    protected final oa4 a;
    protected final kb3 b;

    public na4(ea3 ea3Var, oa4 oa4Var) {
        this.a = oa4Var;
        this.b = new iv9(ea3Var.m(oa4Var.a()));
    }

    @Override // defpackage.ma3
    public boolean a() {
        return true;
    }

    @Override // defpackage.ma3
    public kb3 b() {
        return this.b;
    }

    @Override // defpackage.la4
    public BigInteger[] c(BigInteger bigInteger) {
        return xh3.b(this.a.b(), bigInteger);
    }
}
