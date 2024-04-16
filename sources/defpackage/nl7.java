package defpackage;

import ru.dodopizza.app.presentation.main.a;
/* compiled from: OrderTypeSwitcherModule_ProvideIsDeeplinkHandledFactory.java */
/* renamed from: nl7  reason: default package */
/* loaded from: classes3.dex */
public final class nl7 implements no3<r75> {
    private final as8<a> a;

    public nl7(as8<a> as8Var) {
        this.a = as8Var;
    }

    public static nl7 a(as8<a> as8Var) {
        return new nl7(as8Var);
    }

    public static r75 c(a aVar) {
        return (r75) jh8.e(ll7.a.b(aVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public r75 get() {
        return c(this.a.get());
    }
}
