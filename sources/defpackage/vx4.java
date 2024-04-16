package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.tx4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: InAppFilteringManagerImpl.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0016R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0014"}, d2 = {"Lvx4;", "Lux4;", "", "", "shownInApps", "", "Lfx4;", "inApps", c.a, "Ltx4;", "event", "a", "", "abtestsInAppsPool", "b", "Lwy4;", "Lwy4;", "inAppRepository", "<init>", "(Lwy4;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: vx4  reason: default package */
/* loaded from: classes.dex */
public final class vx4 implements ux4 {
    private final wy4 a;

    public vx4(wy4 wy4Var) {
        z65.h(wy4Var, "inAppRepository");
        this.a = wy4Var;
    }

    @Override // defpackage.ux4
    public List<fx4> a(List<fx4> list, tx4 tx4Var) {
        z65.h(list, "inApps");
        z65.h(tx4Var, "event");
        if (!z65.c(tx4Var, tx4.a.INSTANCE)) {
            return this.a.d(tx4Var.getName());
        }
        return list;
    }

    @Override // defpackage.ux4
    public List<fx4> b(List<fx4> list, Collection<String> collection) {
        z65.h(list, "inApps");
        z65.h(collection, "abtestsInAppsPool");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (collection.contains(((fx4) obj).b())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.ux4
    public List<fx4> c(Set<String> set, List<fx4> list) {
        z65.h(set, "shownInApps");
        z65.h(list, "inApps");
        fk6 fk6Var = fk6.a;
        fk6Var.d(this, "Already shown innaps: " + set);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!set.contains(((fx4) obj).b())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
