package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
/* compiled from: LifecycleDispatcher.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/lifecycle/f;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class f {
    public static final f a = new f();
    private static final AtomicBoolean b = new AtomicBoolean(false);

    /* compiled from: LifecycleDispatcher.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\n"}, d2 = {"Landroidx/lifecycle/f$a;", "Lfg3;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityCreated", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a extends fg3 {
        @Override // defpackage.fg3, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            z65.h(activity, "activity");
            m.b.c(activity);
        }
    }

    private f() {
    }

    public static final void a(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        if (b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        z65.f(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
