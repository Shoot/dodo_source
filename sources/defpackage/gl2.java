package defpackage;

import ru.dodopizza.app.di.modules.DataSourceModule;
/* compiled from: DataSourceModule_ProvideCacheTimestampRepositoryFactory.java */
/* renamed from: gl2  reason: default package */
/* loaded from: classes3.dex */
public final class gl2 implements no3<ul0> {
    private final as8<jk2> a;

    public gl2(as8<jk2> as8Var) {
        this.a = as8Var;
    }

    public static gl2 a(as8<jk2> as8Var) {
        return new gl2(as8Var);
    }

    public static ul0 c(jk2 jk2Var) {
        return (ul0) jh8.e(DataSourceModule.a.c(jk2Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ul0 get() {
        return c(this.a.get());
    }
}
