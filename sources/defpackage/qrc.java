package defpackage;

import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: qrc  reason: default package */
/* loaded from: classes2.dex */
public final class qrc extends vpc {
    /* JADX INFO: Access modifiers changed from: protected */
    public qrc() {
        this.a.add(ksc.FOR_IN);
        this.a.add(ksc.FOR_IN_CONST);
        this.a.add(ksc.FOR_IN_LET);
        this.a.add(ksc.FOR_LET);
        this.a.add(ksc.FOR_OF);
        this.a.add(ksc.FOR_OF_CONST);
        this.a.add(ksc.FOR_OF_LET);
        this.a.add(ksc.WHILE);
    }

    private static bpc c(xrc xrcVar, Iterator<bpc> it, bpc bpcVar) {
        if (it != null) {
            while (it.hasNext()) {
                bpc b = xrcVar.a(it.next()).b((qnc) bpcVar);
                if (b instanceof doc) {
                    doc docVar = (doc) b;
                    if ("break".equals(docVar.b())) {
                        return bpc.K4;
                    }
                    if ("return".equals(docVar.b())) {
                        return docVar;
                    }
                }
            }
        }
        return bpc.K4;
    }

    private static bpc d(xrc xrcVar, bpc bpcVar, bpc bpcVar2) {
        return c(xrcVar, bpcVar.h(), bpcVar2);
    }

    private static bpc e(xrc xrcVar, bpc bpcVar, bpc bpcVar2) {
        if (bpcVar instanceof Iterable) {
            return c(xrcVar, ((Iterable) bpcVar).iterator(), bpcVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override // defpackage.vpc
    public final bpc b(String str, xzc xzcVar, List<bpc> list) {
        switch (vrc.a[eyc.e(str).ordinal()]) {
            case 1:
                eyc.g(ksc.FOR_IN, 3, list);
                if (list.get(0) instanceof gpc) {
                    String g = list.get(0).g();
                    return d(new bsc(xzcVar, g), xzcVar.c(list.get(1)), xzcVar.c(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
            case 2:
                eyc.g(ksc.FOR_IN_CONST, 3, list);
                if (list.get(0) instanceof gpc) {
                    String g2 = list.get(0).g();
                    return d(new urc(xzcVar, g2), xzcVar.c(list.get(1)), xzcVar.c(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
            case 3:
                eyc.g(ksc.FOR_IN_LET, 3, list);
                if (list.get(0) instanceof gpc) {
                    String g3 = list.get(0).g();
                    return d(new zrc(xzcVar, g3), xzcVar.c(list.get(1)), xzcVar.c(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
            case 4:
                eyc.g(ksc.FOR_LET, 4, list);
                bpc c = xzcVar.c(list.get(0));
                if (c instanceof qnc) {
                    qnc qncVar = (qnc) c;
                    bpc bpcVar = list.get(1);
                    bpc bpcVar2 = list.get(2);
                    bpc c2 = xzcVar.c(list.get(3));
                    xzc d = xzcVar.d();
                    for (int i = 0; i < qncVar.z(); i++) {
                        String g4 = qncVar.v(i).g();
                        d.h(g4, xzcVar.a(g4));
                    }
                    while (xzcVar.c(bpcVar).d().booleanValue()) {
                        bpc b = xzcVar.b((qnc) c2);
                        if (b instanceof doc) {
                            doc docVar = (doc) b;
                            if (!"break".equals(docVar.b())) {
                                if ("return".equals(docVar.b())) {
                                    return docVar;
                                }
                            } else {
                                return bpc.K4;
                            }
                        }
                        xzc d2 = xzcVar.d();
                        for (int i2 = 0; i2 < qncVar.z(); i2++) {
                            String g5 = qncVar.v(i2).g();
                            d2.h(g5, d.a(g5));
                        }
                        d2.c(bpcVar2);
                        d = d2;
                    }
                    return bpc.K4;
                }
                throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
            case 5:
                eyc.g(ksc.FOR_OF, 3, list);
                if (list.get(0) instanceof gpc) {
                    String g6 = list.get(0).g();
                    return e(new bsc(xzcVar, g6), xzcVar.c(list.get(1)), xzcVar.c(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
            case 6:
                eyc.g(ksc.FOR_OF_CONST, 3, list);
                if (list.get(0) instanceof gpc) {
                    String g7 = list.get(0).g();
                    return e(new urc(xzcVar, g7), xzcVar.c(list.get(1)), xzcVar.c(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
            case 7:
                eyc.g(ksc.FOR_OF_LET, 3, list);
                if (list.get(0) instanceof gpc) {
                    String g8 = list.get(0).g();
                    return e(new zrc(xzcVar, g8), xzcVar.c(list.get(1)), xzcVar.c(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
            case 8:
                eyc.g(ksc.WHILE, 4, list);
                bpc bpcVar3 = list.get(0);
                bpc bpcVar4 = list.get(1);
                bpc c3 = xzcVar.c(list.get(3));
                if (xzcVar.c(list.get(2)).d().booleanValue()) {
                    bpc b2 = xzcVar.b((qnc) c3);
                    if (b2 instanceof doc) {
                        doc docVar2 = (doc) b2;
                        if (!"break".equals(docVar2.b())) {
                            if ("return".equals(docVar2.b())) {
                                return docVar2;
                            }
                        }
                        return bpc.K4;
                    }
                }
                while (xzcVar.c(bpcVar3).d().booleanValue()) {
                    bpc b3 = xzcVar.b((qnc) c3);
                    if (b3 instanceof doc) {
                        doc docVar3 = (doc) b3;
                        if (!"break".equals(docVar3.b())) {
                            if ("return".equals(docVar3.b())) {
                                return docVar3;
                            }
                        } else {
                            return bpc.K4;
                        }
                    }
                    xzcVar.c(bpcVar4);
                }
                return bpc.K4;
            default:
                return super.a(str);
        }
    }
}
