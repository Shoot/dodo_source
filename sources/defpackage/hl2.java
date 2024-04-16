package defpackage;

import android.app.Application;
import ru.dodopizza.app.di.modules.DataSourceModule;
/* compiled from: DataSourceModule_ProvideDeviceIdProviderFactory.java */
/* renamed from: hl2  reason: default package */
/* loaded from: classes3.dex */
public final class hl2 implements no3<s13> {
    private final as8<Application> a;
    private final as8<i60> b;

    public hl2(as8<Application> as8Var, as8<i60> as8Var2) {
        this.a = as8Var;
        this.b = as8Var2;
    }

    public static hl2 a(as8<Application> as8Var, as8<i60> as8Var2) {
        return new hl2(as8Var, as8Var2);
    }

    public static s13 c(Application application, i60 i60Var) {
        return (s13) jh8.e(DataSourceModule.a.d(application, i60Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public s13 get() {
        return c(this.a.get(), this.b.get());
    }
}
