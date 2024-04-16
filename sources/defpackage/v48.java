package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import ru.dodopizza.app.domain.country.CountryService;
import ru.dodopizza.app.presentation.phonenumberlogin.phoneprefixlist.PhonePrefixListPresenter;
/* compiled from: PhonePrefixModule.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0007J(\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¨\u0006\u0018"}, d2 = {"Lv48;", "", "Lb7a;", "request", "Lr48;", "interactor", "Lf63;", "router", "Lru/dodopizza/app/presentation/phonenumberlogin/phoneprefixlist/PhonePrefixListPresenter;", c.a, "Lz48;", "phonePrefixService", "a", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Lpy1;", "countryNameService", "Lhq3;", "featureService", "Lm28;", "phoneFormatRepository", "b", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: v48  reason: default package */
/* loaded from: classes3.dex */
public final class v48 {
    public static final v48 a = new v48();

    private v48() {
    }

    public final r48 a(z48 z48Var) {
        z65.h(z48Var, "phonePrefixService");
        return new r48(z48Var);
    }

    public final z48 b(CountryService countryService, py1 py1Var, hq3 hq3Var, m28 m28Var) {
        z65.h(countryService, "countryService");
        z65.h(py1Var, "countryNameService");
        z65.h(hq3Var, "featureService");
        z65.h(m28Var, "phoneFormatRepository");
        return new z48(countryService, py1Var, hq3Var, m28Var);
    }

    public final PhonePrefixListPresenter c(b7a b7aVar, r48 r48Var, f63 f63Var) {
        z65.h(b7aVar, "request");
        z65.h(r48Var, "interactor");
        z65.h(f63Var, "router");
        return new PhonePrefixListPresenter(b7aVar, r48Var, f63Var);
    }
}
