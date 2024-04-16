package com.dodopizza.order.feature.product.card.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AbstractProductCardPresenter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/dodopizza/order/feature/product/card/presentation/a;", "", "<init>", "()V", "a", "b", "Lcom/dodopizza/order/feature/product/card/presentation/a$a;", "Lcom/dodopizza/order/feature/product/card/presentation/a$b;", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class a {

    /* compiled from: AbstractProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/dodopizza/order/feature/product/card/presentation/a$a;", "Lcom/dodopizza/order/feature/product/card/presentation/a;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "menuItemId", "<init>", "(Ljava/lang/String;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.dodopizza.order.feature.product.card.presentation.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0194a extends a {
        private final String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0194a(String str) {
            super(null);
            z65.h(str, "menuItemId");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }
    }

    /* compiled from: AbstractProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/order/feature/product/card/presentation/a$b;", "Lcom/dodopizza/order/feature/product/card/presentation/a;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class b extends a {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    private a() {
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
