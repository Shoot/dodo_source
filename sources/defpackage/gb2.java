package defpackage;

import com.dodopizza.order.feature.assistant.AssistantFeatureDependencies;
import com.dodopizza.order.feature.assistant.mood.presentation.AssistantMoodPresenter;
import defpackage.lu;
/* compiled from: DaggerAssistantMoodComponent.java */
/* renamed from: gb2  reason: default package */
/* loaded from: classes2.dex */
public final class gb2 {

    /* compiled from: DaggerAssistantMoodComponent.java */
    /* renamed from: gb2$a */
    /* loaded from: classes2.dex */
    private static final class a implements lu {
        private final a b;
        private as8<f63> c;
        private as8<gc> d;
        private as8<mu> e;
        private as8<qu> f;
        private as8<AssistantMoodPresenter> g;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerAssistantMoodComponent.java */
        /* renamed from: gb2$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0323a implements as8<gc> {
            private final AssistantFeatureDependencies a;

            C0323a(AssistantFeatureDependencies assistantFeatureDependencies) {
                this.a = assistantFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public gc get() {
                return (gc) jh8.d(this.a.a());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerAssistantMoodComponent.java */
        /* renamed from: gb2$a$b */
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

        private void b(AssistantFeatureDependencies assistantFeatureDependencies, mu muVar) {
            this.c = new b(assistantFeatureDependencies);
            this.d = new C0323a(assistantFeatureDependencies);
            no3 a = z45.a(muVar);
            this.e = a;
            as8<qu> a2 = p63.a(ru.a(a));
            this.f = a2;
            this.g = p63.a(uu.a(this.c, this.d, a2));
        }

        private ou c(ou ouVar) {
            pu.a(ouVar, this.g);
            return ouVar;
        }

        @Override // defpackage.lu
        public void a(ou ouVar) {
            c(ouVar);
        }

        private a(AssistantFeatureDependencies assistantFeatureDependencies, mu muVar) {
            this.b = this;
            b(assistantFeatureDependencies, muVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAssistantMoodComponent.java */
    /* renamed from: gb2$b */
    /* loaded from: classes2.dex */
    public static final class b implements lu.b {
        private b() {
        }

        @Override // defpackage.lu.b
        public lu a(mu muVar, AssistantFeatureDependencies assistantFeatureDependencies) {
            jh8.b(muVar);
            jh8.b(assistantFeatureDependencies);
            return new a(assistantFeatureDependencies, muVar);
        }
    }

    public static lu.b a() {
        return new b();
    }
}
