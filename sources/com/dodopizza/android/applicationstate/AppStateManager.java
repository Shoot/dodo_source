package com.dodopizza.android.applicationstate;

import androidx.lifecycle.d;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: AppStateManager.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB\u0013\b\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\u00060\u0014R\u00020\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/dodopizza/android/applicationstate/AppStateManager;", "Lhp;", "", e.a, "(Lcv1;)Ljava/lang/Object;", "Landroidx/lifecycle/d;", "a", "Landroidx/lifecycle/d;", "processLifecycle", "Lfr6;", "Lep;", "b", "Lfr6;", "_state", "Lkua;", c.a, "Lkua;", "getState", "()Lkua;", "state", "Lcom/dodopizza/android/applicationstate/AppStateManager$LifecycleObserver;", DateTokenConverter.CONVERTER_KEY, "Lcom/dodopizza/android/applicationstate/AppStateManager$LifecycleObserver;", "observer", "<init>", "(Landroidx/lifecycle/d;)V", "LifecycleObserver", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class AppStateManager implements hp {
    private final d a;
    private final fr6<ep> b;
    private final kua<ep> c;
    private LifecycleObserver d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppStateManager.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/dodopizza/android/applicationstate/AppStateManager$LifecycleObserver;", "Lpq2;", "Lop5;", "owner", "", "onStop", "onStart", "<init>", "(Lcom/dodopizza/android/applicationstate/AppStateManager;)V", "android_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public final class LifecycleObserver implements pq2 {
        public LifecycleObserver() {
        }

        @Override // defpackage.pq2
        public /* synthetic */ void onCreate(op5 op5Var) {
            oq2.a(this, op5Var);
        }

        @Override // defpackage.pq2
        public /* synthetic */ void onDestroy(op5 op5Var) {
            oq2.b(this, op5Var);
        }

        @Override // defpackage.pq2
        public /* synthetic */ void onPause(op5 op5Var) {
            oq2.c(this, op5Var);
        }

        @Override // defpackage.pq2
        public /* synthetic */ void onResume(op5 op5Var) {
            oq2.d(this, op5Var);
        }

        @Override // defpackage.pq2
        public void onStart(op5 op5Var) {
            z65.h(op5Var, "owner");
            AppStateManager.this.b.setValue(ep.a);
        }

        @Override // defpackage.pq2
        public void onStop(op5 op5Var) {
            z65.h(op5Var, "owner");
            AppStateManager.this.b.setValue(ep.b);
        }
    }

    /* compiled from: AppStateManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<Throwable, Unit> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            d dVar = AppStateManager.this.a;
            LifecycleObserver lifecycleObserver = AppStateManager.this.d;
            if (lifecycleObserver == null) {
                z65.z("observer");
                lifecycleObserver = null;
            }
            dVar.d(lifecycleObserver);
        }
    }

    public AppStateManager(d dVar) {
        z65.h(dVar, "processLifecycle");
        this.a = dVar;
        fr6<ep> a2 = mua.a(ep.b);
        this.b = a2;
        this.c = wz3.d(a2);
    }

    public final Object e(cv1<? super Unit> cv1Var) {
        cv1 c;
        Object d;
        Object d2;
        if (this.d == null) {
            c = b75.c(cv1Var);
            gn0 gn0Var = new gn0(c, 1);
            gn0Var.w();
            LifecycleObserver lifecycleObserver = new LifecycleObserver();
            this.a.a(lifecycleObserver);
            this.d = lifecycleObserver;
            gn0Var.u(new a());
            Object s = gn0Var.s();
            d = c75.d();
            if (s == d) {
                io2.c(cv1Var);
            }
            d2 = c75.d();
            if (s == d2) {
                return s;
            }
            return Unit.a;
        }
        throw new IllegalStateException("The instance was already initialized".toString());
    }

    @Override // defpackage.hp
    public kua<ep> getState() {
        return this.c;
    }
}
