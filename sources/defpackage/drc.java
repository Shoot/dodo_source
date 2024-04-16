package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: drc  reason: default package */
/* loaded from: classes2.dex */
public final class drc {
    private Map<String, vpc> a = new HashMap();
    private csc b = new csc();

    public drc() {
        b(new ppc());
        b(new zqc());
        b(new frc());
        b(new mrc());
        b(new qrc());
        b(new asc());
        b(new isc());
    }

    private final void b(vpc vpcVar) {
        for (ksc kscVar : vpcVar.a) {
            this.a.put(kscVar.toString(), vpcVar);
        }
    }

    public final bpc a(xzc xzcVar, bpc bpcVar) {
        vpc vpcVar;
        eyc.b(xzcVar);
        if (bpcVar instanceof hpc) {
            hpc hpcVar = (hpc) bpcVar;
            ArrayList<bpc> b = hpcVar.b();
            String a = hpcVar.a();
            if (this.a.containsKey(a)) {
                vpcVar = this.a.get(a);
            } else {
                vpcVar = this.b;
            }
            return vpcVar.b(a, xzcVar, b);
        }
        return bpcVar;
    }
}
