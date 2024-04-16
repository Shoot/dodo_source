package defpackage;

import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
/* compiled from: BaseKeyframeAnimation.java */
/* renamed from: t70  reason: default package */
/* loaded from: classes.dex */
public abstract class t70<K, A> {
    private final d<K> c;
    protected b06<A> e;
    final List<b> a = new ArrayList(1);
    private boolean b = false;
    protected float d = 0.0f;
    private A f = null;
    private float g = -1.0f;
    private float h = -1.0f;

    /* compiled from: BaseKeyframeAnimation.java */
    /* renamed from: t70$b */
    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BaseKeyframeAnimation.java */
    /* renamed from: t70$c */
    /* loaded from: classes.dex */
    public static final class c<T> implements d<T> {
        private c() {
        }

        @Override // defpackage.t70.d
        public boolean a(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // defpackage.t70.d
        public lg5<T> b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // defpackage.t70.d
        public boolean c(float f) {
            return false;
        }

        @Override // defpackage.t70.d
        public float d() {
            return 0.0f;
        }

        @Override // defpackage.t70.d
        public float e() {
            return 1.0f;
        }

        @Override // defpackage.t70.d
        public boolean isEmpty() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BaseKeyframeAnimation.java */
    /* renamed from: t70$d */
    /* loaded from: classes.dex */
    public interface d<T> {
        boolean a(float f);

        lg5<T> b();

        boolean c(float f);

        float d();

        float e();

        boolean isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BaseKeyframeAnimation.java */
    /* renamed from: t70$e */
    /* loaded from: classes.dex */
    public static final class e<T> implements d<T> {
        private final List<? extends lg5<T>> a;
        private lg5<T> c = null;
        private float d = -1.0f;
        @NonNull
        private lg5<T> b = f(0.0f);

        e(List<? extends lg5<T>> list) {
            this.a = list;
        }

        private lg5<T> f(float f) {
            List<? extends lg5<T>> list = this.a;
            lg5<T> lg5Var = list.get(list.size() - 1);
            if (f >= lg5Var.e()) {
                return lg5Var;
            }
            for (int size = this.a.size() - 2; size >= 1; size--) {
                lg5<T> lg5Var2 = this.a.get(size);
                if (this.b != lg5Var2 && lg5Var2.a(f)) {
                    return lg5Var2;
                }
            }
            return this.a.get(0);
        }

        @Override // defpackage.t70.d
        public boolean a(float f) {
            lg5<T> lg5Var = this.c;
            lg5<T> lg5Var2 = this.b;
            if (lg5Var == lg5Var2 && this.d == f) {
                return true;
            }
            this.c = lg5Var2;
            this.d = f;
            return false;
        }

        @Override // defpackage.t70.d
        @NonNull
        public lg5<T> b() {
            return this.b;
        }

        @Override // defpackage.t70.d
        public boolean c(float f) {
            if (this.b.a(f)) {
                return !this.b.h();
            }
            this.b = f(f);
            return true;
        }

        @Override // defpackage.t70.d
        public float d() {
            return this.a.get(0).e();
        }

        @Override // defpackage.t70.d
        public float e() {
            List<? extends lg5<T>> list = this.a;
            return list.get(list.size() - 1).b();
        }

        @Override // defpackage.t70.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BaseKeyframeAnimation.java */
    /* renamed from: t70$f */
    /* loaded from: classes.dex */
    public static final class f<T> implements d<T> {
        @NonNull
        private final lg5<T> a;
        private float b = -1.0f;

        f(List<? extends lg5<T>> list) {
            this.a = list.get(0);
        }

        @Override // defpackage.t70.d
        public boolean a(float f) {
            if (this.b == f) {
                return true;
            }
            this.b = f;
            return false;
        }

        @Override // defpackage.t70.d
        public lg5<T> b() {
            return this.a;
        }

        @Override // defpackage.t70.d
        public boolean c(float f) {
            return !this.a.h();
        }

        @Override // defpackage.t70.d
        public float d() {
            return this.a.e();
        }

        @Override // defpackage.t70.d
        public float e() {
            return this.a.b();
        }

        @Override // defpackage.t70.d
        public boolean isEmpty() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t70(List<? extends lg5<K>> list) {
        this.c = o(list);
    }

    private float g() {
        if (this.g == -1.0f) {
            this.g = this.c.d();
        }
        return this.g;
    }

    private static <T> d<T> o(List<? extends lg5<T>> list) {
        if (list.isEmpty()) {
            return new c();
        }
        if (list.size() == 1) {
            return new f(list);
        }
        return new e(list);
    }

    public void a(b bVar) {
        this.a.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public lg5<K> b() {
        oi5.a("BaseKeyframeAnimation#getCurrentKeyframe");
        lg5<K> b2 = this.c.b();
        oi5.b("BaseKeyframeAnimation#getCurrentKeyframe");
        return b2;
    }

    float c() {
        if (this.h == -1.0f) {
            this.h = this.c.e();
        }
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float d() {
        lg5<K> b2 = b();
        if (b2 != null && !b2.h()) {
            return b2.d.getInterpolation(e());
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float e() {
        if (this.b) {
            return 0.0f;
        }
        lg5<K> b2 = b();
        if (b2.h()) {
            return 0.0f;
        }
        return (this.d - b2.e()) / (b2.b() - b2.e());
    }

    public float f() {
        return this.d;
    }

    public A h() {
        A i;
        float e2 = e();
        if (this.e == null && this.c.a(e2)) {
            return this.f;
        }
        lg5<K> b2 = b();
        Interpolator interpolator = b2.e;
        if (interpolator != null && b2.f != null) {
            i = j(b2, e2, interpolator.getInterpolation(e2), b2.f.getInterpolation(e2));
        } else {
            i = i(b2, d());
        }
        this.f = i;
        return i;
    }

    abstract A i(lg5<K> lg5Var, float f2);

    protected A j(lg5<K> lg5Var, float f2, float f3, float f4) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void k() {
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).a();
        }
    }

    public void l() {
        this.b = true;
    }

    public void m(float f2) {
        if (this.c.isEmpty()) {
            return;
        }
        if (f2 < g()) {
            f2 = g();
        } else if (f2 > c()) {
            f2 = c();
        }
        if (f2 == this.d) {
            return;
        }
        this.d = f2;
        if (this.c.c(f2)) {
            k();
        }
    }

    public void n(b06<A> b06Var) {
        b06<A> b06Var2 = this.e;
        if (b06Var2 != null) {
            b06Var2.c(null);
        }
        this.e = b06Var;
        if (b06Var != null) {
            b06Var.c(this);
        }
    }
}
