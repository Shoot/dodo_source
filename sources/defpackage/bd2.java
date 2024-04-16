package defpackage;

import com.dodopizza.controlling.feature.couriertipscard.CourierTipsCardFeatureDependencies;
import com.dodopizza.controlling.feature.couriertipscard.presentation.CourierTipsCardPresenter;
import defpackage.dz1;
/* compiled from: DaggerCourierTipsCardComponent.java */
/* renamed from: bd2  reason: default package */
/* loaded from: classes.dex */
public final class bd2 {

    /* compiled from: DaggerCourierTipsCardComponent.java */
    /* renamed from: bd2$a */
    /* loaded from: classes.dex */
    private static final class a implements dz1 {
        private final ez1 b;
        private final CourierTipsCardFeatureDependencies c;
        private final a d;

        private iz1 b() {
            return kz1.a((tz1) jh8.d(this.c.e0()), (pz1) jh8.d(this.c.k0()));
        }

        @Override // defpackage.dz1
        public CourierTipsCardPresenter a() {
            return lz1.a(this.b, (gc) jh8.d(this.c.a()), b(), (fz1) jh8.d(this.c.F2()));
        }

        private a(CourierTipsCardFeatureDependencies courierTipsCardFeatureDependencies, ez1 ez1Var) {
            this.d = this;
            this.b = ez1Var;
            this.c = courierTipsCardFeatureDependencies;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerCourierTipsCardComponent.java */
    /* renamed from: bd2$b */
    /* loaded from: classes.dex */
    public static final class b implements dz1.b {
        private b() {
        }

        @Override // defpackage.dz1.b
        public dz1 a(CourierTipsCardFeatureDependencies courierTipsCardFeatureDependencies, ez1 ez1Var) {
            jh8.b(courierTipsCardFeatureDependencies);
            jh8.b(ez1Var);
            return new a(courierTipsCardFeatureDependencies, ez1Var);
        }
    }

    public static dz1.b a() {
        return new b();
    }
}
