package defpackage;
/* compiled from: AssistantPreferencesInteractor_Factory.java */
/* renamed from: jv  reason: default package */
/* loaded from: classes2.dex */
public final class jv implements no3<iv> {
    private final as8<fv> a;

    public jv(as8<fv> as8Var) {
        this.a = as8Var;
    }

    public static jv a(as8<fv> as8Var) {
        return new jv(as8Var);
    }

    public static iv c(fv fvVar) {
        return new iv(fvVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public iv get() {
        return c(this.a.get());
    }
}
