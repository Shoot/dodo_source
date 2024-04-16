package defpackage;

import com.dodopizza.core.feature.remoteconfig.RemoteConfigFeatureDependencies;
import com.dodopizza.core.feature.remoteconfig.presentation.RemoteConfigInitializer;
import defpackage.cd9;
/* compiled from: DaggerRemoteConfigComponent.java */
/* renamed from: li2  reason: default package */
/* loaded from: classes.dex */
public final class li2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerRemoteConfigComponent.java */
    /* renamed from: li2$a */
    /* loaded from: classes.dex */
    public static final class a implements cd9.b {
        private a() {
        }

        @Override // defpackage.cd9.b
        public cd9 a(RemoteConfigFeatureDependencies remoteConfigFeatureDependencies) {
            jh8.b(remoteConfigFeatureDependencies);
            return new b(remoteConfigFeatureDependencies);
        }
    }

    /* compiled from: DaggerRemoteConfigComponent.java */
    /* renamed from: li2$b */
    /* loaded from: classes.dex */
    private static final class b implements cd9 {
        private final b b;
        private as8<hp> c;
        private as8<ld9> d;
        private as8<qx1> e;
        private as8<kx1> f;
        private as8<gd9> g;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerRemoteConfigComponent.java */
        /* renamed from: li2$b$a */
        /* loaded from: classes.dex */
        public static final class a implements as8<hp> {
            private final RemoteConfigFeatureDependencies a;

            a(RemoteConfigFeatureDependencies remoteConfigFeatureDependencies) {
                this.a = remoteConfigFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public hp get() {
                return (hp) jh8.d(this.a.P());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerRemoteConfigComponent.java */
        /* renamed from: li2$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0426b implements as8<kx1> {
            private final RemoteConfigFeatureDependencies a;

            C0426b(RemoteConfigFeatureDependencies remoteConfigFeatureDependencies) {
                this.a = remoteConfigFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public kx1 get() {
                return (kx1) jh8.d(this.a.d());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerRemoteConfigComponent.java */
        /* renamed from: li2$b$c */
        /* loaded from: classes.dex */
        public static final class c implements as8<qx1> {
            private final RemoteConfigFeatureDependencies a;

            c(RemoteConfigFeatureDependencies remoteConfigFeatureDependencies) {
                this.a = remoteConfigFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public qx1 get() {
                return (qx1) jh8.d(this.a.q());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerRemoteConfigComponent.java */
        /* renamed from: li2$b$d */
        /* loaded from: classes.dex */
        public static final class d implements as8<ld9> {
            private final RemoteConfigFeatureDependencies a;

            d(RemoteConfigFeatureDependencies remoteConfigFeatureDependencies) {
                this.a = remoteConfigFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ld9 get() {
                return (ld9) jh8.d(this.a.y2());
            }
        }

        private void b(RemoteConfigFeatureDependencies remoteConfigFeatureDependencies) {
            this.c = new a(remoteConfigFeatureDependencies);
            this.d = new d(remoteConfigFeatureDependencies);
            this.e = new c(remoteConfigFeatureDependencies);
            C0426b c0426b = new C0426b(remoteConfigFeatureDependencies);
            this.f = c0426b;
            this.g = p63.a(hd9.a(this.c, this.d, this.e, c0426b));
        }

        private RemoteConfigInitializer c(RemoteConfigInitializer remoteConfigInitializer) {
            fd9.a(remoteConfigInitializer, this.g.get());
            return remoteConfigInitializer;
        }

        @Override // defpackage.cd9
        public void a(RemoteConfigInitializer remoteConfigInitializer) {
            c(remoteConfigInitializer);
        }

        private b(RemoteConfigFeatureDependencies remoteConfigFeatureDependencies) {
            this.b = this;
            b(remoteConfigFeatureDependencies);
        }
    }

    public static cd9.b a() {
        return new a();
    }
}
