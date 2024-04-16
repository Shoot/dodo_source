package defpackage;

import android.app.Activity;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import defpackage.tmb;
import kotlin.Metadata;
/* compiled from: AddressFormFragmentModule.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\rH\u0007¨\u0006\u0014"}, d2 = {"Lz7;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lws3;", "b", "Landroid/app/Activity;", "activity", "Lt7;", "presenterFactory", "fieldsConfig", "Lay1;", tmb.c.COUNTRY_JSON_NAME, "Lj54;", "a", "creator", "Lh54;", c.a, "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: z7  reason: default package */
/* loaded from: classes3.dex */
public final class z7 {
    public static final z7 a = new z7();

    private z7() {
    }

    public final j54 a(Activity activity, t7 t7Var, ws3 ws3Var, ay1 ay1Var) {
        z65.h(activity, "activity");
        z65.h(t7Var, "presenterFactory");
        z65.h(ws3Var, "fieldsConfig");
        z65.h(ay1Var, tmb.c.COUNTRY_JSON_NAME);
        return new j54(new u7(activity), new tp2(t7Var), ws3Var.a(ay1Var.getCode()));
    }

    public final ws3 b(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return new v7(context);
    }

    public final h54 c(j54 j54Var) {
        z65.h(j54Var, "creator");
        return new h54(j54Var, null, null, null, 14, null);
    }
}
