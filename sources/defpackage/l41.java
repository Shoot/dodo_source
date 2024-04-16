package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: CheckoutDetailsModule.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\b\u0010\u0013\u001a\u00020\u0012H\u0007J\u0012\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0015\u001a\u00020\u0014H\u0007¨\u0006\u001a"}, d2 = {"Ll41;", "", "Lj41;", "impl", "Li41;", c.a, "Lop5;", "lifecycleOwner", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lxtb;", e.a, "Ljgb;", "timeFormatter", "Lhq3;", "featureService", "Lvs2;", "b", "Lyt9;", DateTokenConverter.CONVERTER_KEY, "Lf63;", "checkoutRouter", "Ls41;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: l41  reason: default package */
/* loaded from: classes3.dex */
public final class l41 {
    public static final l41 a = new l41();

    private l41() {
    }

    public final s41 a(f63 f63Var) {
        z65.h(f63Var, "checkoutRouter");
        return new s41(f63Var);
    }

    public final vs2 b(jgb jgbVar, hq3 hq3Var) {
        z65.h(jgbVar, "timeFormatter");
        z65.h(hq3Var, "featureService");
        if (hq3Var.a(bq3.f)) {
            return new xs2(jgbVar);
        }
        return new ws2(jgbVar);
    }

    public final i41 c(j41 j41Var) {
        z65.h(j41Var, "impl");
        return j41Var;
    }

    public final yt9 d() {
        return new yt9();
    }

    public final xtb e(op5 op5Var, Context context) {
        z65.h(op5Var, "lifecycleOwner");
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return new h42(op5Var, context, new f42(context), new lg0(context));
    }
}
