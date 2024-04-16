package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.sm6;
import im.threads.business.transport.MessageAttributes;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: HitPathTracker.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001a¢\u0006\u0004\b2\u00103J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J7\u0010\u0012\u001a\u00020\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016ø\u0001\u0000J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J7\u0010\u0014\u001a\u00020\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0005H\u0016ø\u0001\u0000J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\u0006\u0010\u0016\u001a\u00020\u0007J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016R\u0017\u0010\u001e\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\u001f8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R#\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0%8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010*R\u0016\u0010.\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-R\u0016\u00101\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010-\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"Llz6;", "Ltz6;", "Lkd8;", "oldEvent", "newEvent", "", "l", "", "i", "", "Lvd8;", "Lwd8;", "changes", "Lom5;", "parentCoordinates", "Lu65;", "internalPointerEvent", "isInBounds", "f", e.a, "a", DateTokenConverter.CONVERTER_KEY, Image.TYPE_MEDIUM, "b", "", "toString", "Lsm6$c;", "Lsm6$c;", "j", "()Lsm6$c;", "modifierNode", "Lgr6;", c.a, "Lgr6;", "k", "()Lgr6;", "pointerIds", "", "Ljava/util/Map;", "relevantChanges", "Lom5;", MessageAttributes.COORDINATES, "Lkd8;", "pointerEvent", "g", "Z", "wasIn", Image.TYPE_HIGH, "isIn", "hasExited", "<init>", "(Lsm6$c;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: lz6  reason: default package */
/* loaded from: classes.dex */
public final class lz6 extends tz6 {
    private final sm6.c b;
    private final gr6<vd8> c;
    private final Map<vd8, wd8> d;
    private om5 e;
    private kd8 f;
    private boolean g;
    private boolean h;
    private boolean i;

    public lz6(sm6.c cVar) {
        z65.h(cVar, "modifierNode");
        this.b = cVar;
        this.c = new gr6<>(new vd8[16], 0);
        this.d = new LinkedHashMap();
        this.h = true;
        this.i = true;
    }

    private final void i() {
        this.d.clear();
        this.e = null;
    }

    private final boolean l(kd8 kd8Var, kd8 kd8Var2) {
        if (kd8Var == null || kd8Var.c().size() != kd8Var2.c().size()) {
            return true;
        }
        int size = kd8Var2.c().size();
        for (int i = 0; i < size; i++) {
            if (!s67.i(kd8Var.c().get(i).g(), kd8Var2.c().get(i).g())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01f4  */
    @Override // defpackage.tz6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.util.Map<defpackage.vd8, defpackage.wd8> r34, defpackage.om5 r35, defpackage.u65 r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lz6.a(java.util.Map, om5, u65, boolean):boolean");
    }

    @Override // defpackage.tz6
    public void b(u65 u65Var) {
        z65.h(u65Var, "internalPointerEvent");
        super.b(u65Var);
        kd8 kd8Var = this.f;
        if (kd8Var == null) {
            return;
        }
        this.g = this.h;
        List<wd8> c = kd8Var.c();
        int size = c.size();
        for (int i = 0; i < size; i++) {
            wd8 wd8Var = c.get(i);
            if (!wd8Var.h() && (!u65Var.d(wd8Var.f()) || !this.h)) {
                this.c.x(vd8.a(wd8Var.f()));
            }
        }
        this.h = false;
        this.i = nd8.i(kd8Var.e(), nd8.a.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // defpackage.tz6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            r10 = this;
            gr6 r0 = r10.g()
            int r1 = r0.s()
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L1b
            java.lang.Object[] r0 = r0.r()
            r4 = 0
        L11:
            r5 = r0[r4]
            lz6 r5 = (defpackage.lz6) r5
            r5.d()
            int r4 = r4 + r3
            if (r4 < r1) goto L11
        L1b:
            sm6$c r0 = r10.b
            r1 = 16
            int r4 = defpackage.qz6.a(r1)
            r5 = 0
            r6 = r5
        L25:
            if (r0 == 0) goto L72
            boolean r7 = r0 instanceof defpackage.fe8
            if (r7 == 0) goto L31
            fe8 r0 = (defpackage.fe8) r0
            r0.h0()
            goto L6d
        L31:
            int r7 = r0.H0()
            r7 = r7 & r4
            if (r7 == 0) goto L6d
            boolean r7 = r0 instanceof defpackage.fu2
            if (r7 == 0) goto L6d
            r7 = r0
            fu2 r7 = (defpackage.fu2) r7
            sm6$c r7 = r7.g1()
            r8 = 0
        L44:
            if (r7 == 0) goto L6a
            int r9 = r7.H0()
            r9 = r9 & r4
            if (r9 == 0) goto L65
            int r8 = r8 + 1
            if (r8 != r3) goto L53
            r0 = r7
            goto L65
        L53:
            if (r6 != 0) goto L5c
            gr6 r6 = new gr6
            sm6$c[] r9 = new defpackage.sm6.c[r1]
            r6.<init>(r9, r2)
        L5c:
            if (r0 == 0) goto L62
            r6.b(r0)
            r0 = r5
        L62:
            r6.b(r7)
        L65:
            sm6$c r7 = r7.D0()
            goto L44
        L6a:
            if (r8 != r3) goto L6d
            goto L25
        L6d:
            sm6$c r0 = defpackage.au2.b(r6)
            goto L25
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lz6.d():void");
    }

    @Override // defpackage.tz6
    public boolean e(u65 u65Var) {
        gr6<lz6> g;
        int s;
        z65.h(u65Var, "internalPointerEvent");
        boolean z = false;
        int i = 0;
        z = false;
        if (!this.d.isEmpty() && this.b.M0()) {
            kd8 kd8Var = this.f;
            z65.e(kd8Var);
            om5 om5Var = this.e;
            z65.e(om5Var);
            long a = om5Var.a();
            sm6.c cVar = this.b;
            int a2 = qz6.a(16);
            gr6 gr6Var = null;
            while (cVar != null) {
                if (cVar instanceof fe8) {
                    ((fe8) cVar).v(kd8Var, md8.Final, a);
                } else if ((cVar.H0() & a2) != 0 && (cVar instanceof fu2)) {
                    int i2 = 0;
                    for (sm6.c g1 = ((fu2) cVar).g1(); g1 != null; g1 = g1.D0()) {
                        if ((g1.H0() & a2) != 0) {
                            i2++;
                            if (i2 == 1) {
                                cVar = g1;
                            } else {
                                if (gr6Var == null) {
                                    gr6Var = new gr6(new sm6.c[16], 0);
                                }
                                if (cVar != null) {
                                    gr6Var.b(cVar);
                                    cVar = null;
                                }
                                gr6Var.b(g1);
                            }
                        }
                    }
                    if (i2 == 1) {
                    }
                }
                cVar = au2.g(gr6Var);
            }
            if (this.b.M0() && (s = (g = g()).s()) > 0) {
                lz6[] r = g.r();
                do {
                    r[i].e(u65Var);
                    i++;
                } while (i < s);
                z = true;
            } else {
                z = true;
            }
        }
        b(u65Var);
        i();
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    @Override // defpackage.tz6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f(java.util.Map<defpackage.vd8, defpackage.wd8> r12, defpackage.om5 r13, defpackage.u65 r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lz6.f(java.util.Map, om5, u65, boolean):boolean");
    }

    public final sm6.c j() {
        return this.b;
    }

    public final gr6<vd8> k() {
        return this.c;
    }

    public final void m() {
        this.h = true;
    }

    public String toString() {
        return "Node(pointerInputFilter=" + this.b + ", children=" + g() + ", pointerIds=" + this.c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
