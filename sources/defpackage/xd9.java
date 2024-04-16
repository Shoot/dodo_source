package defpackage;

import com.dodopizza.order.feature.product.card.presentation.removeingredient.RemoveIngredientsPresenter;
import java.util.List;
/* compiled from: RemoveIngredientsModule_ProvideRemoveIngredientPresenterFactory.java */
/* renamed from: xd9  reason: default package */
/* loaded from: classes2.dex */
public final class xd9 implements no3<RemoveIngredientsPresenter> {
    private final as8<String> a;
    private final as8<List<vl8>> b;
    private final as8<gc> c;

    public xd9(as8<String> as8Var, as8<List<vl8>> as8Var2, as8<gc> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static xd9 a(as8<String> as8Var, as8<List<vl8>> as8Var2, as8<gc> as8Var3) {
        return new xd9(as8Var, as8Var2, as8Var3);
    }

    public static RemoveIngredientsPresenter c(String str, List<vl8> list, gc gcVar) {
        return (RemoveIngredientsPresenter) jh8.e(wd9.a.a(str, list, gcVar));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public RemoveIngredientsPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
