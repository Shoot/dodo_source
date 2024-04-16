package defpackage;

import java.security.SecureRandom;
/* renamed from: bb4  reason: default package */
/* loaded from: classes3.dex */
public class bb4 extends ff5 {
    private ib4 c;

    public bb4(SecureRandom secureRandom, ib4 ib4Var) {
        super(secureRandom, ib4Var.b().bitLength() - 1);
        this.c = ib4Var;
    }

    public ib4 c() {
        return this.c;
    }
}
