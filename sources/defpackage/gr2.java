package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DefaultPizzaShoppingItemSelectorImpl.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J4\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J,\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\u0002J\u001e\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0010"}, d2 = {"Lgr2;", "Lvr2;", "", "Lkotlin/Pair;", "Ltja;", "Lm78;", "", "defaultSize", "b", DateTokenConverter.CONVERTER_KEY, c.a, "", "shoppingItems", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: gr2  reason: default package */
/* loaded from: classes4.dex */
public final class gr2 implements vr2 {
    public static final a a = new a(null);

    /* compiled from: DefaultPizzaShoppingItemSelectorImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lgr2$a;", "", "", "DEFAULT_DOUGH", "I", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gr2$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final Pair<tja, m78> b(List<? extends Pair<? extends tja, m78>> list, int i) {
        Object obj;
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                Pair pair = (Pair) obj;
                tja tjaVar = (tja) pair.a();
                m78 m78Var = (m78) pair.b();
                if (m78Var.s().d() == i && m78Var.o().d() == 1 && !tjaVar.p()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (Pair) obj;
    }

    private final Pair<tja, m78> c(List<? extends Pair<? extends tja, m78>> list) {
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

    private final Pair<tja, m78> d(List<? extends Pair<? extends tja, m78>> list, int i) {
        Object obj;
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                Pair pair = (Pair) obj;
                tja tjaVar = (tja) pair.a();
                if (((m78) pair.b()).s().d() == i && !tjaVar.p()) {
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
        Pair<tja, m78> b = b(arrayList, i);
        if (b == null && (b = d(arrayList, i)) == null && (b = c(arrayList)) == null) {
            Z = sc1.Z(arrayList);
            b = (Pair) Z;
        }
        return b.a();
    }
}
