package defpackage;

import ru.dodopizza.app.di.modules.DataSourceModule;
/* compiled from: DataSourceModule_ProvideQueryHandlerFactory.java */
/* renamed from: ml2  reason: default package */
/* loaded from: classes3.dex */
public final class ml2 implements no3<xu8> {
    private final as8<vc6> a;

    public ml2(as8<vc6> as8Var) {
        this.a = as8Var;
    }

    public static ml2 a(as8<vc6> as8Var) {
        return new ml2(as8Var);
    }

    public static xu8 c(vc6 vc6Var) {
        return (xu8) jh8.e(DataSourceModule.a.i(vc6Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public xu8 get() {
        return c(this.a.get());
    }
}
