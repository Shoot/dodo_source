package defpackage;

import java.security.SecureRandom;
/* renamed from: j9c  reason: default package */
/* loaded from: classes3.dex */
public class j9c implements tx {
    private SecureRandom g;

    @Override // defpackage.tx
    public sx a() {
        k9c k9cVar = new k9c(this.g);
        return new sx(k9cVar.b(), k9cVar);
    }

    public void b(ff5 ff5Var) {
        this.g = ff5Var.a();
    }
}
