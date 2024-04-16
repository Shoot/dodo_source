package defpackage;

import ru.dodopizza.app.di.modules.DataSourceModule;
/* compiled from: DataSourceModule_ProvideCacheInspectorFactory.java */
/* renamed from: fl2  reason: default package */
/* loaded from: classes3.dex */
public final class fl2 implements no3<ml0> {
    private final as8<ul0> a;

    public fl2(as8<ul0> as8Var) {
        this.a = as8Var;
    }

    public static fl2 a(as8<ul0> as8Var) {
        return new fl2(as8Var);
    }

    public static ml0 c(ul0 ul0Var) {
        return (ml0) jh8.e(DataSourceModule.a.b(ul0Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ml0 get() {
        return c(this.a.get());
    }
}
