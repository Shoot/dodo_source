package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.BonusActionEntity;
import com.dodopizza.persistence.entity.PackageInfoEntity;
import com.dodopizza.persistence.entity.cart.CartEntity;
import com.dodopizza.persistence.entity.cart.CartItemEntity;
import com.dodopizza.persistence.entity.cart.PriceEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import io.realm.k0;
import kotlin.Metadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.data.dto.response.OrderResponse;
/* compiled from: AnalyticsHelper.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010#\u001a\u00020!\u0012\u0006\u0010&\u001a\u00020$\u0012\u0006\u0010)\u001a\u00020'\u0012\u0006\u0010,\u001a\u00020*¢\u0006\u0004\b5\u00106J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J%\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010+R\u001c\u00100\u001a\n .*\u0004\u0018\u00010-0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R\u0014\u00104\u001a\u0002018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00067"}, d2 = {"Lcd;", "Lbd;", "Ltl5;", Image.TYPE_HIGH, "Lru/dodopizza/app/data/dto/response/OrderResponse;", "orderResponse", "", "f", "Lov5;", "orderLocation", "Ld88;", "pizzeria", "", "g", "(Lov5;Ld88;)Ljava/lang/Float;", "", "b", "a", "isError", e.a, c.a, "Lbc7;", BonusActionEntity.ORDER, DateTokenConverter.CONVERTER_KEY, "Lgc;", "Lgc;", "analytics", "Lava;", "Lava;", "stateProvider", "La98;", "La98;", "pizzeriaRepository", "Lr43;", "Lr43;", "distanceMeasurer", "Lzl5;", "Lzl5;", "lastLocationProvider", "Li32;", "Li32;", "currentLocaleProvider", "Lmh0;", "Lmh0;", "buildInfo", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lorg/slf4j/Logger;", "logger", "Ldu7;", "i", "()Ldu7;", "paymentType", "<init>", "(Lgc;Lava;La98;Lr43;Lzl5;Li32;Lmh0;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: cd  reason: default package */
/* loaded from: classes4.dex */
public final class cd implements bd {
    private final gc a;
    private final ava b;
    private final a98 c;
    private final r43 d;
    private final zl5 e;
    private final i32 f;
    private final mh0 g;
    private final Logger h;

    public cd(gc gcVar, ava avaVar, a98 a98Var, r43 r43Var, zl5 zl5Var, i32 i32Var, mh0 mh0Var) {
        z65.h(gcVar, "analytics");
        z65.h(avaVar, "stateProvider");
        z65.h(a98Var, "pizzeriaRepository");
        z65.h(r43Var, "distanceMeasurer");
        z65.h(zl5Var, "lastLocationProvider");
        z65.h(i32Var, "currentLocaleProvider");
        z65.h(mh0Var, "buildInfo");
        this.a = gcVar;
        this.b = avaVar;
        this.c = a98Var;
        this.d = r43Var;
        this.e = zl5Var;
        this.f = i32Var;
        this.g = mh0Var;
        this.h = LoggerFactory.getLogger("AnalyticsHelperImpl");
    }

    private final boolean f(OrderResponse orderResponse) {
        k0<CartItemEntity> cartItems;
        CartEntity cart = orderResponse.getState().getCart();
        if (cart == null || (cartItems = cart.getCartItems()) == null || cartItems.isEmpty()) {
            return false;
        }
        for (CartItemEntity cartItemEntity : cartItems) {
            if (!cartItemEntity.getCartComboProducts().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private final Float g(ov5 ov5Var, d88 d88Var) {
        if (ov5Var == null || d88Var == null) {
            return null;
        }
        return Float.valueOf(this.d.a(ov5Var, d88Var.x()));
    }

    private final tl5 h() {
        return ul5.a(this.f.get());
    }

    private final du7 i() {
        return wn3.a(this.b.e());
    }

    @Override // defpackage.bd
    public void a() {
        this.a.a(v31.c(i()));
    }

    @Override // defpackage.bd
    public void b(OrderResponse orderResponse) {
        d88 d88Var;
        Integer num;
        ov5 ov5Var;
        double d;
        boolean z;
        Integer num2;
        oo7 b;
        PriceEntity price;
        z65.h(orderResponse, "orderResponse");
        String selectedPizzeriaId = orderResponse.getState().getSelectedPizzeriaId();
        xo7 xo7Var = null;
        if (selectedPizzeriaId != null) {
            d88Var = this.c.a(selectedPizzeriaId);
        } else {
            d88Var = null;
        }
        bc7 createdOrder = orderResponse.getCreatedOrder();
        if (createdOrder != null) {
            num = Integer.valueOf(createdOrder.e());
        } else {
            num = null;
        }
        this.a.a(jd.c(orderResponse.getState(), num, d88Var, this.g));
        try {
            ov5Var = this.e.get();
        } catch (Exception e) {
            this.h.warn("Failed to get last location. ", (Throwable) e);
            ov5Var = null;
        }
        CartEntity cart = orderResponse.getState().getCart();
        if (cart != null && (price = cart.getPrice()) != null) {
            d = price.getLoyaltyRewardSum();
        } else {
            d = 0.0d;
        }
        double d2 = d;
        PackageInfoEntity packageInfo = this.b.e().getPackageInfo();
        if (packageInfo != null && (b = qo7.b(packageInfo)) != null) {
            xo7Var = b.b();
        }
        if (xo7Var == xo7.b) {
            z = true;
        } else {
            z = false;
        }
        bc7 createdOrder2 = orderResponse.getCreatedOrder();
        if (createdOrder2 != null) {
            num2 = num;
            this.a.a(new f22(createdOrder2, d2, orderResponse.getState(), d88Var, kn6.f().c(), ov5Var, g(ov5Var, d88Var), h(), z));
        } else {
            num2 = num;
        }
        if (f(orderResponse)) {
            this.a.a(new d22(orderResponse.getState(), num2, d88Var));
        }
    }

    @Override // defpackage.bd
    public void c() {
        this.a.a(v31.b(oe8.c));
    }

    @Override // defpackage.bd
    public void d(bc7 bc7Var) {
        z65.h(bc7Var, BonusActionEntity.ORDER);
        this.a.a(new cc7(bc7Var.t(), bc7Var.B()));
        this.a.a(jd.d(bc7Var));
    }

    @Override // defpackage.bd
    public void e(boolean z) {
        this.a.a(v31.d(i(), z));
    }
}
