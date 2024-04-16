package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: frc  reason: default package */
/* loaded from: classes2.dex */
public final class frc extends vpc {
    /* JADX INFO: Access modifiers changed from: protected */
    public frc() {
        this.a.add(ksc.APPLY);
        this.a.add(ksc.BLOCK);
        this.a.add(ksc.BREAK);
        this.a.add(ksc.CASE);
        this.a.add(ksc.DEFAULT);
        this.a.add(ksc.CONTINUE);
        this.a.add(ksc.DEFINE_FUNCTION);
        this.a.add(ksc.FN);
        this.a.add(ksc.IF);
        this.a.add(ksc.QUOTE);
        this.a.add(ksc.RETURN);
        this.a.add(ksc.SWITCH);
        this.a.add(ksc.TERNARY);
    }

    private static bpc c(xzc xzcVar, List<bpc> list) {
        eyc.k(ksc.FN, 2, list);
        bpc c = xzcVar.c(list.get(0));
        bpc c2 = xzcVar.c(list.get(1));
        if (c2 instanceof qnc) {
            List<bpc> F = ((qnc) c2).F();
            List<bpc> arrayList = new ArrayList<>();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new cpc(c.g(), F, arrayList, xzcVar);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", c2.getClass().getCanonicalName()));
    }

    @Override // defpackage.vpc
    public final bpc b(String str, xzc xzcVar, List<bpc> list) {
        bpc bpcVar;
        bpc bpcVar2;
        int i = 0;
        switch (lrc.a[eyc.e(str).ordinal()]) {
            case 1:
                eyc.g(ksc.APPLY, 3, list);
                bpc c = xzcVar.c(list.get(0));
                String g = xzcVar.c(list.get(1)).g();
                bpc c2 = xzcVar.c(list.get(2));
                if (c2 instanceof qnc) {
                    if (!g.isEmpty()) {
                        return c.t(g, xzcVar, ((qnc) c2).F());
                    }
                    throw new IllegalArgumentException("Function name for apply is undefined");
                }
                throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", c2.getClass().getCanonicalName()));
            case 2:
                return xzcVar.d().b(new qnc(list));
            case 3:
                eyc.g(ksc.BREAK, 0, list);
                return bpc.N4;
            case 4:
            case 5:
                if (!list.isEmpty()) {
                    bpc c3 = xzcVar.c(list.get(0));
                    if (c3 instanceof qnc) {
                        return xzcVar.b((qnc) c3);
                    }
                }
                return bpc.K4;
            case 6:
                eyc.g(ksc.BREAK, 0, list);
                return bpc.M4;
            case 7:
                eyc.k(ksc.DEFINE_FUNCTION, 2, list);
                cpc cpcVar = (cpc) c(xzcVar, list);
                if (cpcVar.a() == null) {
                    xzcVar.h("", cpcVar);
                } else {
                    xzcVar.h(cpcVar.a(), cpcVar);
                }
                return cpcVar;
            case 8:
                return c(xzcVar, list);
            case 9:
                eyc.k(ksc.IF, 2, list);
                bpc c4 = xzcVar.c(list.get(0));
                bpc c5 = xzcVar.c(list.get(1));
                if (list.size() > 2) {
                    bpcVar = xzcVar.c(list.get(2));
                } else {
                    bpcVar = null;
                }
                bpc bpcVar3 = bpc.K4;
                if (c4.d().booleanValue()) {
                    bpcVar2 = xzcVar.b((qnc) c5);
                } else if (bpcVar != null) {
                    bpcVar2 = xzcVar.b((qnc) bpcVar);
                } else {
                    bpcVar2 = bpcVar3;
                }
                if (bpcVar2 instanceof doc) {
                    return bpcVar2;
                }
                return bpcVar3;
            case 10:
                return new qnc(list);
            case 11:
                if (list.isEmpty()) {
                    return bpc.O4;
                }
                eyc.g(ksc.RETURN, 1, list);
                return new doc("return", xzcVar.c(list.get(0)));
            case 12:
                eyc.g(ksc.SWITCH, 3, list);
                bpc c6 = xzcVar.c(list.get(0));
                bpc c7 = xzcVar.c(list.get(1));
                bpc c8 = xzcVar.c(list.get(2));
                if (c7 instanceof qnc) {
                    if (c8 instanceof qnc) {
                        qnc qncVar = (qnc) c7;
                        qnc qncVar2 = (qnc) c8;
                        boolean z = false;
                        while (true) {
                            if (i < qncVar.z()) {
                                if (z || c6.equals(xzcVar.c(qncVar.v(i)))) {
                                    bpc c9 = xzcVar.c(qncVar2.v(i));
                                    if (c9 instanceof doc) {
                                        if (!((doc) c9).b().equals("break")) {
                                            return c9;
                                        }
                                    } else {
                                        z = true;
                                    }
                                }
                                i++;
                            } else if (qncVar.z() + 1 == qncVar2.z()) {
                                bpc c10 = xzcVar.c(qncVar2.v(qncVar.z()));
                                if (c10 instanceof doc) {
                                    String b = ((doc) c10).b();
                                    if (b.equals("return") || b.equals("continue")) {
                                        return c10;
                                    }
                                }
                            }
                        }
                        return bpc.K4;
                    }
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
            case 13:
                eyc.g(ksc.TERNARY, 3, list);
                if (xzcVar.c(list.get(0)).d().booleanValue()) {
                    return xzcVar.c(list.get(1));
                }
                return xzcVar.c(list.get(2));
            default:
                return super.a(str);
        }
    }
}
