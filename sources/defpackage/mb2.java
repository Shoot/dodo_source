package defpackage;

import com.dodopizza.order.feature.assistant.AssistantFeatureDependencies;
import com.dodopizza.order.feature.assistant.sharing.presentation.AssistantSharingPresenter;
import defpackage.aw;
/* compiled from: DaggerAssistantSharingComponent.java */
/* renamed from: mb2  reason: default package */
/* loaded from: classes2.dex */
public final class mb2 {

    /* compiled from: DaggerAssistantSharingComponent.java */
    /* renamed from: mb2$a */
    /* loaded from: classes2.dex */
    private static final class a implements aw {
        private final a b;
        private as8<f63> c;
        private as8<gc> d;
        private as8<bw> e;
        private as8<hq3> f;
        private as8<kx1> g;
        private as8<fw> h;
        private as8<AssistantSharingPresenter> i;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerAssistantSharingComponent.java */
        /* renamed from: mb2$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0435a implements as8<gc> {
            private final AssistantFeatureDependencies a;

            C0435a(AssistantFeatureDependencies assistantFeatureDependencies) {
                this.a = assistantFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public gc get() {
                return (gc) jh8.d(this.a.a());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerAssistantSharingComponent.java */
        /* renamed from: mb2$a$b */
        /* loaded from: classes2.dex */
        public static final class b implements as8<hq3> {
            private final AssistantFeatureDependencies a;

            b(AssistantFeatureDependencies assistantFeatureDependencies) {
                this.a = assistantFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public hq3 get() {
                return (hq3) jh8.d(this.a.c());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerAssistantSharingComponent.java */
        /* renamed from: mb2$a$c */
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
        /* compiled from: DaggerAssistantSharingComponent.java */
        /* renamed from: mb2$a$d */
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

        private void b(AssistantFeatureDependencies assistantFeatureDependencies, bw bwVar) {
            this.c = new d(assistantFeatureDependencies);
            this.d = new C0435a(assistantFeatureDependencies);
            this.e = z45.a(bwVar);
            this.f = new b(assistantFeatureDependencies);
            c cVar = new c(assistantFeatureDependencies);
            this.g = cVar;
            as8<fw> a = p63.a(gw.a(this.e, this.f, cVar));
            this.h = a;
            this.i = p63.a(hw.a(this.c, this.d, a));
        }

        private dw c(dw dwVar) {
            ew.a(dwVar, this.i);
            return dwVar;
        }

        @Override // defpackage.aw
        public void a(dw dwVar) {
            c(dwVar);
        }

        private a(AssistantFeatureDependencies assistantFeatureDependencies, bw bwVar) {
            this.b = this;
            b(assistantFeatureDependencies, bwVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAssistantSharingComponent.java */
    /* renamed from: mb2$b */
    /* loaded from: classes2.dex */
    public static final class b implements aw.b {
        private b() {
        }

        @Override // defpackage.aw.b
        public aw a(bw bwVar, AssistantFeatureDependencies assistantFeatureDependencies) {
            jh8.b(bwVar);
            jh8.b(assistantFeatureDependencies);
            return new a(assistantFeatureDependencies, bwVar);
        }
    }

    public static aw.b a() {
        return new b();
    }
}
