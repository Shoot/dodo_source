package defpackage;

import ru.dodopizza.app.domain.locality.LocalityServiceImpl;
/* compiled from: LocalityModule_ProvideLocalityServiceFactory.java */
/* renamed from: xu5  reason: default package */
/* loaded from: classes3.dex */
public final class xu5 implements no3<jv5> {
    private final as8<LocalityServiceImpl> a;

    public xu5(as8<LocalityServiceImpl> as8Var) {
        this.a = as8Var;
    }

    public static xu5 a(as8<LocalityServiceImpl> as8Var) {
        return new xu5(as8Var);
    }

    public static jv5 c(LocalityServiceImpl localityServiceImpl) {
        return (jv5) jh8.e(iu5.a.j(localityServiceImpl));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public jv5 get() {
        return c(this.a.get());
    }
}
