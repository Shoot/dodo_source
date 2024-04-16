package defpackage;

import ru.dodopizza.backend.domain.stories.StoriesApi;
/* compiled from: StoriesModule_ProvideStoriesServiceFactory.java */
/* renamed from: iya  reason: default package */
/* loaded from: classes3.dex */
public final class iya implements no3<kya> {
    private final as8<StoriesApi> a;
    private final as8<f15> b;
    private final as8<ava> c;

    public iya(as8<StoriesApi> as8Var, as8<f15> as8Var2, as8<ava> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static iya a(as8<StoriesApi> as8Var, as8<f15> as8Var2, as8<ava> as8Var3) {
        return new iya(as8Var, as8Var2, as8Var3);
    }

    public static kya c(StoriesApi storiesApi, f15 f15Var, ava avaVar) {
        return (kya) jh8.e(cya.a.f(storiesApi, f15Var, avaVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public kya get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
