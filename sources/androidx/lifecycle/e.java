package androidx.lifecycle;

import androidx.lifecycle.d;
import androidx.lifecycle.e;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import defpackage.l95;
import kotlin.Metadata;
/* compiled from: LifecycleController.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Landroidx/lifecycle/e;", "", "", "b", "Landroidx/lifecycle/d;", "a", "Landroidx/lifecycle/d;", "lifecycle", "Landroidx/lifecycle/d$b;", "Landroidx/lifecycle/d$b;", "minState", "Lm33;", com.huawei.hms.opendevice.c.a, "Lm33;", "dispatchQueue", "Landroidx/lifecycle/g;", DateTokenConverter.CONVERTER_KEY, "Landroidx/lifecycle/g;", "observer", "Ll95;", "parentJob", "<init>", "(Landroidx/lifecycle/d;Landroidx/lifecycle/d$b;Lm33;Ll95;)V", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class e {
    private final d a;
    private final d.b b;
    private final m33 c;
    private final g d;

    public e(d dVar, d.b bVar, m33 m33Var, final l95 l95Var) {
        z65.h(dVar, "lifecycle");
        z65.h(bVar, "minState");
        z65.h(m33Var, "dispatchQueue");
        z65.h(l95Var, "parentJob");
        this.a = dVar;
        this.b = bVar;
        this.c = m33Var;
        g gVar = new g() { // from class: hp5
            @Override // androidx.lifecycle.g
            public final void d(op5 op5Var, d.a aVar) {
                e.c(e.this, l95Var, op5Var, aVar);
            }
        };
        this.d = gVar;
        if (dVar.b() == d.b.DESTROYED) {
            l95.a.a(l95Var, null, 1, null);
            b();
            return;
        }
        dVar.a(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(e eVar, l95 l95Var, op5 op5Var, d.a aVar) {
        z65.h(eVar, "this$0");
        z65.h(l95Var, "$parentJob");
        z65.h(op5Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(aVar, "<anonymous parameter 1>");
        if (op5Var.getLifecycle().b() == d.b.DESTROYED) {
            l95.a.a(l95Var, null, 1, null);
            eVar.b();
        } else if (op5Var.getLifecycle().b().compareTo(eVar.b) < 0) {
            eVar.c.h();
        } else {
            eVar.c.i();
        }
    }

    public final void b() {
        this.a.d(this.d);
        this.c.g();
    }
}
