package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: jrc  reason: default package */
/* loaded from: classes2.dex */
public final class jrc {
    private static qnc a(qnc qncVar, xzc xzcVar, ioc iocVar) {
        return b(qncVar, xzcVar, iocVar, null, null);
    }

    private static qnc b(qnc qncVar, xzc xzcVar, ioc iocVar, Boolean bool, Boolean bool2) {
        qnc qncVar2 = new qnc();
        Iterator<Integer> E = qncVar.E();
        while (E.hasNext()) {
            int intValue = E.next().intValue();
            if (qncVar.D(intValue)) {
                bpc b = iocVar.b(xzcVar, Arrays.asList(qncVar.v(intValue), new znc(Double.valueOf(intValue)), qncVar));
                if (b.d().equals(bool)) {
                    return qncVar2;
                }
                if (bool2 == null || b.d().equals(bool2)) {
                    qncVar2.C(intValue, b);
                }
            }
        }
        return qncVar2;
    }

    public static bpc c(String str, qnc qncVar, xzc xzcVar, List<bpc> list) {
        String str2;
        ioc iocVar;
        double min;
        xzc xzcVar2;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1776922004:
                if (str.equals("toString")) {
                    c = 0;
                    break;
                }
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    c = 1;
                    break;
                }
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    c = 2;
                    break;
                }
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    c = 3;
                    break;
                }
                break;
            case -895859076:
                if (str.equals("splice")) {
                    c = 4;
                    break;
                }
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    c = 5;
                    break;
                }
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c = 6;
                    break;
                }
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    c = 7;
                    break;
                }
                break;
            case 107868:
                if (str.equals("map")) {
                    c = '\b';
                    break;
                }
                break;
            case 111185:
                if (str.equals("pop")) {
                    c = '\t';
                    break;
                }
                break;
            case 3267882:
                if (str.equals("join")) {
                    c = '\n';
                    break;
                }
                break;
            case 3452698:
                if (str.equals("push")) {
                    c = 11;
                    break;
                }
                break;
            case 3536116:
                if (str.equals("some")) {
                    c = '\f';
                    break;
                }
                break;
            case 3536286:
                if (str.equals("sort")) {
                    c = '\r';
                    break;
                }
                break;
            case 96891675:
                if (str.equals("every")) {
                    c = 14;
                    break;
                }
                break;
            case 109407362:
                if (str.equals("shift")) {
                    c = 15;
                    break;
                }
                break;
            case 109526418:
                if (str.equals("slice")) {
                    c = 16;
                    break;
                }
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    c = 17;
                    break;
                }
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    c = 18;
                    break;
                }
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c = 19;
                    break;
                }
                break;
        }
        double d = 0.0d;
        switch (c) {
            case 0:
                eyc.f("toString", 0, list);
                return new gpc(qncVar.toString());
            case 1:
                qnc qncVar2 = (qnc) qncVar.c();
                if (!list.isEmpty()) {
                    for (bpc bpcVar : list) {
                        bpc c2 = xzcVar.c(bpcVar);
                        if (!(c2 instanceof doc)) {
                            int z = qncVar2.z();
                            if (c2 instanceof qnc) {
                                qnc qncVar3 = (qnc) c2;
                                Iterator<Integer> E = qncVar3.E();
                                while (E.hasNext()) {
                                    Integer next = E.next();
                                    qncVar2.C(next.intValue() + z, qncVar3.v(next.intValue()));
                                }
                            } else {
                                qncVar2.C(z, c2);
                            }
                        } else {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                    }
                }
                return qncVar2;
            case 2:
                eyc.f("filter", 1, list);
                bpc c3 = xzcVar.c(list.get(0));
                if (c3 instanceof cpc) {
                    if (qncVar.a() == 0) {
                        return new qnc();
                    }
                    qnc qncVar4 = (qnc) qncVar.c();
                    qnc b = b(qncVar, xzcVar, (cpc) c3, null, Boolean.TRUE);
                    qnc qncVar5 = new qnc();
                    Iterator<Integer> E2 = b.E();
                    while (E2.hasNext()) {
                        qncVar5.x(qncVar4.v(E2.next().intValue()));
                    }
                    return qncVar5;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 3:
                return d(qncVar, xzcVar, list, true);
            case 4:
                if (list.isEmpty()) {
                    return new qnc();
                }
                int a = (int) eyc.a(xzcVar.c(list.get(0)).f().doubleValue());
                if (a < 0) {
                    a = Math.max(0, a + qncVar.z());
                } else if (a > qncVar.z()) {
                    a = qncVar.z();
                }
                int z2 = qncVar.z();
                qnc qncVar6 = new qnc();
                if (list.size() > 1) {
                    int max = Math.max(0, (int) eyc.a(xzcVar.c(list.get(1)).f().doubleValue()));
                    if (max > 0) {
                        for (int i = a; i < Math.min(z2, a + max); i++) {
                            qncVar6.x(qncVar.v(a));
                            qncVar.B(a);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i2 = 2; i2 < list.size(); i2++) {
                            bpc c4 = xzcVar.c(list.get(i2));
                            if (!(c4 instanceof doc)) {
                                qncVar.w((a + i2) - 2, c4);
                            } else {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                        }
                    }
                    return qncVar6;
                }
                while (a < z2) {
                    qncVar6.x(qncVar.v(a));
                    qncVar.C(a, null);
                    a++;
                }
                return qncVar6;
            case 5:
                eyc.f("forEach", 1, list);
                bpc c5 = xzcVar.c(list.get(0));
                if (c5 instanceof cpc) {
                    if (qncVar.a() == 0) {
                        return bpc.K4;
                    }
                    a(qncVar, xzcVar, (cpc) c5);
                    return bpc.K4;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 6:
                eyc.n("lastIndexOf", 2, list);
                bpc bpcVar2 = bpc.K4;
                if (!list.isEmpty()) {
                    bpcVar2 = xzcVar.c(list.get(0));
                }
                double z3 = qncVar.z() - 1;
                if (list.size() > 1) {
                    bpc c6 = xzcVar.c(list.get(1));
                    if (Double.isNaN(c6.f().doubleValue())) {
                        z3 = qncVar.z() - 1;
                    } else {
                        z3 = eyc.a(c6.f().doubleValue());
                    }
                    if (z3 < 0.0d) {
                        z3 += qncVar.z();
                    }
                }
                if (z3 < 0.0d) {
                    return new znc(Double.valueOf(-1.0d));
                }
                for (int min2 = (int) Math.min(qncVar.z(), z3); min2 >= 0; min2--) {
                    if (qncVar.D(min2) && eyc.h(qncVar.v(min2), bpcVar2)) {
                        return new znc(Double.valueOf(min2));
                    }
                }
                return new znc(Double.valueOf(-1.0d));
            case 7:
                if (!list.isEmpty()) {
                    qnc qncVar7 = new qnc();
                    for (bpc bpcVar3 : list) {
                        bpc c7 = xzcVar.c(bpcVar3);
                        if (!(c7 instanceof doc)) {
                            qncVar7.x(c7);
                        } else {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                    }
                    int z4 = qncVar7.z();
                    Iterator<Integer> E3 = qncVar.E();
                    while (E3.hasNext()) {
                        Integer next2 = E3.next();
                        qncVar7.C(next2.intValue() + z4, qncVar.v(next2.intValue()));
                    }
                    qncVar.G();
                    Iterator<Integer> E4 = qncVar7.E();
                    while (E4.hasNext()) {
                        Integer next3 = E4.next();
                        qncVar.C(next3.intValue(), qncVar7.v(next3.intValue()));
                    }
                }
                return new znc(Double.valueOf(qncVar.z()));
            case '\b':
                eyc.f("map", 1, list);
                bpc c8 = xzcVar.c(list.get(0));
                if (c8 instanceof cpc) {
                    if (qncVar.z() == 0) {
                        return new qnc();
                    }
                    return a(qncVar, xzcVar, (cpc) c8);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\t':
                eyc.f("pop", 0, list);
                int z5 = qncVar.z();
                if (z5 == 0) {
                    return bpc.K4;
                }
                int i3 = z5 - 1;
                bpc v = qncVar.v(i3);
                qncVar.B(i3);
                return v;
            case '\n':
                eyc.n("join", 1, list);
                if (qncVar.z() == 0) {
                    return bpc.R4;
                }
                if (!list.isEmpty()) {
                    bpc c9 = xzcVar.c(list.get(0));
                    if (!(c9 instanceof uoc) && !(c9 instanceof upc)) {
                        str2 = c9.g();
                    } else {
                        str2 = "";
                    }
                } else {
                    str2 = ",";
                }
                return new gpc(qncVar.A(str2));
            case 11:
                if (!list.isEmpty()) {
                    for (bpc bpcVar4 : list) {
                        qncVar.x(xzcVar.c(bpcVar4));
                    }
                }
                return new znc(Double.valueOf(qncVar.z()));
            case '\f':
                eyc.f("some", 1, list);
                bpc c10 = xzcVar.c(list.get(0));
                if (c10 instanceof ioc) {
                    if (qncVar.z() != 0) {
                        ioc iocVar2 = (ioc) c10;
                        Iterator<Integer> E5 = qncVar.E();
                        while (E5.hasNext()) {
                            int intValue = E5.next().intValue();
                            if (qncVar.D(intValue) && iocVar2.b(xzcVar, Arrays.asList(qncVar.v(intValue), new znc(Double.valueOf(intValue)), qncVar)).d().booleanValue()) {
                                return bpc.P4;
                            }
                        }
                    }
                    return bpc.Q4;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case '\r':
                eyc.n("sort", 1, list);
                if (qncVar.z() >= 2) {
                    List<bpc> F = qncVar.F();
                    if (!list.isEmpty()) {
                        bpc c11 = xzcVar.c(list.get(0));
                        if (c11 instanceof ioc) {
                            iocVar = (ioc) c11;
                        } else {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                    } else {
                        iocVar = null;
                    }
                    Collections.sort(F, new prc(iocVar, xzcVar));
                    qncVar.G();
                    int i4 = 0;
                    for (bpc bpcVar5 : F) {
                        qncVar.C(i4, bpcVar5);
                        i4++;
                    }
                }
                return qncVar;
            case 14:
                eyc.f("every", 1, list);
                bpc c12 = xzcVar.c(list.get(0));
                if (c12 instanceof cpc) {
                    if (qncVar.z() != 0 && b(qncVar, xzcVar, (cpc) c12, Boolean.FALSE, Boolean.TRUE).z() != qncVar.z()) {
                        return bpc.Q4;
                    }
                    return bpc.P4;
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 15:
                eyc.f("shift", 0, list);
                if (qncVar.z() == 0) {
                    return bpc.K4;
                }
                bpc v2 = qncVar.v(0);
                qncVar.B(0);
                return v2;
            case 16:
                eyc.n("slice", 2, list);
                if (list.isEmpty()) {
                    return qncVar.c();
                }
                double z6 = qncVar.z();
                double a2 = eyc.a(xzcVar.c(list.get(0)).f().doubleValue());
                if (a2 < 0.0d) {
                    min = Math.max(a2 + z6, 0.0d);
                } else {
                    min = Math.min(a2, z6);
                }
                if (list.size() == 2) {
                    double a3 = eyc.a(xzcVar.c(list.get(1)).f().doubleValue());
                    if (a3 < 0.0d) {
                        z6 = Math.max(z6 + a3, 0.0d);
                    } else {
                        z6 = Math.min(z6, a3);
                    }
                }
                qnc qncVar8 = new qnc();
                for (int i5 = (int) min; i5 < z6; i5++) {
                    qncVar8.x(qncVar.v(i5));
                }
                return qncVar8;
            case 17:
                return d(qncVar, xzcVar, list, false);
            case 18:
                eyc.f("reverse", 0, list);
                int z7 = qncVar.z();
                if (z7 != 0) {
                    for (int i6 = 0; i6 < z7 / 2; i6++) {
                        if (qncVar.D(i6)) {
                            bpc v3 = qncVar.v(i6);
                            qncVar.C(i6, null);
                            int i7 = (z7 - 1) - i6;
                            if (qncVar.D(i7)) {
                                qncVar.C(i6, qncVar.v(i7));
                            }
                            qncVar.C(i7, v3);
                        }
                    }
                }
                return qncVar;
            case 19:
                eyc.n("indexOf", 2, list);
                bpc bpcVar6 = bpc.K4;
                if (!list.isEmpty()) {
                    xzcVar2 = xzcVar;
                    bpcVar6 = xzcVar2.c(list.get(0));
                } else {
                    xzcVar2 = xzcVar;
                }
                if (list.size() > 1) {
                    double a4 = eyc.a(xzcVar2.c(list.get(1)).f().doubleValue());
                    if (a4 >= qncVar.z()) {
                        return new znc(Double.valueOf(-1.0d));
                    }
                    if (a4 < 0.0d) {
                        d = qncVar.z() + a4;
                    } else {
                        d = a4;
                    }
                }
                Iterator<Integer> E6 = qncVar.E();
                while (E6.hasNext()) {
                    int intValue2 = E6.next().intValue();
                    double d2 = intValue2;
                    if (d2 >= d && eyc.h(qncVar.v(intValue2), bpcVar6)) {
                        return new znc(Double.valueOf(d2));
                    }
                }
                return new znc(Double.valueOf(-1.0d));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    private static bpc d(qnc qncVar, xzc xzcVar, List<bpc> list, boolean z) {
        bpc bpcVar;
        int i;
        int i2;
        int i3;
        eyc.j("reduce", 1, list);
        eyc.n("reduce", 2, list);
        bpc c = xzcVar.c(list.get(0));
        if (c instanceof ioc) {
            if (list.size() == 2) {
                bpcVar = xzcVar.c(list.get(1));
                if (bpcVar instanceof doc) {
                    throw new IllegalArgumentException("Failed to parse initial value");
                }
            } else if (qncVar.z() != 0) {
                bpcVar = null;
            } else {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            ioc iocVar = (ioc) c;
            int z2 = qncVar.z();
            if (z) {
                i = 0;
            } else {
                i = z2 - 1;
            }
            if (z) {
                i2 = z2 - 1;
            } else {
                i2 = 0;
            }
            if (z) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            if (bpcVar == null) {
                bpcVar = qncVar.v(i);
                i += i3;
            }
            while ((i2 - i) * i3 >= 0) {
                if (qncVar.D(i)) {
                    bpcVar = iocVar.b(xzcVar, Arrays.asList(bpcVar, qncVar.v(i), new znc(Double.valueOf(i)), qncVar));
                    if (bpcVar instanceof doc) {
                        throw new IllegalStateException("Reduce operation failed");
                    }
                    i += i3;
                } else {
                    i += i3;
                }
            }
            return bpcVar;
        }
        throw new IllegalArgumentException("Callback should be a method");
    }
}
