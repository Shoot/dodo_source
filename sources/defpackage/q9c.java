package defpackage;

import java.security.SecureRandom;
/* renamed from: q9c  reason: default package */
/* loaded from: classes3.dex */
public class q9c implements tx {
    private SecureRandom g;

    @Override // defpackage.tx
    public sx a() {
        r9c r9cVar = new r9c(this.g);
        return new sx(r9cVar.b(), r9cVar);
    }

    public void b(ff5 ff5Var) {
        this.g = ff5Var.a();
    }
}
