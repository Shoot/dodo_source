package defpackage;

import com.dodopizza.core.feature.debugtools.toggles.FeatureTogglesFeatureDependencies;
import com.dodopizza.core.feature.debugtools.toggles.presentation.TogglesPresenter;
import defpackage.eib;
/* compiled from: DaggerTogglesComponent.java */
/* renamed from: uj2  reason: default package */
/* loaded from: classes.dex */
public final class uj2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerTogglesComponent.java */
    /* renamed from: uj2$a */
    /* loaded from: classes.dex */
    public static final class a implements eib.b {
        private a() {
        }

        @Override // defpackage.eib.b
        public eib a(FeatureTogglesFeatureDependencies featureTogglesFeatureDependencies) {
            jh8.b(featureTogglesFeatureDependencies);
            return new b(featureTogglesFeatureDependencies);
        }
    }

    /* compiled from: DaggerTogglesComponent.java */
    /* renamed from: uj2$b */
    /* loaded from: classes.dex */
    private static final class b implements eib {
        private final FeatureTogglesFeatureDependencies b;
        private final b c;

        @Override // defpackage.eib
        public TogglesPresenter a() {
            return new TogglesPresenter((ci8) jh8.d(this.b.G()), (f89) jh8.d(this.b.w2()), (yhb) jh8.d(this.b.u0()), (hq3) jh8.d(this.b.c()), (s80) jh8.d(this.b.T()), (dq3) jh8.d(this.b.U()), (kx1) jh8.d(this.b.d()));
        }

        private b(FeatureTogglesFeatureDependencies featureTogglesFeatureDependencies) {
            this.c = this;
            this.b = featureTogglesFeatureDependencies;
        }
    }

    public static eib.b a() {
        return new a();
    }
}
