package defpackage;

import ru.dodopizza.app.presentation.selectlocation.b;
/* compiled from: SelectLocationModule_ProvideSelectLocationInteractorFactory.java */
/* renamed from: g6a  reason: default package */
/* loaded from: classes3.dex */
public final class g6a implements no3<c6a> {
    private final as8<b> a;

    public g6a(as8<b> as8Var) {
        this.a = as8Var;
    }

    public static g6a a(as8<b> as8Var) {
        return new g6a(as8Var);
    }

    public static c6a c(b bVar) {
        return (c6a) jh8.e(e6a.a.b(bVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public c6a get() {
        return c(this.a.get());
    }
}
