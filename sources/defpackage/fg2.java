package defpackage;

import android.content.Context;
import defpackage.m27;
import ru.dodopizza.app.application.fcm.PushMessagingService;
import ru.dodopizza.app.di.modules.presentation.notification.NotificationFeatureDependencies;
/* compiled from: DaggerNotificationComponent.java */
/* renamed from: fg2  reason: default package */
/* loaded from: classes3.dex */
public final class fg2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerNotificationComponent.java */
    /* renamed from: fg2$a */
    /* loaded from: classes3.dex */
    public static final class a implements m27.b {
        private a() {
        }

        @Override // defpackage.m27.b
        public m27 a(Context context, kx1 kx1Var, NotificationFeatureDependencies notificationFeatureDependencies) {
            jh8.b(context);
            jh8.b(kx1Var);
            jh8.b(notificationFeatureDependencies);
            return new b(notificationFeatureDependencies, context, kx1Var);
        }
    }

    /* compiled from: DaggerNotificationComponent.java */
    /* renamed from: fg2$b */
    /* loaded from: classes3.dex */
    private static final class b implements m27 {
        private final b b;
        private as8<n27> c;
        private as8<Context> d;
        private as8<ih> e;
        private as8<mt8> f;
        private as8<xda> g;
        private as8<pq> h;
        private as8<bfb> i;
        private as8<hfb> j;
        private as8<bo> k;
        private as8<kx1> l;
        private as8<st8> m;
        private as8<ok6> n;
        private as8<qx1> o;
        private as8<ss8> p;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerNotificationComponent.java */
        /* renamed from: fg2$b$a */
        /* loaded from: classes3.dex */
        public static final class a implements as8<ih> {
            private final NotificationFeatureDependencies a;

            a(NotificationFeatureDependencies notificationFeatureDependencies) {
                this.a = notificationFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ih get() {
                return (ih) jh8.d(this.a.x0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerNotificationComponent.java */
        /* renamed from: fg2$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0312b implements as8<bo> {
            private final NotificationFeatureDependencies a;

            C0312b(NotificationFeatureDependencies notificationFeatureDependencies) {
                this.a = notificationFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public bo get() {
                return (bo) jh8.d(this.a.x());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerNotificationComponent.java */
        /* renamed from: fg2$b$c */
        /* loaded from: classes3.dex */
        public static final class c implements as8<pq> {
            private final NotificationFeatureDependencies a;

            c(NotificationFeatureDependencies notificationFeatureDependencies) {
                this.a = notificationFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public pq get() {
                return (pq) jh8.d(this.a.G2());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerNotificationComponent.java */
        /* renamed from: fg2$b$d */
        /* loaded from: classes3.dex */
        public static final class d implements as8<ok6> {
            private final NotificationFeatureDependencies a;

            d(NotificationFeatureDependencies notificationFeatureDependencies) {
                this.a = notificationFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ok6 get() {
                return (ok6) jh8.d(this.a.M1());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerNotificationComponent.java */
        /* renamed from: fg2$b$e */
        /* loaded from: classes3.dex */
        public static final class e implements as8<n27> {
            private final NotificationFeatureDependencies a;

            e(NotificationFeatureDependencies notificationFeatureDependencies) {
                this.a = notificationFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public n27 get() {
                return (n27) jh8.d(this.a.h2());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerNotificationComponent.java */
        /* renamed from: fg2$b$f */
        /* loaded from: classes3.dex */
        public static final class f implements as8<qx1> {
            private final NotificationFeatureDependencies a;

            f(NotificationFeatureDependencies notificationFeatureDependencies) {
                this.a = notificationFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public qx1 get() {
                return (qx1) jh8.d(this.a.q());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerNotificationComponent.java */
        /* renamed from: fg2$b$g */
        /* loaded from: classes3.dex */
        public static final class g implements as8<xda> {
            private final NotificationFeatureDependencies a;

            g(NotificationFeatureDependencies notificationFeatureDependencies) {
                this.a = notificationFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public xda get() {
                return (xda) jh8.d(this.a.W());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerNotificationComponent.java */
        /* renamed from: fg2$b$h */
        /* loaded from: classes3.dex */
        public static final class h implements as8<bfb> {
            private final NotificationFeatureDependencies a;

            h(NotificationFeatureDependencies notificationFeatureDependencies) {
                this.a = notificationFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public bfb get() {
                return (bfb) jh8.d(this.a.X());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerNotificationComponent.java */
        /* renamed from: fg2$b$i */
        /* loaded from: classes3.dex */
        public static final class i implements as8<hfb> {
            private final NotificationFeatureDependencies a;

            i(NotificationFeatureDependencies notificationFeatureDependencies) {
                this.a = notificationFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public hfb get() {
                return (hfb) jh8.d(this.a.S3());
            }
        }

        private void b(NotificationFeatureDependencies notificationFeatureDependencies, Context context, kx1 kx1Var) {
            this.c = new e(notificationFeatureDependencies);
            this.d = z45.a(context);
            a aVar = new a(notificationFeatureDependencies);
            this.e = aVar;
            this.f = p63.a(nt8.a(this.d, aVar));
            this.g = new g(notificationFeatureDependencies);
            this.h = new c(notificationFeatureDependencies);
            this.i = new h(notificationFeatureDependencies);
            this.j = new i(notificationFeatureDependencies);
            this.k = new C0312b(notificationFeatureDependencies);
            no3 a2 = z45.a(kx1Var);
            this.l = a2;
            this.m = p63.a(tt8.a(this.g, this.h, this.i, this.j, this.k, a2));
            this.n = new d(notificationFeatureDependencies);
            f fVar = new f(notificationFeatureDependencies);
            this.o = fVar;
            this.p = p63.a(ts8.a(this.c, this.f, this.m, this.n, fVar));
        }

        private PushMessagingService c(PushMessagingService pushMessagingService) {
            us8.a(pushMessagingService, this.p.get());
            return pushMessagingService;
        }

        @Override // defpackage.m27
        public void a(PushMessagingService pushMessagingService) {
            c(pushMessagingService);
        }

        private b(NotificationFeatureDependencies notificationFeatureDependencies, Context context, kx1 kx1Var) {
            this.b = this;
            b(notificationFeatureDependencies, context, kx1Var);
        }
    }

    public static m27.b a() {
        return new a();
    }
}
