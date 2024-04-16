package defpackage;

import com.dodopizza.order.feature.assistant.AssistantFeatureDependencies;
import com.dodopizza.order.feature.assistant.error.presentation.AssistantErrorPresenter;
import defpackage.ts;
/* compiled from: DaggerAssistantErrorComponent.java */
/* renamed from: xa2  reason: default package */
/* loaded from: classes2.dex */
public final class xa2 {

    /* compiled from: DaggerAssistantErrorComponent.java */
    /* renamed from: xa2$a */
    /* loaded from: classes2.dex */
    private static final class a implements ts {
        private final a b;
        private as8<us> c;
        private as8<f63> d;
        private as8<gc> e;
        private as8<AssistantErrorPresenter> f;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerAssistantErrorComponent.java */
        /* renamed from: xa2$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0735a implements as8<gc> {
            private final AssistantFeatureDependencies a;

            C0735a(AssistantFeatureDependencies assistantFeatureDependencies) {
                this.a = assistantFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public gc get() {
                return (gc) jh8.d(this.a.a());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerAssistantErrorComponent.java */
        /* renamed from: xa2$a$b */
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

        private void b(AssistantFeatureDependencies assistantFeatureDependencies, us usVar) {
            this.c = z45.a(usVar);
            this.d = new b(assistantFeatureDependencies);
            C0735a c0735a = new C0735a(assistantFeatureDependencies);
            this.e = c0735a;
            this.f = p63.a(xs.a(this.c, this.d, c0735a));
        }

        private vs c(vs vsVar) {
            ws.a(vsVar, this.f);
            return vsVar;
        }

        @Override // defpackage.ts
        public void a(vs vsVar) {
            c(vsVar);
        }

        private a(AssistantFeatureDependencies assistantFeatureDependencies, us usVar) {
            this.b = this;
            b(assistantFeatureDependencies, usVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAssistantErrorComponent.java */
    /* renamed from: xa2$b */
    /* loaded from: classes2.dex */
    public static final class b implements ts.b {
        private b() {
        }

        @Override // defpackage.ts.b
        public ts a(us usVar, AssistantFeatureDependencies assistantFeatureDependencies) {
            jh8.b(usVar);
            jh8.b(assistantFeatureDependencies);
            return new a(assistantFeatureDependencies, usVar);
        }
    }

    public static ts.b a() {
        return new b();
    }
}
