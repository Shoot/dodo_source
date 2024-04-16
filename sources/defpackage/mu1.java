package defpackage;

import android.app.Application;
import android.content.Context;
/* compiled from: ContextModule_ProvideContextFactory.java */
/* renamed from: mu1  reason: default package */
/* loaded from: classes3.dex */
public final class mu1 implements no3<Context> {
    private final as8<Application> a;

    public mu1(as8<Application> as8Var) {
        this.a = as8Var;
    }

    public static mu1 a(as8<Application> as8Var) {
        return new mu1(as8Var);
    }

    public static Context c(Application application) {
        return (Context) jh8.e(lu1.a.a(application));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public Context get() {
        return c(this.a.get());
    }
}
