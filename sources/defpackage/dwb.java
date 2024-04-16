package defpackage;

import java.util.Collections;
/* compiled from: ValueCallbackKeyframeAnimation.java */
/* renamed from: dwb  reason: default package */
/* loaded from: classes.dex */
public class dwb<K, A> extends t70<K, A> {
    private final A i;

    public dwb(b06<A> b06Var) {
        this(b06Var, null);
    }

    @Override // defpackage.t70
    float c() {
        return 1.0f;
    }

    @Override // defpackage.t70
    public A h() {
        b06<A> b06Var = this.e;
        A a = this.i;
        return b06Var.b(0.0f, 0.0f, a, a, f(), f(), f());
    }

    @Override // defpackage.t70
    A i(lg5<K> lg5Var, float f) {
        return h();
    }

    @Override // defpackage.t70
    public void k() {
        if (this.e != null) {
            super.k();
        }
    }

    @Override // defpackage.t70
    public void m(float f) {
        this.d = f;
    }

    public dwb(b06<A> b06Var, A a) {
        super(Collections.emptyList());
        n(b06Var);
        this.i = a;
    }
}
