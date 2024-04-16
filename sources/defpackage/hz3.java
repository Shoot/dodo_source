package defpackage;

import java.util.List;
/* compiled from: FloatKeyframeAnimation.java */
/* renamed from: hz3  reason: default package */
/* loaded from: classes.dex */
public class hz3 extends mg5<Float> {
    public hz3(List<lg5<Float>> list) {
        super(list);
    }

    public float p() {
        return q(b(), d());
    }

    float q(lg5<Float> lg5Var, float f) {
        Float f2;
        if (lg5Var.b != null && lg5Var.c != null) {
            b06<A> b06Var = this.e;
            if (b06Var != 0 && (f2 = (Float) b06Var.b(lg5Var.g, lg5Var.h.floatValue(), lg5Var.b, lg5Var.c, f, e(), f())) != null) {
                return f2.floatValue();
            }
            return ql6.i(lg5Var.f(), lg5Var.c(), f);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.t70
    /* renamed from: r */
    public Float i(lg5<Float> lg5Var, float f) {
        return Float.valueOf(q(lg5Var, f));
    }
}
