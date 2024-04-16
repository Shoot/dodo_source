package defpackage;

import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import ru.dodopizza.app.presentation.selectlocation.landing.LandingPresenter;
import ru.dodopizza.app.presentation.selectlocation.landing.a;
/* compiled from: LandingModule.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J,\u0010\u0010\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\b\u0010\u0011\u001a\u00020\u000eH\u0007¨\u0006\u0014"}, d2 = {"Lvj5;", "", "", "locationName", "Lf63;", "router", "Lrj5;", "interactor", "Lru/dodopizza/app/presentation/selectlocation/landing/LandingPresenter;", c.a, LocalityEntity.FIELD_COUNTRY_CODE, "locationId", "Lml5;", "landingService", "Luj5;", "landingMapper", "a", "b", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: vj5  reason: default package */
/* loaded from: classes3.dex */
public final class vj5 {
    public static final vj5 a = new vj5();

    private vj5() {
    }

    public final rj5 a(String str, String str2, ml5 ml5Var, uj5 uj5Var) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(str2, "locationId");
        z65.h(ml5Var, "landingService");
        z65.h(uj5Var, "landingMapper");
        return new sj5(str, str2, ml5Var, uj5Var);
    }

    public final uj5 b() {
        return new a();
    }

    public final LandingPresenter c(String str, f63 f63Var, rj5 rj5Var) {
        z65.h(str, "locationName");
        z65.h(f63Var, "router");
        z65.h(rj5Var, "interactor");
        return new LandingPresenter(str, f63Var, rj5Var);
    }
}
