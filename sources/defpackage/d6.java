package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.support.api.entity.core.CommonCode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: ActivityStartTryBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0018\u0010\b\u001a\u00020\u0003*\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u001a\n\u0010\t\u001a\u00020\u0006*\u00020\u0003¨\u0006\n"}, d2 = {"Landroid/content/Context;", "Landroid/content/Intent;", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "Lc6;", c.a, "Lkotlin/Function0;", "", "onNotFound", "b", "a", "android_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: d6  reason: default package */
/* loaded from: classes.dex */
public final class d6 {
    public static final void a(c6 c6Var) {
        z65.h(c6Var, "<this>");
        Intent b = c6Var.b();
        if (b != null) {
            try {
                c6Var.a().startActivity(b);
                Unit unit = Unit.a;
            } catch (ActivityNotFoundException unused) {
                Function0<Unit> c = c6Var.c();
                if (c != null) {
                    c.invoke();
                    Unit unit2 = Unit.a;
                }
            }
        }
    }

    public static final c6 b(c6 c6Var, Function0<Unit> function0) {
        z65.h(c6Var, "<this>");
        z65.h(function0, "onNotFound");
        c6Var.e(function0);
        return c6Var;
    }

    public static final c6 c(Context context, Intent intent) {
        z65.h(context, "<this>");
        z65.h(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        c6 c6Var = new c6(context);
        c6Var.d(intent);
        return c6Var;
    }
}
