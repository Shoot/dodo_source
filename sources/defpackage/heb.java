package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.res.Resources;
import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import im.threads.ui.activities.BaseActivity;
import im.threads.ui.permissions.PermissionsActivity;
import kotlin.Metadata;
/* compiled from: ThreadsLibActivitiesFix.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0005B-\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u001a\u0010\u0012\u001a\u00060\u000fR\u00020\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lheb;", "", "", c.a, "Landroid/app/Application;", "a", "Landroid/app/Application;", "application", "Las8;", "Lbfb;", "b", "Las8;", "threadsLibInitializerProvider", "Lih;", "androidLanguageManagerProvider", "Lheb$a;", DateTokenConverter.CONVERTER_KEY, "Lheb$a;", "callbacks", "<init>", "(Landroid/app/Application;Las8;Las8;)V", "chat_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: heb  reason: default package */
/* loaded from: classes.dex */
public final class heb {
    private final Application a;
    private final as8<bfb> b;
    private final as8<ih> c;
    private a d;

    /* compiled from: ThreadsLibActivitiesFix.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0006H\u0016¨\u0006\u0014"}, d2 = {"Lheb$a;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "", "a", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityPreCreated", "onActivityCreated", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivityStopped", "onActivityDestroyed", "outState", "onActivitySaveInstanceState", "<init>", "(Lheb;)V", "chat_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: heb$a */
    /* loaded from: classes.dex */
    private final class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        private final boolean a(Activity activity) {
            if (!(activity instanceof BaseActivity) && !(activity instanceof PermissionsActivity)) {
                return false;
            }
            return true;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            z65.h(activity, "activity");
            if (a(activity)) {
                Resources resources = activity.getResources();
                z65.g(resources, "getResources(...)");
                ((ih) heb.this.c.get()).c(resources);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            z65.h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            z65.h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            z65.h(activity, "activity");
            if (a(activity)) {
                ((bfb) heb.this.b.get()).b();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            z65.h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            z65.h(activity, "activity");
            z65.h(bundle, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            z65.h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            z65.h(activity, "activity");
        }
    }

    public heb(Application application, as8<bfb> as8Var, as8<ih> as8Var2) {
        z65.h(application, "application");
        z65.h(as8Var, "threadsLibInitializerProvider");
        z65.h(as8Var2, "androidLanguageManagerProvider");
        this.a = application;
        this.b = as8Var;
        this.c = as8Var2;
    }

    public final void c() {
        if (this.d == null) {
            a aVar = new a();
            this.d = aVar;
            this.a.registerActivityLifecycleCallbacks(aVar);
            return;
        }
        throw new IllegalStateException("The fix is initialized already".toString());
    }
}
