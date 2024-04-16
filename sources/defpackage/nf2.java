package defpackage;

import com.dodopizza.loyalty.missions.LoyaltyMissionDetailsPresenter;
import com.dodopizza.loyalty.missions.di.LoyaltyMissionDetailsDependencies;
import defpackage.a16;
/* compiled from: DaggerLoyaltyMissionDetailsComponent.java */
/* renamed from: nf2  reason: default package */
/* loaded from: classes2.dex */
public final class nf2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerLoyaltyMissionDetailsComponent.java */
    /* renamed from: nf2$a */
    /* loaded from: classes2.dex */
    public static final class a implements a16.b {
        private a() {
        }

        @Override // defpackage.a16.b
        public a16 a(LoyaltyMissionDetailsDependencies loyaltyMissionDetailsDependencies, b16 b16Var) {
            jh8.b(loyaltyMissionDetailsDependencies);
            jh8.b(b16Var);
            return new b(loyaltyMissionDetailsDependencies, b16Var);
        }
    }

    /* compiled from: DaggerLoyaltyMissionDetailsComponent.java */
    /* renamed from: nf2$b */
    /* loaded from: classes2.dex */
    private static final class b implements a16 {
        private final LoyaltyMissionDetailsDependencies b;
        private final b16 c;
        private final b d;

        private o16 b() {
            return new o16((x26) jh8.d(this.b.y()), (gc) jh8.d(this.b.a()));
        }

        @Override // defpackage.a16
        public LoyaltyMissionDetailsPresenter a() {
            return new LoyaltyMissionDetailsPresenter(b(), (f63) jh8.d(this.b.b()), this.c, (gc) jh8.d(this.b.a()));
        }

        private b(LoyaltyMissionDetailsDependencies loyaltyMissionDetailsDependencies, b16 b16Var) {
            this.d = this;
            this.b = loyaltyMissionDetailsDependencies;
            this.c = b16Var;
        }
    }

    public static a16.b a() {
        return new a();
    }
}
