package defpackage;

import java.math.BigInteger;
/* renamed from: k72  reason: default package */
/* loaded from: classes3.dex */
public class k72 extends d72 {
    private BigInteger c;

    public k72(BigInteger bigInteger, h72 h72Var) {
        super(true, h72Var);
        this.c = bigInteger;
    }

    public BigInteger c() {
        return this.c;
    }

    @Override // defpackage.d72
    public boolean equals(Object obj) {
        if (!(obj instanceof k72) || !((k72) obj).c().equals(this.c) || !super.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.d72
    public int hashCode() {
        return this.c.hashCode() ^ super.hashCode();
    }
}
