package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.g;
import androidx.savedstate.Recreator;
import androidx.savedstate.a;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SavedStateRegistry.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0003\u001a\u0005\nB\t\b\u0000¢\u0006\u0004\b-\u0010.J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u000f\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\fH\u0007J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0004H\u0007R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010 R$\u0010$\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001d8G@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010'R\"\u0010,\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b)\u0010%\"\u0004\b*\u0010+¨\u0006/"}, d2 = {"Landroidx/savedstate/a;", "", "", Action.KEY_ATTRIBUTE, "Landroid/os/Bundle;", "b", "Landroidx/savedstate/a$c;", "provider", "", Image.TYPE_HIGH, com.huawei.hms.opendevice.c.a, "j", "Ljava/lang/Class;", "Landroidx/savedstate/a$a;", "clazz", "i", "Landroidx/lifecycle/d;", "lifecycle", e.a, "(Landroidx/lifecycle/d;)V", "savedState", "f", "(Landroid/os/Bundle;)V", "outBundle", "g", "Lvs9;", "a", "Lvs9;", "components", "", "Z", "attached", "Landroid/os/Bundle;", "restoredState", "<set-?>", DateTokenConverter.CONVERTER_KEY, "isRestored", "()Z", "Landroidx/savedstate/Recreator$b;", "Landroidx/savedstate/Recreator$b;", "recreatorProvider", "isAllowingSavingState$savedstate_release", "setAllowingSavingState$savedstate_release", "(Z)V", "isAllowingSavingState", "<init>", "()V", "savedstate_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class a {
    private static final b g = new b(null);
    private boolean b;
    private Bundle c;
    private boolean d;
    private Recreator.b e;
    private final vs9<String, c> a = new vs9<>();
    private boolean f = true;

    /* compiled from: SavedStateRegistry.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/savedstate/a$a;", "", "Lnt9;", "owner", "", "a", "savedstate_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: androidx.savedstate.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0048a {
        void a(nt9 nt9Var);
    }

    /* compiled from: SavedStateRegistry.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/savedstate/a$b;", "", "", "SAVED_COMPONENTS_KEY", "Ljava/lang/String;", "<init>", "()V", "savedstate_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SavedStateRegistry.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/savedstate/a$c;", "", "Landroid/os/Bundle;", "a", "savedstate_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public interface c {
        Bundle a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(a aVar, op5 op5Var, d.a aVar2) {
        z65.h(aVar, "this$0");
        z65.h(op5Var, "<anonymous parameter 0>");
        z65.h(aVar2, "event");
        if (aVar2 == d.a.ON_START) {
            aVar.f = true;
        } else if (aVar2 == d.a.ON_STOP) {
            aVar.f = false;
        }
    }

    public final Bundle b(String str) {
        Bundle bundle;
        z65.h(str, Action.KEY_ATTRIBUTE);
        if (this.d) {
            Bundle bundle2 = this.c;
            if (bundle2 == null) {
                return null;
            }
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str);
            } else {
                bundle = null;
            }
            Bundle bundle3 = this.c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.c;
            if (bundle4 == null || bundle4.isEmpty()) {
                this.c = null;
            }
            return bundle;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final c c(String str) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        Iterator<Map.Entry<String, c>> it = this.a.iterator();
        while (it.hasNext()) {
            Map.Entry<String, c> next = it.next();
            z65.g(next, "components");
            c value = next.getValue();
            if (z65.c(next.getKey(), str)) {
                return value;
            }
        }
        return null;
    }

    public final void e(d dVar) {
        z65.h(dVar, "lifecycle");
        if (!this.b) {
            dVar.a(new g() { // from class: lt9
                @Override // androidx.lifecycle.g
                public final void d(op5 op5Var, d.a aVar) {
                    a.d(a.this, op5Var, aVar);
                }
            });
            this.b = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    }

    public final void f(Bundle bundle) {
        Bundle bundle2;
        if (this.b) {
            if (!this.d) {
                if (bundle != null) {
                    bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                } else {
                    bundle2 = null;
                }
                this.c = bundle2;
                this.d = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
    }

    public final void g(Bundle bundle) {
        z65.h(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        vs9<String, c>.d f = this.a.f();
        z65.g(f, "this.components.iteratorWithAdditions()");
        while (f.hasNext()) {
            Map.Entry next = f.next();
            bundle2.putBundle((String) next.getKey(), ((c) next.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public final void h(String str, c cVar) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        z65.h(cVar, "provider");
        if (this.a.k(str, cVar) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
    }

    public final void i(Class<? extends InterfaceC0048a> cls) {
        z65.h(cls, "clazz");
        if (this.f) {
            Recreator.b bVar = this.e;
            if (bVar == null) {
                bVar = new Recreator.b(this);
            }
            this.e = bVar;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.b bVar2 = this.e;
                if (bVar2 != null) {
                    String name = cls.getName();
                    z65.g(name, "clazz.name");
                    bVar2.b(name);
                    return;
                }
                return;
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }

    public final void j(String str) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        this.a.p(str);
    }
}
