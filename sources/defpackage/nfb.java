package defpackage;

import com.google.gson.Gson;
/* compiled from: ThreadsLibUserInfoBuilder_Factory.java */
/* renamed from: nfb  reason: default package */
/* loaded from: classes.dex */
public final class nfb implements no3<mfb> {
    private final as8<Gson> a;
    private final as8<ay1> b;
    private final as8<jeb> c;

    public nfb(as8<Gson> as8Var, as8<ay1> as8Var2, as8<jeb> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static nfb a(as8<Gson> as8Var, as8<ay1> as8Var2, as8<jeb> as8Var3) {
        return new nfb(as8Var, as8Var2, as8Var3);
    }

    public static mfb c(Gson gson, as8<ay1> as8Var, jeb jebVar) {
        return new mfb(gson, as8Var, jebVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public mfb get() {
        return c(this.a.get(), this.b, this.c.get());
    }
}
