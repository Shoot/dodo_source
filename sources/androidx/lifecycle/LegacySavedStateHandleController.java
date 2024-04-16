package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.lifecycle.d;
import androidx.savedstate.a;
import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.kustoworker.KustoStorage;
import kotlin.Metadata;
/* compiled from: LegacySavedStateHandleController.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J,\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\u0013"}, d2 = {"Landroidx/lifecycle/LegacySavedStateHandleController;", "", "Landroidx/savedstate/a;", "registry", "Landroidx/lifecycle/d;", "lifecycle", "", Action.KEY_ATTRIBUTE, "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/SavedStateHandleController;", "b", "Landroidx/lifecycle/r;", "viewModel", "", "a", com.huawei.hms.opendevice.c.a, "<init>", "()V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LegacySavedStateHandleController {
    public static final LegacySavedStateHandleController a = new LegacySavedStateHandleController();

    /* compiled from: LegacySavedStateHandleController.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Landroidx/lifecycle/LegacySavedStateHandleController$a;", "Landroidx/savedstate/a$a;", "Lnt9;", "owner", "", "a", "<init>", "()V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a implements a.InterfaceC0048a {
        @Override // androidx.savedstate.a.InterfaceC0048a
        public void a(nt9 nt9Var) {
            z65.h(nt9Var, "owner");
            if (nt9Var instanceof vzb) {
                t viewModelStore = ((vzb) nt9Var).getViewModelStore();
                androidx.savedstate.a savedStateRegistry = nt9Var.getSavedStateRegistry();
                for (String str : viewModelStore.c()) {
                    r b = viewModelStore.b(str);
                    z65.e(b);
                    LegacySavedStateHandleController.a(b, savedStateRegistry, nt9Var.getLifecycle());
                }
                if (!viewModelStore.c().isEmpty()) {
                    savedStateRegistry.i(a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
        }
    }

    private LegacySavedStateHandleController() {
    }

    public static final void a(r rVar, androidx.savedstate.a aVar, d dVar) {
        z65.h(rVar, "viewModel");
        z65.h(aVar, "registry");
        z65.h(dVar, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) rVar.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.c()) {
            savedStateHandleController.a(aVar, dVar);
            a.c(aVar, dVar);
        }
    }

    public static final SavedStateHandleController b(androidx.savedstate.a aVar, d dVar, String str, Bundle bundle) {
        z65.h(aVar, "registry");
        z65.h(dVar, "lifecycle");
        z65.e(str);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, n.f.a(aVar.b(str), bundle));
        savedStateHandleController.a(aVar, dVar);
        a.c(aVar, dVar);
        return savedStateHandleController;
    }

    private final void c(final androidx.savedstate.a aVar, final d dVar) {
        d.b b = dVar.b();
        if (b != d.b.INITIALIZED && !b.i(d.b.STARTED)) {
            dVar.a(new g() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.g
                public void d(op5 op5Var, d.a aVar2) {
                    z65.h(op5Var, KustoStorage.KustoTable.COLUMN_SOURCE);
                    z65.h(aVar2, "event");
                    if (aVar2 == d.a.ON_START) {
                        d.this.d(this);
                        aVar.i(LegacySavedStateHandleController.a.class);
                    }
                }
            });
        } else {
            aVar.i(a.class);
        }
    }
}
