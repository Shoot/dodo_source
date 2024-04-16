package defpackage;
/* compiled from: AssistantMoodInteractor_Factory.java */
/* renamed from: ru  reason: default package */
/* loaded from: classes2.dex */
public final class ru implements no3<qu> {
    private final as8<mu> a;

    public ru(as8<mu> as8Var) {
        this.a = as8Var;
    }

    public static ru a(as8<mu> as8Var) {
        return new ru(as8Var);
    }

    public static qu c(mu muVar) {
        return new qu(muVar);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public qu get() {
        return c(this.a.get());
    }
}
