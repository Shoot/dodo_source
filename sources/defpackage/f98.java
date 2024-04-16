package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.domain.country.CountryService;
import ru.dodopizza.backend.domain.pizzeria.PizzeriaAPI;
import ru.dodopizza.backend.domain.pizzeria.dto.NewPizzeriaDto;
import ru.dodopizza.backend.domain.pizzeria.dto.PizzeriaDto;
/* compiled from: PizzeriaService.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010#\u001a\u00020!\u0012\u0006\u0010&\u001a\u00020$\u0012\u0006\u0010)\u001a\u00020'¢\u0006\u0004\b*\u0010+J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\u0007H\u0002J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(¨\u0006,"}, d2 = {"Lf98;", "Le98;", "", LocalityEntity.FIELD_COUNTRY_CODE, "", "Ld88;", DateTokenConverter.CONVERTER_KEY, "", "g", "i", Image.TYPE_HIGH, "j", "f", "Ldt5;", "locality", "", e.a, "getPizzeriasInCountry", "a", c.a, "b", "La98;", "La98;", "pizzeriaRepository", "Lpa8;", "Lpa8;", "pizzeriasInLocalityRepository", "Lru/dodopizza/app/domain/country/CountryService;", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Ljv5;", "Ljv5;", "localityService", "Lru/dodopizza/backend/domain/pizzeria/PizzeriaAPI;", "Lru/dodopizza/backend/domain/pizzeria/PizzeriaAPI;", "pizzeriaAPI", "Lava;", "Lava;", "stateProvider", "Lbia;", "Lbia;", "sharedTraces", "<init>", "(La98;Lpa8;Lru/dodopizza/app/domain/country/CountryService;Ljv5;Lru/dodopizza/backend/domain/pizzeria/PizzeriaAPI;Lava;Lbia;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: f98  reason: default package */
/* loaded from: classes4.dex */
public final class f98 implements e98 {
    private final a98 a;
    private final pa8 b;
    private final CountryService c;
    private final jv5 d;
    private final PizzeriaAPI e;
    private final ava f;
    private final bia g;

    public f98(a98 a98Var, pa8 pa8Var, CountryService countryService, jv5 jv5Var, PizzeriaAPI pizzeriaAPI, ava avaVar, bia biaVar) {
        z65.h(a98Var, "pizzeriaRepository");
        z65.h(pa8Var, "pizzeriasInLocalityRepository");
        z65.h(countryService, "countryService");
        z65.h(jv5Var, "localityService");
        z65.h(pizzeriaAPI, "pizzeriaAPI");
        z65.h(avaVar, "stateProvider");
        z65.h(biaVar, "sharedTraces");
        this.a = a98Var;
        this.b = pa8Var;
        this.c = countryService;
        this.d = jv5Var;
        this.e = pizzeriaAPI;
        this.f = avaVar;
        this.g = biaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Collection<d88> d(String str) {
        int w;
        g();
        List<NewPizzeriaDto> pizzeriasInCountry = this.e.getPizzeriasInCountry(str);
        i();
        h();
        List<NewPizzeriaDto> list = pizzeriasInCountry;
        Function1<NewPizzeriaDto, d88> e = qm2.e();
        w = lc1.w(list, 10);
        ArrayList arrayList = new ArrayList(w);
        for (Object obj : list) {
            arrayList.add(e.invoke(obj));
        }
        j();
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<d88> e(dt5 dt5Var) {
        int w;
        List<d88> x0;
        String a = dt5Var.a();
        List<PizzeriaDto> pizzerias = this.e.getPizzerias(dt5Var.getId(), this.c.h(a), a);
        Function1<PizzeriaDto, d88> f = qm2.f();
        w = lc1.w(pizzerias, 10);
        ArrayList arrayList = new ArrayList(w);
        for (Object obj : pizzerias) {
            arrayList.add(f.invoke(obj));
        }
        x0 = sc1.x0(arrayList);
        return x0;
    }

    private final Collection<d88> f() {
        Collection<d88> b = this.a.b();
        if (b == null || !(!b.isEmpty())) {
            List<d88> e = e((dt5) mh5.b(this.d.i(), "Current locality is not set "));
            this.a.c(e);
            return e;
        }
        return b;
    }

    private final void g() {
        this.g.b("pizzerias_loading");
    }

    private final void h() {
        this.g.b("pizzerias_mapping_to_domain");
    }

    private final void i() {
        this.g.a("pizzerias_loading");
    }

    private final void j() {
        this.g.a("pizzerias_mapping_to_domain");
    }

    @Override // defpackage.e98
    public synchronized Collection<d88> a(dt5 dt5Var) {
        List<d88> e;
        try {
            z65.h(dt5Var, "locality");
            dt5 i = this.d.i();
            if (i != null && z65.c(dt5Var.a(), i.a()) && z65.c(dt5Var.getId(), i.getId())) {
                e = f();
            } else {
                e = e(dt5Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    @Override // defpackage.e98
    public synchronized d88 b() {
        Object obj;
        try {
            String selectedPizzeriaId = this.f.e().getSelectedPizzeriaId();
            if (selectedPizzeriaId == null) {
                selectedPizzeriaId = "";
            }
            Iterator<T> it = f().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (z65.c(((d88) obj).getId(), selectedPizzeriaId)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (d88) mh5.c(obj, d88.x.a());
    }

    @Override // defpackage.e98
    public Collection<d88> c(dt5 dt5Var) {
        z65.h(dt5Var, "locality");
        Collection<d88> d = this.b.d(dt5Var);
        if (d == null || !(!d.isEmpty())) {
            List<d88> e = e(dt5Var);
            this.b.f(e, dt5Var);
            return e;
        }
        return d;
    }

    @Override // defpackage.e98
    public synchronized Collection<d88> getPizzeriasInCountry(String str) {
        Collection<d88> c;
        try {
            z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
            c = this.b.c(str);
            if (c == null || !(!c.isEmpty())) {
                c = d(str);
                this.b.e(c, str);
            }
        } finally {
        }
        return c;
    }
}
