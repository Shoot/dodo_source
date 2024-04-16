package defpackage;

import java.util.List;
/* compiled from: IntegerKeyframeAnimation.java */
/* renamed from: e65  reason: default package */
/* loaded from: classes.dex */
public class e65 extends mg5<Integer> {
    public e65(List<lg5<Integer>> list) {
        super(list);
    }

    public int p() {
        return q(b(), d());
    }

    int q(lg5<Integer> lg5Var, float f) {
        Integer num;
        if (lg5Var.b != null && lg5Var.c != null) {
            b06<A> b06Var = this.e;
            if (b06Var != 0 && (num = (Integer) b06Var.b(lg5Var.g, lg5Var.h.floatValue(), lg5Var.b, lg5Var.c, f, e(), f())) != null) {
                return num.intValue();
            }
            return ql6.j(lg5Var.g(), lg5Var.d(), f);
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
