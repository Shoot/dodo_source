package defpackage;

import kotlin.Metadata;
import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: CountryResolver.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lty1;", "", "Lay1;", "a", "Ldt5;", "Ldt5;", "locality", "Lru/dodopizza/app/domain/country/CountryService;", "b", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "<init>", "(Ldt5;Lru/dodopizza/app/domain/country/CountryService;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ty1  reason: default package */
/* loaded from: classes3.dex */
public final class ty1 {
    private final dt5 a;
    private final CountryService b;

    public ty1(dt5 dt5Var, CountryService countryService) {
        z65.h(dt5Var, "locality");
        z65.h(countryService, "countryService");
        this.a = dt5Var;
        this.b = countryService;
    }

    public final ay1 a() {
        return this.b.c(this.a.a());
    }
}
