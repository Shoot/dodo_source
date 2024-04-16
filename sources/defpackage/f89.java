package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.PackageInfoEntity;
import com.dodopizza.persistence.entity.PackageWidgetDataEntity;
import com.dodopizza.persistence.entity.cart.CartEntity;
import com.dodopizza.persistence.entity.cart.DataPromoCodeEntity;
import com.dodopizza.persistence.entity.cart.StateEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import io.realm.d0;
import io.realm.k0;
import io.realm.n0;
import java.util.Iterator;
import kotlin.Metadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: RealmDataSource.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u001a\u0010\u0010\u001a\u00020\u00052\u0010\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\rH\u0002J\u0012\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0002J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\u0017\u001a\u00020\u0005J\u0006\u0010\u0018\u001a\u00020\u0005R\u001c\u0010\u001c\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001b¨\u0006\u001f"}, d2 = {"Lf89;", "", "Lio/realm/d0;", "a", "realm", "", c.a, "", "throwable", "b", "", "localityId", "i", "Lio/realm/k0;", "Lio/realm/n0;", StatisticManager.LIST, DateTokenConverter.CONVERTER_KEY, "realmObject", e.a, "Lcom/dodopizza/persistence/entity/cart/StateEntity;", "state", "j", Image.TYPE_HIGH, "g", "f", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lorg/slf4j/Logger;", "logger", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: f89  reason: default package */
/* loaded from: classes3.dex */
public final class f89 {
    private final Logger a = LoggerFactory.getLogger("RealmDataSource");

    private final d0 a() {
        d0 x0 = d0.x0();
        x0.beginTransaction();
        z65.e(x0);
        return x0;
    }

    private final void b(d0 d0Var, Throwable th) {
        this.a.error("Some trouble in RealmDataSource#cancelTransaction", th);
        if (d0Var.H()) {
            d0Var.a();
        }
        d0Var.close();
    }

    private final void c(d0 d0Var) {
        d0Var.i();
        d0Var.close();
    }

    private final void d(k0<? extends n0> k0Var) {
        if (k0Var == null) {
            return;
        }
        while (!k0Var.isEmpty()) {
            n0 n0Var = k0Var.get(0);
            if (n0Var != null) {
                n0Var.deleteFromRealm();
            }
        }
        k0Var.t();
    }

    private final void e(n0 n0Var) {
        if (n0Var != null) {
            n0Var.deleteFromRealm();
        }
    }

    private final void i(String str, d0 d0Var) {
        PackageWidgetDataEntity packageWidgetDataEntity;
        StateEntity stateEntity = (StateEntity) d0Var.Y0(StateEntity.class).e("localityId", str).h();
        if (stateEntity != null) {
            e(stateEntity.getDeliveryAddressEntity());
            e(stateEntity.getDataPayment());
            if (stateEntity.getCart() != null) {
                CartEntity cart = stateEntity.getCart();
                z65.e(cart);
                d(cart.getGiftItems());
                CartEntity cart2 = stateEntity.getCart();
                z65.e(cart2);
                e(cart2.getPrice());
                CartEntity cart3 = stateEntity.getCart();
                z65.e(cart3);
                if (cart3.getPromoCode() != null) {
                    CartEntity cart4 = stateEntity.getCart();
                    z65.e(cart4);
                    DataPromoCodeEntity promoCode = cart4.getPromoCode();
                    z65.e(promoCode);
                    e(promoCode.getAppliedInfo());
                    CartEntity cart5 = stateEntity.getCart();
                    z65.e(cart5);
                    DataPromoCodeEntity promoCode2 = cart5.getPromoCode();
                    z65.e(promoCode2);
                    e(promoCode2.getBonusAction());
                }
                CartEntity cart6 = stateEntity.getCart();
                z65.e(cart6);
                e(cart6.getPromoCode());
                d(stateEntity.getErrors());
            }
            e(stateEntity.getCart());
            PackageInfoEntity packageInfo = stateEntity.getPackageInfo();
            if (packageInfo != null) {
                packageWidgetDataEntity = packageInfo.getWidgetData();
            } else {
                packageWidgetDataEntity = null;
            }
            e(packageWidgetDataEntity);
            e(stateEntity.getPackageInfo());
            stateEntity.deleteFromRealm();
        }
    }

    public final void f() {
        d0 a = a();
        try {
            Iterator it = a.Y0(StateEntity.class).g().iterator();
            while (it.hasNext()) {
                String localityId = ((StateEntity) it.next()).getLocalityId();
                if (localityId != null) {
                    i(localityId, a);
                }
            }
            c(a);
        } catch (Throwable th) {
            b(a, th);
        }
    }

    public final void g() {
        d0 a = a();
        try {
            a.k();
        } finally {
            c(a);
        }
    }

    public final StateEntity h(String str) {
        z65.h(str, "localityId");
        d0 x0 = d0.x0();
        x0.K();
        StateEntity stateEntity = null;
        try {
            StateEntity stateEntity2 = (StateEntity) x0.Y0(StateEntity.class).e("localityId", str).h();
            if (stateEntity2 != null) {
                stateEntity = (StateEntity) x0.S(stateEntity2);
            }
        } catch (Throwable th) {
            try {
                Logger logger = this.a;
                logger.error("Some trouble when getting state " + str, th);
            } finally {
                x0.close();
            }
        }
        return stateEntity;
    }

    public final void j(StateEntity stateEntity) {
        z65.h(stateEntity, "state");
        d0 a = a();
        try {
            String localityId = stateEntity.getLocalityId();
            if (localityId == null) {
                localityId = "";
            }
            i(localityId, a);
            a.O0(stateEntity);
            c(a);
        } catch (Throwable th) {
            b(a, th);
        }
    }
}
