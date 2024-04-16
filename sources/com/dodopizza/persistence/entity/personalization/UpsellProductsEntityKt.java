package com.dodopizza.persistence.entity.personalization;

import com.inappstory.sdk.stories.statistic.StatisticManager;
import io.realm.k0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: UpsellProductsEntity.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\"\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u001a \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\b"}, d2 = {"Lio/realm/k0;", "Lcom/dodopizza/persistence/entity/personalization/MapEntry;", StatisticManager.LIST, "", "", "realmListToMap", "map", "mapToRealList", "persistence_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class UpsellProductsEntityKt {
    public static final k0<MapEntry> mapToRealList(Map<String, String> map) {
        List F0;
        z65.h(map, "map");
        k0<MapEntry> k0Var = new k0<>();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new MapEntry(entry.getKey(), entry.getValue()));
        }
        F0 = sc1.F0(arrayList);
        k0Var.addAll(F0);
        return k0Var;
    }

    public static final Map<String, String> realmListToMap(k0<MapEntry> k0Var) {
        Map<String, String> map;
        Map<String, String> h;
        int w;
        if (k0Var != null) {
            w = lc1.w(k0Var, 10);
            ArrayList arrayList = new ArrayList(w);
            for (MapEntry mapEntry : k0Var) {
                String key = mapEntry.getKey();
                String str = "";
                if (key == null) {
                    key = "";
                }
                String value = mapEntry.getValue();
                if (value != null) {
                    str = value;
                }
                arrayList.add(lnb.a(key, str));
            }
            map = g86.s(arrayList);
        } else {
            map = null;
        }
        if (map == null) {
            h = g86.h();
            return h;
        }
        return map;
    }
}
