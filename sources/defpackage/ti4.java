package defpackage;

import defpackage.lr1;
import java.util.ArrayList;
/* compiled from: Grouping.java */
/* renamed from: ti4  reason: default package */
/* loaded from: classes.dex */
public class ti4 {
    public static s4c a(lr1 lr1Var, int i, ArrayList<s4c> arrayList, s4c s4cVar) {
        int i2;
        int n1;
        if (i == 0) {
            i2 = lr1Var.Q0;
        } else {
            i2 = lr1Var.R0;
        }
        int i3 = 0;
        if (i2 != -1 && (s4cVar == null || i2 != s4cVar.b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                s4c s4cVar2 = arrayList.get(i4);
                if (s4cVar2.c() == i2) {
                    if (s4cVar != null) {
                        s4cVar.g(i, s4cVar2);
                        arrayList.remove(s4cVar);
                    }
                    s4cVar = s4cVar2;
                } else {
                    i4++;
                }
            }
        } else if (i2 != -1) {
            return s4cVar;
        }
        if (s4cVar == null) {
            if ((lr1Var instanceof eo4) && (n1 = ((eo4) lr1Var).n1(i)) != -1) {
                int i5 = 0;
                while (true) {
                    if (i5 >= arrayList.size()) {
                        break;
                    }
                    s4c s4cVar3 = arrayList.get(i5);
                    if (s4cVar3.c() == n1) {
                        s4cVar = s4cVar3;
                        break;
                    }
                    i5++;
                }
            }
            if (s4cVar == null) {
                s4cVar = new s4c(i);
            }
            arrayList.add(s4cVar);
        }
        if (s4cVar.a(lr1Var)) {
            if (lr1Var instanceof vi4) {
                vi4 vi4Var = (vi4) lr1Var;
                hr1 m1 = vi4Var.m1();
                if (vi4Var.n1() == 0) {
                    i3 = 1;
                }
                m1.c(i3, arrayList, s4cVar);
            }
            if (i == 0) {
                lr1Var.Q0 = s4cVar.c();
                lr1Var.P.c(i, arrayList, s4cVar);
                lr1Var.R.c(i, arrayList, s4cVar);
            } else {
                lr1Var.R0 = s4cVar.c();
                lr1Var.Q.c(i, arrayList, s4cVar);
                lr1Var.T.c(i, arrayList, s4cVar);
                lr1Var.S.c(i, arrayList, s4cVar);
            }
            lr1Var.W.c(i, arrayList, s4cVar);
        }
        return s4cVar;
    }

    private static s4c b(ArrayList<s4c> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            s4c s4cVar = arrayList.get(i2);
            if (i == s4cVar.b) {
                return s4cVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0392 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(defpackage.mr1 r16, defpackage.m90.b r17) {
        /*
            Method dump skipped, instructions count: 921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ti4.c(mr1, m90$b):boolean");
    }

    public static boolean d(lr1.b bVar, lr1.b bVar2, lr1.b bVar3, lr1.b bVar4) {
        boolean z;
        boolean z2;
        lr1.b bVar5;
        lr1.b bVar6;
        lr1.b bVar7 = lr1.b.FIXED;
        if (bVar3 != bVar7 && bVar3 != (bVar6 = lr1.b.WRAP_CONTENT) && (bVar3 != lr1.b.MATCH_PARENT || bVar == bVar6)) {
            z = false;
        } else {
            z = true;
        }
        if (bVar4 != bVar7 && bVar4 != (bVar5 = lr1.b.WRAP_CONTENT) && (bVar4 != lr1.b.MATCH_PARENT || bVar2 == bVar5)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }
}
