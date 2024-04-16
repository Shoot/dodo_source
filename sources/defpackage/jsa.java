package defpackage;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import defpackage.o93;
/* compiled from: SpringAnimation.java */
/* renamed from: jsa  reason: default package */
/* loaded from: classes.dex */
public final class jsa extends o93<jsa> {
    private ksa A;
    private float B;
    private boolean C;

    public <K> jsa(K k, lz3<K> lz3Var) {
        super(k, lz3Var);
        this.A = null;
        this.B = Float.MAX_VALUE;
        this.C = false;
    }

    private void o() {
        ksa ksaVar = this.A;
        if (ksaVar != null) {
            double a = ksaVar.a();
            if (a <= this.g) {
                if (a >= this.h) {
                    return;
                }
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
    }

    @Override // defpackage.o93
    public void i() {
        o();
        this.A.g(d());
        super.i();
    }

    @Override // defpackage.o93
    boolean k(long j) {
        if (this.C) {
            float f = this.B;
            if (f != Float.MAX_VALUE) {
                this.A.e(f);
                this.B = Float.MAX_VALUE;
            }
            this.b = this.A.a();
            this.a = 0.0f;
            this.C = false;
            return true;
        }
        if (this.B != Float.MAX_VALUE) {
            this.A.a();
            long j2 = j / 2;
            o93.o h = this.A.h(this.b, this.a, j2);
            this.A.e(this.B);
            this.B = Float.MAX_VALUE;
            o93.o h2 = this.A.h(h.a, h.b, j2);
            this.b = h2.a;
            this.a = h2.b;
        } else {
            o93.o h3 = this.A.h(this.b, this.a, j);
            this.b = h3.a;
            this.a = h3.b;
        }
        float max = Math.max(this.b, this.h);
        this.b = max;
        float min = Math.min(max, this.g);
        this.b = min;
        if (!n(min, this.a)) {
            return false;
        }
        this.b = this.A.a();
        this.a = 0.0f;
        return true;
    }

    public void l(float f) {
        if (e()) {
            this.B = f;
            return;
        }
        if (this.A == null) {
            this.A = new ksa(f);
        }
        this.A.e(f);
        i();
    }

    public boolean m() {
        if (this.A.b > 0.0d) {
            return true;
        }
        return false;
    }

    boolean n(float f, float f2) {
        return this.A.c(f, f2);
    }

    public jsa p(ksa ksaVar) {
        this.A = ksaVar;
        return this;
    }

    public void q() {
        if (m()) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.f) {
                    this.C = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
    }
}
