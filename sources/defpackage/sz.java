package defpackage;
/* compiled from: AuthorizationAppModule_ProvideAuthorizationConfigFactory.java */
/* renamed from: sz  reason: default package */
/* loaded from: classes3.dex */
public final class sz implements no3<b00> {
    private final rz a;

    public sz(rz rzVar) {
        this.a = rzVar;
    }

    public static sz a(rz rzVar) {
        return new sz(rzVar);
    }

    public static b00 c(rz rzVar) {
        return (b00) jh8.e(rzVar.b());
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public b00 get() {
        return c(this.a);
    }
}
