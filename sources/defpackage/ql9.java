package defpackage;

import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.locality.LocalityAPI;
/* compiled from: RetrofitModule_ProvideLocalityAPIFactory.java */
/* renamed from: ql9  reason: default package */
/* loaded from: classes3.dex */
public final class ql9 implements no3<LocalityAPI> {
    private final gl9 a;
    private final as8<Retrofit> b;

    public ql9(gl9 gl9Var, as8<Retrofit> as8Var) {
        this.a = gl9Var;
        this.b = as8Var;
    }

    public static ql9 a(gl9 gl9Var, as8<Retrofit> as8Var) {
        return new ql9(gl9Var, as8Var);
    }

    public static LocalityAPI c(gl9 gl9Var, Retrofit retrofit) {
        return (LocalityAPI) jh8.e(gl9Var.j(retrofit));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public LocalityAPI get() {
        return c(this.a, this.b.get());
    }
}
