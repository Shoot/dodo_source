package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ou2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.dodopizza.backend.domain.customer.CustomerAPI;
import ru.dodopizza.backend.domain.customer.dto.DeleteAddressRequestDto;
import ru.dodopizza.backend.domain.customer.dto.DeleteLocationRequestDto;
import ru.dodopizza.backend.domain.customer.dto.SaveClientDeliveryLocationDto;
import ru.dodopizza.backend.domain.state.dto.deliverylocation.CoordinatesDto;
import ru.dodopizza.backend.domain.state.dto.deliverylocation.DeliveryLocationDto;
/* compiled from: CustomerAddressService.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0!\u0012\u0006\u0010'\u001a\u00020%\u0012\u0006\u0010*\u001a\u00020(¢\u0006\u0004\b2\u00103J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0016\u0010\u0018\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\fH\u0016J\b\u0010\u001b\u001a\u00020\u0007H\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010)R\u001c\u0010.\u001a\n +*\u0004\u0018\u00010\"0\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00101\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00064"}, d2 = {"Ly42;", "Lx42;", "Le91;", "Lru/dodopizza/backend/domain/customer/dto/SaveClientDeliveryLocationDto;", Image.TYPE_MEDIUM, "Lw6;", "address", "", Image.TYPE_HIGH, "clientDeliveryLocation", "i", "", "Lou2;", "j", "o", "", "getAll", "n", "a", e.a, "", "id", DateTokenConverter.CONVERTER_KEY, "deliverablePlaces", "b", "deliverablePlace", "f", c.a, "", "g", "Lv42;", "Lv42;", "repository", "Las8;", "Lru/dodopizza/backend/domain/customer/CustomerAPI;", "Las8;", "customerAPIProvider", "Lj9a;", "Lj9a;", "selectedAddressState", "Lhq3;", "Lhq3;", "featureService", "kotlin.jvm.PlatformType", "k", "()Lru/dodopizza/backend/domain/customer/CustomerAPI;", "customerAPI", "l", "()Z", "useDeliveryLocationProfile", "<init>", "(Lv42;Las8;Lj9a;Lhq3;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: y42  reason: default package */
/* loaded from: classes4.dex */
public final class y42 implements x42 {
    private final v42 a;
    private final as8<CustomerAPI> b;
    private final j9a c;
    private final hq3 d;

    public y42(v42 v42Var, as8<CustomerAPI> as8Var, j9a j9aVar, hq3 hq3Var) {
        z65.h(v42Var, "repository");
        z65.h(as8Var, "customerAPIProvider");
        z65.h(j9aVar, "selectedAddressState");
        z65.h(hq3Var, "featureService");
        this.a = v42Var;
        this.b = as8Var;
        this.c = j9aVar;
        this.d = hq3Var;
    }

    private final void h(w6 w6Var) {
        if (!w6Var.o()) {
            k().deleteCustomerAddress(new DeleteAddressRequestDto(w6Var.getId()));
        }
        this.a.d(w6Var.getId());
    }

    private final void i(e91 e91Var) {
        k().deleteCustomerDeliveryLocation(new DeleteLocationRequestDto(e91Var.getId()));
        this.a.c(e91Var.getId());
    }

    private final List<ou2> j() {
        ArrayList arrayList;
        int w;
        int w2;
        if (l()) {
            List<e91> g = this.a.g();
            w2 = lc1.w(g, 10);
            arrayList = new ArrayList(w2);
            for (e91 e91Var : g) {
                arrayList.add(ru2.c(e91Var));
            }
        } else {
            List<w6> e = this.a.e();
            w = lc1.w(e, 10);
            arrayList = new ArrayList(w);
            for (w6 w6Var : e) {
                arrayList.add(ru2.b(w6Var));
            }
        }
        return arrayList;
    }

    private final CustomerAPI k() {
        return this.b.get();
    }

    private final boolean l() {
        return this.d.a(bq3.d5);
    }

    private final SaveClientDeliveryLocationDto m(e91 e91Var) {
        return new SaveClientDeliveryLocationDto(e91Var.getId(), new DeliveryLocationDto(e91Var.c().f(), e91Var.c().c(), new CoordinatesDto(e91Var.c().d().b(), e91Var.c().d().c()), e91Var.c().e()));
    }

    private final void o(w6 w6Var) {
        this.c.h(w6Var);
    }

    @Override // defpackage.x42
    public void a(e91 e91Var) {
        z65.h(e91Var, "clientDeliveryLocation");
        if (e91Var.e()) {
            return;
        }
        k().saveClientLocation(m(e91Var));
        this.a.f(new ou2.c(e91Var));
    }

    @Override // defpackage.x42
    public void b(List<? extends ou2> list) {
        z65.h(list, "deliverablePlaces");
        this.a.b(list);
    }

    @Override // defpackage.x42
    public void c() {
        this.a.clear();
    }

    @Override // defpackage.x42
    public w6 d(String str) {
        z65.h(str, "id");
        w6 a = this.a.a(str);
        if (a != null) {
            return a;
        }
        throw new IllegalArgumentException("There is not such address with id=" + str);
    }

    @Override // defpackage.x42
    public w6 e(w6 w6Var) {
        Object obj;
        z65.h(w6Var, "address");
        Iterator<T> it = this.a.e().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((w6) obj).q(w6Var)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        w6 w6Var2 = (w6) obj;
        if (w6Var2 != null) {
            return w6Var2;
        }
        n(w6Var);
        return w6Var;
    }

    @Override // defpackage.x42
    public void f(ou2 ou2Var) {
        z65.h(ou2Var, "deliverablePlace");
        if (ou2Var instanceof ou2.b) {
            h(((ou2.b) ou2Var).b());
            o(w6.n);
        } else if (ou2Var instanceof ou2.c) {
            i(((ou2.c) ou2Var).b());
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // defpackage.x42
    public boolean g() {
        if (this.d.a(bq3.d5)) {
            if (this.a.g().isEmpty()) {
                return false;
            }
        } else if (this.a.e().isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.x42
    public Collection<ou2> getAll() {
        return j();
    }

    public void n(w6 w6Var) {
        z65.h(w6Var, "address");
        this.a.f(new ou2.b(w6Var));
        o(w6Var);
    }
}
