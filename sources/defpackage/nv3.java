package defpackage;

import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.listwidget.StoriesWidgetService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
/* compiled from: FirebaseAnalyticsExtensions.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a%\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001\"\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0018\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u001a\u0012\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\b¨\u0006\u000b"}, d2 = {"Lbc;", "", "Lod;", "items", c.a, "(Lbc;[Lod;)Lbc;", "", "b", "", "coupon", "a", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: nv3  reason: default package */
/* loaded from: classes4.dex */
public final class nv3 {
    public static final bc a(bc bcVar, String str) {
        z65.h(bcVar, "<this>");
        z65.h(str, "coupon");
        return bc.e(bcVar, "coupon", str, false, 4, null);
    }

    public static final bc b(bc bcVar, List<od> list) {
        int w;
        Map k;
        z65.h(bcVar, "<this>");
        z65.h(list, "items");
        List<od> list2 = list;
        w = lc1.w(list2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (od odVar : list2) {
            Pair[] pairArr = new Pair[6];
            pairArr[0] = lnb.a("item_name", odVar.d());
            int i = 1;
            pairArr[1] = lnb.a(StoriesWidgetService.ID, odVar.c());
            pairArr[2] = lnb.a("price", odVar.e());
            pairArr[3] = lnb.a("item_category", odVar.a());
            pairArr[4] = lnb.a("item_variant", odVar.g());
            Integer f = odVar.f();
            if (f != null) {
                i = f.intValue();
            }
            pairArr[5] = lnb.a("quantity", Integer.valueOf(i));
            k = g86.k(pairArr);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : k.entrySet()) {
                if (entry.getValue() != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            arrayList.add(linkedHashMap);
        }
        return bc.e(bcVar, "items", arrayList, false, 4, null);
    }

    public static final bc c(bc bcVar, od... odVarArr) {
        List U;
        z65.h(bcVar, "<this>");
        z65.h(odVarArr, "items");
        U = yr.U(odVarArr);
        return b(bcVar, U);
    }
}
