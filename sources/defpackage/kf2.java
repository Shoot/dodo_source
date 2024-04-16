package defpackage;

import com.dodopizza.loyalty.menu.LoyaltyPresenter;
import com.dodopizza.loyalty.menu.di.LoyaltyDependencies;
import defpackage.d06;
/* compiled from: DaggerLoyaltyComponent.java */
/* renamed from: kf2  reason: default package */
/* loaded from: classes2.dex */
public final class kf2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerLoyaltyComponent.java */
    /* renamed from: kf2$a */
    /* loaded from: classes2.dex */
    public static final class a implements d06.b {
        private a() {
        }

        @Override // defpackage.d06.b
        public d06 a(LoyaltyDependencies loyaltyDependencies, e06 e06Var) {
            jh8.b(loyaltyDependencies);
            jh8.b(e06Var);
            return new b(loyaltyDependencies, e06Var);
        }
    }

    /* compiled from: DaggerLoyaltyComponent.java */
    /* renamed from: kf2$b */
    /* loaded from: classes2.dex */
    private static final class b implements d06 {
        private final e06 b;
        private final LoyaltyDependencies c;
        private final b d;

        private s06 b() {
            return new s06((x26) jh8.d(this.c.y()), (t52) jh8.d(this.c.m()), (ds0) jh8.d(this.c.o()), (ava) jh8.d(this.c.h()), (hq3) jh8.d(this.c.c()), (dt5) jh8.d(this.c.F()), (fda) jh8.d(this.c.j0()), (kx1) jh8.d(this.c.d()));
        }

        @Override // defpackage.d06
        public LoyaltyPresenter a() {
            return x16.a(this.b, b(), (f63) jh8.d(this.c.b()), (gc) jh8.d(this.c.a()));
        }

        private b(LoyaltyDependencies loyaltyDependencies, e06 e06Var) {
            this.d = this;
            this.b = e06Var;
            this.c = loyaltyDependencies;
        }
    }

    public static d06.b a() {
        return new a();
    }
}
