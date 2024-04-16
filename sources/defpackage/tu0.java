package defpackage;

import java.util.ArrayList;
/* compiled from: Chain.java */
/* renamed from: tu0  reason: default package */
/* loaded from: classes.dex */
public class tu0 {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r7 == 2) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
        if (r7 == 2) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0261 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x051d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x03a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:334:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void a(defpackage.mr1 r37, defpackage.gq5 r38, int r39, int r40, defpackage.vu0 r41) {
        /*
            Method dump skipped, instructions count: 1342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tu0.a(mr1, gq5, int, int, vu0):void");
    }

    public static void b(mr1 mr1Var, gq5 gq5Var, ArrayList<lr1> arrayList, int i) {
        int i2;
        vu0[] vu0VarArr;
        int i3;
        if (i == 0) {
            i2 = mr1Var.e1;
            vu0VarArr = mr1Var.h1;
            i3 = 0;
        } else {
            i2 = mr1Var.f1;
            vu0VarArr = mr1Var.g1;
            i3 = 2;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            vu0 vu0Var = vu0VarArr[i4];
            vu0Var.a();
            if (arrayList == null || arrayList.contains(vu0Var.a)) {
                a(mr1Var, gq5Var, i, i3, vu0Var);
            }
        }
    }
}
