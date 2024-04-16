package defpackage;

import android.app.Application;
import com.dodopizza.core.feature.captcha.CaptchaFeatureDependencies;
import com.dodopizza.core.feature.captcha.presentation.CaptchaInitializer;
import defpackage.co0;
/* compiled from: DaggerCaptchaComponent.java */
/* renamed from: vb2  reason: default package */
/* loaded from: classes.dex */
public final class vb2 {

    /* compiled from: DaggerCaptchaComponent.java */
    /* renamed from: vb2$a */
    /* loaded from: classes.dex */
    private static final class a implements co0 {
        private final a b;
        private as8<hp> c;
        private as8<Application> d;
        private as8<bo0> e;
        private as8<qx1> f;
        private as8<kx1> g;
        private as8<lo0> h;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerCaptchaComponent.java */
        /* renamed from: vb2$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0698a implements as8<hp> {
            private final CaptchaFeatureDependencies a;

            C0698a(CaptchaFeatureDependencies captchaFeatureDependencies) {
                this.a = captchaFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public hp get() {
                return (hp) jh8.d(this.a.P());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerCaptchaComponent.java */
        /* renamed from: vb2$a$b */
        /* loaded from: classes.dex */
        public static final class b implements as8<Application> {
            private final CaptchaFeatureDependencies a;

            b(CaptchaFeatureDependencies captchaFeatureDependencies) {
                this.a = captchaFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public Application get() {
                return (Application) jh8.d(this.a.o0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerCaptchaComponent.java */
        /* renamed from: vb2$a$c */
        /* loaded from: classes.dex */
        public static final class c implements as8<bo0> {
            private final CaptchaFeatureDependencies a;

            c(CaptchaFeatureDependencies captchaFeatureDependencies) {
                this.a = captchaFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public bo0 get() {
                return (bo0) jh8.d(this.a.X1());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerCaptchaComponent.java */
        /* renamed from: vb2$a$d */
        /* loaded from: classes.dex */
        public static final class d implements as8<kx1> {
            private final CaptchaFeatureDependencies a;

            d(CaptchaFeatureDependencies captchaFeatureDependencies) {
                this.a = captchaFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public kx1 get() {
                return (kx1) jh8.d(this.a.d());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerCaptchaComponent.java */
        /* renamed from: vb2$a$e */
        /* loaded from: classes.dex */
        public static final class e implements as8<qx1> {
            private final CaptchaFeatureDependencies a;

            e(CaptchaFeatureDependencies captchaFeatureDependencies) {
                this.a = captchaFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public qx1 get() {
                return (qx1) jh8.d(this.a.q());
            }
        }

        private void b(CaptchaFeatureDependencies captchaFeatureDependencies) {
            this.c = new C0698a(captchaFeatureDependencies);
            this.d = new b(captchaFeatureDependencies);
            this.e = new c(captchaFeatureDependencies);
            this.f = new e(captchaFeatureDependencies);
            d dVar = new d(captchaFeatureDependencies);
            this.g = dVar;
            this.h = p63.a(mo0.a(this.c, this.d, this.e, this.f, dVar));
        }

        private CaptchaInitializer c(CaptchaInitializer captchaInitializer) {
            ko0.a(captchaInitializer, this.h.get());
            return captchaInitializer;
        }

        @Override // defpackage.co0
        public void a(CaptchaInitializer captchaInitializer) {
            c(captchaInitializer);
        }

        private a(CaptchaFeatureDependencies captchaFeatureDependencies) {
            this.b = this;
            b(captchaFeatureDependencies);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerCaptchaComponent.java */
    /* renamed from: vb2$b */
    /* loaded from: classes.dex */
    public static final class b implements co0.b {
        private b() {
        }

        @Override // defpackage.co0.b
        public co0 a(CaptchaFeatureDependencies captchaFeatureDependencies) {
            jh8.b(captchaFeatureDependencies);
            return new a(captchaFeatureDependencies);
        }
    }

    public static co0.b a() {
        return new b();
    }
}
