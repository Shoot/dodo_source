package defpackage;

import ru.dodopizza.app.di.modules.DataSourceModule;
/* compiled from: DataSourceModule_ProvideMemoryDataSourceFactory.java */
/* renamed from: jl2  reason: default package */
/* loaded from: classes3.dex */
public final class jl2 implements no3<vc6> {

    /* compiled from: DataSourceModule_ProvideMemoryDataSourceFactory.java */
    /* renamed from: jl2$a */
    /* loaded from: classes3.dex */
    private static final class a {
        private static final jl2 a = new jl2();
    }

    public static jl2 a() {
        return a.a;
    }

    public static vc6 c() {
        return (vc6) jh8.e(DataSourceModule.a.f());
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public vc6 get() {
        return c();
    }
}
