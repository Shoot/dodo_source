package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: cpc  reason: default package */
/* loaded from: classes2.dex */
public final class cpc extends ioc implements eoc {
    private final List<String> c;
    private final List<bpc> d;
    private xzc e;

    private cpc(cpc cpcVar) {
        super(cpcVar.a);
        ArrayList arrayList = new ArrayList(cpcVar.c.size());
        this.c = arrayList;
        arrayList.addAll(cpcVar.c);
        ArrayList arrayList2 = new ArrayList(cpcVar.d.size());
        this.d = arrayList2;
        arrayList2.addAll(cpcVar.d);
        this.e = cpcVar.e;
    }

    @Override // defpackage.ioc
    public final bpc b(xzc xzcVar, List<bpc> list) {
        xzc d = this.e.d();
        for (int i = 0; i < this.c.size(); i++) {
            if (i < list.size()) {
                d.e(this.c.get(i), xzcVar.c(list.get(i)));
            } else {
                d.e(this.c.get(i), bpc.K4);
            }
        }
        for (bpc bpcVar : this.d) {
            bpc c = d.c(bpcVar);
            if (c instanceof hpc) {
                c = d.c(bpcVar);
            }
            if (c instanceof doc) {
                return ((doc) c).a();
            }
        }
        return bpc.K4;
    }

    @Override // defpackage.ioc, defpackage.bpc
    public final bpc c() {
        return new cpc(this);
    }

    public cpc(String str, List<bpc> list, List<bpc> list2, xzc xzcVar) {
        super(str);
        this.c = new ArrayList();
        this.e = xzcVar;
        if (!list.isEmpty()) {
            for (bpc bpcVar : list) {
                this.c.add(bpcVar.g());
            }
        }
        this.d = new ArrayList(list2);
    }
}
