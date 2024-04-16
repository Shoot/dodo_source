package com.dodopizza.order.feature.checkout.sbp.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SbpBankListSelectionResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/dodopizza/order/feature/checkout/sbp/presentation/c;", "", "<init>", "()V", "a", "b", "Lcom/dodopizza/order/feature/checkout/sbp/presentation/c$a;", "Lcom/dodopizza/order/feature/checkout/sbp/presentation/c$b;", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class c {

    /* compiled from: SbpBankListSelectionResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/order/feature/checkout/sbp/presentation/c$a;", "Lcom/dodopizza/order/feature/checkout/sbp/presentation/c;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a extends c {
        public static final a a = new a();

        private a() {
            super(null);
        }
    }

    /* compiled from: SbpBankListSelectionResult.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/dodopizza/order/feature/checkout/sbp/presentation/c$b;", "Lcom/dodopizza/order/feature/checkout/sbp/presentation/c;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "sbpUrl", "Lhu9;", "Lhu9;", "()Lhu9;", "sbpBank", "<init>", "(Ljava/lang/String;Lhu9;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class b extends c {
        private final String a;
        private final hu9 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, hu9 hu9Var) {
            super(null);
            z65.h(str, "sbpUrl");
            z65.h(hu9Var, "sbpBank");
            this.a = str;
            this.b = hu9Var;
        }

        public final hu9 a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (z65.c(this.a, bVar.a) && z65.c(this.b, bVar.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.a;
            hu9 hu9Var = this.b;
            return "SbpBankSelected(sbpUrl=" + str + ", sbpBank=" + hu9Var + ")";
        }
    }

    private c() {
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
