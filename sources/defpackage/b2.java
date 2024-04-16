package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.dodopizza.order.feature.product.card.presentation.AbstractProductCardPresenter;
import com.dodopizza.order.feature.product.card.presentation.shoppingitem.ShoppingItemNavigationBar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: AbstractProductCardFragment.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0001\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\n\u001a\u00020\tH\u0014J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0003H\u0014R\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lb2;", "Lf70;", "Ljl8;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "", "hh", "rootView", "ih", "Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ShoppingItemNavigationBar;", "mh", "()Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ShoppingItemNavigationBar;", "navigationBar", "Lcom/dodopizza/order/feature/product/card/presentation/AbstractProductCardPresenter;", "nh", "()Lcom/dodopizza/order/feature/product/card/presentation/AbstractProductCardPresenter;", "presenter", "layoutId", "<init>", "(I)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: b2  reason: default package */
/* loaded from: classes2.dex */
public abstract class b2 extends f70 implements jl8 {

    /* compiled from: AbstractProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b2$a */
    /* loaded from: classes2.dex */
    static final class a extends ej5 implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            b2.this.nh().r();
        }
    }

    public b2(int i) {
        super(i);
    }

    @Override // defpackage.f70
    protected int hh() {
        if (Build.VERSION.SDK_INT >= 23) {
            return ew8.G;
        }
        return ew8.f;
    }

    @Override // defpackage.f70
    protected void ih(View view) {
        z65.h(view, "rootView");
        p45.c(view, null, true, 1, null);
    }

    public abstract ShoppingItemNavigationBar mh();

    public abstract AbstractProductCardPresenter<? extends jl8> nh();

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        mh().setOnBackButtonClick(new a());
    }
}
