package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.threeten.bp.DateTimeException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DateTimeBuilder.java */
/* renamed from: zm2  reason: default package */
/* loaded from: classes3.dex */
public final class zm2 extends lq2 implements q8b, Cloneable {
    final Map<u8b, Long> a = new HashMap();
    p71 b;
    vcc c;
    i71 d;
    gs5 e;
    boolean f;
    cy7 g;

    private void E0() {
        if (this.e == null) {
            if (this.a.containsKey(h71.S4) || this.a.containsKey(h71.l) || this.a.containsKey(h71.k)) {
                Map<u8b, Long> map = this.a;
                h71 h71Var = h71.e;
                if (map.containsKey(h71Var)) {
                    long longValue = this.a.get(h71Var).longValue();
                    this.a.put(h71.g, Long.valueOf(longValue / 1000));
                    this.a.put(h71.i, Long.valueOf(longValue / 1000000));
                    return;
                }
                this.a.put(h71Var, 0L);
                this.a.put(h71.g, 0L);
                this.a.put(h71.i, 0L);
            }
        }
    }

    private void F0() {
        if (this.d != null && this.e != null) {
            Long l = this.a.get(h71.T4);
            if (l != null) {
                n71<?> P = this.d.P(this.e).P(wcc.h0(l.intValue()));
                h71 h71Var = h71.S4;
                this.a.put(h71Var, Long.valueOf(P.q(h71Var)));
            } else if (this.c != null) {
                n71<?> P2 = this.d.P(this.e).P(this.c);
                h71 h71Var2 = h71.S4;
                this.a.put(h71Var2, Long.valueOf(P2.q(h71Var2)));
            }
        }
    }

    private void J0(u8b u8bVar, i71 i71Var) {
        if (this.b.equals(i71Var.T())) {
            long m0 = i71Var.m0();
            Long put = this.a.put(h71.y, Long.valueOf(m0));
            if (put != null && put.longValue() != m0) {
                throw new DateTimeException("Conflict found: " + ds5.Z0(put.longValue()) + " differs from " + ds5.Z0(m0) + " while resolving  " + u8bVar);
            }
            return;
        }
        throw new DateTimeException("ChronoLocalDate must use the effective parsed chronology: " + this.b);
    }

    private void K0(u8b u8bVar, gs5 gs5Var) {
        long N0 = gs5Var.N0();
        Long put = this.a.put(h71.f, Long.valueOf(N0));
        if (put != null && put.longValue() != N0) {
            throw new DateTimeException("Conflict found: " + gs5.r0(put.longValue()) + " differs from " + gs5Var + " while resolving  " + u8bVar);
        }
    }

    private void L0(mj9 mj9Var) {
        Map<u8b, Long> map = this.a;
        h71 h71Var = h71.q;
        Long l = map.get(h71Var);
        Map<u8b, Long> map2 = this.a;
        h71 h71Var2 = h71.m;
        Long l2 = map2.get(h71Var2);
        Map<u8b, Long> map3 = this.a;
        h71 h71Var3 = h71.k;
        Long l3 = map3.get(h71Var3);
        Map<u8b, Long> map4 = this.a;
        h71 h71Var4 = h71.e;
        Long l4 = map4.get(h71Var4);
        if (l == null) {
            return;
        }
        if (l2 == null && (l3 != null || l4 != null)) {
            return;
        }
        if (l2 != null && l3 == null && l4 != null) {
            return;
        }
        if (mj9Var != mj9.LENIENT) {
            if (mj9Var == mj9.SMART && l.longValue() == 24 && ((l2 == null || l2.longValue() == 0) && ((l3 == null || l3.longValue() == 0) && (l4 == null || l4.longValue() == 0)))) {
                l = 0L;
                this.g = cy7.d(1);
            }
            int x = h71Var.x(l.longValue());
            if (l2 != null) {
                int x2 = h71Var2.x(l2.longValue());
                if (l3 != null) {
                    int x3 = h71Var3.x(l3.longValue());
                    if (l4 != null) {
                        Q(gs5.p0(x, x2, x3, h71Var4.x(l4.longValue())));
                    } else {
                        Q(gs5.o0(x, x2, x3));
                    }
                } else if (l4 == null) {
                    Q(gs5.m0(x, x2));
                }
            } else if (l3 == null && l4 == null) {
                Q(gs5.m0(x, 0));
            }
        } else {
            long longValue = l.longValue();
            if (l2 != null) {
                if (l3 != null) {
                    if (l4 == null) {
                        l4 = 0L;
                    }
                    long k = g95.k(g95.k(g95.k(g95.m(longValue, 3600000000000L), g95.m(l2.longValue(), 60000000000L)), g95.m(l3.longValue(), 1000000000L)), l4.longValue());
                    Q(gs5.r0(g95.h(k, 86400000000000L)));
                    this.g = cy7.d((int) g95.e(k, 86400000000000L));
                } else {
                    long k2 = g95.k(g95.m(longValue, 3600L), g95.m(l2.longValue(), 60L));
                    Q(gs5.x0(g95.h(k2, 86400L)));
                    this.g = cy7.d((int) g95.e(k2, 86400L));
                }
            } else {
                int p = g95.p(g95.e(longValue, 24L));
                Q(gs5.m0(g95.g(longValue, 24), 0));
                this.g = cy7.d(p);
            }
        }
        this.a.remove(h71Var);
        this.a.remove(h71Var2);
        this.a.remove(h71Var3);
        this.a.remove(h71Var4);
    }

