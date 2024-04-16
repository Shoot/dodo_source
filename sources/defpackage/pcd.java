package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: pcd  reason: default package */
/* loaded from: classes2.dex */
public final class pcd extends ioc {
    private final p3d c;
    private final Map<String, ioc> d;

    public pcd(p3d p3dVar) {
        super("require");
        this.d = new HashMap();
        this.c = p3dVar;
    }

    @Override // defpackage.ioc
    public final bpc b(xzc xzcVar, List<bpc> list) {
        eyc.f("require", 1, list);
        String g = xzcVar.c(list.get(0)).g();
        if (this.d.containsKey(g)) {
            return this.d.get(g);
        }
        bpc a = this.c.a(g);
        if (a instanceof ioc) {
            this.d.put(g, (ioc) a);
        }
        return a;
    }
}
