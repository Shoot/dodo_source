package defpackage;

import com.dodopizza.order.feature.assistant.AssistantFeatureDependencies;
import com.dodopizza.order.feature.assistant.preferences.presentation.AssistantPreferencesPresenter;
import defpackage.ev;
/* compiled from: DaggerAssistantPreferencesComponent.java */
/* renamed from: jb2  reason: default package */
/* loaded from: classes2.dex */
public final class jb2 {

    /* compiled from: DaggerAssistantPreferencesComponent.java */
    /* renamed from: jb2$a */
    /* loaded from: classes2.dex */
    private static final class a implements ev {
        private final a b;
        private as8<fv> c;
        private as8<f63> d;
        private as8<gc> e;
        private as8<iv> f;
        private as8<AssistantPreferencesPresenter> g;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerAssistantPreferencesComponent.java */
        /* renamed from: jb2$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0392a implements as8<gc> {
            private final AssistantFeatureDependencies a;

            C0392a(AssistantFeatureDependencies assistantFeatureDependencies) {
                this.a = assistantFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public gc get() {
                return (gc) jh8.d(this.a.a());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerAssistantPreferencesComponent.java */
        /* renamed from: jb2$a$b */
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

        private void b(AssistantFeatureDependencies assistantFeatureDependencies, fv fvVar) {
            this.c = z45.a(fvVar);
            this.d = new b(assistantFeatureDependencies);
            this.e = new C0392a(assistantFeatureDependencies);
            as8<iv> a = p63.a(jv.a(this.c));
            this.f = a;
            this.g = p63.a(mv.a(this.c, this.d, this.e, a));
        }

        private gv c(gv gvVar) {
            hv.a(gvVar, this.g);
            return gvVar;
        }

        @Override // defpackage.ev
        public void a(gv gvVar) {
            c(gvVar);
        }

        private a(AssistantFeatureDependencies assistantFeatureDependencies, fv fvVar) {
            this.b = this;
            b(assistantFeatureDependencies, fvVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAssistantPreferencesComponent.java */
    /* renamed from: jb2$b */
    /* loaded from: classes2.dex */
    public static final class b implements ev.b {
        private b() {
        }

        @Override // defpackage.ev.b
        public ev a(fv fvVar, AssistantFeatureDependencies assistantFeatureDependencies) {
            jh8.b(fvVar);
            jh8.b(assistantFeatureDependencies);
            return new a(assistantFeatureDependencies, fvVar);
        }
    }

    public static ev.b a() {
        return new b();
    }
}
