package defpackage;

import android.content.Context;
import ru.dodopizza.app.di.modules.DataSourceModule;
/* compiled from: DataSourceModule_ProvideBackupPrefsDataSourceFactory.java */
/* renamed from: el2  reason: default package */
/* loaded from: classes3.dex */
public final class el2 implements no3<i60> {
    private final as8<Context> a;

    public el2(as8<Context> as8Var) {
        this.a = as8Var;
    }

    public static el2 a(as8<Context> as8Var) {
        return new el2(as8Var);
    }

    public static i60 c(Context context) {
        return (i60) jh8.e(DataSourceModule.a.a(context));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public i60 get() {
        return c(this.a.get());
    }
}
