package defpackage;

import com.dodopizza.controlling.feature.mysteryshoppercard.MysteryShopperCardFeatureDependencies;
import com.dodopizza.controlling.feature.mysteryshoppercard.presentation.MysteryShopperCardPresenter;
import defpackage.rr6;
/* compiled from: DaggerMysteryShopperCardComponent.java */
/* renamed from: wf2  reason: default package */
/* loaded from: classes.dex */
public final class wf2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerMysteryShopperCardComponent.java */
    /* renamed from: wf2$a */
    /* loaded from: classes.dex */
    public static final class a implements rr6.b {
        private a() {
        }

        @Override // defpackage.rr6.b
        public rr6 a(sr6 sr6Var, MysteryShopperCardFeatureDependencies mysteryShopperCardFeatureDependencies) {
            jh8.b(sr6Var);
            jh8.b(mysteryShopperCardFeatureDependencies);
            return new b(mysteryShopperCardFeatureDependencies, sr6Var);
        }
    }

    /* compiled from: DaggerMysteryShopperCardComponent.java */
    /* renamed from: wf2$b */
    /* loaded from: classes.dex */
    private static final class b implements rr6 {
        private final sr6 b;
        private final MysteryShopperCardFeatureDependencies c;
        private final b d;

        private ur6 b() {
            return xr6.a((es6) jh8.d(this.c.V()));
        }

        @Override // defpackage.rr6
        public MysteryShopperCardPresenter a() {
            return new MysteryShopperCardPresenter(this.b, (gc) jh8.d(this.c.a()), b(), (tr6) jh8.d(this.c.K3()));
        }

        private b(MysteryShopperCardFeatureDependencies mysteryShopperCardFeatureDependencies, sr6 sr6Var) {
            this.d = this;
            this.b = sr6Var;
            this.c = mysteryShopperCardFeatureDependencies;
        }
    }

    public static rr6.b a() {
        return new a();
    }
}
