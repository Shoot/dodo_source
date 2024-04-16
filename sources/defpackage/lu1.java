package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.gson.Gson;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: ContextModule.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u000e\u001a\u00020\rH\u0007J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0012\u001a\u00020\u0011H\u0007J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0011H\u0007J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0014H\u0007J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0011H\u0007J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¨\u0006\u001f"}, d2 = {"Llu1;", "", "Landroid/app/Application;", "app", "Landroid/content/Context;", "a", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/res/Resources;", "j", "Landroid/content/pm/PackageManager;", e.a, "Lc63;", "i", "Lpgb;", "k", "Ljgb;", "b", "Lhy7;", "g", "impl", "Lfy7;", "f", "permissionChecker", "Lwv5;", c.a, "Lmy7;", Image.TYPE_HIGH, "Lew5;", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: lu1  reason: default package */
/* loaded from: classes3.dex */
public final class lu1 {
    public static final lu1 a = new lu1();

    private lu1() {
    }

    public final Context a(Application application) {
        z65.h(application, "app");
        return application;
    }

    public final jgb b(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return new zr2(context);
    }

    public final wv5 c(fy7 fy7Var) {
        z65.h(fy7Var, "permissionChecker");
        return new xv5(fy7Var);
    }

    public final ew5 d(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return new fw5(context);
    }

    public final PackageManager e(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        PackageManager packageManager = context.getPackageManager();
        z65.g(packageManager, "getPackageManager(...)");
        return packageManager;
    }

    public final fy7 f(hy7 hy7Var) {
        z65.h(hy7Var, "impl");
        return hy7Var;
    }

    public final hy7 g() {
        return new hy7();
    }

    public final my7 h(hy7 hy7Var) {
        z65.h(hy7Var, "impl");
        return hy7Var;
    }

    public final c63 i(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Resources resources = context.getResources();
        z65.g(resources, "getResources(...)");
        String packageName = context.getPackageName();
        z65.g(packageName, "getPackageName(...)");
        return new d63(resources, packageName, new Gson());
    }

    public final Resources j(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Resources resources = context.getResources();
        z65.g(resources, "getResources(...)");
        return resources;
    }

    public final pgb k() {
        return new pgb();
    }
}
