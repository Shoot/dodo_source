package defpackage;

import java.util.Collection;
import kotlin.Metadata;
/* compiled from: DefaultShoppingItemSelectorFactory.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\t"}, d2 = {"Lxr2;", "Lwr2;", "", "Ltja;", "shoppingItems", "Lvr2;", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: xr2  reason: default package */
/* loaded from: classes4.dex */
public final class xr2 implements wr2 {
    @Override // defpackage.wr2
    public vr2 a(Collection<? extends tja> collection) {
        z65.h(collection, "shoppingItems");
        Collection<? extends tja> collection2 = collection;
        Collection<? extends tja> collection3 = collection2;
        if (!collection3.isEmpty()) {
            for (tja tjaVar : collection2) {
                if (!(tjaVar.Y() instanceof m78)) {
                    if (!collection3.isEmpty()) {
                        for (tja tjaVar2 : collection2) {
                            if (!(tjaVar2.Y() instanceof swb)) {
                                return new ny3();
                            }
                        }
                    }
                    return new cs2();
                }
            }
        }
        return new gr2();
    }
}
