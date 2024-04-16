package defpackage;

import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.state.WorkflowApi;
/* compiled from: RetrofitModule_ProvideWorkflowApiFactory.java */
/* renamed from: wl9  reason: default package */
/* loaded from: classes3.dex */
public final class wl9 implements no3<WorkflowApi> {
    private final gl9 a;
    private final as8<Retrofit> b;

    public wl9(gl9 gl9Var, as8<Retrofit> as8Var) {
        this.a = gl9Var;
        this.b = as8Var;
    }

    public static wl9 a(gl9 gl9Var, as8<Retrofit> as8Var) {
        return new wl9(gl9Var, as8Var);
    }

    public static WorkflowApi c(gl9 gl9Var, Retrofit retrofit) {
        return (WorkflowApi) jh8.e(gl9Var.p(retrofit));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public WorkflowApi get() {
        return c(this.a, this.b.get());
    }
}
