package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.UpsaleStateEntity;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.dv0;
import defpackage.ev0;
import defpackage.hv0;
import defpackage.iv0;
import defpackage.wl5;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: SelectLocationServiceImpl.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010%\u001a\u00020#\u0012\u0006\u0010(\u001a\u00020&\u0012\u0006\u0010+\u001a\u00020)\u0012\u0006\u0010.\u001a\u00020,\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00105\u001a\u000203\u0012\u0006\u00108\u001a\u000206¢\u0006\u0004\b9\u0010:J\u001e\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0002J\u001a\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0002J\u001a\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\"\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u0002H\u0002J \u0010\u001c\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010 \u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\"\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020!H\u0016R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010*R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00105\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00104R\u0014\u00108\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00107¨\u0006;"}, d2 = {"Ll6a;", "Lk6a;", "", "Lru/dodopizza/app/domain/country/models/CountryCode;", LocalityEntity.FIELD_COUNTRY_CODE, "Ltl5;", "newLanguageConfig", "", "l", "Ldt5;", "locality", "languageConfig", "Liv0;", "g", Image.TYPE_HIGH, "k", "Lhv0$c;", "request", "i", "j", "pizzeriaId", "pizzeriaHasRestaurantOperationalType", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "", DateTokenConverter.CONVERTER_KEY, "Le91;", "clientDeliveryLocation", "languageIsChanged", "f", "Lhv0$b;", "changeLocalityRequest", "a", c.a, "Lhv0$a;", "b", "Lev0;", "Lev0;", "changeLocationLogicFactory", "Lbv0;", "Lbv0;", "changeLocalityService", "Lkfa;", "Lkfa;", "setDeliveryLocationService", "Llh8;", "Llh8;", "predefinePizzeriaService", "Lwl5;", e.a, "Lwl5;", "languageService", "Lny1;", "Lny1;", "languageConfigs", "Lf8c;", "Lf8c;", "workflowIdProvider", "<init>", "(Lev0;Lbv0;Lkfa;Llh8;Lwl5;Lny1;Lf8c;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: l6a  reason: default package */
/* loaded from: classes4.dex */
public final class l6a implements k6a {
    private final ev0 a;
    private final bv0 b;
    private final kfa c;
    private final lh8 d;
    private final wl5 e;
    private final ny1 f;
    private final f8c g;

    public l6a(ev0 ev0Var, bv0 bv0Var, kfa kfaVar, lh8 lh8Var, wl5 wl5Var, ny1 ny1Var, f8c f8cVar) {
        z65.h(ev0Var, "changeLocationLogicFactory");
        z65.h(bv0Var, "changeLocalityService");
        z65.h(kfaVar, "setDeliveryLocationService");
        z65.h(lh8Var, "predefinePizzeriaService");
        z65.h(wl5Var, "languageService");
        z65.h(ny1Var, "languageConfigs");
        z65.h(f8cVar, "workflowIdProvider");
        this.a = ev0Var;
        this.b = bv0Var;
        this.c = kfaVar;
        this.d = lh8Var;
        this.e = wl5Var;
        this.f = ny1Var;
        this.g = f8cVar;
    }

    private final void d(String str, boolean z, String str2) {
        if (z) {
            this.d.b(str, str2);
        } else {
            this.d.a(str, str2);
        }
    }

    static /* synthetic */ void e(l6a l6aVar, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        l6aVar.d(str, z, str2);
    }

    private final iv0 f(dt5 dt5Var, e91 e91Var, boolean z) {
        this.b.a(dt5Var);
        this.c.a(e91Var, true, this.g.b());
        return new iv0.c(z);
    }

    private final iv0 g(dt5 dt5Var, tl5 tl5Var) {
        String b;
        if (tl5Var == null || (b = tl5Var.b()) == null) {
            b = this.e.b(dt5Var.a()).b();
        }
        return new iv0.d(dt5Var, b);
    }

    private final iv0 h(dt5 dt5Var, tl5 tl5Var) {
        boolean l = l(dt5Var.a(), tl5Var);
        this.b.a(dt5Var);
        return new iv0.c(l);
    }

    private final iv0 i(hv0.c cVar) {
        y58 a = cVar.a();
        tl5 b = cVar.b();
        String a2 = a.a();
        dt5 b2 = a.b();
        boolean c = a.c();
        boolean l = l(b2.a(), b);
        this.b.a(b2);
        e(this, a2, c, null, 4, null);
        return new iv0.c(l);
    }

    private final iv0 j(hv0.c cVar) {
        y58 a = cVar.a();
        tl5 b = cVar.b();
        String a2 = a.a();
        dt5 b2 = a.b();
        boolean c = a.c();
        boolean l = l(b2.a(), b);
        String b3 = this.g.b();
        this.b.a(b2);
        d(a2, c, b3);
        return new iv0.c(l);
    }

    private final iv0 k(dt5 dt5Var, tl5 tl5Var) {
        return new iv0.e(dt5Var, l(dt5Var.a(), tl5Var));
    }

    private final boolean l(String str, tl5 tl5Var) {
        wl5 wl5Var = this.e;
        if (tl5Var == null) {
            tl5Var = wl5Var.b(str);
        }
        return wl5Var.d(tl5Var) instanceof wl5.a.C0724a;
    }

    @Override // defpackage.k6a
    public iv0 a(hv0.b bVar) {
        z65.h(bVar, "changeLocalityRequest");
        dt5 b = bVar.b();
        dv0 a = ev0.a.a(this.a, b, false, 2, null);
        if (a instanceof dv0.b) {
            return h(b, bVar.a());
        }
        if (z65.c(a, dv0.c.a)) {
            return k(b, bVar.a());
        }
        if (z65.c(a, dv0.a.a)) {
            return g(b, bVar.a());
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.k6a
    public iv0 b(hv0.a aVar) {
        z65.h(aVar, "request");
        dt5 f = aVar.f();
        tl5 e = aVar.e();
        if (e == null) {
            e = this.f.c(f.a());
        }
        boolean l = l(f.a(), e);
        dv0 a = this.a.a(f, aVar.d());
        if (a instanceof dv0.b) {
            return f(f, aVar.c(), l);
        }
        if (z65.c(a, dv0.c.a)) {
            return new iv0.a(aVar.c(), l);
        }
        if (z65.c(a, dv0.a.a)) {
            return g(f, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.k6a
    public iv0 c(hv0.c cVar) {
        z65.h(cVar, "request");
        dt5 d = cVar.d().d();
        dv0 a = ev0.a.a(this.a, d, false, 2, null);
        if (a instanceof dv0.b) {
            return i(cVar);
        }
        if (z65.c(a, dv0.c.a)) {
            return j(cVar);
        }
        if (z65.c(a, dv0.a.a)) {
            return g(d, cVar.c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
