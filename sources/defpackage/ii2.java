package defpackage;

import com.dodopizza.loyalty.referralsystem.ReferralSystemPresenter;
import com.dodopizza.loyalty.referralsystem.di.ReferralSystemFeatureDependencies;
import defpackage.kb9;
/* compiled from: DaggerReferralSystemComponent.java */
/* renamed from: ii2  reason: default package */
/* loaded from: classes2.dex */
public final class ii2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerReferralSystemComponent.java */
    /* renamed from: ii2$a */
    /* loaded from: classes2.dex */
    public static final class a implements kb9.b {
        private a() {
        }

        @Override // defpackage.kb9.b
        public kb9 a(ReferralSystemFeatureDependencies referralSystemFeatureDependencies) {
            jh8.b(referralSystemFeatureDependencies);
            return new b(referralSystemFeatureDependencies);
        }
    }

    /* compiled from: DaggerReferralSystemComponent.java */
    /* renamed from: ii2$b */
    /* loaded from: classes2.dex */
    private static final class b implements kb9 {
        private final ReferralSystemFeatureDependencies b;
        private final b c;

        private qb9 b() {
            return new qb9((x26) jh8.d(this.b.y()), (fda) jh8.d(this.b.j0()), (kx1) jh8.d(this.b.d()));
        }

        @Override // defpackage.kb9
        public ReferralSystemPresenter a() {
            return new ReferralSystemPresenter(b(), (f63) jh8.d(this.b.b()), (lb9) jh8.d(this.b.T2()), (hq3) jh8.d(this.b.c()), (gc) jh8.d(this.b.a()));
        }

        private b(ReferralSystemFeatureDependencies referralSystemFeatureDependencies) {
            this.c = this;
            this.b = referralSystemFeatureDependencies;
        }
    }

    public static kb9.b a() {
        return new a();
    }
}
