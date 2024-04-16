package defpackage;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: isc  reason: default package */
/* loaded from: classes2.dex */
public final class isc extends vpc {
    /* JADX INFO: Access modifiers changed from: protected */
    public isc() {
        this.a.add(ksc.ASSIGN);
        this.a.add(ksc.CONST);
        this.a.add(ksc.CREATE_ARRAY);
        this.a.add(ksc.CREATE_OBJECT);
        this.a.add(ksc.EXPRESSION_LIST);
        this.a.add(ksc.GET);
        this.a.add(ksc.GET_INDEX);
        this.a.add(ksc.GET_PROPERTY);
        this.a.add(ksc.NULL);
        this.a.add(ksc.SET_PROPERTY);
        this.a.add(ksc.TYPEOF);
        this.a.add(ksc.UNDEFINED);
        this.a.add(ksc.VAR);
    }

    @Override // defpackage.vpc
    public final bpc b(String str, xzc xzcVar, List<bpc> list) {
        String str2;
        int i = 0;
        switch (fsc.a[eyc.e(str).ordinal()]) {
            case 1:
                eyc.g(ksc.ASSIGN, 2, list);
                bpc c = xzcVar.c(list.get(0));
                if (c instanceof gpc) {
                    if (xzcVar.g(c.g())) {
                        bpc c2 = xzcVar.c(list.get(1));
                        xzcVar.h(c.g(), c2);
                        return c2;
                    }
                    throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", c.g()));
                }
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", c.getClass().getCanonicalName()));
            case 2:
                eyc.k(ksc.CONST, 2, list);
                if (list.size() % 2 == 0) {
                    for (int i2 = 0; i2 < list.size() - 1; i2 += 2) {
                        bpc c3 = xzcVar.c(list.get(i2));
                        if (c3 instanceof gpc) {
                            xzcVar.f(c3.g(), xzcVar.c(list.get(i2 + 1)));
                        } else {
                            throw new IllegalArgumentException(String.format("Expected string for const name. got %s", c3.getClass().getCanonicalName()));
                        }
                    }
                    return bpc.K4;
                }
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            case 3:
                if (list.isEmpty()) {
                    return new qnc();
                }
                qnc qncVar = new qnc();
                for (bpc bpcVar : list) {
                    bpc c4 = xzcVar.c(bpcVar);
                    if (!(c4 instanceof doc)) {
                        qncVar.C(i, c4);
                        i++;
                    } else {
                        throw new IllegalStateException("Failed to evaluate array element");
                    }
                }
                return qncVar;
            case 4:
                if (list.isEmpty()) {
                    return new yoc();
                }
                if (list.size() % 2 == 0) {
                    yoc yocVar = new yoc();
                    while (i < list.size() - 1) {
                        bpc c5 = xzcVar.c(list.get(i));
                        bpc c6 = xzcVar.c(list.get(i + 1));
                        if (!(c5 instanceof doc) && !(c6 instanceof doc)) {
                            yocVar.u(c5.g(), c6);
                            i += 2;
                        } else {
                            throw new IllegalStateException("Failed to evaluate map entry");
                        }
                    }
                    return yocVar;
                }
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            case 5:
                eyc.k(ksc.EXPRESSION_LIST, 1, list);
                bpc bpcVar2 = bpc.K4;
                while (i < list.size()) {
                    bpcVar2 = xzcVar.c(list.get(i));
                    if (bpcVar2 instanceof doc) {
                        throw new IllegalStateException("ControlValue cannot be in an expression list");
                    }
                    i++;
                }
                return bpcVar2;
            case 6:
                eyc.g(ksc.GET, 1, list);
                bpc c7 = xzcVar.c(list.get(0));
                if (c7 instanceof gpc) {
                    return xzcVar.a(c7.g());
                }
                throw new IllegalArgumentException(String.format("Expected string for get var. got %s", c7.getClass().getCanonicalName()));
            case 7:
            case 8:
                eyc.g(ksc.GET_PROPERTY, 2, list);
                bpc c8 = xzcVar.c(list.get(0));
                bpc c9 = xzcVar.c(list.get(1));
                if ((c8 instanceof qnc) && eyc.l(c9)) {
                    return ((qnc) c8).v(c9.f().intValue());
                }
                if (c8 instanceof eoc) {
                    return ((eoc) c8).k(c9.g());
                }
                if (c8 instanceof gpc) {
                    if ("length".equals(c9.g())) {
                        return new znc(Double.valueOf(c8.g().length()));
                    }
                    if (eyc.l(c9) && c9.f().doubleValue() < c8.g().length()) {
                        return new gpc(String.valueOf(c8.g().charAt(c9.f().intValue())));
                    }
                }
                return bpc.K4;
            case 9:
                eyc.g(ksc.NULL, 0, list);
                return bpc.L4;
            case 10:
                eyc.g(ksc.SET_PROPERTY, 3, list);
                bpc c10 = xzcVar.c(list.get(0));
                bpc c11 = xzcVar.c(list.get(1));
                bpc c12 = xzcVar.c(list.get(2));
                if (c10 != bpc.K4 && c10 != bpc.L4) {
                    if ((c10 instanceof qnc) && (c11 instanceof znc)) {
                        ((qnc) c10).C(c11.f().intValue(), c12);
                    } else if (c10 instanceof eoc) {
                        ((eoc) c10).u(c11.g(), c12);
                    }
                    return c12;
                }
                throw new IllegalStateException(String.format("Can't set property %s of %s", c11.g(), c10.g()));
            case 11:
                eyc.g(ksc.TYPEOF, 1, list);
                bpc c13 = xzcVar.c(list.get(0));
                if (c13 instanceof upc) {
                    str2 = "undefined";
                } else if (c13 instanceof tnc) {
                    str2 = "boolean";
                } else if (c13 instanceof znc) {
                    str2 = "number";
                } else if (c13 instanceof gpc) {
                    str2 = "string";
                } else if (c13 instanceof cpc) {
                    str2 = "function";
                } else if ((c13 instanceof hpc) || (c13 instanceof doc)) {
                    throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", c13));
                } else {
                    str2 = "object";
                }
                return new gpc(str2);
            case 12:
                eyc.g(ksc.UNDEFINED, 0, list);
                return bpc.K4;
            case 13:
                eyc.k(ksc.VAR, 1, list);
                for (bpc bpcVar3 : list) {
                    bpc c14 = xzcVar.c(bpcVar3);
                    if (c14 instanceof gpc) {
                        xzcVar.e(c14.g(), bpc.K4);
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", c14.getClass().getCanonicalName()));
                    }
                }
                return bpc.K4;
            default:
                return super.a(str);
        }
    }
}
