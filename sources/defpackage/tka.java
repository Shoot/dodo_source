package defpackage;
/* compiled from: SignerInterceptor_Factory.java */
/* renamed from: tka  reason: default package */
/* loaded from: classes4.dex */
public final class tka implements no3<ska> {
    private final as8<nka> a;

    public tka(as8<nka> as8Var) {
        this.a = as8Var;
    }

    public static tka a(as8<nka> as8Var) {
        return new tka(as8Var);
    }

    public static ska c(as8<nka> as8Var) {
        return new ska(as8Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ska get() {
        return c(this.a);
    }
}
