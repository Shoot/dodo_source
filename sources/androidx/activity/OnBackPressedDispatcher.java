package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.d;
import androidx.lifecycle.g;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.push.e;
import java.util.Collection;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: OnBackPressedDispatcher.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0003\u000b&\u0011B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u000f\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0007J\b\u0010\u0011\u001a\u00020\u0010H\u0007J\b\u0010\u0012\u001a\u00020\u0004H\u0007R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u0016\u0010#\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\"¨\u0006'"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "", "Landroid/window/OnBackInvokedDispatcher;", "invoker", "", "f", "g", "()V", "Li77;", "onBackPressedCallback", "Len0;", com.huawei.hms.opendevice.c.a, "(Li77;)Len0;", "Lop5;", "owner", "b", "", DateTokenConverter.CONVERTER_KEY, e.a, "Ljava/lang/Runnable;", "a", "Ljava/lang/Runnable;", "fallbackOnBackPressed", "Lgr;", "Lgr;", "onBackPressedCallbacks", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "enabledChangedCallback", "Landroid/window/OnBackInvokedCallback;", "Landroid/window/OnBackInvokedCallback;", "onBackInvokedCallback", "Landroid/window/OnBackInvokedDispatcher;", "invokedDispatcher", "Z", "backInvokedCallbackRegistered", "<init>", "(Ljava/lang/Runnable;)V", "LifecycleOnBackPressedCancellable", "activity_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    private final Runnable a;
    private final gr<i77> b = new gr<>();
    private Function0<Unit> c;
    private OnBackInvokedCallback d;
    private OnBackInvokedDispatcher e;
    private boolean f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;", "Landroidx/lifecycle/g;", "Len0;", "Lop5;", KustoStorage.KustoTable.COLUMN_SOURCE, "Landroidx/lifecycle/d$a;", "event", "", DateTokenConverter.CONVERTER_KEY, "cancel", "Landroidx/lifecycle/d;", "a", "Landroidx/lifecycle/d;", "lifecycle", "Li77;", "b", "Li77;", "onBackPressedCallback", com.huawei.hms.opendevice.c.a, "Len0;", "currentCancellable", "<init>", "(Landroidx/activity/OnBackPressedDispatcher;Landroidx/lifecycle/d;Li77;)V", "activity_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public final class LifecycleOnBackPressedCancellable implements g, en0 {
        private final androidx.lifecycle.d a;
        private final i77 b;
        private en0 c;
        final /* synthetic */ OnBackPressedDispatcher d;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, androidx.lifecycle.d dVar, i77 i77Var) {
            z65.h(dVar, "lifecycle");
            z65.h(i77Var, "onBackPressedCallback");
            this.d = onBackPressedDispatcher;
            this.a = dVar;
            this.b = i77Var;
            dVar.a(this);
        }

        @Override // defpackage.en0
        public void cancel() {
            this.a.d(this);
            this.b.e(this);
            en0 en0Var = this.c;
            if (en0Var != null) {
                en0Var.cancel();
            }
            this.c = null;
        }

        @Override // androidx.lifecycle.g
        public void d(op5 op5Var, d.a aVar) {
            z65.h(op5Var, KustoStorage.KustoTable.COLUMN_SOURCE);
            z65.h(aVar, "event");
            if (aVar == d.a.ON_START) {
                this.c = this.d.c(this.b);
            } else if (aVar == d.a.ON_STOP) {
                en0 en0Var = this.c;
                if (en0Var != null) {
                    en0Var.cancel();
                }
            } else if (aVar == d.a.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            OnBackPressedDispatcher.this.g();
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<Unit> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            OnBackPressedDispatcher.this.e();
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0007J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007J\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0007¨\u0006\u000f"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$c;", "", "dispatcher", "", "priority", "callback", "", DateTokenConverter.CONVERTER_KEY, e.a, "Lkotlin/Function0;", "onBackInvoked", "Landroid/window/OnBackInvokedCallback;", "b", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class c {
        public static final c a = new c();

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(Function0 function0) {
            z65.h(function0, "$onBackInvoked");
            function0.invoke();
        }

        public final OnBackInvokedCallback b(final Function0<Unit> function0) {
            z65.h(function0, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: j77
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.c.c(Function0.this);
                }
            };
        }

        public final void d(Object obj, int i, Object obj2) {
            z65.h(obj, "dispatcher");
            z65.h(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
        }

        public final void e(Object obj, Object obj2) {
            z65.h(obj, "dispatcher");
            z65.h(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher$d;", "Len0;", "", "cancel", "Li77;", "a", "Li77;", "onBackPressedCallback", "<init>", "(Landroidx/activity/OnBackPressedDispatcher;Li77;)V", "activity_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public final class d implements en0 {
        private final i77 a;
        final /* synthetic */ OnBackPressedDispatcher b;

        public d(OnBackPressedDispatcher onBackPressedDispatcher, i77 i77Var) {
            z65.h(i77Var, "onBackPressedCallback");
            this.b = onBackPressedDispatcher;
            this.a = i77Var;
        }

        @Override // defpackage.en0
        public void cancel() {
            this.b.b.remove(this.a);
            this.a.e(this);
            if (Build.VERSION.SDK_INT >= 33) {
                this.a.g(null);
                this.b.g();
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.a = runnable;
        if (Build.VERSION.SDK_INT >= 33) {
            this.c = new a();
            this.d = c.a.b(new b());
        }
    }

    public final void b(op5 op5Var, i77 i77Var) {
        z65.h(op5Var, "owner");
        z65.h(i77Var, "onBackPressedCallback");
        androidx.lifecycle.d lifecycle = op5Var.getLifecycle();
        if (lifecycle.b() == d.b.DESTROYED) {
            return;
        }
        i77Var.a(new LifecycleOnBackPressedCancellable(this, lifecycle, i77Var));
        if (Build.VERSION.SDK_INT >= 33) {
            g();
            i77Var.g(this.c);
        }
    }

    public final en0 c(i77 i77Var) {
        z65.h(i77Var, "onBackPressedCallback");
        this.b.add(i77Var);
        d dVar = new d(this, i77Var);
        i77Var.a(dVar);
        if (Build.VERSION.SDK_INT >= 33) {
            g();
            i77Var.g(this.c);
        }
        return dVar;
    }

    public final boolean d() {
        gr<i77> grVar = this.b;
        if ((grVar instanceof Collection) && grVar.isEmpty()) {
            return false;
        }
        for (i77 i77Var : grVar) {
            if (i77Var.c()) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        i77 i77Var;
        gr<i77> grVar = this.b;
        ListIterator<i77> listIterator = grVar.listIterator(grVar.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                i77Var = listIterator.previous();
                if (i77Var.c()) {
                    break;
                }
            } else {
                i77Var = null;
                break;
            }
        }
        i77 i77Var2 = i77Var;
        if (i77Var2 != null) {
            i77Var2.b();
            return;
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void f(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        z65.h(onBackInvokedDispatcher, "invoker");
        this.e = onBackInvokedDispatcher;
        g();
    }

    public final void g() {
        boolean d2 = d();
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            if (d2 && !this.f) {
                c.a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f = true;
            } else if (!d2 && this.f) {
                c.a.e(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f = false;
            }
        }
    }
}
