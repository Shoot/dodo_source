package defpackage;

import com.dodopizza.auth.features.legaldocuments.LegalDocumentsFeatureDependencies;
import com.dodopizza.auth.features.legaldocuments.presentation.LegalDocumentsPresenter;
import defpackage.po5;
/* compiled from: DaggerLegalDocumentsComponent.java */
/* renamed from: ef2  reason: default package */
/* loaded from: classes.dex */
public final class ef2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerLegalDocumentsComponent.java */
    /* renamed from: ef2$a */
    /* loaded from: classes.dex */
    public static final class a implements po5.b {
        private a() {
        }

        @Override // defpackage.po5.b
        public po5 a(qo5 qo5Var, LegalDocumentsFeatureDependencies legalDocumentsFeatureDependencies) {
            jh8.b(qo5Var);
            jh8.b(legalDocumentsFeatureDependencies);
            return new b(legalDocumentsFeatureDependencies, qo5Var);
        }
    }

    /* compiled from: DaggerLegalDocumentsComponent.java */
    /* renamed from: ef2$b */
    /* loaded from: classes.dex */
    private static final class b implements po5 {
        private final b b;
        private as8<qo5> c;
        private as8<f63> d;
        private as8<hq3> e;
        private as8<LegalDocumentsPresenter> f;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerLegalDocumentsComponent.java */
        /* renamed from: ef2$b$a */
        /* loaded from: classes.dex */
        public static final class a implements as8<hq3> {
            private final LegalDocumentsFeatureDependencies a;

            a(LegalDocumentsFeatureDependencies legalDocumentsFeatureDependencies) {
                this.a = legalDocumentsFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public hq3 get() {
                return (hq3) jh8.d(this.a.c());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerLegalDocumentsComponent.java */
        /* renamed from: ef2$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0303b implements as8<f63> {
            private final LegalDocumentsFeatureDependencies a;

            C0303b(LegalDocumentsFeatureDependencies legalDocumentsFeatureDependencies) {
                this.a = legalDocumentsFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public f63 get() {
                return (f63) jh8.d(this.a.b());
            }
        }

        private void b(LegalDocumentsFeatureDependencies legalDocumentsFeatureDependencies, qo5 qo5Var) {
            this.c = z45.a(qo5Var);
            this.d = new C0303b(legalDocumentsFeatureDependencies);
            a aVar = new a(legalDocumentsFeatureDependencies);
            this.e = aVar;
            this.f = p63.a(to5.a(this.c, this.d, aVar));
        }

        private com.dodopizza.auth.features.legaldocuments.presentation.a c(com.dodopizza.auth.features.legaldocuments.presentation.a aVar) {
            so5.a(aVar, this.f);
            return aVar;
        }

        @Override // defpackage.po5
        public void a(com.dodopizza.auth.features.legaldocuments.presentation.a aVar) {
            c(aVar);
        }

        private b(LegalDocumentsFeatureDependencies legalDocumentsFeatureDependencies, qo5 qo5Var) {
            this.b = this;
            b(legalDocumentsFeatureDependencies, qo5Var);
        }
    }

    public static po5.b a() {
        return new a();
    }
}
