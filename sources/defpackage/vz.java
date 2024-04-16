package defpackage;

import ru.dodopizza.app.presentation.pincodelogin.d;
/* compiled from: AuthorizationAppModule_ProvidePinCodeSmsHelperFactory.java */
/* renamed from: vz  reason: default package */
/* loaded from: classes3.dex */
public final class vz implements no3<d> {
    private final rz a;

    public vz(rz rzVar) {
        this.a = rzVar;
    }

    public static vz a(rz rzVar) {
        return new vz(rzVar);
    }

    public static d c(rz rzVar) {
        return (d) jh8.e(rzVar.e());
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public d get() {
        return c(this.a);
    }
}
