package ru.dodopizza.app;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import ru.dodopizza.app.a;
import ru.dodopizza.app.di.AppComponent;
/* compiled from: DodoPizzaApp.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0005\u001a\u00020\u0004H\u0016R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Lru/dodopizza/app/DodoPizzaApp;", "Landroid/app/Application;", "Luh5;", "Llm1;", "Lth5;", "t0", "Lcma;", "Lru/dodopizza/app/di/AppComponent;", "a", "Lcma;", "()Lcma;", "componentDependenciesRegistry", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public class DodoPizzaApp extends Application implements uh5, lm1 {
    private final cma<AppComponent> a = new cma<>(new rl6(), bc9.b(AppComponent.class), new a());

    /* compiled from: DodoPizzaApp.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/dodopizza/app/di/AppComponent;", "a", "()Lru/dodopizza/app/di/AppComponent;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<AppComponent> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final AppComponent invoke() {
            wta.a.d(fxa.e);
            return AppComponent.b.a.a(AppComponent.f.a(), DodoPizzaApp.this, new a.C0506a(new yq8() { // from class: ru.dodopizza.app.DodoPizzaApp.a.a
                @Override // defpackage.ke5
                public Object get() {
                    sj3 sj3Var;
                    sj3Var = ru.dodopizza.app.a.a;
                    return sj3Var;
                }
            }), null, null, 12, null);
        }
    }

    @Override // defpackage.lm1
    /* renamed from: a */
    public cma<AppComponent> getComponentDependenciesRegistry() {
        return this.a;
    }

    @Override // defpackage.uh5
    public th5 t0() {
        return getComponentDependenciesRegistry().b().t0();
    }
}
