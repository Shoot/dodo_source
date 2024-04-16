package defpackage;

import java.security.SecureRandom;
/* renamed from: ce3  reason: default package */
/* loaded from: classes3.dex */
public class ce3 extends ff5 {
    private ie3 c;

    public ce3(SecureRandom secureRandom, ie3 ie3Var) {
        super(secureRandom, d(ie3Var));
        this.c = ie3Var;
    }

    static int d(ie3 ie3Var) {
        if (ie3Var.b() != 0) {
            return ie3Var.b();
        }
        return ie3Var.c().bitLength();
    }

    public ie3 c() {
        return this.c;
    }
}
