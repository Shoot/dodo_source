package defpackage;

import defpackage.qd6;
import kotlin.Metadata;
/* compiled from: SimpleMenuItemEnricher.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Llla;", "Lbe6;", "Lqd6$e;", "menuItem", "b", "Lzf6;", "a", "Lzf6;", "menuPersonalPriceInfoRepository", "<init>", "(Lzf6;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: lla  reason: default package */
/* loaded from: classes4.dex */
public final class lla implements be6<qd6.e> {
    private final zf6 a;

    public lla(zf6 zf6Var) {
        z65.h(zf6Var, "menuPersonalPriceInfoRepository");
        this.a = zf6Var;
    }

    @Override // defpackage.be6
    /* renamed from: b */
    public qd6.e a(qd6.e eVar) {
        z65.h(eVar, "menuItem");
        vf6 find = this.a.find(eVar.t().t());
        if (find != null) {
            l18 b = ph6.b(find);
            qd6.e s = qd6.e.s(eVar, null, null, null, null, null, null, null, 0, ph6.a(eVar.t(), find.h(), b), null, null, null, null, b, false, 24319, null);
            if (s != null) {
                return s;
            }
        }
        return eVar;
    }
}
