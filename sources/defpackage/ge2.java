package defpackage;

import com.dodopizza.controlling.feature.fullscreenimage.FullscreenImageFeatureDependencies;
import com.dodopizza.controlling.feature.fullscreenimage.presentation.FullscreenImagePresenter;
import defpackage.u74;
/* compiled from: DaggerFullscreenImageComponent.java */
/* renamed from: ge2  reason: default package */
/* loaded from: classes.dex */
public final class ge2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerFullscreenImageComponent.java */
    /* renamed from: ge2$a */
    /* loaded from: classes.dex */
    public static final class a implements u74.b {
        private a() {
        }

        @Override // defpackage.u74.b
        public u74 a(v74 v74Var, FullscreenImageFeatureDependencies fullscreenImageFeatureDependencies) {
            jh8.b(v74Var);
            jh8.b(fullscreenImageFeatureDependencies);
            return new b(fullscreenImageFeatureDependencies, v74Var);
        }
    }

    /* compiled from: DaggerFullscreenImageComponent.java */
    /* renamed from: ge2$b */
    /* loaded from: classes.dex */
    private static final class b implements u74 {
        private final b b;
        private as8<v74> c;
        private as8<f63> d;
        private as8<FullscreenImagePresenter> e;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerFullscreenImageComponent.java */
        /* renamed from: ge2$b$a */
        /* loaded from: classes.dex */
        public static final class a implements as8<f63> {
            private final FullscreenImageFeatureDependencies a;

            a(FullscreenImageFeatureDependencies fullscreenImageFeatureDependencies) {
                this.a = fullscreenImageFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public f63 get() {
                return (f63) jh8.d(this.a.b());
            }
        }

        private void b(FullscreenImageFeatureDependencies fullscreenImageFeatureDependencies, v74 v74Var) {
            this.c = z45.a(v74Var);
            a aVar = new a(fullscreenImageFeatureDependencies);
            this.d = aVar;
            this.e = d84.a(this.c, aVar);
        }

        private a84 c(a84 a84Var) {
            b84.a(a84Var, this.e);
            return a84Var;
        }

        @Override // defpackage.u74
        public void a(a84 a84Var) {
            c(a84Var);
        }

        private b(FullscreenImageFeatureDependencies fullscreenImageFeatureDependencies, v74 v74Var) {
            this.b = this;
            b(fullscreenImageFeatureDependencies, v74Var);
        }
    }

    public static u74.b a() {
        return new a();
    }
}
