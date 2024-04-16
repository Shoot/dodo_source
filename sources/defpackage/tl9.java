package defpackage;

import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.pizzeria.PizzeriaAPI;
/* compiled from: RetrofitModule_ProvidePizzeriaAPIFactory.java */
/* renamed from: tl9  reason: default package */
/* loaded from: classes3.dex */
public final class tl9 implements no3<PizzeriaAPI> {
    private final gl9 a;
    private final as8<Retrofit> b;

    public tl9(gl9 gl9Var, as8<Retrofit> as8Var) {
        this.a = gl9Var;
        this.b = as8Var;
    }

    public static tl9 a(gl9 gl9Var, as8<Retrofit> as8Var) {
        return new tl9(gl9Var, as8Var);
    }

    public static PizzeriaAPI c(gl9 gl9Var, Retrofit retrofit) {
        return (PizzeriaAPI) jh8.e(gl9Var.m(retrofit));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public PizzeriaAPI get() {
        return c(this.a, this.b.get());
    }
}
