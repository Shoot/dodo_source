package defpackage;

import com.dodopizza.order.feature.product.card.presentation.removeingredient.RemoveIngredientsFeatureDependencies;
import com.dodopizza.order.feature.product.card.presentation.removeingredient.RemoveIngredientsPresenter;
import defpackage.sd9;
import java.util.List;
/* compiled from: DaggerRemoveIngredientsComponent.java */
/* renamed from: oi2  reason: default package */
/* loaded from: classes2.dex */
public final class oi2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerRemoveIngredientsComponent.java */
    /* renamed from: oi2$a */
    /* loaded from: classes2.dex */
    public static final class a implements sd9.b {
        private a() {
        }

        @Override // defpackage.sd9.b
        public sd9 a(RemoveIngredientsFeatureDependencies removeIngredientsFeatureDependencies, String str, List<vl8> list) {
            jh8.b(removeIngredientsFeatureDependencies);
            jh8.b(str);
            jh8.b(list);
            return new b(removeIngredientsFeatureDependencies, str, list);
        }
    }

    /* compiled from: DaggerRemoveIngredientsComponent.java */
    /* renamed from: oi2$b */
    /* loaded from: classes2.dex */
    private static final class b implements sd9 {
        private final b b;
        private as8<String> c;
        private as8<List<vl8>> d;
        private as8<gc> e;
        private as8<RemoveIngredientsPresenter> f;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerRemoveIngredientsComponent.java */
        /* renamed from: oi2$b$a */
        /* loaded from: classes2.dex */
        public static final class a implements as8<gc> {
            private final RemoveIngredientsFeatureDependencies a;

            a(RemoveIngredientsFeatureDependencies removeIngredientsFeatureDependencies) {
                this.a = removeIngredientsFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public gc get() {
                return (gc) jh8.d(this.a.a());
            }
        }

        private void b(RemoveIngredientsFeatureDependencies removeIngredientsFeatureDependencies, String str, List<vl8> list) {
            this.c = z45.a(str);
            this.d = z45.a(list);
            a aVar = new a(removeIngredientsFeatureDependencies);
            this.e = aVar;
            this.f = xd9.a(this.c, this.d, aVar);
        }

        private ud9 c(ud9 ud9Var) {
            vd9.a(ud9Var, this.f);
            return ud9Var;
        }

        @Override // defpackage.sd9
        public void a(ud9 ud9Var) {
            c(ud9Var);
        }

        private b(RemoveIngredientsFeatureDependencies removeIngredientsFeatureDependencies, String str, List<vl8> list) {
            this.b = this;
            b(removeIngredientsFeatureDependencies, str, list);
        }
    }

    public static sd9.b a() {
        return new a();
    }
}
