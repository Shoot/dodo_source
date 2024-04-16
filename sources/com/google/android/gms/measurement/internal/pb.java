package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.b0;
import com.google.android.gms.internal.measurement.k0;
import com.google.android.gms.internal.measurement.l0;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class pb {
    private String a;
    private boolean b;
    private com.google.android.gms.internal.measurement.k0 c;
    private BitSet d;
    private BitSet e;
    private Map<Integer, Long> f;
    private Map<Integer, List<Long>> g;
    private final /* synthetic */ ob h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ BitSet b(pb pbVar) {
        return pbVar.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Iterable] */
    @NonNull
    public final com.google.android.gms.internal.measurement.b0 a(int i) {
        ArrayList arrayList;
        ?? arrayList2;
        b0.a N = com.google.android.gms.internal.measurement.b0.N();
        N.s(i);
        N.w(this.b);
        com.google.android.gms.internal.measurement.k0 k0Var = this.c;
        if (k0Var != null) {
            N.v(k0Var);
        }
        k0.a B = com.google.android.gms.internal.measurement.k0.X().w(db.M(this.d)).B(db.M(this.e));
        if (this.f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f.size());
            for (Integer num : this.f.keySet()) {
                int intValue = num.intValue();
                Long l = this.f.get(Integer.valueOf(intValue));
                if (l != null) {
                    arrayList.add((com.google.android.gms.internal.measurement.c0) ((com.google.android.gms.internal.measurement.b2) com.google.android.gms.internal.measurement.c0.M().s(intValue).t(l.longValue()).u()));
                }
            }
        }
        if (arrayList != null) {
            B.t(arrayList);
        }
        if (this.g == null) {
            arrayList2 = Collections.emptyList();
        } else {
            arrayList2 = new ArrayList(this.g.size());
            for (Integer num2 : this.g.keySet()) {
                l0.a s = com.google.android.gms.internal.measurement.l0.N().s(num2.intValue());
                List<Long> list = this.g.get(num2);
                if (list != null) {
                    Collections.sort(list);
                    s.t(list);
                }
                arrayList2.add((com.google.android.gms.internal.measurement.l0) ((com.google.android.gms.internal.measurement.b2) s.u()));
            }
        }
        B.z(arrayList2);
        N.t(B);
        return (com.google.android.gms.internal.measurement.b0) ((com.google.android.gms.internal.measurement.b2) N.u());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(@NonNull rb rbVar) {
        int a = rbVar.a();
        Boolean bool = rbVar.c;
        if (bool != null) {
            this.e.set(a, bool.booleanValue());
        }
        Boolean bool2 = rbVar.d;
        if (bool2 != null) {
            this.d.set(a, bool2.booleanValue());
        }
        if (rbVar.e != null) {
            Long l = this.f.get(Integer.valueOf(a));
            long longValue = rbVar.e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f.put(Integer.valueOf(a), Long.valueOf(longValue));
            }
        }
        if (rbVar.f != null) {
            List<Long> list = this.g.get(Integer.valueOf(a));
            if (list == null) {
                list = new ArrayList<>();
                this.g.put(Integer.valueOf(a), list);
            }
            if (rbVar.j()) {
                list.clear();
            }
            if (t6d.a() && this.h.a().E(this.a, b0.j0) && rbVar.i()) {
                list.clear();
            }
            if (t6d.a() && this.h.a().E(this.a, b0.j0)) {
                long longValue2 = rbVar.f.longValue() / 1000;
                if (!list.contains(Long.valueOf(longValue2))) {
                    list.add(Long.valueOf(longValue2));
                    return;
                }
                return;
            }
            list.add(Long.valueOf(rbVar.f.longValue() / 1000));
        }
    }

    private pb(ob obVar, String str) {
        this.h = obVar;
        this.a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new lr();
        this.g = new lr();
    }

    private pb(ob obVar, String str, com.google.android.gms.internal.measurement.k0 k0Var, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.h = obVar;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = map;
        this.g = new lr();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(num));
                this.g.put(num, arrayList);
            }
        }
        this.b = false;
        this.c = k0Var;
    }
}
