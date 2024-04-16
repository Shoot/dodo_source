package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.s;
import androidx.savedstate.a;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import defpackage.n22;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: SavedStateHandleSupport.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u0003\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a*\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002\u001a\f\u0010\u000f\u001a\u00020\f*\u00020\u000eH\u0007\"\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011\"\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011\"\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011\"\u0018\u0010\u0018\u001a\u00020\u0015*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0018\u0010\u001c\u001a\u00020\u0019*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lnt9;", "Lvzb;", "T", "", com.huawei.hms.opendevice.c.a, "(Lnt9;)V", "savedStateRegistryOwner", "viewModelStoreOwner", "", Action.KEY_ATTRIBUTE, "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/n;", "b", "Ln22;", "a", "Ln22$b;", "Ln22$b;", "SAVED_STATE_REGISTRY_OWNER_KEY", "VIEW_MODEL_STORE_OWNER_KEY", "DEFAULT_ARGS_KEY", "Lkt9;", com.huawei.hms.push.e.a, "(Lvzb;)Lkt9;", "savedStateHandlesVM", "Ljt9;", DateTokenConverter.CONVERTER_KEY, "(Lnt9;)Ljt9;", "savedStateHandlesProvider", "lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class o {
    public static final n22.b<nt9> a = new b();
    public static final n22.b<vzb> b = new c();
    public static final n22.b<Bundle> c = new a();

    /* compiled from: SavedStateHandleSupport.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/o$a", "Ln22$b;", "Landroid/os/Bundle;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a implements n22.b<Bundle> {
        a() {
        }
    }

    /* compiled from: SavedStateHandleSupport.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/o$b", "Ln22$b;", "Lnt9;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class b implements n22.b<nt9> {
        b() {
        }
    }

    /* compiled from: SavedStateHandleSupport.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/o$c", "Ln22$b;", "Lvzb;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class c implements n22.b<vzb> {
        c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SavedStateHandleSupport.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln22;", "Lkt9;", "a", "(Ln22;)Lkt9;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class d extends ej5 implements Function1<n22, kt9> {
        public static final d a = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final kt9 invoke(n22 n22Var) {
            z65.h(n22Var, "$this$initializer");
            return new kt9();
        }
    }

    public static final n a(n22 n22Var) {
        z65.h(n22Var, "<this>");
        nt9 nt9Var = (nt9) n22Var.a(a);
        if (nt9Var != null) {
            vzb vzbVar = (vzb) n22Var.a(b);
            if (vzbVar != null) {
                Bundle bundle = (Bundle) n22Var.a(c);
                String str = (String) n22Var.a(s.c.c);
                if (str != null) {
                    return b(nt9Var, vzbVar, str, bundle);
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    private static final n b(nt9 nt9Var, vzb vzbVar, String str, Bundle bundle) {
        jt9 d2 = d(nt9Var);
        kt9 e = e(vzbVar);
        n nVar = e.f().get(str);
        if (nVar == null) {
            n a2 = n.f.a(d2.b(str), bundle);
            e.f().put(str, a2);
            return a2;
        }
        return nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends nt9 & vzb> void c(T t) {
        z65.h(t, "<this>");
        d.b b2 = t.getLifecycle().b();
        if (b2 != d.b.INITIALIZED && b2 != d.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (t.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            jt9 jt9Var = new jt9(t.getSavedStateRegistry(), t);
            t.getSavedStateRegistry().h("androidx.lifecycle.internal.SavedStateHandlesProvider", jt9Var);
            t.getLifecycle().a(new SavedStateHandleAttacher(jt9Var));
        }
    }

    public static final jt9 d(nt9 nt9Var) {
        jt9 jt9Var;
        z65.h(nt9Var, "<this>");
        a.c c2 = nt9Var.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        if (c2 instanceof jt9) {
            jt9Var = (jt9) c2;
        } else {
            jt9Var = null;
        }
        if (jt9Var != null) {
            return jt9Var;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final kt9 e(vzb vzbVar) {
        z65.h(vzbVar, "<this>");
        b35 b35Var = new b35();
        b35Var.a(bc9.b(kt9.class), d.a);
        return (kt9) new s(vzbVar, b35Var.b()).b("androidx.lifecycle.internal.SavedStateHandlesVM", kt9.class);
    }
}
