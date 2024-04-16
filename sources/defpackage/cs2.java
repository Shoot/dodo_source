package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
/* compiled from: DefaultVariableShoppingItemSelectorImpl.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J,\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\u0002J\u001e\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, d2 = {"Lcs2;", "Lvr2;", "", "Lkotlin/Pair;", "Ltja;", "Lswb;", "", "defaultSize", c.a, "b", "", "shoppingItems", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: cs2  reason: default package */
/* loaded from: classes4.dex */
public final class cs2 implements vr2 {
    private final Pair<tja, swb> b(List<? extends Pair<? extends tja, swb>> list) {
        Object obj;
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!((tja) ((Pair) obj).a()).p()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (Pair) obj;
    }

    private final Pair<tja, swb> c(List<? extends Pair<? extends tja, swb>> list, int i) {
        Object obj;
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                Pair pair = (Pair) obj;
                tja tjaVar = (tja) pair.a();
                if (((swb) pair.b()).r().d() == i && !tjaVar.p()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (Pair) obj;
    }

    @Override // defpackage.vr2
    public tja a(Collection<? extends tja> collection, int i) {
        int w;
        Object Z;
        z65.h(collection, "shoppingItems");
        Collection<? extends tja> collection2 = collection;
        w = lc1.w(collection2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (tja tjaVar : collection2) {
            arrayList.add(lnb.a(tjaVar, tjaVar.t0()));
        }
        Pair<tja, swb> c = c(arrayList, i);
        if (c == null && (c = b(arrayList)) == null) {
            Z = sc1.Z(arrayList);
            c = (Pair) Z;
        }
        return c.a();
    }
}
