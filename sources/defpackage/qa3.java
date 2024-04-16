package defpackage;

import org.bouncycastle.asn1.k;
/* renamed from: qa3  reason: default package */
/* loaded from: classes3.dex */
public class qa3 extends hb3 {
    private final k n;
    private final k o;
    private final k p;

    public qa3(la3 la3Var, k kVar, k kVar2, k kVar3) {
        super(kVar, la3Var);
        if ((la3Var instanceof hb3) && !kVar.x(((hb3) la3Var).j())) {
            throw new IllegalArgumentException("named parameters do not match publicKeyParamSet value");
        }
        this.n = kVar;
        this.o = kVar2;
        this.p = kVar3;
    }

    public k k() {
        return this.o;
    }

    public k l() {
        return this.p;
    }

    public k m() {
        return this.n;
    }
}
