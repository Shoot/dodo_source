package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes2.dex */
public final class y1 {
    public static bpc a(t0 t0Var) {
        if (t0Var == null) {
            return bpc.K4;
        }
        int i = i1.a[t0Var.I().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            String valueOf = String.valueOf(t0Var);
                            throw new IllegalStateException("Invalid entity: " + valueOf);
                        }
                        throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
                    }
                    List<t0> M = t0Var.M();
                    ArrayList arrayList = new ArrayList();
                    for (t0 t0Var2 : M) {
                        arrayList.add(a(t0Var2));
                    }
                    return new hpc(t0Var.K(), arrayList);
                } else if (t0Var.O()) {
                    return new tnc(Boolean.valueOf(t0Var.N()));
                } else {
                    return new tnc(null);
                }
            } else if (t0Var.P()) {
                return new znc(Double.valueOf(t0Var.H()));
            } else {
                return new znc(null);
            }
        } else if (t0Var.Q()) {
            return new gpc(t0Var.L());
        } else {
            return bpc.R4;
        }
    }

    public static bpc b(Object obj) {
        if (obj == null) {
            return bpc.L4;
        }
        if (obj instanceof String) {
            return new gpc((String) obj);
        }
        if (obj instanceof Double) {
            return new znc((Double) obj);
        }
        if (obj instanceof Long) {
            return new znc(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new znc(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new tnc((Boolean) obj);
        }
        if (obj instanceof Map) {
            yoc yocVar = new yoc();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                bpc b = b(map.get(obj2));
                if (obj2 != null) {
                    if (!(obj2 instanceof String)) {
                        obj2 = obj2.toString();
                    }
                    yocVar.u((String) obj2, b);
                }
            }
            return yocVar;
        } else if (obj instanceof List) {
            qnc qncVar = new qnc();
            for (Object obj3 : (List) obj) {
                qncVar.x(b(obj3));
            }
            return qncVar;
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }
}
