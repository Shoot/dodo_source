package defpackage;

import com.dodopizza.order.feature.assistant.AssistantFeatureDependencies;
import com.dodopizza.order.feature.assistant.welcome.presentation.AssistantWelcomePresenter;
import defpackage.mw;
/* compiled from: DaggerAssistantWelcomeComponent.java */
/* renamed from: pb2  reason: default package */
/* loaded from: classes2.dex */
public final class pb2 {

    /* compiled from: DaggerAssistantWelcomeComponent.java */
    /* renamed from: pb2$a */
    /* loaded from: classes2.dex */
    private static final class a implements mw {
        private final a b;
        private as8<nw> c;
        private as8<f63> d;
        private as8<gc> e;
        private as8<yv> f;
        private as8<kx1> g;
        private as8<wv> h;
        private as8<sw> i;
        private as8<AssistantWelcomePresenter> j;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerAssistantWelcomeComponent.java */
        /* renamed from: pb2$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0476a implements as8<gc> {
            private final AssistantFeatureDependencies a;

            C0476a(AssistantFeatureDependencies assistantFeatureDependencies) {
                this.a = assistantFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public gc get() {
                return (gc) jh8.d(this.a.a());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerAssistantWelcomeComponent.java */
        /* renamed from: pb2$a$b */
        /* loaded from: classes2.dex */
        public static final class b implements as8<yv> {
            private final AssistantFeatureDependencies a;

            b(AssistantFeatureDependencies assistantFeatureDependencies) {
                this.a = assistantFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public yv get() {
                return (yv) jh8.d(this.a.Q2());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerAssistantWelcomeComponent.java */
        /* renamed from: pb2$a$c */
        /* loaded from: classes2.dex */
        public static final class c implements as8<kx1> {
            private final AssistantFeatureDependencies a;

            c(AssistantFeatureDependencies assistantFeatureDependencies) {
                this.a = assistantFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public kx1 get() {
                return (kx1) jh8.d(this.a.d());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerAssistantWelcomeComponent.java */
        /* renamed from: pb2$a$d */
        /* loaded from: classes2.dex */
        public static final class d implements as8<f63> {
            private final AssistantFeatureDependencies a;

            d(AssistantFeatureDependencies assistantFeatureDependencies) {
                this.a = assistantFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public f63 get() {
                return (f63) jh8.d(this.a.b());
            }
        }

        private void b(AssistantFeatureDependencies assistantFeatureDependencies, nw nwVar) {
            this.c = z45.a(nwVar);
            this.d = new d(assistantFeatureDependencies);
            this.e = new C0476a(assistantFeatureDependencies);
            this.f = new b(assistantFeatureDependencies);
            c cVar = new c(assistantFeatureDependencies);
            this.g = cVar;
            as8<wv> a = p63.a(xv.a(this.f, cVar));
            this.h = a;
            as8<sw> a2 = p63.a(tw.a(this.c, a));
            this.i = a2;
            this.j = p63.a(uw.a(this.c, this.d, this.e, a2));
        }

        private qw c(qw qwVar) {
            rw.a(qwVar, this.j);
            return qwVar;
        }

        @Override // defpackage.mw
        public void a(qw qwVar) {
            c(qwVar);
        }

        private a(AssistantFeatureDependencies assistantFeatureDependencies, nw nwVar) {
            this.b = this;
            b(assistantFeatureDependencies, nwVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAssistantWelcomeComponent.java */
    /* renamed from: pb2$b */
    /* loaded from: classes2.dex */
    public static final class b implements mw.b {
        private b() {
        }

        @Override // defpackage.mw.b
        public mw a(nw nwVar, AssistantFeatureDependencies assistantFeatureDependencies) {
            jh8.b(nwVar);
            jh8.b(assistantFeatureDependencies);
            return new a(assistantFeatureDependencies, nwVar);
        }
    }

    public static mw.b a() {
        return new b();
    }
}
