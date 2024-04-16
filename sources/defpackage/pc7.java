package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.controlling.feature.ordercompleted.presentation.OrderCompletedPresenter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: OrderCompletedModule.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J8\u0010\u0014\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0007J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¨\u0006 "}, d2 = {"Lpc7;", "", "Lcom/dodopizza/controlling/feature/ordercompleted/presentation/OrderCompletedPresenter;", "presenter", "Lfz1;", "a", "Ltr6;", "b", "Lic7;", "data", "Loc7;", "interactor", "Lgc;", "analytics", "Lf63;", "router", "Ljc7;", "courierTipsFeatureState", "Lah7;", "autoSubmitFeatureState", DateTokenConverter.CONVERTER_KEY, "Lo69;", "ratingService", c.a, "Lop5;", "lifecycleOwner", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lxtb;", e.a, "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: pc7  reason: default package */
/* loaded from: classes.dex */
public final class pc7 {
    public static final pc7 a = new pc7();

    private pc7() {
    }

    public final fz1 a(OrderCompletedPresenter orderCompletedPresenter) {
        z65.h(orderCompletedPresenter, "presenter");
        return orderCompletedPresenter;
    }

    public final tr6 b(OrderCompletedPresenter orderCompletedPresenter) {
        z65.h(orderCompletedPresenter, "presenter");
        return orderCompletedPresenter;
    }

    public final oc7 c(o69 o69Var) {
        z65.h(o69Var, "ratingService");
        return new oc7(o69Var, null, 2, null);
    }

    public final OrderCompletedPresenter d(ic7 ic7Var, oc7 oc7Var, gc gcVar, f63 f63Var, jc7 jc7Var, ah7 ah7Var) {
        z65.h(ic7Var, "data");
        z65.h(oc7Var, "interactor");
        z65.h(gcVar, "analytics");
        z65.h(f63Var, "router");
        z65.h(jc7Var, "courierTipsFeatureState");
        z65.h(ah7Var, "autoSubmitFeatureState");
        return new OrderCompletedPresenter(ic7Var, oc7Var, gcVar, f63Var, jc7Var, ah7Var);
    }

    public final xtb e(op5 op5Var, Context context) {
        z65.h(op5Var, "lifecycleOwner");
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return new h42(op5Var, context, new f42(context), new lg0(context));
    }
}
