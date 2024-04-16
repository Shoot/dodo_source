package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.s;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
/* compiled from: SavedStateViewModelFactory.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0017\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010$\u001a\u00020#\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b%\u0010&J/\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ-\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0003H\u0017R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006'"}, d2 = {"Landroidx/lifecycle/p;", "Landroidx/lifecycle/s$d;", "Landroidx/lifecycle/s$b;", "Landroidx/lifecycle/r;", "T", "Ljava/lang/Class;", "modelClass", "Ln22;", "extras", "b", "(Ljava/lang/Class;Ln22;)Landroidx/lifecycle/r;", "", Action.KEY_ATTRIBUTE, DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/r;", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/r;", "viewModel", "", com.huawei.hms.opendevice.c.a, "Landroid/app/Application;", "Landroid/app/Application;", "application", "Landroidx/lifecycle/s$b;", "factory", "Landroid/os/Bundle;", "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/d;", "Landroidx/lifecycle/d;", "lifecycle", "Landroidx/savedstate/a;", com.huawei.hms.push.e.a, "Landroidx/savedstate/a;", "savedStateRegistry", "Lnt9;", "owner", "<init>", "(Landroid/app/Application;Lnt9;Landroid/os/Bundle;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class p extends s.d implements s.b {
    private Application a;
    private final s.b b;
    private Bundle c;
    private d d;
    private androidx.savedstate.a e;

    @SuppressLint({"LambdaLast"})
    public p(Application application, nt9 nt9Var, Bundle bundle) {
        s.a aVar;
        z65.h(nt9Var, "owner");
        this.e = nt9Var.getSavedStateRegistry();
        this.d = nt9Var.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            aVar = s.a.e.a(application);
        } else {
            aVar = new s.a();
        }
        this.b = aVar;
    }

    @Override // androidx.lifecycle.s.b
    public <T extends r> T a(Class<T> cls) {
        z65.h(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.s.b
    public <T extends r> T b(Class<T> cls, n22 n22Var) {
        List list;
        Constructor c;
        List list2;
        z65.h(cls, "modelClass");
        z65.h(n22Var, "extras");
        String str = (String) n22Var.a(s.c.c);
        if (str != null) {
            if (n22Var.a(o.a) != null && n22Var.a(o.b) != null) {
                Application application = (Application) n22Var.a(s.a.g);
                boolean isAssignableFrom = lj.class.isAssignableFrom(cls);
                if (!isAssignableFrom || application == null) {
                    list = ot9.b;
                    c = ot9.c(cls, list);
                } else {
                    list2 = ot9.a;
                    c = ot9.c(cls, list2);
                }
                if (c == null) {
                    return (T) this.b.b(cls, n22Var);
                }
                if (isAssignableFrom && application != null) {
                    return (T) ot9.d(cls, c, application, o.a(n22Var));
                }
                return (T) ot9.d(cls, c, o.a(n22Var));
            } else if (this.d != null) {
                return (T) d(str, cls);
            } else {
                throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            }
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.s.d
    public void c(r rVar) {
        z65.h(rVar, "viewModel");
        if (this.d != null) {
            androidx.savedstate.a aVar = this.e;
            z65.e(aVar);
            d dVar = this.d;
            z65.e(dVar);
            LegacySavedStateHandleController.a(rVar, aVar, dVar);
        }
    }

    public final <T extends r> T d(String str, Class<T> cls) {
        List list;
        Constructor c;
        T t;
        Application application;
        List list2;
        z65.h(str, Action.KEY_ATTRIBUTE);
        z65.h(cls, "modelClass");
        d dVar = this.d;
        if (dVar != null) {
            boolean isAssignableFrom = lj.class.isAssignableFrom(cls);
            if (!isAssignableFrom || this.a == null) {
                list = ot9.b;
                c = ot9.c(cls, list);
            } else {
                list2 = ot9.a;
                c = ot9.c(cls, list2);
            }
            if (c == null) {
                if (this.a != null) {
                    return (T) this.b.a(cls);
                }
                return (T) s.c.a.a().a(cls);
            }
            androidx.savedstate.a aVar = this.e;
            z65.e(aVar);
            SavedStateHandleController b = LegacySavedStateHandleController.b(aVar, dVar, str, this.c);
            if (isAssignableFrom && (application = this.a) != null) {
                z65.e(application);
                t = (T) ot9.d(cls, c, application, b.b());
            } else {
                t = (T) ot9.d(cls, c, b.b());
            }
            t.e("androidx.lifecycle.savedstate.vm.tag", b);
            return t;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
