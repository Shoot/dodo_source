package com.dodopizza.order.feature.checkout.sbp.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SbpBankListPresenter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/dodopizza/order/feature/checkout/sbp/presentation/b;", "Lok3;", "<init>", "()V", "a", "b", "Lcom/dodopizza/order/feature/checkout/sbp/presentation/b$a;", "Lcom/dodopizza/order/feature/checkout/sbp/presentation/b$b;", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class b extends ok3 {

    /* compiled from: SbpBankListPresenter.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003¨\u0006\f"}, d2 = {"Lcom/dodopizza/order/feature/checkout/sbp/presentation/b$a;", "Lcom/dodopizza/order/feature/checkout/sbp/presentation/b;", "", "toString", "", "hashCode", "", "other", "", "equals", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a extends b {
        public static final a a = new a();

        private a() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return true;
        }

        public int hashCode() {
            return -880518067;
        }

        public String toString() {
            return "NavigationButtonPressed";
        }
    }

    /* compiled from: SbpBankListPresenter.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/dodopizza/order/feature/checkout/sbp/presentation/b$b;", "Lcom/dodopizza/order/feature/checkout/sbp/presentation/b;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lou9;", "a", "Lou9;", "()Lou9;", "sbpBankListVO", "<init>", "(Lou9;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.dodopizza.order.feature.checkout.sbp.presentation.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0170b extends b {
        private final ou9 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0170b(ou9 ou9Var) {
            super(null);
            z65.h(ou9Var, "sbpBankListVO");
            this.a = ou9Var;
        }

        public final ou9 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0170b) && z65.c(this.a, ((C0170b) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            ou9 ou9Var = this.a;
            return "SbpBankSelected(sbpBankListVO=" + ou9Var + ")";
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
