package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import retrofit2.Retrofit;
import ru.dodopizza.app.R;
import ru.dodopizza.backend.domain.order.OrderApi;
/* compiled from: OrderModule.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007J@\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\fH\u0007J\u0018\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0007J\u0018\u0010&\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u000eH\u0007¨\u0006)"}, d2 = {"Lng7;", "", "Lhg7;", "impl", "Lli7;", "f", "Lretrofit2/Retrofit;", "retrofit", "Lru/dodopizza/backend/domain/order/OrderApi;", e.a, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lmh0;", "buildInfo", "Lw13;", DateTokenConverter.CONVERTER_KEY, "Lgc;", "analytics", "Lava;", "stateProvider", "La98;", "pizzeriaRepository", "Lr43;", "distanceMeasurer", "Lzl5;", "lastLocationProvider", "Li32;", "currentLocaleProvider", "Lbd;", "a", "orderApi", "Lg22;", "createOrderRequestConverter", "Li22;", c.a, "Ljgb;", "timeFormatter", "deviceInfoForOrderCreator", "b", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ng7  reason: default package */
/* loaded from: classes3.dex */
public final class ng7 {
    public static final ng7 a = new ng7();

    /* compiled from: OrderModule.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ng7$a */
    /* loaded from: classes3.dex */
    static final class a extends ej5 implements Function0<String> {
        final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            String string = this.a.getString(R.string.app_name_non_translatable);
            z65.g(string, "getString(...)");
            return string;
        }
    }

    private ng7() {
    }

    public final bd a(gc gcVar, ava avaVar, a98 a98Var, r43 r43Var, zl5 zl5Var, i32 i32Var, mh0 mh0Var) {
        z65.h(gcVar, "analytics");
        z65.h(avaVar, "stateProvider");
        z65.h(a98Var, "pizzeriaRepository");
        z65.h(r43Var, "distanceMeasurer");
        z65.h(zl5Var, "lastLocationProvider");
        z65.h(i32Var, "currentLocaleProvider");
        z65.h(mh0Var, "buildInfo");
        return new cd(gcVar, avaVar, a98Var, r43Var, zl5Var, i32Var, mh0Var);
    }

    public final g22 b(jgb jgbVar, w13 w13Var) {
        z65.h(jgbVar, "timeFormatter");
        z65.h(w13Var, "deviceInfoForOrderCreator");
        return new h22(jgbVar, w13Var);
    }

    public final i22 c(OrderApi orderApi, g22 g22Var) {
        z65.h(orderApi, "orderApi");
        z65.h(g22Var, "createOrderRequestConverter");
        return new j22(orderApi, g22Var);
    }

    public final w13 d(Context context, mh0 mh0Var) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(mh0Var, "buildInfo");
        return new x13(mh0Var, new a(context));
    }

    public final OrderApi e(Retrofit retrofit) {
        z65.h(retrofit, "retrofit");
        return (OrderApi) retrofit.create(OrderApi.class);
    }

    public final li7 f(hg7 hg7Var) {
        z65.h(hg7Var, "impl");
        return hg7Var;
    }
}
