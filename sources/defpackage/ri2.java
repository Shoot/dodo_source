package defpackage;

import com.dodopizza.controlling.feature.rndigitalcard.RnDigitalCardFeatureDependencies;
import com.dodopizza.controlling.feature.rndigitalcard.presentation.RnDigitalCardPresenter;
import defpackage.um9;
/* compiled from: DaggerRnDigitalCardComponent.java */
/* renamed from: ri2  reason: default package */
/* loaded from: classes.dex */
public final class ri2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerRnDigitalCardComponent.java */
    /* renamed from: ri2$a */
    /* loaded from: classes.dex */
    public static final class a implements um9.b {
        private a() {
        }

        @Override // defpackage.um9.b
        public um9 a(RnDigitalCardFeatureDependencies rnDigitalCardFeatureDependencies, vm9 vm9Var) {
            jh8.b(rnDigitalCardFeatureDependencies);
            jh8.b(vm9Var);
            return new b(rnDigitalCardFeatureDependencies, vm9Var);
        }
    }

    /* compiled from: DaggerRnDigitalCardComponent.java */
    /* renamed from: ri2$b */
    /* loaded from: classes.dex */
    private static final class b implements um9 {
        private final vm9 b;
        private final RnDigitalCardFeatureDependencies c;
        private final b d;

        private ym9 b() {
            return an9.a((en9) jh8.d(this.c.W2()));
        }

        @Override // defpackage.um9
        public RnDigitalCardPresenter a() {
            return new RnDigitalCardPresenter(this.b, (gc) jh8.d(this.c.a()), b(), (f63) jh8.d(this.c.b()));
        }

        private b(RnDigitalCardFeatureDependencies rnDigitalCardFeatureDependencies, vm9 vm9Var) {
            this.d = this;
            this.b = vm9Var;
            this.c = rnDigitalCardFeatureDependencies;
        }
    }

    public static um9.b a() {
        return new a();
    }
}
