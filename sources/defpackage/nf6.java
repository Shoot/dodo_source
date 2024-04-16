package defpackage;

import retrofit2.Retrofit;
import ru.dodopizza.backend.domain.menu.MenuAPI;
/* compiled from: MenuModule_ProvideMenuAPIFactory.java */
/* renamed from: nf6  reason: default package */
/* loaded from: classes3.dex */
public final class nf6 implements no3<MenuAPI> {
    private final as8<Retrofit> a;

    public nf6(as8<Retrofit> as8Var) {
        this.a = as8Var;
    }

    public static nf6 a(as8<Retrofit> as8Var) {
        return new nf6(as8Var);
    }

    public static MenuAPI c(Retrofit retrofit) {
        return (MenuAPI) jh8.e(jf6.a.d(retrofit));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public MenuAPI get() {
        return c(this.a.get());
    }
}
