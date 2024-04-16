package defpackage;

import com.dodopizza.order.feature.assistant.AssistantFeatureDependencies;
import com.dodopizza.order.feature.assistant.wishes.presentation.AssistantWishesPresenter;
import defpackage.dx;
/* compiled from: DaggerAssistantWishesComponent.java */
/* renamed from: sb2  reason: default package */
/* loaded from: classes2.dex */
public final class sb2 {

    /* compiled from: DaggerAssistantWishesComponent.java */
    /* renamed from: sb2$a */
    /* loaded from: classes2.dex */
    private static final class a implements dx {
        private final a b;
        private as8<ex> c;
        private as8<f63> d;
        private as8<gc> e;
        private as8<hx> f;
        private as8<AssistantWishesPresenter> g;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerAssistantWishesComponent.java */
        /* renamed from: sb2$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0661a implements as8<gc> {
            private final AssistantFeatureDependencies a;

            C0661a(AssistantFeatureDependencies assistantFeatureDependencies) {
                this.a = assistantFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public gc get() {
                return (gc) jh8.d(this.a.a());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerAssistantWishesComponent.java */
        /* renamed from: sb2$a$b */
        /* loaded from: classes2.dex */
        public static final class b implements as8<f63> {
            private final AssistantFeatureDependencies a;

            b(AssistantFeatureDependencies assistantFeatureDependencies) {
                this.a = assistantFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public f63 get() {
                return (f63) jh8.d(this.a.b());
            }
        }

        private void b(AssistantFeatureDependencies assistantFeatureDependencies, ex exVar) {
            this.c = z45.a(exVar);
            this.d = new b(assistantFeatureDependencies);
            this.e = new C0661a(assistantFeatureDependencies);
            as8<hx> a = p63.a(ix.a(this.c));
            this.f = a;
            this.g = p63.a(lx.a(this.c, this.d, this.e, a));
        }

        private fx c(fx fxVar) {
            gx.a(fxVar, this.g);
            return fxVar;
        }

        @Override // defpackage.dx
        public void a(fx fxVar) {
            c(fxVar);
        }

        private a(AssistantFeatureDependencies assistantFeatureDependencies, ex exVar) {
            this.b = this;
            b(assistantFeatureDependencies, exVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAssistantWishesComponent.java */
    /* renamed from: sb2$b */
    /* loaded from: classes2.dex */
    public static final class b implements dx.b {
        private b() {
        }

        @Override // defpackage.dx.b
        public dx a(ex exVar, AssistantFeatureDependencies assistantFeatureDependencies) {
            jh8.b(exVar);
            jh8.b(assistantFeatureDependencies);
            return new a(assistantFeatureDependencies, exVar);
        }
    }

    public static dx.b a() {
        return new b();
    }
}
