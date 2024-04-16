package defpackage;

import android.content.Context;
import ru.dodopizza.app.di.modules.DataSourceModule;
/* compiled from: DataSourceModule_ProvidePreferencesDataSourceFactory.java */
/* renamed from: ll2  reason: default package */
/* loaded from: classes3.dex */
public final class ll2 implements no3<ci8> {
    private final as8<Context> a;

    public ll2(as8<Context> as8Var) {
        this.a = as8Var;
    }

    public static ll2 a(as8<Context> as8Var) {
        return new ll2(as8Var);
    }

    public static ci8 c(Context context) {
        return (ci8) jh8.e(DataSourceModule.a.h(context));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ci8 get() {
        return c(this.a.get());
    }
}
