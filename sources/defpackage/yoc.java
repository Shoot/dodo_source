package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: yoc  reason: default package */
/* loaded from: classes2.dex */
public class yoc implements eoc, bpc {
    private final Map<String, bpc> a = new HashMap();

    public final List<String> a() {
        return new ArrayList(this.a.keySet());
    }

    @Override // defpackage.bpc
    public final bpc c() {
        yoc yocVar = new yoc();
        for (Map.Entry<String, bpc> entry : this.a.entrySet()) {
            if (entry.getValue() instanceof eoc) {
                yocVar.a.put(entry.getKey(), entry.getValue());
            } else {
                yocVar.a.put(entry.getKey(), entry.getValue().c());
            }
        }
        return yocVar;
    }

    @Override // defpackage.bpc
    public final Boolean d() {
        return Boolean.TRUE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yoc)) {
            return false;
        }
        return this.a.equals(((yoc) obj).a);
    }

    @Override // defpackage.bpc
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.bpc
    public final String g() {
        return "[object Object]";
    }

    @Override // defpackage.bpc
    public final Iterator<bpc> h() {
        return poc.a(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.eoc
    public final bpc k(String str) {
        if (this.a.containsKey(str)) {
            return this.a.get(str);
        }
        return bpc.K4;
    }

    @Override // defpackage.eoc
    public final boolean p(String str) {
        return this.a.containsKey(str);
    }

    public bpc t(String str, xzc xzcVar, List<bpc> list) {
        if ("toString".equals(str)) {
            return new gpc(toString());
        }
        return poc.b(this, new gpc(str), xzcVar, list);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.a.isEmpty()) {
            for (String str : this.a.keySet()) {
                sb.append(String.format("%s: %s,", str, this.a.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.eoc
    public final void u(String str, bpc bpcVar) {
        if (bpcVar == null) {
            this.a.remove(str);
        } else {
            this.a.put(str, bpcVar);
        }
    }
}
