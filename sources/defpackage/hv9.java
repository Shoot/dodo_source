package defpackage;

import java.util.List;
/* compiled from: ScaleKeyframeAnimation.java */
/* renamed from: hv9  reason: default package */
/* loaded from: classes.dex */
public class hv9 extends mg5<jv9> {
    private final jv9 i;

    public hv9(List<lg5<jv9>> list) {
        super(list);
        this.i = new jv9();
    }

    @Override // defpackage.t70
    /* renamed from: p */
    public jv9 i(lg5<jv9> lg5Var, float f) {
        jv9 jv9Var;
        jv9 jv9Var2;
        jv9 jv9Var3 = lg5Var.b;
        if (jv9Var3 != null && (jv9Var = lg5Var.c) != null) {
            jv9 jv9Var4 = jv9Var3;
            jv9 jv9Var5 = jv9Var;
            b06<A> b06Var = this.e;
            if (b06Var != 0 && (jv9Var2 = (jv9) b06Var.b(lg5Var.g, lg5Var.h.floatValue(), jv9Var4, jv9Var5, f, e(), f())) != null) {
                return jv9Var2;
            }
            this.i.d(ql6.i(jv9Var4.b(), jv9Var5.b(), f), ql6.i(jv9Var4.c(), jv9Var5.c(), f));
            return this.i;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
