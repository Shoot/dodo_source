package defpackage;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: PersonalOfferVO.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0000¨\u0006\u0005"}, d2 = {"Lp67;", "", "a", "", "b", "order_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: m08  reason: default package */
/* loaded from: classes2.dex */
public final class m08 {
    public static final String a(p67 p67Var) {
        z65.h(p67Var, "<this>");
        if (p67Var instanceof t2a) {
            return ((t2a) p67Var).m();
        }
        if (p67Var instanceof k08) {
            return ((k08) p67Var).m();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean b(p67 p67Var) {
        z65.h(p67Var, "<this>");
        if (p67Var instanceof t2a) {
            return ((t2a) p67Var).p();
        }
        if (p67Var instanceof k08) {
            return ((k08) p67Var).p();
        }
        return false;
    }
}
