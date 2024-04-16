package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.qd6;
import kotlin.Metadata;
/* compiled from: VariableMenuItemEnricher.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u000f"}, d2 = {"Lqwb;", "Lbe6;", "Lqd6$f;", "menuItem", "b", "Lhq3;", "a", "Lhq3;", "featureService", "Lbe6;", "noopEnricher", c.a, "enricher", "<init>", "(Lhq3;Lbe6;Lbe6;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: qwb  reason: default package */
/* loaded from: classes4.dex */
public final class qwb implements be6<qd6.f> {
    private final hq3 a;
    private final be6<qd6.f> b;
    private final be6<qd6.f> c;

    public qwb(hq3 hq3Var, be6<qd6.f> be6Var, be6<qd6.f> be6Var2) {
        z65.h(hq3Var, "featureService");
        z65.h(be6Var, "noopEnricher");
        z65.h(be6Var2, "enricher");
        this.a = hq3Var;
        this.b = be6Var;
        this.c = be6Var2;
    }

    @Override // defpackage.be6
    /* renamed from: b */
    public qd6.f a(qd6.f fVar) {
        z65.h(fVar, "menuItem");
        if (this.a.a(bq3.C5)) {
            return this.c.a(fVar);
        }
        return this.b.a(fVar);
    }
}
