package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: poc  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class poc {
    public static Iterator<bpc> a(Map<String, bpc> map) {
        return new joc(map.keySet().iterator());
    }

    public static bpc b(eoc eocVar, bpc bpcVar, xzc xzcVar, List<bpc> list) {
        if (eocVar.p(bpcVar.g())) {
            bpc k = eocVar.k(bpcVar.g());
            if (k instanceof ioc) {
                return ((ioc) k).b(xzcVar, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", bpcVar.g()));
        } else if ("hasOwnProperty".equals(bpcVar.g())) {
            eyc.f("hasOwnProperty", 1, list);
            if (eocVar.p(xzcVar.c(list.get(0)).g())) {
                return bpc.P4;
            }
            return bpc.Q4;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", bpcVar.g()));
        }
    }
}
