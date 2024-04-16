package defpackage;

import kotlin.Metadata;
import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: CountryService.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¨\u0006\u0005"}, d2 = {"Lru/dodopizza/app/domain/country/CountryService;", "Ljv5;", "localityService", "", "a", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: wy1  reason: default package */
/* loaded from: classes4.dex */
public final class wy1 {
    public static final String a(CountryService countryService, jv5 jv5Var) {
        String str;
        z65.h(countryService, "<this>");
        z65.h(jv5Var, "localityService");
        dt5 i = jv5Var.i();
        if (i != null) {
            str = i.a();
        } else {
            str = null;
        }
        return countryService.h((String) mh5.c(str, "643"));
    }
}
