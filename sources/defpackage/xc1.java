package defpackage;

import java.util.List;
/* compiled from: ColorKeyframeAnimation.java */
/* renamed from: xc1  reason: default package */
/* loaded from: classes.dex */
public class xc1 extends mg5<Integer> {
    public xc1(List<lg5<Integer>> list) {
        super(list);
    }

    public int p() {
        return q(b(), d());
    }

    public int q(lg5<Integer> lg5Var, float f) {
        Integer num;
        if (lg5Var.b != null && lg5Var.c != null) {
            b06<A> b06Var = this.e;
            if (b06Var != 0 && (num = (Integer) b06Var.b(lg5Var.g, lg5Var.h.floatValue(), lg5Var.b, lg5Var.c, f, e(), f())) != null) {
                return num.intValue();
            }
            return qc4.c(ql6.b(f, 0.0f, 1.0f), lg5Var.b.intValue(), lg5Var.c.intValue());
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.t70
    /* renamed from: r */
    public Integer i(lg5<Integer> lg5Var, float f) {
        return Integer.valueOf(q(lg5Var, f));
    }
}
