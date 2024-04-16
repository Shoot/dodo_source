package com.dodopizza.order.feature.product.card.presentation;

import com.dodopizza.order.feature.product.card.presentation.a;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.jl8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AbstractProductCardPresenter.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u0000 \u000e*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0007B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0005\u001a\u00020\u0004R\u001a\u0010\u000b\u001a\u00020\u00068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/dodopizza/order/feature/product/card/presentation/AbstractProductCardPresenter;", "Ljl8;", "T", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "", "r", "Lf63;", "a", "Lf63;", Image.TYPE_SMALL, "()Lf63;", "router", "<init>", "(Lf63;)V", "b", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class AbstractProductCardPresenter<T extends jl8> extends BasePresenter<T> {
    public static final a b = new a(null);
    public static final int c = 8;
    private static final int d = gy8.add_product_result_id;
    private final f63 a;

    /* compiled from: AbstractProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/dodopizza/order/feature/product/card/presentation/AbstractProductCardPresenter$a;", "", "", "RESULT_ID", "I", "a", "()I", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return AbstractProductCardPresenter.d;
        }
    }

    public AbstractProductCardPresenter(f63 f63Var) {
        z65.h(f63Var, "router");
        this.a = f63Var;
    }

    public final void r() {
        this.a.i(d, a.b.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final f63 s() {
        return this.a;
    }
}
