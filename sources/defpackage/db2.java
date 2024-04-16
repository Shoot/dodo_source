package defpackage;

import com.dodopizza.order.feature.assistant.AssistantFeatureDependencies;
import com.dodopizza.order.feature.assistant.result.presentation.AssistantGeneratorResultPresenter;
import defpackage.ot;
/* compiled from: DaggerAssistantGeneratorResultComponent.java */
/* renamed from: db2  reason: default package */
/* loaded from: classes2.dex */
public final class db2 {

    /* compiled from: DaggerAssistantGeneratorResultComponent.java */
    /* renamed from: db2$a */
    /* loaded from: classes2.dex */
    private static final class a implements ot {
        private final AssistantFeatureDependencies b;
        private final a c;
        private as8<st> d;
        private as8<f63> e;
        private as8<gc> f;
        private as8<ns> g;
        private as8<kx1> h;
        private as8<wt> i;
        private as8<AssistantGeneratorResultPresenter> j;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerAssistantGeneratorResultComponent.java */
        /* renamed from: db2$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0282a implements as8<gc> {
            private final AssistantFeatureDependencies a;

            C0282a(AssistantFeatureDependencies assistantFeatureDependencies) {
                this.a = assistantFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public gc get() {
                return (gc) jh8.d(this.a.a());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerAssistantGeneratorResultComponent.java */
        /* renamed from: db2$a$b */
        /* loaded from: classes2.dex */
        public static final class b implements as8<ns> {
            private final AssistantFeatureDependencies a;

            b(AssistantFeatureDependencies assistantFeatureDependencies) {
                this.a = assistantFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public ns get() {
                return (ns) jh8.d(this.a.h1());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerAssistantGeneratorResultComponent.java */
        /* renamed from: db2$a$c */
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
        /* compiled from: DaggerAssistantGeneratorResultComponent.java */
        /* renamed from: db2$a$d */
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

        private void b(AssistantFeatureDependencies assistantFeatureDependencies, st stVar) {
            this.d = z45.a(stVar);
            this.e = new d(assistantFeatureDependencies);
            this.f = new C0282a(assistantFeatureDependencies);
            this.g = new b(assistantFeatureDependencies);
            c cVar = new c(assistantFeatureDependencies);
            this.h = cVar;
            as8<wt> a = p63.a(xt.a(this.d, this.f, this.g, cVar));
            this.i = a;
            this.j = p63.a(yt.a(this.d, this.e, this.f, a));
        }

        private ut c(ut utVar) {
            vt.a(utVar, (tn6) jh8.d(this.b.j2()));
            vt.b(utVar, this.j);
            return utVar;
        }

        @Override // defpackage.ot
        public void a(ut utVar) {
            c(utVar);
        }

        private a(AssistantFeatureDependencies assistantFeatureDependencies, st stVar) {
            this.c = this;
            this.b = assistantFeatureDependencies;
            b(assistantFeatureDependencies, stVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAssistantGeneratorResultComponent.java */
    /* renamed from: db2$b */
    /* loaded from: classes2.dex */
    public static final class b implements ot.b {
        private b() {
        }

        @Override // defpackage.ot.b
        public ot a(st stVar, AssistantFeatureDependencies assistantFeatureDependencies) {
            jh8.b(stVar);
            jh8.b(assistantFeatureDependencies);
            return new a(assistantFeatureDependencies, stVar);
        }
    }

    public static ot.b a() {
        return new b();
    }
}
