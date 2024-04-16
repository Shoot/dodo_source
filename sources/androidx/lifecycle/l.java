package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.d;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ProcessLifecycleOwner.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 *2\u00020\u0001:\u0002\u000f\u0012B\t\b\u0002¢\u0006\u0004\b)\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\u0004J\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010#R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Landroidx/lifecycle/l;", "Lop5;", "", "f", "()V", com.huawei.hms.push.e.a, DateTokenConverter.CONVERTER_KEY, "g", "j", "k", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, Image.TYPE_HIGH, "(Landroid/content/Context;)V", "", "a", "I", "startedCounter", "b", "resumedCounter", "", com.huawei.hms.opendevice.c.a, "Z", "pauseSent", "stopSent", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Landroidx/lifecycle/h;", "Landroidx/lifecycle/h;", "registry", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "delayedPauseRunnable", "Landroidx/lifecycle/m$a;", "Landroidx/lifecycle/m$a;", "initializationListener", "Landroidx/lifecycle/d;", "getLifecycle", "()Landroidx/lifecycle/d;", "lifecycle", "<init>", "i", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class l implements op5 {
    public static final b i = new b(null);
    private static final l j = new l();
    private int a;
    private int b;
    private Handler e;
    private boolean c = true;
    private boolean d = true;
    private final h f = new h(this);
    private final Runnable g = new Runnable() { // from class: tk8
        @Override // java.lang.Runnable
        public final void run() {
            l.i(l.this);
        }
    };
    private final m.a h = new d();

    /* compiled from: ProcessLifecycleOwner.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Landroidx/lifecycle/l$a;", "", "Landroid/app/Activity;", "activity", "Landroid/app/Application$ActivityLifecycleCallbacks;", "callback", "", "a", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a {
        public static final a a = new a();

        private a() {
        }

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            z65.h(activity, "activity");
            z65.h(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0000X\u0081T¢\u0006\f\n\u0004\b\n\u0010\u000b\u0012\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/l$b;", "", "Lop5;", "a", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", "(Landroid/content/Context;)V", "", "TIMEOUT_MS", "J", "getTIMEOUT_MS$lifecycle_process_release$annotations", "()V", "Landroidx/lifecycle/l;", "newInstance", "Landroidx/lifecycle/l;", "<init>", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final op5 a() {
            return l.j;
        }

        public final void b(Context context) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            l.j.h(context);
        }
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017J\u001a\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"androidx/lifecycle/l$c", "Lfg3;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityPreCreated", "onActivityCreated", "onActivityPaused", "onActivityStopped", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class c extends fg3 {

        /* compiled from: ProcessLifecycleOwner.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"androidx/lifecycle/l$c$a", "Lfg3;", "Landroid/app/Activity;", "activity", "", "onActivityPostStarted", "onActivityPostResumed", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
        /* loaded from: classes.dex */
        public static final class a extends fg3 {
            final /* synthetic */ l this$0;

            a(l lVar) {
                this.this$0 = lVar;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                z65.h(activity, "activity");
                this.this$0.e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                z65.h(activity, "activity");
                this.this$0.f();
            }
        }

        c() {
        }

        @Override // defpackage.fg3, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            z65.h(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                m.b.b(activity).f(l.this.h);
            }
        }

        @Override // defpackage.fg3, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            z65.h(activity, "activity");
            l.this.d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            z65.h(activity, "activity");
            a.a(activity, new a(l.this));
        }

        @Override // defpackage.fg3, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            z65.h(activity, "activity");
            l.this.g();
        }
    }

    private l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(l lVar) {
        z65.h(lVar, "this$0");
        lVar.j();
        lVar.k();
    }

    public static final op5 l() {
        return i.a();
    }

    public final void d() {
        int i2 = this.b - 1;
        this.b = i2;
        if (i2 == 0) {
            Handler handler = this.e;
            z65.e(handler);
            handler.postDelayed(this.g, 700L);
        }
    }

    public final void e() {
        int i2 = this.b + 1;
        this.b = i2;
        if (i2 == 1) {
            if (this.c) {
                this.f.i(d.a.ON_RESUME);
                this.c = false;
                return;
            }
            Handler handler = this.e;
            z65.e(handler);
            handler.removeCallbacks(this.g);
        }
    }

    public final void f() {
        int i2 = this.a + 1;
        this.a = i2;
        if (i2 == 1 && this.d) {
            this.f.i(d.a.ON_START);
            this.d = false;
        }
    }

    public final void g() {
        this.a--;
        k();
    }

    @Override // defpackage.op5
    public androidx.lifecycle.d getLifecycle() {
        return this.f;
    }

    public final void h(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.e = new Handler();
        this.f.i(d.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        z65.f(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void j() {
        if (this.b == 0) {
            this.c = true;
            this.f.i(d.a.ON_PAUSE);
        }
    }

    public final void k() {
        if (this.a == 0 && this.c) {
            this.f.i(d.a.ON_STOP);
            this.d = true;
        }
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"androidx/lifecycle/l$d", "Landroidx/lifecycle/m$a;", "", "onCreate", "onStart", "o", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class d implements m.a {
        d() {
        }

        @Override // androidx.lifecycle.m.a
        public void o() {
            l.this.e();
        }

        @Override // androidx.lifecycle.m.a
        public void onStart() {
            l.this.f();
        }

        @Override // androidx.lifecycle.m.a
        public void onCreate() {
        }
    }
}
