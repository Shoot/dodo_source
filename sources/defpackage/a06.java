package defpackage;

import android.view.Choreographer;
/* compiled from: LottieValueAnimator.java */
/* renamed from: a06  reason: default package */
/* loaded from: classes.dex */
public class a06 extends y70 implements Choreographer.FrameCallback {
    private ez5 j;
    private float c = 1.0f;
    private boolean d = false;
    private long e = 0;
    private float f = 0.0f;
    private int g = 0;
    private float h = -2.1474836E9f;
    private float i = 2.1474836E9f;
    protected boolean k = false;

    private void G() {
        if (this.j == null) {
            return;
        }
        float f = this.f;
        if (f >= this.h && f <= this.i) {
            return;
        }
        throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.h), Float.valueOf(this.i), Float.valueOf(this.f)));
    }

    private float l() {
        ez5 ez5Var = this.j;
        if (ez5Var == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / ez5Var.i()) / Math.abs(this.c);
    }

    private boolean p() {
        if (o() < 0.0f) {
            return true;
        }
        return false;
    }

    public void A(float f) {
        if (this.f == f) {
            return;
        }
        this.f = ql6.b(f, n(), m());
        this.e = 0L;
        f();
    }

    public void B(float f) {
        C(this.h, f);
    }

    public void C(float f, float f2) {
        float p;
        float f3;
        if (f <= f2) {
            ez5 ez5Var = this.j;
            if (ez5Var == null) {
                p = -3.4028235E38f;
            } else {
                p = ez5Var.p();
            }
            ez5 ez5Var2 = this.j;
            if (ez5Var2 == null) {
                f3 = Float.MAX_VALUE;
            } else {
                f3 = ez5Var2.f();
            }
            float b = ql6.b(f, p, f3);
            float b2 = ql6.b(f2, p, f3);
            if (b != this.h || b2 != this.i) {
                this.h = b;
                this.i = b2;
                A((int) ql6.b(this.f, b, b2));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
    }

    public void D(int i) {
        C(i, (int) this.i);
    }

    public void F(float f) {
        this.c = f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.y70
    public void b() {
        super.b();
        c(p());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        b();
        t();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        float n;
        float m;
        s();
        if (this.j != null && isRunning()) {
            oi5.a("LottieValueAnimator#doFrame");
            long j2 = this.e;
            long j3 = 0;
            if (j2 != 0) {
                j3 = j - j2;
            }
            float l = ((float) j3) / l();
            float f = this.f;
            if (p()) {
                l = -l;
            }
            float f2 = f + l;
            this.f = f2;
            boolean z = !ql6.d(f2, n(), m());
            this.f = ql6.b(this.f, n(), m());
            this.e = j;
            f();
            if (z) {
                if (getRepeatCount() != -1 && this.g >= getRepeatCount()) {
                    if (this.c < 0.0f) {
                        m = n();
                    } else {
                        m = m();
                    }
                    this.f = m;
                    t();
                    c(p());
                } else {
                    d();
                    this.g++;
                    if (getRepeatMode() == 2) {
                        this.d = !this.d;
                        y();
                    } else {
                        if (p()) {
                            n = m();
                        } else {
                            n = n();
                        }
                        this.f = n;
                    }
                    this.e = j;
                }
            }
            G();
            oi5.b("LottieValueAnimator#doFrame");
        }
    }

    public void g() {
        this.j = null;
        this.h = -2.1474836E9f;
        this.i = 2.1474836E9f;
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float n;
        float m;
        float n2;
        if (this.j == null) {
            return 0.0f;
        }
        if (p()) {
            n = m() - this.f;
            m = m();
            n2 = n();
        } else {
            n = this.f - n();
            m = m();
            n2 = n();
        }
        return n / (m - n2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(i());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        ez5 ez5Var = this.j;
        if (ez5Var == null) {
            return 0L;
        }
        return ez5Var.d();
    }

    public void h() {
        t();
        c(p());
    }

    public float i() {
        ez5 ez5Var = this.j;
        if (ez5Var == null) {
            return 0.0f;
        }
        return (this.f - ez5Var.p()) / (this.j.f() - this.j.p());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.k;
    }

    public float j() {
        return this.f;
    }

    public float m() {
        ez5 ez5Var = this.j;
        if (ez5Var == null) {
            return 0.0f;
        }
        float f = this.i;
        if (f == 2.1474836E9f) {
            return ez5Var.f();
        }
        return f;
    }

    public float n() {
        ez5 ez5Var = this.j;
        if (ez5Var == null) {
            return 0.0f;
        }
        float f = this.h;
        if (f == -2.1474836E9f) {
            return ez5Var.p();
        }
        return f;
    }

    public float o() {
        return this.c;
    }

    public void q() {
        t();
    }

    public void r() {
        float n;
        this.k = true;
        e(p());
        if (p()) {
            n = m();
        } else {
            n = n();
        }
        A((int) n);
        this.e = 0L;
        this.g = 0;
        s();
    }

    protected void s() {
        if (isRunning()) {
            v(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.d) {
            this.d = false;
            y();
        }
    }

    protected void t() {
        v(true);
    }

    protected void v(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.k = false;
        }
    }

    public void w() {
        this.k = true;
        s();
        this.e = 0L;
        if (p() && j() == n()) {
            this.f = m();
        } else if (!p() && j() == m()) {
            this.f = n();
        }
    }

    public void y() {
        F(-o());
    }

    public void z(ez5 ez5Var) {
        boolean z;
        if (this.j == null) {
            z = true;
        } else {
            z = false;
        }
        this.j = ez5Var;
        if (z) {
            C(Math.max(this.h, ez5Var.p()), Math.min(this.i, ez5Var.f()));
        } else {
            C((int) ez5Var.p(), (int) ez5Var.f());
        }
        float f = this.f;
        this.f = 0.0f;
        A((int) f);
        f();
    }
}
