package defpackage;

import com.dodopizza.geo.feature.phonenumbercollector.PhoneNumberCollectorDependencies;
import com.dodopizza.geo.feature.phonenumbercollector.presentation.PhoneNumberCollectorPresenter;
import defpackage.y28;
/* compiled from: DaggerPhoneNumberCollectorComponent.java */
/* renamed from: ch2  reason: default package */
/* loaded from: classes2.dex */
public final class ch2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerPhoneNumberCollectorComponent.java */
    /* renamed from: ch2$a */
    /* loaded from: classes2.dex */
    public static final class a implements y28.b {
        private a() {
        }

        @Override // defpackage.y28.b
        public y28 a(PhoneNumberCollectorDependencies phoneNumberCollectorDependencies) {
            jh8.b(phoneNumberCollectorDependencies);
            return new b(phoneNumberCollectorDependencies);
        }
    }

    /* compiled from: DaggerPhoneNumberCollectorComponent.java */
    /* renamed from: ch2$b */
    /* loaded from: classes2.dex */
    private static final class b implements y28 {
        private final b b;
        private as8<f63> c;
        private as8<i38> d;
        private as8<h38> e;
        private as8<xi8> f;
        private as8<v28> g;
        private as8<mh0> h;
        private as8<gc> i;
        private as8<PhoneNumberCollectorPresenter> j;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerPhoneNumberCollectorComponent.java */
        /* renamed from: ch2$b$a */
        /* loaded from: classes2.dex */
        public static final class a implements as8<gc> {
            private final PhoneNumberCollectorDependencies a;

            a(PhoneNumberCollectorDependencies phoneNumberCollectorDependencies) {
                this.a = phoneNumberCollectorDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public gc get() {
                return (gc) jh8.d(this.a.a());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerPhoneNumberCollectorComponent.java */
        /* renamed from: ch2$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0086b implements as8<mh0> {
            private final PhoneNumberCollectorDependencies a;

            C0086b(PhoneNumberCollectorDependencies phoneNumberCollectorDependencies) {
                this.a = phoneNumberCollectorDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public mh0 get() {
                return (mh0) jh8.d(this.a.i());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerPhoneNumberCollectorComponent.java */
        /* renamed from: ch2$b$c */
        /* loaded from: classes2.dex */
        public static final class c implements as8<v28> {
            private final PhoneNumberCollectorDependencies a;

            c(PhoneNumberCollectorDependencies phoneNumberCollectorDependencies) {
                this.a = phoneNumberCollectorDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public v28 get() {
                return (v28) jh8.d(this.a.i2());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerPhoneNumberCollectorComponent.java */
        /* renamed from: ch2$b$d */
        /* loaded from: classes2.dex */
        public static final class d implements as8<f63> {
            private final PhoneNumberCollectorDependencies a;

            d(PhoneNumberCollectorDependencies phoneNumberCollectorDependencies) {
                this.a = phoneNumberCollectorDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public f63 get() {
                return (f63) jh8.d(this.a.b());
            }
        }

        private void b(PhoneNumberCollectorDependencies phoneNumberCollectorDependencies) {
            d dVar = new d(phoneNumberCollectorDependencies);
            this.c = dVar;
            j38 a2 = j38.a(dVar);
            this.d = a2;
            this.e = p63.a(e38.a(a2));
            this.f = p63.a(d38.a());
            this.g = new c(phoneNumberCollectorDependencies);
            this.h = new C0086b(phoneNumberCollectorDependencies);
            a aVar = new a(phoneNumberCollectorDependencies);
            this.i = aVar;
            this.j = f38.a(this.e, this.f, this.g, this.h, aVar);
        }

        private a38 c(a38 a38Var) {
            b38.a(a38Var, this.j);
            return a38Var;
        }

        @Override // defpackage.y28
        public void a(a38 a38Var) {
            c(a38Var);
        }

        private b(PhoneNumberCollectorDependencies phoneNumberCollectorDependencies) {
            this.b = this;
            b(phoneNumberCollectorDependencies);
        }
    }

    public static y28.b a() {
        return new a();
    }
}
