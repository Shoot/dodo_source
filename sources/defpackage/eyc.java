package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: eyc  reason: default package */
/* loaded from: classes2.dex */
public final class eyc {
    public static double a(double d) {
        int i;
        int i2;
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (!Double.isInfinite(d) && d != 0.0d && d != -0.0d) {
            if (i > 0) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            return i2 * Math.floor(Math.abs(d));
        }
        return d;
    }

    public static int b(xzc xzcVar) {
        int i = i(xzcVar.a("runtime.counter").f().doubleValue() + 1.0d);
        if (i <= 1000000) {
            xzcVar.h("runtime.counter", new znc(Double.valueOf(i)));
            return i;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static Object c(bpc bpcVar) {
        if (bpc.L4.equals(bpcVar)) {
            return null;
        }
        if (bpc.K4.equals(bpcVar)) {
            return "";
        }
        if (bpcVar instanceof yoc) {
            return d((yoc) bpcVar);
        }
        if (bpcVar instanceof qnc) {
            ArrayList arrayList = new ArrayList();
            Iterator<bpc> it = ((qnc) bpcVar).iterator();
            while (it.hasNext()) {
                Object c = c(it.next());
                if (c != null) {
                    arrayList.add(c);
                }
            }
            return arrayList;
        } else if (!bpcVar.f().isNaN()) {
            return bpcVar.f();
        } else {
            return bpcVar.g();
        }
    }

    public static Map<String, Object> d(yoc yocVar) {
        HashMap hashMap = new HashMap();
        for (String str : yocVar.a()) {
            Object c = c(yocVar.k(str));
            if (c != null) {
                hashMap.put(str, c);
            }
        }
        return hashMap;
    }

    public static ksc e(String str) {
        ksc kscVar;
        if (str != null && !str.isEmpty()) {
            kscVar = ksc.a(Integer.parseInt(str));
        } else {
            kscVar = null;
        }
        if (kscVar != null) {
            return kscVar;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static void f(String str, int i, List<bpc> list) {
        if (list.size() == i) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
    }

    public static void g(ksc kscVar, int i, List<bpc> list) {
        f(kscVar.name(), i, list);
    }

    public static boolean h(bpc bpcVar, bpc bpcVar2) {
        if (!bpcVar.getClass().equals(bpcVar2.getClass())) {
            return false;
        }
        if ((bpcVar instanceof upc) || (bpcVar instanceof uoc)) {
            return true;
        }
        if (bpcVar instanceof znc) {
            if (Double.isNaN(bpcVar.f().doubleValue()) || Double.isNaN(bpcVar2.f().doubleValue())) {
                return false;
            }
            return bpcVar.f().equals(bpcVar2.f());
        } else if (bpcVar instanceof gpc) {
            return bpcVar.g().equals(bpcVar2.g());
        } else {
            if (bpcVar instanceof tnc) {
                return bpcVar.d().equals(bpcVar2.d());
            }
            if (bpcVar != bpcVar2) {
                return false;
            }
            return true;
        }
    }

    public static int i(double d) {
        int i;
        int i2;
        if (!Double.isNaN(d) && !Double.isInfinite(d) && d != 0.0d) {
            if (i > 0) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            return (int) ((i2 * Math.floor(Math.abs(d))) % 4.294967296E9d);
        }
        return 0;
    }

    public static void j(String str, int i, List<bpc> list) {
        if (list.size() >= i) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
    }

    public static void k(ksc kscVar, int i, List<bpc> list) {
        j(kscVar.name(), i, list);
    }

    public static boolean l(bpc bpcVar) {
        if (bpcVar == null) {
            return false;
        }
        Double f = bpcVar.f();
        if (f.isNaN() || f.doubleValue() < 0.0d || !f.equals(Double.valueOf(Math.floor(f.doubleValue())))) {
            return false;
        }
        return true;
    }

    public static long m(double d) {
        return i(d) & 4294967295L;
    }

    public static void n(String str, int i, List<bpc> list) {
        if (list.size() <= i) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
    }
}
