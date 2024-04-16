package defpackage;
/* compiled from: AssistantWelcomeInteractor_Factory.java */
/* renamed from: tw  reason: default package */
/* loaded from: classes2.dex */
public final class tw implements no3<sw> {
    private final as8<nw> a;
    private final as8<wv> b;

    public tw(as8<nw> as8Var, as8<wv> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static tw a(as8<nw> as8Var, as8<wv> as8Var2) {
        return new tw(as8Var, as8Var2);
    }

    public static sw c(nw nwVar, wv wvVar) {
        return new sw(nwVar, wvVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public sw get() {
        return c(this.a.get(), this.b.get());
    }
}
