package defpackage;

import java.security.SecureRandom;
/* renamed from: qc3  reason: default package */
/* loaded from: classes3.dex */
public class qc3 implements tx {
    private SecureRandom g;

    @Override // defpackage.tx
    public sx a() {
        rc3 rc3Var = new rc3(this.g);
        return new sx(rc3Var.b(), rc3Var);
    }

    public void b(ff5 ff5Var) {
        this.g = ff5Var.a();
    }
}
