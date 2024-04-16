package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.qz4;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: InAppMessageViewDisplayerImpl.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H\u0002J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016J \u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u001c\u0010\"\u001a\b\u0012\u0002\b\u0003\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u001c\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010!R\u001c\u0010'\u001a\u0004\u0018\u00010$*\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lky4;", "Liy4;", "", "l", "", "o", "Lrz4;", "Lqz4;", "wrapper", "n", "Landroid/app/Activity;", "activity", "shouldUseBlur", "a", e.a, DateTokenConverter.CONVERTER_KEY, "b", c.a, "inAppType", "Lh87;", "onInAppClick", "Li87;", "onInAppShown", "f", "Landroid/app/Activity;", "currentActivity", "Lhx4;", "Lhx4;", "inAppCallback", "Ljava/util/LinkedList;", "Ljava/util/LinkedList;", "inAppQueue", "Luz4;", "Luz4;", "currentHolder", "pausedHolder", "Landroid/view/ViewGroup;", "k", "(Landroid/app/Activity;)Landroid/view/ViewGroup;", "root", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ky4  reason: default package */
/* loaded from: classes.dex */
public final class ky4 implements iy4 {
    private Activity a;
    private hx4 b = new dn1(new vtb(), new zo2(), new tw1(), new zx5());
    private final LinkedList<rz4<qz4>> c = new LinkedList<>();
    private uz4<?> d;
    private uz4<?> e;

    private final ViewGroup k(Activity activity) {
        View view;
        Window window;
        View decorView;
        if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            view = decorView.getRootView();
        } else {
            view = null;
        }
        return (ViewGroup) view;
    }

    private final boolean l() {
        Activity activity = this.a;
        if (activity == null || activity.isFinishing()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(ky4 ky4Var) {
        z65.h(ky4Var, "this$0");
        gk6.a(ky4Var, "Skip InApp.Show for restored inApp");
    }

    private final void n(rz4<? extends qz4> rz4Var) {
        Unit unit;
        ViewGroup k;
        if (rz4Var.c() instanceof qz4.a) {
            Activity activity = this.a;
            if (activity != null && (k = k(activity)) != null) {
                z65.f(rz4Var, "null cannot be cast to non-null type cloud.mindbox.mobile_sdk.inapp.domain.models.InAppTypeWrapper<cloud.mindbox.mobile_sdk.inapp.domain.models.InAppType.SimpleImage>");
                gla glaVar = new gla(rz4Var, new ix4(this.b, new a()));
                glaVar.p(k);
                this.d = glaVar;
                unit = Unit.a;
            } else {
                unit = null;
            }
            if (unit == null) {
                gk6.c(this, "failed to show inApp: currentRoot is null", null, 2, null);
            }
        }
    }

    private final void o() {
        if ((!this.c.isEmpty()) && !d()) {
            rz4<qz4> pop = this.c.pop();
            z65.g(pop, "tryShowInAppFromQueue$lambda$2");
            gk6.a(pop, "trying to show in-app with id " + pop.c().a() + " from queue");
            n(pop);
        }
    }

    @Override // defpackage.iy4
    public void a(Activity activity, boolean z) {
        rz4<?> a2;
        z65.h(activity, "activity");
        gk6.a(this, "onResumeCurrentActivity: " + activity.hashCode());
        this.a = activity;
        uz4<?> uz4Var = this.e;
        if (uz4Var != null && uz4Var.b()) {
            uz4<?> uz4Var2 = this.e;
            if (uz4Var2 != null && (a2 = uz4Var2.a()) != null) {
                gk6.a(this, "trying to restore in-app with id " + this.e);
                n(rz4.b(a2, null, null, new i87() { // from class: jy4
                    @Override // defpackage.i87
                    public final void a() {
                        ky4.m(ky4.this);
                    }
                }, 3, null));
                return;
            }
            return;
        }
        o();
    }

    @Override // defpackage.iy4
    public void b(Activity activity) {
        z65.h(activity, "activity");
        gk6.a(this, "onStopCurrentActivity: " + activity.hashCode());
        uz4<?> uz4Var = this.e;
        if (uz4Var != null) {
            uz4Var.Y0();
        }
    }

    @Override // defpackage.iy4
    public void c(Activity activity) {
        z65.h(activity, "activity");
        gk6.a(this, "onPauseCurrentActivity: " + activity.hashCode());
        if (z65.c(this.a, activity)) {
            this.a = null;
        }
        this.e = this.d;
        this.d = null;
    }

    @Override // defpackage.iy4
    public boolean d() {
        uz4<?> uz4Var = this.d;
        if (uz4Var != null) {
            return uz4Var.b();
        }
        return false;
    }

    @Override // defpackage.iy4
    public void e(Activity activity, boolean z) {
        z65.h(activity, "activity");
        gk6.a(this, "registerCurrentActivity: " + activity.hashCode());
        this.a = activity;
        o();
    }

    @Override // defpackage.iy4
    public void f(qz4 qz4Var, h87 h87Var, i87 i87Var) {
        z65.h(qz4Var, "inAppType");
        z65.h(h87Var, "onInAppClick");
        z65.h(i87Var, "onInAppShown");
        rz4<qz4> rz4Var = new rz4<>(qz4Var, h87Var, i87Var);
        if (l()) {
            gk6.a(this, "In-app with id " + qz4Var.a() + " is going to be shown immediately");
            n(rz4Var);
            return;
        }
        this.c.add(rz4Var);
        gk6.a(this, "In-app with id " + qz4Var.a() + " is added to showing queue and will be shown later");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InAppMessageViewDisplayerImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: ky4$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        a() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            uz4 uz4Var = ky4.this.e;
            if (uz4Var != null) {
                uz4Var.Y0();
            }
            ky4.this.e = null;
            ky4.this.d = null;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }
    }
}
