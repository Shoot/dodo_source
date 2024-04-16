package androidx.lifecycle;

import androidx.lifecycle.d;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import kotlin.Metadata;
/* compiled from: SavedStateHandleController.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R$\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001d"}, d2 = {"Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/g;", "Landroidx/savedstate/a;", "registry", "Landroidx/lifecycle/d;", "lifecycle", "", "a", "Lop5;", KustoStorage.KustoTable.COLUMN_SOURCE, "Landroidx/lifecycle/d$a;", "event", DateTokenConverter.CONVERTER_KEY, "", "Ljava/lang/String;", Action.KEY_ATTRIBUTE, "Landroidx/lifecycle/n;", "b", "Landroidx/lifecycle/n;", "()Landroidx/lifecycle/n;", "handle", "", "<set-?>", com.huawei.hms.opendevice.c.a, "Z", "()Z", "isAttached", "<init>", "(Ljava/lang/String;Landroidx/lifecycle/n;)V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SavedStateHandleController implements g {
    private final String a;
    private final n b;
    private boolean c;

    public SavedStateHandleController(String str, n nVar) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        z65.h(nVar, "handle");
        this.a = str;
        this.b = nVar;
    }

    public final void a(androidx.savedstate.a aVar, d dVar) {
        z65.h(aVar, "registry");
        z65.h(dVar, "lifecycle");
        if (!this.c) {
            this.c = true;
            dVar.a(this);
            aVar.h(this.a, this.b.c());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }

    public final n b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    @Override // androidx.lifecycle.g
    public void d(op5 op5Var, d.a aVar) {
        z65.h(op5Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(aVar, "event");
        if (aVar == d.a.ON_DESTROY) {
            this.c = false;
            op5Var.getLifecycle().d(this);
        }
    }
}
