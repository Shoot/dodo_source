package defpackage;

import defpackage.qd6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: MenuItemCopyMakerFacade.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\r"}, d2 = {"Lyd6;", "Lxd6;", "Lqd6;", "menuItem", "a", "Lqd6$e;", "Lxd6;", "simpleMenuItemCopyMaker", "Lqd6$f;", "b", "variableMenuItemCopyMaker", "<init>", "(Lxd6;Lxd6;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: yd6  reason: default package */
/* loaded from: classes4.dex */
public final class yd6 implements xd6<qd6> {
    private final xd6<qd6.e> a;
    private final xd6<qd6.f> b;

    public yd6(xd6<qd6.e> xd6Var, xd6<qd6.f> xd6Var2) {
        z65.h(xd6Var, "simpleMenuItemCopyMaker");
        z65.h(xd6Var2, "variableMenuItemCopyMaker");
        this.a = xd6Var;
        this.b = xd6Var2;
    }

    @Override // defpackage.xd6
    public qd6 a(qd6 qd6Var) {
        z65.h(qd6Var, "menuItem");
        if (qd6Var instanceof qd6.e) {
            return this.a.a(qd6Var);
        }
        if (qd6Var instanceof qd6.f) {
            return this.b.a(qd6Var);
        }
        if ((qd6Var instanceof qd6.d) || (qd6Var instanceof qd6.c) || (qd6Var instanceof qd6.b)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
