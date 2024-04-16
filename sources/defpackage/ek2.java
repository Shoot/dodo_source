package defpackage;

import com.dodopizza.feature.webinfo.WebInfoFeatureDependencies;
import com.dodopizza.feature.webinfo.presentation.WebInfoPresenter;
import com.dodopizza.feature.webinfo.presentation.c;
import defpackage.f3c;
/* compiled from: DaggerWebInfoComponent.java */
/* renamed from: ek2  reason: default package */
/* loaded from: classes.dex */
public final class ek2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerWebInfoComponent.java */
    /* renamed from: ek2$a */
    /* loaded from: classes.dex */
    public static final class a implements f3c.b {
        private a() {
        }

        @Override // defpackage.f3c.b
        public f3c a(com.dodopizza.feature.webinfo.presentation.a aVar, WebInfoFeatureDependencies webInfoFeatureDependencies) {
            jh8.b(aVar);
            jh8.b(webInfoFeatureDependencies);
            return new b(webInfoFeatureDependencies, aVar);
        }
    }

    /* compiled from: DaggerWebInfoComponent.java */
    /* renamed from: ek2$b */
    /* loaded from: classes.dex */
    private static final class b implements f3c {
        private final WebInfoFeatureDependencies b;
        private final b c;
        private as8<com.dodopizza.feature.webinfo.presentation.a> d;
        private as8<f63> e;
        private as8<gc> f;
        private as8<WebInfoPresenter> g;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerWebInfoComponent.java */
        /* renamed from: ek2$b$a */
        /* loaded from: classes.dex */
        public static final class a implements as8<gc> {
            private final WebInfoFeatureDependencies a;

            a(WebInfoFeatureDependencies webInfoFeatureDependencies) {
                this.a = webInfoFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public gc get() {
                return (gc) jh8.d(this.a.a());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerWebInfoComponent.java */
        /* renamed from: ek2$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0305b implements as8<f63> {
            private final WebInfoFeatureDependencies a;

            C0305b(WebInfoFeatureDependencies webInfoFeatureDependencies) {
                this.a = webInfoFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public f63 get() {
                return (f63) jh8.d(this.a.b());
            }
        }

        private void b(WebInfoFeatureDependencies webInfoFeatureDependencies, com.dodopizza.feature.webinfo.presentation.a aVar) {
            this.d = z45.a(aVar);
            this.e = new C0305b(webInfoFeatureDependencies);
            a aVar2 = new a(webInfoFeatureDependencies);
            this.f = aVar2;
            this.g = k3c.a(this.d, this.e, aVar2);
        }

        private c c(c cVar) {
            i3c.b(cVar, this.g);
            i3c.a(cVar, (mh0) jh8.d(this.b.i()));
            return cVar;
        }

        @Override // defpackage.f3c
        public void a(c cVar) {
            c(cVar);
        }

        private b(WebInfoFeatureDependencies webInfoFeatureDependencies, com.dodopizza.feature.webinfo.presentation.a aVar) {
            this.c = this;
            this.b = webInfoFeatureDependencies;
            b(webInfoFeatureDependencies, aVar);
        }
    }

    public static f3c.b a() {
        return new a();
    }
}
