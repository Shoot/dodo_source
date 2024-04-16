package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
/* compiled from: PathKeyframe.java */
/* renamed from: ur7  reason: default package */
/* loaded from: classes.dex */
public class ur7 extends lg5<PointF> {
    private Path q;
    private final lg5<PointF> r;

    public ur7(ez5 ez5Var, lg5<PointF> lg5Var) {
        super(ez5Var, lg5Var.b, lg5Var.c, lg5Var.d, lg5Var.e, lg5Var.f, lg5Var.g, lg5Var.h);
        this.r = lg5Var;
        i();
    }

    public void i() {
        boolean z;
        T t;
        T t2;
        T t3 = this.c;
        if (t3 != 0 && (t2 = this.b) != 0 && ((PointF) t2).equals(((PointF) t3).x, ((PointF) t3).y)) {
            z = true;
        } else {
            z = false;
        }
        T t4 = this.b;
        if (t4 != 0 && (t = this.c) != 0 && !z) {
            lg5<PointF> lg5Var = this.r;
            this.q = fvb.d((PointF) t4, (PointF) t, lg5Var.o, lg5Var.p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Path j() {
        return this.q;
    }
}
