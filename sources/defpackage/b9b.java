package defpackage;

import kotlin.Metadata;
import ru.dodopizza.app.domain.DodopizzaApi;
import ru.dodopizza.app.presentation.temporarilyblock.presenter.TemporarilyBlockPresenter;
/* compiled from: TemporarilyBlockModule.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\r"}, d2 = {"Lb9b;", "", "La9b;", "interactor", "Lci8;", "preferencesAssetsDataSource", "Lru/dodopizza/app/presentation/temporarilyblock/presenter/TemporarilyBlockPresenter;", "b", "Lru/dodopizza/app/domain/DodopizzaApi;", "dodoPizzaApi", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: b9b  reason: default package */
/* loaded from: classes3.dex */
public final class b9b {
    public static final b9b a = new b9b();

    private b9b() {
    }

    public final a9b a(DodopizzaApi dodopizzaApi) {
        z65.h(dodopizzaApi, "dodoPizzaApi");
        return new a9b(dodopizzaApi);
    }

    public final TemporarilyBlockPresenter b(a9b a9bVar, ci8 ci8Var) {
        z65.h(a9bVar, "interactor");
        z65.h(ci8Var, "preferencesAssetsDataSource");
        return new TemporarilyBlockPresenter(a9bVar, ci8Var);
    }
}
