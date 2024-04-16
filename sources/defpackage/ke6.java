package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: MenuItemPersonalizer.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lke6;", "Lje6;", "Lqd6;", "menuItem", "", "a", "Lbe6;", "Lbe6;", "menuItemEnricher", "Lxd6;", "b", "Lxd6;", "menuItemCopyMaker", "<init>", "(Lbe6;Lxd6;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ke6  reason: default package */
/* loaded from: classes4.dex */
public final class ke6 implements je6 {
    private final be6<qd6> a;
    private final xd6<qd6> b;

    public ke6(be6<qd6> be6Var, xd6<qd6> xd6Var) {
        z65.h(be6Var, "menuItemEnricher");
        z65.h(xd6Var, "menuItemCopyMaker");
        this.a = be6Var;
        this.b = xd6Var;
    }

    @Override // defpackage.je6
    public Collection<qd6> a(qd6 qd6Var) {
        z65.h(qd6Var, "menuItem");
        qd6 a = this.a.a(qd6Var);
        qd6 a2 = this.b.a(a);
        ArrayList arrayList = new ArrayList();
        arrayList.add(a);
        if (a2 != null) {
            arrayList.add(a2);
        }
        return arrayList;
    }
}
