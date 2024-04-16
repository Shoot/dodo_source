package defpackage;

import kotlin.Metadata;
import ru.dodopizza.app.presentation.selectlocation.localitylist.LocalityListPresenter;
/* compiled from: LocalityListModule.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0007¨\u0006\u0011"}, d2 = {"Ldu5;", "", "Lbu5;", "impl", "Lau5;", "a", "Lh97;", "onboardingData", "Lut5;", "localityListData", "Lyo9;", "routersContainer", "localityListInteractor", "Lru/dodopizza/app/presentation/selectlocation/localitylist/LocalityListPresenter;", "b", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: du5  reason: default package */
/* loaded from: classes3.dex */
public final class du5 {
    public static final du5 a = new du5();

    private du5() {
    }

    public final au5 a(bu5 bu5Var) {
        z65.h(bu5Var, "impl");
        return bu5Var;
    }

    public final LocalityListPresenter b(h97 h97Var, ut5 ut5Var, yo9 yo9Var, au5 au5Var) {
        z65.h(h97Var, "onboardingData");
        z65.h(ut5Var, "localityListData");
        z65.h(yo9Var, "routersContainer");
        z65.h(au5Var, "localityListInteractor");
        return new LocalityListPresenter(h97Var, ut5Var, au5Var, yo9Var.b(), null, 16, null);
    }
}
