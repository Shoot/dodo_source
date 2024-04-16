package ru.dodopizza.app.presentation.selectpizzeria;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: PizzeriasMap.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class a {
    public final boolean a(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        int a = iu1.a(context, "android.permission.INTERNET");
        int a2 = iu1.a(context, "android.permission.ACCESS_NETWORK_STATE");
        int a3 = iu1.a(context, "android.permission.ACCESS_WIFI_STATE");
        if (a == 0 && a2 == 0 && a3 == 0) {
            return true;
        }
        return false;
    }
}
