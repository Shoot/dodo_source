package com.dodopizza.activeorder.feature.orderdetails.presentation;

import kotlin.Metadata;
/* compiled from: OrderDetailsVO.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/dodopizza/activeorder/feature/orderdetails/presentation/a;", "", "a", "b", com.huawei.hms.opendevice.c.a, "Lcom/dodopizza/activeorder/feature/orderdetails/presentation/a$a;", "Lcom/dodopizza/activeorder/feature/orderdetails/presentation/a$b;", "Lcom/dodopizza/activeorder/feature/orderdetails/presentation/a$c;", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public interface a {

    /* compiled from: OrderDetailsVO.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/activeorder/feature/orderdetails/presentation/a$a;", "Lcom/dodopizza/activeorder/feature/orderdetails/presentation/a;", "<init>", "()V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.dodopizza.activeorder.feature.orderdetails.presentation.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0110a implements a {
        public static final C0110a a = new C0110a();

        private C0110a() {
        }
    }

    /* compiled from: OrderDetailsVO.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dodopizza/activeorder/feature/orderdetails/presentation/a$b;", "Lcom/dodopizza/activeorder/feature/orderdetails/presentation/a;", "<init>", "()V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class b implements a {
        public static final b a = new b();

        private b() {
        }
    }

    /* compiled from: OrderDetailsVO.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/dodopizza/activeorder/feature/orderdetails/presentation/a$c;", "Lcom/dodopizza/activeorder/feature/orderdetails/presentation/a;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lhn6;", "a", "Lhn6;", "()Lhn6;", "amount", "<init>", "(Lhn6;)V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class c implements a {
        private final hn6 a;

        public c(hn6 hn6Var) {
            z65.h(hn6Var, "amount");
            this.a = hn6Var;
        }

        public final hn6 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && z65.c(this.a, ((c) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            hn6 hn6Var = this.a;
            return "Visible(amount=" + hn6Var + ")";
        }
    }
}
