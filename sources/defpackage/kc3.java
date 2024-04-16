package defpackage;

import java.security.SecureRandom;
/* renamed from: kc3  reason: default package */
/* loaded from: classes3.dex */
public class kc3 implements tx {
    private SecureRandom g;

    @Override // defpackage.tx
    public sx a() {
        lc3 lc3Var = new lc3(this.g);
        return new sx(lc3Var.b(), lc3Var);
    }

    public void b(ff5 ff5Var) {
        this.g = ff5Var.a();
    }
}
