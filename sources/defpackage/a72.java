package defpackage;

import java.security.SecureRandom;
/* renamed from: a72  reason: default package */
/* loaded from: classes3.dex */
public class a72 extends ff5 {
    private h72 c;

    public a72(SecureRandom secureRandom, h72 h72Var) {
        super(secureRandom, d(h72Var));
        this.c = h72Var;
    }

    static int d(h72 h72Var) {
        if (h72Var.d() != 0) {
            return h72Var.d();
        }
        return h72Var.f().bitLength();
    }

    public h72 c() {
        return this.c;
    }
}
