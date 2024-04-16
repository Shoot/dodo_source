package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.ou2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
/* compiled from: DeliverablePlace.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010 \n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0003\u001a\f\u0010\u0005\u001a\u0004\u0018\u00010\u0000*\u00020\u0001\u001a\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007*\b\u0012\u0004\u0012\u00020\u00010\u0006\u001a\f\u0010\t\u001a\u0004\u0018\u00010\u0003*\u00020\u0001¨\u0006\n"}, d2 = {"Lw6;", "Lou2;", "b", "Le91;", c.a, DateTokenConverter.CONVERTER_KEY, "", "", "a", e.a, "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: ru2  reason: default package */
/* loaded from: classes4.dex */
public final class ru2 {
    public static final List<w6> a(Collection<? extends ou2> collection) {
        int w;
        z65.h(collection, "<this>");
        ArrayList<ou2.b> arrayList = new ArrayList();
        for (Object obj : collection) {
            if (obj instanceof ou2.b) {
                arrayList.add(obj);
            }
        }
        w = lc1.w(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(w);
        for (ou2.b bVar : arrayList) {
            arrayList2.add(bVar.b());
        }
        return arrayList2;
    }

    public static final ou2 b(w6 w6Var) {
        z65.h(w6Var, "<this>");
        return new ou2.b(w6Var);
    }

    public static final ou2 c(e91 e91Var) {
        z65.h(e91Var, "<this>");
        return new ou2.c(e91Var);
    }

    public static final w6 d(ou2 ou2Var) {
        ou2.b bVar;
        z65.h(ou2Var, "<this>");
        if (ou2Var instanceof ou2.b) {
            bVar = (ou2.b) ou2Var;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            return null;
        }
        return bVar.b();
    }

    public static final e91 e(ou2 ou2Var) {
        ou2.c cVar;
        z65.h(ou2Var, "<this>");
        if (ou2Var instanceof ou2.c) {
            cVar = (ou2.c) ou2Var;
        } else {
            cVar = null;
        }
        if (cVar == null) {
            return null;
        }
        return cVar.b();
    }
}
