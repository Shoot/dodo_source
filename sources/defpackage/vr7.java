package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
/* compiled from: PathKeyframeAnimation.java */
/* renamed from: vr7  reason: default package */
/* loaded from: classes.dex */
public class vr7 extends mg5<PointF> {
    private final PointF i;
    private final float[] j;
    private final PathMeasure k;
    private ur7 l;

    public vr7(List<? extends lg5<PointF>> list) {
        super(list);
        this.i = new PointF();
        this.j = new float[2];
        this.k = new PathMeasure();
    }

    @Override // defpackage.t70
    /* renamed from: p */
    public PointF i(lg5<PointF> lg5Var, float f) {
        PointF pointF;
        ur7 ur7Var = (ur7) lg5Var;
        Path j = ur7Var.j();
        if (j == null) {
            return lg5Var.b;
        }
        b06<A> b06Var = this.e;
        if (b06Var != 0 && (pointF = (PointF) b06Var.b(ur7Var.g, ur7Var.h.floatValue(), (PointF) ur7Var.b, (PointF) ur7Var.c, e(), f, f())) != null) {
            return pointF;
        }
        if (this.l != ur7Var) {
            this.k.setPath(j, false);
            this.l = ur7Var;
        }
        PathMeasure pathMeasure = this.k;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.j, null);
        PointF pointF2 = this.i;
        float[] fArr = this.j;
        pointF2.set(fArr[0], fArr[1]);
        return this.i;
    }
}
