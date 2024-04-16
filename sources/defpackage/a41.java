package defpackage;

import kotlin.Metadata;
import ru.dodopizza.app.di.locality.LocalityComponent;
import ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponent;
/* compiled from: CheckoutChildFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"La41;", "", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: a41  reason: default package */
/* loaded from: classes4.dex */
public interface a41 {

    /* compiled from: CheckoutChildFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: a41$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public static f63 a(a41 a41Var, f70 f70Var) {
            z65.h(f70Var, "fragment");
            if (!(f70Var.getParentFragment() instanceof c70) && !(f70Var.getParentFragment() instanceof y31)) {
                return ((LocalityComponent) f70Var.getComponentDependenciesRegistry().a(bc9.b(LocalityComponent.class))).b();
            }
            return ((CheckoutComponent) f70Var.getComponentDependenciesRegistry().a(bc9.b(CheckoutComponent.class))).b();
        }
    }
}
