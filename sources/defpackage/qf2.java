package defpackage;

import com.dodopizza.loyalty.products.di.LoyaltyProductsDependencies;
import com.dodopizza.loyalty.products.presentation.LoyaltyProductsPresenter;
import defpackage.g26;
/* compiled from: DaggerLoyaltyProductsComponent.java */
/* renamed from: qf2  reason: default package */
/* loaded from: classes2.dex */
public final class qf2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerLoyaltyProductsComponent.java */
    /* renamed from: qf2$a */
    /* loaded from: classes2.dex */
    public static final class a implements g26.b {
        private a() {
        }

        @Override // defpackage.g26.b
        public g26 a(LoyaltyProductsDependencies loyaltyProductsDependencies, h26 h26Var) {
            jh8.b(loyaltyProductsDependencies);
            jh8.b(h26Var);
            return new b(loyaltyProductsDependencies, h26Var);
        }
    }

    /* compiled from: DaggerLoyaltyProductsComponent.java */
    /* renamed from: qf2$b */
    /* loaded from: classes2.dex */
    private static final class b implements g26 {
        private final LoyaltyProductsDependencies b;
        private final h26 c;
        private final b d;

        private k26 b() {
            return d26.a(this.c, (ds0) jh8.d(this.b.o()), (mxa) jh8.d(this.b.O()));
        }

        @Override // defpackage.g26
        public LoyaltyProductsPresenter a() {
            return new LoyaltyProductsPresenter((f63) jh8.d(this.b.b()), b(), (gc) jh8.d(this.b.a()));
        }

        private b(LoyaltyProductsDependencies loyaltyProductsDependencies, h26 h26Var) {
            this.d = this;
            this.b = loyaltyProductsDependencies;
            this.c = h26Var;
        }
    }

    public static g26.b a() {
        return new a();
    }
}
