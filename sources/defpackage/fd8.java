package defpackage;

import android.graphics.PointF;
import java.util.List;
/* compiled from: PointKeyframeAnimation.java */
/* renamed from: fd8  reason: default package */
/* loaded from: classes.dex */
public class fd8 extends mg5<PointF> {
    private final PointF i;

    public fd8(List<lg5<PointF>> list) {
        super(list);
        this.i = new PointF();
    }

    @Override // defpackage.t70
    /* renamed from: p */
    public PointF i(lg5<PointF> lg5Var, float f) {
        return j(lg5Var, f, f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.t70
    /* renamed from: q */
    public PointF j(lg5<PointF> lg5Var, float f, float f2, float f3) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = lg5Var.b;
        if (pointF3 != null && (pointF = lg5Var.c) != null) {
            PointF pointF4 = pointF3;
            PointF pointF5 = pointF;
            b06<A> b06Var = this.e;
            if (b06Var != 0 && (pointF2 = (PointF) b06Var.b(lg5Var.g, lg5Var.h.floatValue(), pointF4, pointF5, f, e(), f())) != null) {
                return pointF2;
            }
            PointF pointF6 = this.i;
            float f4 = pointF4.x;
            float f5 = f4 + (f2 * (pointF5.x - f4));
            float f6 = pointF4.y;
            pointF6.set(f5, f6 + (f3 * (pointF5.y - f6)));
            return this.i;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
