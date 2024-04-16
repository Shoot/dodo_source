package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: PhonePrefixService.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0003*\u00020\u0005H\u0002J\f\u0010\b\u001a\u00020\u0003*\u00020\u0007H\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014¨\u0006\u0018"}, d2 = {"Lz48;", "", "", "Lj48;", "b", "Lay1;", c.a, "Lj28;", DateTokenConverter.CONVERTER_KEY, "a", "Lru/dodopizza/app/domain/country/CountryService;", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Lpy1;", "Lpy1;", "countryNameService", "Lhq3;", "Lhq3;", "featureService", "Lm28;", "Lm28;", "phoneFormatRepository", "<init>", "(Lru/dodopizza/app/domain/country/CountryService;Lpy1;Lhq3;Lm28;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: z48  reason: default package */
/* loaded from: classes4.dex */
public final class z48 {
    private final CountryService a;
    private final py1 b;
    private final hq3 c;
    private final m28 d;

    public z48(CountryService countryService, py1 py1Var, hq3 hq3Var, m28 m28Var) {
        z65.h(countryService, "countryService");
        z65.h(py1Var, "countryNameService");
        z65.h(hq3Var, "featureService");
        z65.h(m28Var, "phoneFormatRepository");
        this.a = countryService;
        this.b = py1Var;
        this.c = hq3Var;
        this.d = m28Var;
    }

    private final List<j48> b() {
        int w;
        List<j48> F0;
        Collection<ay1> g = this.a.g();
        w = lc1.w(g, 10);
        ArrayList arrayList = new ArrayList(w);
        for (ay1 ay1Var : g) {
            arrayList.add(c(ay1Var));
        }
        F0 = sc1.F0(arrayList);
        return F0;
    }

    private final j48 c(ay1 ay1Var) {
        return new j48(ay1Var.f(), ay1Var.l().getCode(), this.b.a(ay1Var.f()));
    }

    private final j48 d(j28 j28Var) {
        return new j48(j28Var.a(), j28Var.b(), this.b.a(j28Var.a()));
    }

    public final List<j48> a() {
        int w;
        List<j48> F0;
        if (this.c.a(bq3.A5)) {
            Collection<j28> values = this.d.getAll().values();
            w = lc1.w(values, 10);
            ArrayList arrayList = new ArrayList(w);
            for (j28 j28Var : values) {
                arrayList.add(d(j28Var));
            }
            F0 = sc1.F0(arrayList);
            return F0;
        }
        return b();
    }
}
