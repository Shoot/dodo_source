package defpackage;

import java.math.BigInteger;
/* renamed from: oe3  reason: default package */
/* loaded from: classes3.dex */
public class oe3 extends ee3 {
    private BigInteger c;

    public oe3(BigInteger bigInteger, ie3 ie3Var) {
        super(false, ie3Var);
        this.c = bigInteger;
    }

    public BigInteger c() {
        return this.c;
    }

    @Override // defpackage.ee3
    public boolean equals(Object obj) {
        if (!(obj instanceof oe3) || !((oe3) obj).c().equals(this.c) || !super.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ee3
    public int hashCode() {
        return this.c.hashCode() ^ super.hashCode();
    }
}
