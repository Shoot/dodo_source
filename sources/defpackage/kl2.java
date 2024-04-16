package defpackage;

import ru.dodopizza.app.di.modules.DataSourceModule;
/* compiled from: DataSourceModule_ProvideNewRealmDataSourceFactory.java */
/* renamed from: kl2  reason: default package */
/* loaded from: classes3.dex */
public final class kl2 implements no3<f89> {

    /* compiled from: DataSourceModule_ProvideNewRealmDataSourceFactory.java */
    /* renamed from: kl2$a */
    /* loaded from: classes3.dex */
    private static final class a {
        private static final kl2 a = new kl2();
    }

    public static kl2 a() {
        return a.a;
    }

    public static f89 c() {
        return (f89) jh8.e(DataSourceModule.a.g());
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public f89 get() {
        return c();
    }
}
