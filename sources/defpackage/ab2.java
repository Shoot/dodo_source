package defpackage;

import com.dodopizza.order.feature.assistant.AssistantFeatureDependencies;
import com.dodopizza.order.feature.assistant.generator.presentation.AssistantGeneratorPresenter;
import defpackage.dt;
/* compiled from: DaggerAssistantGeneratorComponent.java */
/* renamed from: ab2  reason: default package */
/* loaded from: classes2.dex */
public final class ab2 {

    /* compiled from: DaggerAssistantGeneratorComponent.java */
    /* renamed from: ab2$a */
    /* loaded from: classes2.dex */
    private static final class a implements dt {
        private final a b;
        private as8<et> c;
        private as8<f63> d;
        private as8<gc> e;
        private as8<eu> f;
        private as8<hq3> g;
        private as8<kx1> h;
        private as8<jt> i;
        private as8<AssistantGeneratorPresenter> j;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerAssistantGeneratorComponent.java */
        /* renamed from: ab2$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0000a implements as8<gc> {
            private final AssistantFeatureDependencies a;

            C0000a(AssistantFeatureDependencies assistantFeatureDependencies) {
                this.a = assistantFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public gc get() {
                return (gc) jh8.d(this.a.a());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerAssistantGeneratorComponent.java */
        /* renamed from: ab2$a$b */
        /* loaded from: classes2.dex */
        public static final class b implements as8<eu> {
            private final AssistantFeatureDependencies a;

            b(AssistantFeatureDependencies assistantFeatureDependencies) {
                this.a = assistantFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public eu get() {
                return (eu) jh8.d(this.a.l3());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerAssistantGeneratorComponent.java */
        /* renamed from: ab2$a$c */
        /* loaded from: classes2.dex */
        public static final class c implements as8<hq3> {
            private final AssistantFeatureDependencies a;

            c(AssistantFeatureDependencies assistantFeatureDependencies) {
                this.a = assistantFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public hq3 get() {
                return (hq3) jh8.d(this.a.c());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerAssistantGeneratorComponent.java */
        /* renamed from: ab2$a$d */
        /* loaded from: classes2.dex */
        public static final class d implements as8<kx1> {
            private final AssistantFeatureDependencies a;

            d(AssistantFeatureDependencies assistantFeatureDependencies) {
                this.a = assistantFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public kx1 get() {
                return (kx1) jh8.d(this.a.d());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerAssistantGeneratorComponent.java */
        /* renamed from: ab2$a$e */
        /* loaded from: classes2.dex */
        public static final class e implements as8<f63> {
            private final AssistantFeatureDependencies a;

            e(AssistantFeatureDependencies assistantFeatureDependencies) {
                this.a = assistantFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public f63 get() {
                return (f63) jh8.d(this.a.b());
            }
        }

        private void b(AssistantFeatureDependencies assistantFeatureDependencies, et etVar) {
            this.c = z45.a(etVar);
            this.d = new e(assistantFeatureDependencies);
            this.e = new C0000a(assistantFeatureDependencies);
            this.f = new b(assistantFeatureDependencies);
            this.g = new c(assistantFeatureDependencies);
            d dVar = new d(assistantFeatureDependencies);
            this.h = dVar;
            as8<jt> a = p63.a(kt.a(this.c, this.f, this.g, dVar));
            this.i = a;
            this.j = p63.a(lt.a(this.c, this.d, this.e, a));
        }

        private ft c(ft ftVar) {
            gt.a(ftVar, this.j);
            return ftVar;
        }

        @Override // defpackage.dt
        public void a(ft ftVar) {
            c(ftVar);
        }

        private a(AssistantFeatureDependencies assistantFeatureDependencies, et etVar) {
            this.b = this;
            b(assistantFeatureDependencies, etVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAssistantGeneratorComponent.java */
    /* renamed from: ab2$b */
    /* loaded from: classes2.dex */
    public static final class b implements dt.b {
        private b() {
        }

        @Override // defpackage.dt.b
        public dt a(et etVar, AssistantFeatureDependencies assistantFeatureDependencies) {
            jh8.b(etVar);
            jh8.b(assistantFeatureDependencies);
            return new a(assistantFeatureDependencies, etVar);
        }
    }

    public static dt.b a() {
        return new b();
    }
}
