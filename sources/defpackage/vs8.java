package defpackage;

import android.content.Context;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.core.domain.push.ServicePushApi;
import com.dodopizza.core.domain.push.a;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.efb;
import kotlin.Metadata;
import retrofit2.Retrofit;
/* compiled from: PushModule.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\b\u0010\u000f\u001a\u00020\u000eH\u0007J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0007J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¨\u0006\u001e"}, d2 = {"Lvs8;", "", "Lretrofit2/Retrofit;", "retrofit", "Lcom/dodopizza/core/domain/push/ServicePushApi;", e.a, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lut8;", "a", "Lcom/dodopizza/core/domain/push/a;", "impl", "Lxda;", "f", "Ly27;", c.a, "Lgc;", "analytics", "notificationTextFilter", "Lefb$b;", "threadsLibNotificationFactory", "Lgk7;", "orderTrackingNotificationFactory", "Ln27;", "b", "Leb0;", "binaryFeedbackFeatureState", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: vs8  reason: default package */
/* loaded from: classes3.dex */
public final class vs8 {
    public static final vs8 a = new vs8();

    private vs8() {
    }

    public final ut8 a(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return new eo3(context);
    }

    public final n27 b(gc gcVar, y27 y27Var, efb.b bVar, gk7 gk7Var) {
        z65.h(gcVar, "analytics");
        z65.h(y27Var, "notificationTextFilter");
        z65.h(bVar, "threadsLibNotificationFactory");
        z65.h(gk7Var, "orderTrackingNotificationFactory");
        return new o27(gcVar, y27Var, bVar, gk7Var);
    }

    public final y27 c() {
        if (Build.VERSION.SDK_INT < 26) {
            return new a37();
        }
        return new z27();
    }

    public final gk7 d(eb0 eb0Var) {
        z65.h(eb0Var, "binaryFeedbackFeatureState");
        return new gk7(eb0Var);
    }

    public final ServicePushApi e(Retrofit retrofit) {
        z65.h(retrofit, "retrofit");
        return (ServicePushApi) retrofit.create(ServicePushApi.class);
    }

    public final xda f(a aVar) {
        z65.h(aVar, "impl");
        return aVar;
    }
}
