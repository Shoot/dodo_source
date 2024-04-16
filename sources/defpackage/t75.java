package defpackage;

import java.io.Serializable;
import java.util.Map;
import org.threeten.bp.DateTimeException;
/* compiled from: IsoChronology.java */
/* renamed from: t75  reason: default package */
/* loaded from: classes3.dex */
public final class t75 extends p71 implements Serializable {
    public static final t75 e = new t75();

    private t75() {
    }

    private Object readResolve() {
        return e;
    }

    @Override // defpackage.p71
    /* renamed from: Q */
    public ds5 i(int i, int i2, int i3) {
        return ds5.X0(i, i2, i3);
    }

    @Override // defpackage.p71
    /* renamed from: T */
    public ds5 k(q8b q8bVar) {
        return ds5.E0(q8bVar);
    }

    @Override // defpackage.p71
    /* renamed from: W */
    public u75 u(int i) {
        return u75.a(i);
    }

    public boolean b0(long j) {
        if ((3 & j) == 0 && (j % 100 != 0 || j % 400 == 0)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.p71
    /* renamed from: e0 */
    public es5 G(q8b q8bVar) {
        return es5.J0(q8bVar);
    }

    public ds5 f0(Map<u8b, Long> map, mj9 mj9Var) {
        long longValue;
        long o;
        h71 h71Var = h71.y;
        if (map.containsKey(h71Var)) {
            return ds5.Z0(map.remove(h71Var).longValue());
        }
        h71 h71Var2 = h71.I;
        Long remove = map.remove(h71Var2);
        if (remove != null) {
            if (mj9Var != mj9.LENIENT) {
                h71Var2.E(remove.longValue());
            }
            M(map, h71.B, g95.g(remove.longValue(), 12) + 1);
            M(map, h71.Y, g95.e(remove.longValue(), 12L));
        }
        h71 h71Var3 = h71.X;
        Long remove2 = map.remove(h71Var3);
        if (remove2 != null) {
            if (mj9Var != mj9.LENIENT) {
                h71Var3.E(remove2.longValue());
            }
            Long remove3 = map.remove(h71.Z);
            if (remove3 == null) {
                h71 h71Var4 = h71.Y;
                Long l = map.get(h71Var4);
                if (mj9Var == mj9.STRICT) {
                    if (l != null) {
                        if (l.longValue() > 0) {
                            o = remove2.longValue();
                        } else {
                            o = g95.o(1L, remove2.longValue());
                        }
                        M(map, h71Var4, o);
                    } else {
                        map.put(h71Var3, remove2);
                    }
                } else {
                    if (l != null && l.longValue() <= 0) {
                        longValue = g95.o(1L, remove2.longValue());
                    } else {
                        longValue = remove2.longValue();
                    }
                    M(map, h71Var4, longValue);
                }
            } else if (remove3.longValue() == 1) {
                M(map, h71.Y, remove2.longValue());
            } else if (remove3.longValue() == 0) {
                M(map, h71.Y, g95.o(1L, remove2.longValue()));
            } else {
                throw new DateTimeException("Invalid value for era: " + remove3);
            }
        } else {
            h71 h71Var5 = h71.Z;
            if (map.containsKey(h71Var5)) {
                h71Var5.E(map.get(h71Var5).longValue());
            }
        }
        h71 h71Var6 = h71.Y;
        if (map.containsKey(h71Var6)) {
            h71 h71Var7 = h71.B;
            if (map.containsKey(h71Var7)) {
                h71 h71Var8 = h71.w;
                if (map.containsKey(h71Var8)) {
                    int x = h71Var6.x(map.remove(h71Var6).longValue());
                    int p = g95.p(map.remove(h71Var7).longValue());
                    int p2 = g95.p(map.remove(h71Var8).longValue());
                    if (mj9Var == mj9.LENIENT) {
                        return ds5.X0(x, 1, 1).e1(g95.n(p, 1)).d1(g95.n(p2, 1));
                    } else if (mj9Var == mj9.SMART) {
                        h71Var8.E(p2);
                        if (p != 4 && p != 6 && p != 9 && p != 11) {
                            if (p == 2) {
                                p2 = Math.min(p2, po6.FEBRUARY.u(lcc.Q(x)));
                            }
                        } else {
                            p2 = Math.min(p2, 30);
                        }
                        return ds5.X0(x, p, p2);
                    } else {
                        return ds5.X0(x, p, p2);
                    }
                }
                h71 h71Var9 = h71.z;
                if (map.containsKey(h71Var9)) {
                    h71 h71Var10 = h71.u;
                    if (map.containsKey(h71Var10)) {
                        int x2 = h71Var6.x(map.remove(h71Var6).longValue());
                        if (mj9Var == mj9.LENIENT) {
                            long o2 = g95.o(map.remove(h71Var7).longValue(), 1L);
                            long o3 = g95.o(map.remove(h71Var9).longValue(), 1L);
                            return ds5.X0(x2, 1, 1).e1(o2).f1(o3).d1(g95.o(map.remove(h71Var10).longValue(), 1L));
                        }
                        int x3 = h71Var7.x(map.remove(h71Var7).longValue());
                        ds5 d1 = ds5.X0(x2, x3, 1).d1(((h71Var9.x(map.remove(h71Var9).longValue()) - 1) * 7) + (h71Var10.x(map.remove(h71Var10).longValue()) - 1));
                        if (mj9Var == mj9.STRICT && d1.w(h71Var7) != x3) {
                            throw new DateTimeException("Strict mode rejected date parsed to a different month");
                        }
                        return d1;
                    }
                    h71 h71Var11 = h71.t;
                    if (map.containsKey(h71Var11)) {
                        int x4 = h71Var6.x(map.remove(h71Var6).longValue());
                        if (mj9Var == mj9.LENIENT) {
                            long o4 = g95.o(map.remove(h71Var7).longValue(), 1L);
                            long o5 = g95.o(map.remove(h71Var9).longValue(), 1L);
                            return ds5.X0(x4, 1, 1).e1(o4).f1(o5).d1(g95.o(map.remove(h71Var11).longValue(), 1L));
                        }
                        int x5 = h71Var7.x(map.remove(h71Var7).longValue());
                        ds5 s = ds5.X0(x4, x5, 1).f1(h71Var9.x(map.remove(h71Var9).longValue()) - 1).s(s8b.a(hn2.k(h71Var11.x(map.remove(h71Var11).longValue()))));
                        if (mj9Var == mj9.STRICT && s.w(h71Var7) != x5) {
                            throw new DateTimeException("Strict mode rejected date parsed to a different month");
                        }
                        return s;
                    }
                }
            }
            h71 h71Var12 = h71.x;
            if (map.containsKey(h71Var12)) {
                int x6 = h71Var6.x(map.remove(h71Var6).longValue());
                if (mj9Var == mj9.LENIENT) {
                    return ds5.a1(x6, 1).d1(g95.o(map.remove(h71Var12).longValue(), 1L));
                }
                return ds5.a1(x6, h71Var12.x(map.remove(h71Var12).longValue()));
            }
            h71 h71Var13 = h71.A;
            if (map.containsKey(h71Var13)) {
                h71 h71Var14 = h71.v;
                if (map.containsKey(h71Var14)) {
                    int x7 = h71Var6.x(map.remove(h71Var6).longValue());
                    if (mj9Var == mj9.LENIENT) {
                        long o6 = g95.o(map.remove(h71Var13).longValue(), 1L);
                        return ds5.X0(x7, 1, 1).f1(o6).d1(g95.o(map.remove(h71Var14).longValue(), 1L));
                    }
                    ds5 d12 = ds5.X0(x7, 1, 1).d1(((h71Var13.x(map.remove(h71Var13).longValue()) - 1) * 7) + (h71Var14.x(map.remove(h71Var14).longValue()) - 1));
                    if (mj9Var == mj9.STRICT && d12.w(h71Var6) != x7) {
                        throw new DateTimeException("Strict mode rejected date parsed to a different year");
                    }
                    return d12;
                }
                h71 h71Var15 = h71.t;
                if (map.containsKey(h71Var15)) {
                    int x8 = h71Var6.x(map.remove(h71Var6).longValue());
                    if (mj9Var == mj9.LENIENT) {
                        long o7 = g95.o(map.remove(h71Var13).longValue(), 1L);
                        return ds5.X0(x8, 1, 1).f1(o7).d1(g95.o(map.remove(h71Var15).longValue(), 1L));
                    }
                    ds5 s2 = ds5.X0(x8, 1, 1).f1(h71Var13.x(map.remove(h71Var13).longValue()) - 1).s(s8b.a(hn2.k(h71Var15.x(map.remove(h71Var15).longValue()))));
                    if (mj9Var == mj9.STRICT && s2.w(h71Var6) != x8) {
                        throw new DateTimeException("Strict mode rejected date parsed to a different month");
                    }
                    return s2;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.p71
    public String getId() {
        return "ISO";
    }

    @Override // defpackage.p71
    /* renamed from: h0 */
    public ddc P(b55 b55Var, vcc vccVar) {
        return ddc.N0(b55Var, vccVar);
    }

    @Override // defpackage.p71
    public String x() {
        return "iso8601";
    }
}
