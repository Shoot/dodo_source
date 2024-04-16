package defpackage;

import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.upload.UploadAPI;
/* compiled from: RetrofitModule_ProvideUploadAPIFactory.java */
/* renamed from: vl9  reason: default package */
/* loaded from: classes3.dex */
public final class vl9 implements no3<UploadAPI> {
    private final gl9 a;
    private final as8<Retrofit> b;

    public vl9(gl9 gl9Var, as8<Retrofit> as8Var) {
        this.a = gl9Var;
        this.b = as8Var;
    }

    public static vl9 a(gl9 gl9Var, as8<Retrofit> as8Var) {
        return new vl9(gl9Var, as8Var);
    }

    public static UploadAPI c(gl9 gl9Var, Retrofit retrofit) {
        return (UploadAPI) jh8.e(gl9Var.o(retrofit));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public UploadAPI get() {
        return c(this.a, this.b.get());
    }
}
