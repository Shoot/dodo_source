package defpackage;
/* compiled from: StoriesModule_ProvideInAppStoryInitializerFactory.java */
/* renamed from: eya  reason: default package */
/* loaded from: classes3.dex */
public final class eya implements no3<hz4> {
    private final as8<iz4> a;

    public eya(as8<iz4> as8Var) {
        this.a = as8Var;
    }

    public static eya a(as8<iz4> as8Var) {
        return new eya(as8Var);
    }

    public static hz4 c(iz4 iz4Var) {
        return (hz4) jh8.e(cya.a.b(iz4Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public hz4 get() {
        return c(this.a.get());
    }
}
