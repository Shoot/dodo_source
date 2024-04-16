package defpackage;

import ru.dodopizza.backend.domain.servertime.ServerTimeApi;
/* compiled from: ServerTimeServiceImpl_Factory.java */
/* renamed from: vda  reason: default package */
/* loaded from: classes4.dex */
public final class vda implements no3<uda> {
    private final as8<ServerTimeApi> a;
    private final as8<fda> b;
    private final as8<f5b> c;

    public vda(as8<ServerTimeApi> as8Var, as8<fda> as8Var2, as8<f5b> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static vda a(as8<ServerTimeApi> as8Var, as8<fda> as8Var2, as8<f5b> as8Var3) {
        return new vda(as8Var, as8Var2, as8Var3);
    }

    public static uda c(as8<ServerTimeApi> as8Var, fda fdaVar, f5b f5bVar) {
        return new uda(as8Var, fdaVar, f5bVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public uda get() {
        return c(this.a, this.b.get(), this.c.get());
    }
}
