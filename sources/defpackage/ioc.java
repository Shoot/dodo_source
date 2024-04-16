package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: ioc  reason: default package */
/* loaded from: classes2.dex */
public abstract class ioc implements eoc, bpc {
    protected final String a;
    protected final Map<String, bpc> b = new HashMap();

    public ioc(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public abstract bpc b(xzc xzcVar, List<bpc> list);

    @Override // defpackage.bpc
    public final Boolean d() {
        return Boolean.TRUE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ioc)) {
            return false;
        }
        ioc iocVar = (ioc) obj;
        String str = this.a;
        if (str == null) {
            return false;
        }
        return str.equals(iocVar.a);
    }

    @Override // defpackage.bpc
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.bpc
    public final String g() {
        return this.a;
    }

    @Override // defpackage.bpc
    public final Iterator<bpc> h() {
        return poc.a(this.b);
    }

    public int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // defpackage.eoc
    public final bpc k(String str) {
        if (this.b.containsKey(str)) {
            return this.b.get(str);
        }
        return bpc.K4;
    }

    @Override // defpackage.eoc
    public final boolean p(String str) {
        return this.b.containsKey(str);
    }

    @Override // defpackage.bpc
    public final bpc t(String str, xzc xzcVar, List<bpc> list) {
        if ("toString".equals(str)) {
            return new gpc(this.a);
        }
        return poc.b(this, new gpc(str), xzcVar, list);
    }

    @Override // defpackage.eoc
    public final void u(String str, bpc bpcVar) {
        if (bpcVar == null) {
            this.b.remove(str);
        } else {
            this.b.put(str, bpcVar);
        }
    }

    public bpc c() {
        return this;
    }
}
