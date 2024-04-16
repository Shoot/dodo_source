package defpackage;

import com.dodopizza.order.feature.personaldelivery.DynamicDeliveryFeatureDependencies;
import defpackage.p93;
/* compiled from: DaggerDynamicDeliveryComponent.java */
/* renamed from: qd2  reason: default package */
/* loaded from: classes2.dex */
public final class qd2 {

    /* compiled from: DaggerDynamicDeliveryComponent.java */
    /* renamed from: qd2$a */
    /* loaded from: classes2.dex */
    private static final class a implements p93 {
        private final DynamicDeliveryFeatureDependencies b;
        private final a c;

        private s93 b(s93 s93Var) {
            t93.b(s93Var, (f63) jh8.d(this.b.s()));
            t93.a(s93Var, (gc) jh8.d(this.b.a()));
            return s93Var;
        }

        @Override // defpackage.p93
        public void a(s93 s93Var) {
            b(s93Var);
        }

        private a(DynamicDeliveryFeatureDependencies dynamicDeliveryFeatureDependencies) {
            this.c = this;
            this.b = dynamicDeliveryFeatureDependencies;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerDynamicDeliveryComponent.java */
    /* renamed from: qd2$b */
    /* loaded from: classes2.dex */
    public static final class b implements p93.b {
        private b() {
        }

        @Override // defpackage.p93.b
        public p93 a(DynamicDeliveryFeatureDependencies dynamicDeliveryFeatureDependencies) {
            jh8.b(dynamicDeliveryFeatureDependencies);
            return new a(dynamicDeliveryFeatureDependencies);
        }
    }

    public static p93.b a() {
        return new b();
    }
}
