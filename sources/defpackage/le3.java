package defpackage;

import java.math.BigInteger;
/* renamed from: le3  reason: default package */
/* loaded from: classes3.dex */
public class le3 extends ee3 {
    private BigInteger c;

    public le3(BigInteger bigInteger, ie3 ie3Var) {
        super(true, ie3Var);
        this.c = bigInteger;
    }

    public BigInteger c() {
        return this.c;
    }

    @Override // defpackage.ee3
    public boolean equals(Object obj) {
        if (!(obj instanceof le3) || !((le3) obj).c().equals(this.c)) {
            return false;
        }
        return super.equals(obj);
    }

    @Override // defpackage.ee3
    public int hashCode() {
        return c().hashCode();
    }
}
