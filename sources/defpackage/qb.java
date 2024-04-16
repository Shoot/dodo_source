package defpackage;

import kotlin.Metadata;
import ru.dodopizza.app.presentation.allpizzerias.AllPizzeriasPresenter;
/* compiled from: AllPizzeriasModule.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¨\u0006\u000f"}, d2 = {"Lqb;", "", "Lf63;", "router", "Lcf4;", "getCurrentLocalityInfoInteractor", "Lru/dodopizza/app/presentation/allpizzerias/AllPizzeriasPresenter;", "a", "Ljv5;", "localityService", "Lrt5;", "localityInfoService", "b", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: qb  reason: default package */
/* loaded from: classes3.dex */
public final class qb {
    public static final qb a = new qb();

    private qb() {
    }

    public final AllPizzeriasPresenter a(f63 f63Var, cf4 cf4Var) {
        z65.h(f63Var, "router");
        z65.h(cf4Var, "getCurrentLocalityInfoInteractor");
        return new AllPizzeriasPresenter(f63Var, cf4Var);
    }

    public final cf4 b(jv5 jv5Var, rt5 rt5Var) {
        z65.h(jv5Var, "localityService");
        z65.h(rt5Var, "localityInfoService");
        return new cf4(jv5Var, rt5Var);
    }
}
