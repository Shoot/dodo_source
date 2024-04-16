package com.dodopizza.order.feature.menu.ordertypeswitcher;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OrderTypeSwitcherData.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "", "<init>", "()V", "a", "b", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$a;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class a {

    /* compiled from: OrderTypeSwitcherData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$a;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.dodopizza.order.feature.menu.ordertypeswitcher.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0183a extends a {
        public static final C0183a a = new C0183a();

        private C0183a() {
            super(null);
        }
    }

    /* compiled from: OrderTypeSwitcherData.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a$b;", "Lcom/dodopizza/order/feature/menu/ordertypeswitcher/a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lb61;", "a", "Lb61;", "()Lb61;", "checkoutState", "Lbo3;", "b", "Lbo3;", "()Lbo3;", "extraInfo", "<init>", "(Lb61;Lbo3;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class b extends a {
        private final b61 a;
        private final bo3 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b61 b61Var, bo3 bo3Var) {
            super(null);
            z65.h(b61Var, "checkoutState");
            z65.h(bo3Var, "extraInfo");
            this.a = b61Var;
            this.b = bo3Var;
        }

        public final b61 a() {
            return this.a;
        }

        public final bo3 b() {
            return this.b;
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
            b61 b61Var = this.a;
            bo3 bo3Var = this.b;
            return "OrderTypeSwitcherVOData(checkoutState=" + b61Var + ", extraInfo=" + bo3Var + ")";
        }
    }

    private a() {
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
