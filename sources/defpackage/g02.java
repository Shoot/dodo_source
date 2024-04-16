package defpackage;

import kotlin.Metadata;
import ru.dodopizza.app.presentation.covid.CovidWarningPresenter;
/* compiled from: CovidWarningModule.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\r"}, d2 = {"Lg02;", "", "Lf63;", "router", "Le02;", "interactor", "Lru/dodopizza/app/presentation/covid/CovidWarningPresenter;", "b", "Lyz1;", "covidService", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: g02  reason: default package */
/* loaded from: classes3.dex */
public final class g02 {
    public static final g02 a = new g02();

    private g02() {
    }

    public final e02 a(yz1 yz1Var) {
        z65.h(yz1Var, "covidService");
        return new f02(yz1Var);
    }

    public final CovidWarningPresenter b(f63 f63Var, e02 e02Var) {
        z65.h(f63Var, "router");
        z65.h(e02Var, "interactor");
        return new CovidWarningPresenter(f63Var, e02Var);
    }
}
