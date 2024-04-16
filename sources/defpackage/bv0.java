package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: ChangeLocalityService.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001Ba\b\u0001\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u000200¢\u0006\u0004\b4\u00105J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00066"}, d2 = {"Lbv0;", "", "", "localityId", LocalityEntity.FIELD_COUNTRY_CODE, "", "b", "Ldt5;", "newLocality", "a", "Lava;", "Lava;", "stateProvider", "Lvg7;", "Lvg7;", "orderPizzeriaStateService", "Lc62;", c.a, "Lc62;", "customizationService", "Ldv5;", DateTokenConverter.CONVERTER_KEY, "Ldv5;", "localityRepository", "La98;", e.a, "La98;", "pizzeriaRepository", "Ldua;", "f", "Ldua;", "stateAnalyzer", "Lcs0;", "g", "Lcs0;", "cartRepository", "Las0;", Image.TYPE_HIGH, "Las0;", "cartQueueService", "Ljv5;", "i", "Ljv5;", "localityService", "Lwl5;", "j", "Lwl5;", "languageService", "Lny1;", "k", "Lny1;", "countryLanguageConfigService", "<init>", "(Lava;Lvg7;Lc62;Ldv5;La98;Ldua;Lcs0;Las0;Ljv5;Lwl5;Lny1;)V", "core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: bv0  reason: default package */
/* loaded from: classes.dex */
public final class bv0 {
    private final ava a;
    private final vg7 b;
    private final c62 c;
    private final dv5 d;
    private final a98 e;
    private final dua f;
    private final cs0 g;
    private final as0 h;
    private final jv5 i;
    private final wl5 j;
    private final ny1 k;

    public bv0(ava avaVar, vg7 vg7Var, c62 c62Var, dv5 dv5Var, a98 a98Var, dua duaVar, cs0 cs0Var, as0 as0Var, jv5 jv5Var, wl5 wl5Var, ny1 ny1Var) {
        z65.h(avaVar, "stateProvider");
        z65.h(vg7Var, "orderPizzeriaStateService");
        z65.h(c62Var, "customizationService");
        z65.h(dv5Var, "localityRepository");
        z65.h(a98Var, "pizzeriaRepository");
        z65.h(duaVar, "stateAnalyzer");
        z65.h(cs0Var, "cartRepository");
        z65.h(as0Var, "cartQueueService");
        z65.h(jv5Var, "localityService");
        z65.h(wl5Var, "languageService");
        z65.h(ny1Var, "countryLanguageConfigService");
        this.a = avaVar;
        this.b = vg7Var;
        this.c = c62Var;
        this.d = dv5Var;
        this.e = a98Var;
        this.f = duaVar;
        this.g = cs0Var;
        this.h = as0Var;
        this.i = jv5Var;
        this.j = wl5Var;
        this.k = ny1Var;
    }

    public final boolean a(dt5 dt5Var) {
        z65.h(dt5Var, "newLocality");
        dt5 d = this.d.d();
        if (z65.c(d, dt5Var)) {
            return false;
        }
        this.d.k(dt5Var);
        if (d != null && !z65.c(d.a(), dt5Var.a())) {
            this.f.a();
        }
        this.a.c();
        this.c.e();
        this.h.clear();
        this.e.clear();
        cs0 cs0Var = this.g;
        t90 t90Var = t90.e;
        z65.g(t90Var, "DEFAULT");
        cs0Var.i(t90Var, true);
        this.b.a(d88.x.a());
        this.j.d(this.k.c(dt5Var.a()));
        return true;
    }

    public final boolean b(String str, String str2) {
        z65.h(str, "localityId");
        z65.h(str2, LocalityEntity.FIELD_COUNTRY_CODE);
        dt5 b = this.i.b(str2, str);
        if (b == null) {
            return false;
        }
        return a(b);
    }
}