    private void b0(ds5 ds5Var) {
        if (ds5Var != null) {
            P(ds5Var);
            for (u8b u8bVar : this.a.keySet()) {
                if ((u8bVar instanceof h71) && u8bVar.a()) {
                    try {
                        long q = ds5Var.q(u8bVar);
                        Long l = this.a.get(u8bVar);
                        if (q != l.longValue()) {
                            throw new DateTimeException("Conflict found: Field " + u8bVar + " " + q + " differs from " + u8bVar + " " + l + " derived from " + ds5Var);
                        }
                    } catch (DateTimeException unused) {
                    }
                }
            }
        }
    }

    private void e0() {
        gs5 gs5Var;
        if (this.a.size() > 0) {
            i71 i71Var = this.d;
            if (i71Var != null && (gs5Var = this.e) != null) {
                f0(i71Var.P(gs5Var));
            } else if (i71Var != null) {
                f0(i71Var);
            } else {
                q8b q8bVar = this.e;
                if (q8bVar != null) {
                    f0(q8bVar);
                }
            }
        }
    }

    private void f0(q8b q8bVar) {
        Iterator<Map.Entry<u8b, Long>> it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<u8b, Long> next = it.next();
            u8b key = next.getKey();
            long longValue = next.getValue().longValue();
            if (q8bVar.G(key)) {
                try {
                    long q = q8bVar.q(key);
                    if (q == longValue) {
                        it.remove();
                    } else {
                        throw new DateTimeException("Cross check failed: " + key + " " + q + " vs " + key + " " + longValue);
                    }
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    private Long h0(u8b u8bVar) {
        return this.a.get(u8bVar);
    }

    private void l0(mj9 mj9Var) {
        if (this.b instanceof t75) {
            b0(t75.e.f0(this.a, mj9Var));
            return;
        }
        Map<u8b, Long> map = this.a;
        h71 h71Var = h71.y;
        if (map.containsKey(h71Var)) {
            b0(ds5.Z0(this.a.remove(h71Var).longValue()));
        }
    }

    private void m0() {
        if (this.a.containsKey(h71.S4)) {
            vcc vccVar = this.c;
            if (vccVar != null) {
                o0(vccVar);
                return;
            }
            Long l = this.a.get(h71.T4);
            if (l != null) {
                o0(wcc.h0(l.intValue()));
            }
        }
    }

    private void o0(vcc vccVar) {
        Map<u8b, Long> map = this.a;
        h71 h71Var = h71.S4;
        n71<?> P = this.b.P(b55.l0(map.remove(h71Var).longValue()), vccVar);
        if (this.d == null) {
            P(P.o0());
        } else {
            J0(h71Var, P.o0());
        }
        N(h71.l, P.r0().O0());
    }

    private void p0(mj9 mj9Var) {
        Map<u8b, Long> map = this.a;
        h71 h71Var = h71.r;
        long j = 0;
        if (map.containsKey(h71Var)) {
            long longValue = this.a.remove(h71Var).longValue();
            if (mj9Var != mj9.LENIENT && (mj9Var != mj9.SMART || longValue != 0)) {
                h71Var.E(longValue);
            }
            h71 h71Var2 = h71.q;
            if (longValue == 24) {
                longValue = 0;
            }
            N(h71Var2, longValue);
        }
        Map<u8b, Long> map2 = this.a;
        h71 h71Var3 = h71.p;
        if (map2.containsKey(h71Var3)) {
            long longValue2 = this.a.remove(h71Var3).longValue();
            if (mj9Var != mj9.LENIENT && (mj9Var != mj9.SMART || longValue2 != 0)) {
                h71Var3.E(longValue2);
            }
            h71 h71Var4 = h71.o;
            if (longValue2 != 12) {
                j = longValue2;
            }
            N(h71Var4, j);
        }
        mj9 mj9Var2 = mj9.LENIENT;
        if (mj9Var != mj9Var2) {
            Map<u8b, Long> map3 = this.a;
            h71 h71Var5 = h71.s;
            if (map3.containsKey(h71Var5)) {
                h71Var5.E(this.a.get(h71Var5).longValue());
            }
            Map<u8b, Long> map4 = this.a;
            h71 h71Var6 = h71.o;
            if (map4.containsKey(h71Var6)) {
                h71Var6.E(this.a.get(h71Var6).longValue());
            }
        }
        Map<u8b, Long> map5 = this.a;
        h71 h71Var7 = h71.s;
        if (map5.containsKey(h71Var7)) {
            Map<u8b, Long> map6 = this.a;
            h71 h71Var8 = h71.o;
            if (map6.containsKey(h71Var8)) {
                N(h71.q, (this.a.remove(h71Var7).longValue() * 12) + this.a.remove(h71Var8).longValue());
            }
        }
        Map<u8b, Long> map7 = this.a;
        h71 h71Var9 = h71.f;
        if (map7.containsKey(h71Var9)) {
            long longValue3 = this.a.remove(h71Var9).longValue();
            if (mj9Var != mj9Var2) {
                h71Var9.E(longValue3);
            }
            N(h71.l, longValue3 / 1000000000);
            N(h71.e, longValue3 % 1000000000);
        }
        Map<u8b, Long> map8 = this.a;
        h71 h71Var10 = h71.h;
        if (map8.containsKey(h71Var10)) {
            long longValue4 = this.a.remove(h71Var10).longValue();
            if (mj9Var != mj9Var2) {
                h71Var10.E(longValue4);
            }
            N(h71.l, longValue4 / 1000000);
            N(h71.g, longValue4 % 1000000);
        }
        Map<u8b, Long> map9 = this.a;
        h71 h71Var11 = h71.j;
        if (map9.containsKey(h71Var11)) {
            long longValue5 = this.a.remove(h71Var11).longValue();
            if (mj9Var != mj9Var2) {
                h71Var11.E(longValue5);
            }
            N(h71.l, longValue5 / 1000);
            N(h71.i, longValue5 % 1000);
        }
        Map<u8b, Long> map10 = this.a;
        h71 h71Var12 = h71.l;
        if (map10.containsKey(h71Var12)) {
            long longValue6 = this.a.remove(h71Var12).longValue();
            if (mj9Var != mj9Var2) {
                h71Var12.E(longValue6);
            }
            N(h71.q, longValue6 / 3600);
            N(h71.m, (longValue6 / 60) % 60);
            N(h71.k, longValue6 % 60);
        }
        Map<u8b, Long> map11 = this.a;
        h71 h71Var13 = h71.n;
        if (map11.containsKey(h71Var13)) {
            long longValue7 = this.a.remove(h71Var13).longValue();
            if (mj9Var != mj9Var2) {
                h71Var13.E(longValue7);
            }
            N(h71.q, longValue7 / 60);
            N(h71.m, longValue7 % 60);
        }
        if (mj9Var != mj9Var2) {
            Map<u8b, Long> map12 = this.a;
            h71 h71Var14 = h71.i;
            if (map12.containsKey(h71Var14)) {
                h71Var14.E(this.a.get(h71Var14).longValue());
            }
            Map<u8b, Long> map13 = this.a;
            h71 h71Var15 = h71.g;
            if (map13.containsKey(h71Var15)) {
                h71Var15.E(this.a.get(h71Var15).longValue());
            }
        }
        Map<u8b, Long> map14 = this.a;
        h71 h71Var16 = h71.i;
        if (map14.containsKey(h71Var16)) {
            Map<u8b, Long> map15 = this.a;
            h71 h71Var17 = h71.g;
            if (map15.containsKey(h71Var17)) {
                N(h71Var17, (this.a.remove(h71Var16).longValue() * 1000) + (this.a.get(h71Var17).longValue() % 1000));
            }
        }
        Map<u8b, Long> map16 = this.a;
        h71 h71Var18 = h71.g;
        if (map16.containsKey(h71Var18)) {
            Map<u8b, Long> map17 = this.a;
            h71 h71Var19 = h71.e;
            if (map17.containsKey(h71Var19)) {
                N(h71Var18, this.a.get(h71Var19).longValue() / 1000);
                this.a.remove(h71Var18);
            }
        }
        if (this.a.containsKey(h71Var16)) {
            Map<u8b, Long> map18 = this.a;
            h71 h71Var20 = h71.e;
            if (map18.containsKey(h71Var20)) {
                N(h71Var16, this.a.get(h71Var20).longValue() / 1000000);
                this.a.remove(h71Var16);
            }
        }
        if (this.a.containsKey(h71Var18)) {
            N(h71.e, this.a.remove(h71Var18).longValue() * 1000);
        } else if (this.a.containsKey(h71Var16)) {
            N(h71.e, this.a.remove(h71Var16).longValue() * 1000000);
        }
    }

    private zm2 r0(u8b u8bVar, long j) {
        this.a.put(u8bVar, Long.valueOf(j));
        return this;
    }

    private boolean z0(mj9 mj9Var) {
        int i = 0;
        loop0: while (i < 100) {
            for (Map.Entry<u8b, Long> entry : this.a.entrySet()) {
                u8b key = entry.getKey();
                q8b w = key.w(this.a, this, mj9Var);
                if (w != null) {
                    if (w instanceof n71) {
                        n71 n71Var = (n71) w;
                        vcc vccVar = this.c;
                        if (vccVar == null) {
                            this.c = n71Var.b0();
                        } else if (!vccVar.equals(n71Var.b0())) {
                            throw new DateTimeException("ChronoZonedDateTime must use the effective parsed zone: " + this.c);
                        }
                        w = n71Var.p0();
                    }
                    if (w instanceof i71) {
                        J0(key, (i71) w);
                    } else if (w instanceof gs5) {
                        K0(key, (gs5) w);
                    } else if (w instanceof j71) {
                        j71 j71Var = (j71) w;
                        J0(key, j71Var.o0());
                        K0(key, j71Var.p0());
                    } else {
                        throw new DateTimeException("Unknown type: " + w.getClass().getName());
                    }
                } else if (!this.a.containsKey(key)) {
                    break;
                }
                i++;
            }
        }
        if (i != 100) {
            if (i <= 0) {
                return false;
            }
            return true;
        }
        throw new DateTimeException("Badly written field");
    }

    @Override // defpackage.q8b
    public boolean G(u8b u8bVar) {
        i71 i71Var;
        gs5 gs5Var;
        if (u8bVar == null) {
            return false;
        }
        if (!this.a.containsKey(u8bVar) && (((i71Var = this.d) == null || !i71Var.G(u8bVar)) && ((gs5Var = this.e) == null || !gs5Var.G(u8bVar)))) {
            return false;
        }
        return true;
    }

    @Override // defpackage.lq2, defpackage.q8b
    public <R> R M(w8b<R> w8bVar) {
        if (w8bVar == v8b.g()) {
            return (R) this.c;
        }
        if (w8bVar == v8b.a()) {
            return (R) this.b;
        }
        if (w8bVar == v8b.b()) {
            i71 i71Var = this.d;
            if (i71Var == null) {
                return null;
            }
            return (R) ds5.E0(i71Var);
        } else if (w8bVar == v8b.c()) {
            return (R) this.e;
        } else {
            if (w8bVar != v8b.f() && w8bVar != v8b.d()) {
                if (w8bVar == v8b.e()) {
                    return null;
                }
                return w8bVar.a(this);
            }
            return w8bVar.a(this);
        }
    }

    zm2 N(u8b u8bVar, long j) {
        g95.i(u8bVar, "field");
        Long h0 = h0(u8bVar);
        if (h0 != null && h0.longValue() != j) {
            throw new DateTimeException("Conflict found: " + u8bVar + " " + h0 + " differs from " + u8bVar + " " + j + ": " + this);
        }
        return r0(u8bVar, j);
    }

    void P(i71 i71Var) {
        this.d = i71Var;
    }

    void Q(gs5 gs5Var) {
        this.e = gs5Var;
    }

    public <R> R T(w8b<R> w8bVar) {
        return w8bVar.a(this);
    }

    @Override // defpackage.q8b
    public long q(u8b u8bVar) {
        g95.i(u8bVar, "field");
        Long h0 = h0(u8bVar);
        if (h0 == null) {
            i71 i71Var = this.d;
            if (i71Var != null && i71Var.G(u8bVar)) {
                return this.d.q(u8bVar);
            }
            gs5 gs5Var = this.e;
            if (gs5Var != null && gs5Var.G(u8bVar)) {
                return this.e.q(u8bVar);
            }
            throw new DateTimeException("Field not found: " + u8bVar);
        }
        return h0.longValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("DateTimeBuilder[");
        if (this.a.size() > 0) {
            sb.append("fields=");
            sb.append(this.a);
        }
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", ");
        sb.append(this.e);
        sb.append(']');
        return sb.toString();
    }

    public zm2 x0(mj9 mj9Var, Set<u8b> set) {
        i71 i71Var;
        if (set != null) {
            this.a.keySet().retainAll(set);
        }
        m0();
        l0(mj9Var);
        p0(mj9Var);
        if (z0(mj9Var)) {
            m0();
            l0(mj9Var);
            p0(mj9Var);
        }
        L0(mj9Var);
        e0();
        cy7 cy7Var = this.g;
        if (cy7Var != null && !cy7Var.c() && (i71Var = this.d) != null && this.e != null) {
            this.d = i71Var.l0(this.g);
            this.g = cy7.d;
        }
        E0();
        F0();
        return this;
    }
}
