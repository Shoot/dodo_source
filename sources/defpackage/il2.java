package defpackage;

import com.google.gson.Gson;
import ru.dodopizza.app.di.modules.DataSourceModule;
/* compiled from: DataSourceModule_ProvideGsonFactory.java */
/* renamed from: il2  reason: default package */
/* loaded from: classes3.dex */
public final class il2 implements no3<Gson> {

    /* compiled from: DataSourceModule_ProvideGsonFactory.java */
    /* renamed from: il2$a */
    /* loaded from: classes3.dex */
    private static final class a {
        private static final il2 a = new il2();
    }

    public static il2 a() {
        return a.a;
    }

    public static Gson c() {
        return (Gson) jh8.e(DataSourceModule.a.e());
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public Gson get() {
        return c();
    }
}
