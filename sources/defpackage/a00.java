package defpackage;
/* compiled from: AuthorizationCheckInterceptor_Factory.java */
/* renamed from: a00  reason: default package */
/* loaded from: classes.dex */
public final class a00 implements no3<zz> {
    private final as8<mqb> a;

    public a00(as8<mqb> as8Var) {
        this.a = as8Var;
    }

    public static a00 a(as8<mqb> as8Var) {
        return new a00(as8Var);
    }

    public static zz c(mqb mqbVar) {
        return new zz(mqbVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public zz get() {
        return c(this.a.get());
    }
}
