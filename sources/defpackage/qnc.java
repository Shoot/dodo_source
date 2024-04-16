package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: qnc  reason: default package */
/* loaded from: classes2.dex */
public final class qnc implements eoc, bpc, Iterable<bpc> {
    private final SortedMap<Integer, bpc> a;
    private final Map<String, bpc> b;

    public qnc() {
        this.a = new TreeMap();
        this.b = new TreeMap();
    }

    public final String A(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            for (int i = 0; i < z(); i++) {
                bpc v = v(i);
                sb.append(str);
                if (!(v instanceof upc) && !(v instanceof uoc)) {
                    sb.append(v.g());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final void B(int i) {
        int intValue = this.a.lastKey().intValue();
        if (i <= intValue && i >= 0) {
            this.a.remove(Integer.valueOf(i));
            if (i == intValue) {
                int i2 = i - 1;
                if (!this.a.containsKey(Integer.valueOf(i2)) && i2 >= 0) {
                    this.a.put(Integer.valueOf(i2), bpc.K4);
                    return;
                }
                return;
            }
            while (true) {
                i++;
                if (i <= this.a.lastKey().intValue()) {
                    bpc bpcVar = this.a.get(Integer.valueOf(i));
                    if (bpcVar != null) {
                        this.a.put(Integer.valueOf(i - 1), bpcVar);
                        this.a.remove(Integer.valueOf(i));
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void C(int i, bpc bpcVar) {
        if (i <= 32468) {
            if (i >= 0) {
                if (bpcVar == null) {
                    this.a.remove(Integer.valueOf(i));
                    return;
                } else {
                    this.a.put(Integer.valueOf(i), bpcVar);
                    return;
                }
            }
            throw new IndexOutOfBoundsException("Out of bounds index: " + i);
        }
        throw new IllegalStateException("Array too large");
    }

    public final boolean D(int i) {
        if (i >= 0 && i <= this.a.lastKey().intValue()) {
            return this.a.containsKey(Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i);
    }

    public final Iterator<Integer> E() {
        return this.a.keySet().iterator();
    }

    public final List<bpc> F() {
        ArrayList arrayList = new ArrayList(z());
        for (int i = 0; i < z(); i++) {
            arrayList.add(v(i));
        }
        return arrayList;
    }

    public final void G() {
        this.a.clear();
    }

    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.bpc
    public final bpc c() {
        qnc qncVar = new qnc();
        for (Map.Entry<Integer, bpc> entry : this.a.entrySet()) {
            if (entry.getValue() instanceof eoc) {
                qncVar.a.put(entry.getKey(), entry.getValue());
            } else {
                qncVar.a.put(entry.getKey(), entry.getValue().c());
            }
        }
        return qncVar;
    }

    @Override // defpackage.bpc
    public final Boolean d() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qnc)) {
            return false;
        }
        qnc qncVar = (qnc) obj;
        if (z() != qncVar.z()) {
            return false;
        }
        if (this.a.isEmpty()) {
            return qncVar.a.isEmpty();
        }
        for (int intValue = this.a.firstKey().intValue(); intValue <= this.a.lastKey().intValue(); intValue++) {
            if (!v(intValue).equals(qncVar.v(intValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.bpc
    public final Double f() {
        if (this.a.size() == 1) {
            return v(0).f();
        }
        if (this.a.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.bpc
    public final String g() {
        return toString();
    }

    @Override // defpackage.bpc
    public final Iterator<bpc> h() {
        return new jnc(this, this.a.keySet().iterator(), this.b.keySet().iterator());
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator<bpc> iterator() {
        return new wnc(this);
    }

    @Override // defpackage.eoc
    public final bpc k(String str) {
        bpc bpcVar;
        if ("length".equals(str)) {
            return new znc(Double.valueOf(z()));
        }
        if (p(str) && (bpcVar = this.b.get(str)) != null) {
            return bpcVar;
        }
        return bpc.K4;
    }

    @Override // defpackage.eoc
    public final boolean p(String str) {
        if (!"length".equals(str) && !this.b.containsKey(str)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.bpc
    public final bpc t(String str, xzc xzcVar, List<bpc> list) {
        if (!"concat".equals(str) && !"every".equals(str) && !"filter".equals(str) && !"forEach".equals(str) && !"indexOf".equals(str) && !"join".equals(str) && !"lastIndexOf".equals(str) && !"map".equals(str) && !"pop".equals(str) && !"push".equals(str) && !"reduce".equals(str) && !"reduceRight".equals(str) && !"reverse".equals(str) && !"shift".equals(str) && !"slice".equals(str) && !"some".equals(str) && !"sort".equals(str) && !"splice".equals(str) && !"toString".equals(str) && !"unshift".equals(str)) {
            return poc.b(this, new gpc(str), xzcVar, list);
        }
        return jrc.c(str, this, xzcVar, list);
    }

    public final String toString() {
        return A(",");
    }

    @Override // defpackage.eoc
    public final void u(String str, bpc bpcVar) {
        if (bpcVar == null) {
            this.b.remove(str);
        } else {
            this.b.put(str, bpcVar);
        }
    }

    public final bpc v(int i) {
        bpc bpcVar;
        if (i < z()) {
            if (D(i) && (bpcVar = this.a.get(Integer.valueOf(i))) != null) {
                return bpcVar;
            }
            return bpc.K4;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void w(int i, bpc bpcVar) {
        if (i >= 0) {
            if (i >= z()) {
                C(i, bpcVar);
                return;
            }
            for (int intValue = this.a.lastKey().intValue(); intValue >= i; intValue--) {
                bpc bpcVar2 = this.a.get(Integer.valueOf(intValue));
                if (bpcVar2 != null) {
                    C(intValue + 1, bpcVar2);
                    this.a.remove(Integer.valueOf(intValue));
                }
            }
            C(i, bpcVar);
            return;
        }
        throw new IllegalArgumentException("Invalid value index: " + i);
    }

    public final void x(bpc bpcVar) {
        C(z(), bpcVar);
    }

    public final int z() {
        if (this.a.isEmpty()) {
            return 0;
        }
        return this.a.lastKey().intValue() + 1;
    }

    public qnc(List<bpc> list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                C(i, list.get(i));
            }
        }
    }

    public qnc(bpc... bpcVarArr) {
        this(Arrays.asList(bpcVarArr));
    }
}
