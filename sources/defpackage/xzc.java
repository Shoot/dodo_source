package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: xzc  reason: default package */
/* loaded from: classes2.dex */
public final class xzc {
    private final xzc a;
    private drc b;
    private Map<String, bpc> c = new HashMap();
    private Map<String, Boolean> d = new HashMap();

    public xzc(xzc xzcVar, drc drcVar) {
        this.a = xzcVar;
        this.b = drcVar;
    }

    public final bpc a(String str) {
        xzc xzcVar = this;
        while (!xzcVar.c.containsKey(str)) {
            xzcVar = xzcVar.a;
            if (xzcVar == null) {
                throw new IllegalArgumentException(String.format("%s is not defined", str));
            }
        }
        return xzcVar.c.get(str);
    }

    public final bpc b(qnc qncVar) {
        bpc bpcVar = bpc.K4;
        Iterator<Integer> E = qncVar.E();
        while (E.hasNext()) {
            bpcVar = this.b.a(this, qncVar.v(E.next().intValue()));
            if (bpcVar instanceof doc) {
                break;
            }
        }
        return bpcVar;
    }

    public final bpc c(bpc bpcVar) {
        return this.b.a(this, bpcVar);
    }

    public final xzc d() {
        return new xzc(this, this.b);
    }

    public final void e(String str, bpc bpcVar) {
        if (!this.d.containsKey(str)) {
            if (bpcVar == null) {
                this.c.remove(str);
            } else {
                this.c.put(str, bpcVar);
            }
        }
    }

    public final void f(String str, bpc bpcVar) {
        e(str, bpcVar);
        this.d.put(str, Boolean.TRUE);
    }

    public final boolean g(String str) {
        xzc xzcVar = this;
        while (!xzcVar.c.containsKey(str)) {
            xzcVar = xzcVar.a;
            if (xzcVar == null) {
                return false;
            }
        }
        return true;
    }

    public final void h(String str, bpc bpcVar) {
        xzc xzcVar;
        xzc xzcVar2 = this;
        while (!xzcVar2.c.containsKey(str) && (xzcVar = xzcVar2.a) != null && xzcVar.g(str)) {
            xzcVar2 = xzcVar2.a;
        }
        if (!xzcVar2.d.containsKey(str)) {
            if (bpcVar == null) {
                xzcVar2.c.remove(str);
            } else {
                xzcVar2.c.put(str, bpcVar);
            }
        }
    }
}
