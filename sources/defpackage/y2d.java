package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: y2d  reason: default package */
/* loaded from: classes2.dex */
public final class y2d extends ioc {
    private final wmc c;

    public y2d(wmc wmcVar) {
        super("internal.eventLogger");
        this.c = wmcVar;
    }

    @Override // defpackage.ioc
    public final bpc b(xzc xzcVar, List<bpc> list) {
        Map<String, Object> hashMap;
        eyc.f(this.a, 3, list);
        String g = xzcVar.c(list.get(0)).g();
        long a = (long) eyc.a(xzcVar.c(list.get(1)).f().doubleValue());
        bpc c = xzcVar.c(list.get(2));
        if (c instanceof yoc) {
            hashMap = eyc.d((yoc) c);
        } else {
            hashMap = new HashMap<>();
        }
        this.c.b(g, a, hashMap);
        return bpc.K4;
    }
}
