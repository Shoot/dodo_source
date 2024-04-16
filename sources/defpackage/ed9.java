package defpackage;

import defpackage.gs2;
/* compiled from: RemoteConfigDeferredProxy.java */
/* renamed from: ed9  reason: default package */
/* loaded from: classes2.dex */
public class ed9 {
    private final gs2<qx3> a;

    public ed9(gs2<qx3> gs2Var) {
        this.a = gs2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(i12 i12Var, bs8 bs8Var) {
        ((qx3) bs8Var.get()).a("firebase", i12Var);
        rx5.f().b("Registering RemoteConfig Rollouts subscriber");
    }

    public void c(mub mubVar) {
        if (mubVar == null) {
            rx5.f().k("Didn't successfully register with UserMetadata for rollouts listener");
            return;
        }
        final i12 i12Var = new i12(mubVar);
        this.a.a(new gs2.a() { // from class: dd9
            @Override // defpackage.gs2.a
            public final void a(bs8 bs8Var) {
                ed9.b(i12.this, bs8Var);
            }
        });
    }
}
