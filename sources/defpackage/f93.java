package defpackage;

import defpackage.xb5;
import java.io.IOException;
/* compiled from: DropShadowEffectParser.java */
/* renamed from: f93  reason: default package */
/* loaded from: classes.dex */
public class f93 {
    private static final xb5.a f = xb5.a.a("ef");
    private static final xb5.a g = xb5.a.a("nm", "v");
    private oj a;
    private pj b;
    private pj c;
    private pj d;
    private pj e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
        if (r0.equals("Opacity") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(defpackage.xb5 r6, defpackage.ez5 r7) throws java.io.IOException {
        /*
            r5 = this;
            r6.c()
            java.lang.String r0 = ""
        L5:
            boolean r1 = r6.j()
            if (r1 == 0) goto L90
            xb5$a r1 = defpackage.f93.g
            int r1 = r6.u(r1)
            if (r1 == 0) goto L8a
            r2 = 1
            if (r1 == r2) goto L1d
            r6.x()
            r6.y()
            goto L5
        L1d:
            r0.hashCode()
            int r1 = r0.hashCode()
            r3 = 0
            r4 = -1
            switch(r1) {
                case 353103893: goto L55;
                case 397447147: goto L4c;
                case 1041377119: goto L41;
                case 1379387491: goto L36;
                case 1383710113: goto L2b;
                default: goto L29;
            }
        L29:
            r2 = -1
            goto L5f
        L2b:
            java.lang.String r1 = "Softness"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L34
            goto L29
        L34:
            r2 = 4
            goto L5f
        L36:
            java.lang.String r1 = "Shadow Color"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L3f
            goto L29
        L3f:
            r2 = 3
            goto L5f
        L41:
            java.lang.String r1 = "Direction"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L4a
            goto L29
        L4a:
            r2 = 2
            goto L5f
        L4c:
            java.lang.String r1 = "Opacity"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L5f
            goto L29
        L55:
            java.lang.String r1 = "Distance"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L5e
            goto L29
        L5e:
            r2 = 0
        L5f:
            switch(r2) {
                case 0: goto L82;
                case 1: goto L7b;
                case 2: goto L74;
                case 3: goto L6d;
                case 4: goto L66;
                default: goto L62;
            }
        L62:
            r6.y()
            goto L5
        L66:
            pj r1 = defpackage.ek.e(r6, r7)
            r5.e = r1
            goto L5
        L6d:
            oj r1 = defpackage.ek.c(r6, r7)
            r5.a = r1
            goto L5
        L74:
            pj r1 = defpackage.ek.f(r6, r7, r3)
            r5.c = r1
            goto L5
        L7b:
            pj r1 = defpackage.ek.f(r6, r7, r3)
            r5.b = r1
            goto L5
        L82:
            pj r1 = defpackage.ek.e(r6, r7)
            r5.d = r1
            goto L5
        L8a:
            java.lang.String r0 = r6.o()
            goto L5
        L90:
            r6.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f93.a(xb5, ez5):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e93 b(xb5 xb5Var, ez5 ez5Var) throws IOException {
        pj pjVar;
        pj pjVar2;
        pj pjVar3;
        pj pjVar4;
        while (xb5Var.j()) {
            if (xb5Var.u(f) != 0) {
                xb5Var.x();
                xb5Var.y();
            } else {
                xb5Var.b();
                while (xb5Var.j()) {
                    a(xb5Var, ez5Var);
                }
                xb5Var.e();
            }
        }
        oj ojVar = this.a;
        if (ojVar != null && (pjVar = this.b) != null && (pjVar2 = this.c) != null && (pjVar3 = this.d) != null && (pjVar4 = this.e) != null) {
            return new e93(ojVar, pjVar, pjVar2, pjVar3, pjVar4);
        }
        return null;
    }
}
