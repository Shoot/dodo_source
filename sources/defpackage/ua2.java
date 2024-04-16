package defpackage;

import com.dodopizza.onboarding.feature.apprestartapprove.AppRestartApproveFeatureDependencies;
import com.dodopizza.onboarding.feature.apprestartapprove.presentation.AppRestartApprovePresenter;
import defpackage.mo;
/* compiled from: DaggerAppRestartApproveComponent.java */
/* renamed from: ua2  reason: default package */
/* loaded from: classes2.dex */
public final class ua2 {

    /* compiled from: DaggerAppRestartApproveComponent.java */
    /* renamed from: ua2$a */
    /* loaded from: classes2.dex */
    private static final class a implements mo {
        private final a b;
        private as8<no> c;
        private as8<f63> d;
        private as8<AppRestartApprovePresenter> e;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerAppRestartApproveComponent.java */
        /* renamed from: ua2$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0685a implements as8<f63> {
            private final AppRestartApproveFeatureDependencies a;

            C0685a(AppRestartApproveFeatureDependencies appRestartApproveFeatureDependencies) {
                this.a = appRestartApproveFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public f63 get() {
                return (f63) jh8.d(this.a.b());
            }
        }

        private void b(AppRestartApproveFeatureDependencies appRestartApproveFeatureDependencies, no noVar) {
            this.c = z45.a(noVar);
            C0685a c0685a = new C0685a(appRestartApproveFeatureDependencies);
            this.d = c0685a;
            this.e = p63.a(so.a(this.c, c0685a));
        }

        private qo c(qo qoVar) {
            ro.a(qoVar, this.e);
            return qoVar;
        }

        @Override // defpackage.mo
        public void a(qo qoVar) {
            c(qoVar);
        }

        private a(AppRestartApproveFeatureDependencies appRestartApproveFeatureDependencies, no noVar) {
            this.b = this;
            b(appRestartApproveFeatureDependencies, noVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerAppRestartApproveComponent.java */
    /* renamed from: ua2$b */
    /* loaded from: classes2.dex */
    public static final class b implements mo.b {
        private b() {
        }

        @Override // defpackage.mo.b
        public mo a(no noVar, AppRestartApproveFeatureDependencies appRestartApproveFeatureDependencies) {
            jh8.b(noVar);
            jh8.b(appRestartApproveFeatureDependencies);
            return new a(appRestartApproveFeatureDependencies, noVar);
        }
    }

    public static mo.b a() {
        return new b();
    }
}
