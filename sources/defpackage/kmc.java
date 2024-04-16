package defpackage;

import com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity;
import java.util.Collections;
import java.util.TreeMap;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: kmc  reason: default package */
/* loaded from: classes2.dex */
public final class kmc {
    private final TreeMap<Integer, cpc> a = new TreeMap<>();
    private final TreeMap<Integer, cpc> b = new TreeMap<>();

    private static int a(xzc xzcVar, cpc cpcVar, bpc bpcVar) {
        bpc b = cpcVar.b(xzcVar, Collections.singletonList(bpcVar));
        if (b instanceof znc) {
            return eyc.i(b.f().doubleValue());
        }
        return -1;
    }

    public final void b(String str, int i, cpc cpcVar, String str2) {
        TreeMap<Integer, cpc> treeMap;
        if ("create".equals(str2)) {
            treeMap = this.b;
        } else if (CartQueueItemEntity.OPERATION_EDIT.equals(str2)) {
            treeMap = this.a;
        } else {
            throw new IllegalStateException("Unknown callback type: " + str2);
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            i = treeMap.lastKey().intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i), cpcVar);
    }

    public final void c(xzc xzcVar, wmc wmcVar) {
        b5d b5dVar = new b5d(wmcVar);
        for (Integer num : this.a.keySet()) {
            dnc dncVar = (dnc) wmcVar.d().clone();
            int a = a(xzcVar, this.a.get(num), b5dVar);
            if (a == 2 || a == -1) {
                wmcVar.e(dncVar);
            }
        }
        for (Integer num2 : this.b.keySet()) {
            a(xzcVar, this.b.get(num2), b5dVar);
        }
    }
}
