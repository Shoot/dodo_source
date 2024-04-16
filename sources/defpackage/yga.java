package defpackage;

import android.graphics.PointF;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ShapeData.java */
/* renamed from: yga  reason: default package */
/* loaded from: classes.dex */
public class yga {
    private final List<c32> a;
    private PointF b;
    private boolean c;

    public yga(PointF pointF, boolean z, List<c32> list) {
        this.b = pointF;
        this.c = z;
        this.a = new ArrayList(list);
    }

    public List<c32> a() {
        return this.a;
    }

    public PointF b() {
        return this.b;
    }

    public void c(yga ygaVar, yga ygaVar2, float f) {
        boolean z;
        if (this.b == null) {
            this.b = new PointF();
        }
        if (!ygaVar.d() && !ygaVar2.d()) {
            z = false;
        } else {
            z = true;
        }
        this.c = z;
        if (ygaVar.a().size() != ygaVar2.a().size()) {
            ox5.c("Curves must have the same number of control points. Shape 1: " + ygaVar.a().size() + "\tShape 2: " + ygaVar2.a().size());
        }
        int min = Math.min(ygaVar.a().size(), ygaVar2.a().size());
        if (this.a.size() < min) {
            for (int size = this.a.size(); size < min; size++) {
                this.a.add(new c32());
            }
        } else if (this.a.size() > min) {
            for (int size2 = this.a.size() - 1; size2 >= min; size2--) {
                List<c32> list = this.a;
                list.remove(list.size() - 1);
            }
        }
        PointF b = ygaVar.b();
        PointF b2 = ygaVar2.b();
        f(ql6.i(b.x, b2.x, f), ql6.i(b.y, b2.y, f));
        for (int size3 = this.a.size() - 1; size3 >= 0; size3--) {
            c32 c32Var = ygaVar.a().get(size3);
            c32 c32Var2 = ygaVar2.a().get(size3);
            PointF a = c32Var.a();
            PointF b3 = c32Var.b();
            PointF c = c32Var.c();
            PointF a2 = c32Var2.a();
            PointF b4 = c32Var2.b();
            PointF c2 = c32Var2.c();
            this.a.get(size3).d(ql6.i(a.x, a2.x, f), ql6.i(a.y, a2.y, f));
            this.a.get(size3).e(ql6.i(b3.x, b4.x, f), ql6.i(b3.y, b4.y, f));
            this.a.get(size3).f(ql6.i(c.x, c2.x, f), ql6.i(c.y, c2.y, f));
        }
    }

    public boolean d() {
        return this.c;
    }

    public void e(boolean z) {
        this.c = z;
    }

    public void f(float f, float f2) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.b.set(f, f2);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.a.size() + "closed=" + this.c + CoreConstants.CURLY_RIGHT;
    }

    public yga() {
        this.a = new ArrayList();
    }
}
