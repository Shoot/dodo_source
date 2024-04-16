package com.dodopizza.order.feature.selectionmap.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PizzeriaSelectionResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/b;", "Lqg1;", "<init>", "()V", "a", "b", "Lcom/dodopizza/order/feature/selectionmap/presentation/b$a;", "Lcom/dodopizza/order/feature/selectionmap/presentation/b$b;", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class b implements qg1 {

    /* compiled from: PizzeriaSelectionResult.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/b$a;", "Lcom/dodopizza/order/feature/selectionmap/presentation/b;", "Ld88;", "a", "Ld88;", "()Ld88;", "pizzeria", "Lo9a;", "b", "Lo9a;", "getSelectedPizzeriaType", "()Lo9a;", "selectedPizzeriaType", "", com.huawei.hms.opendevice.c.a, "Ljava/lang/Boolean;", "isNearestPizzeria", "()Ljava/lang/Boolean;", "<init>", "(Ld88;Lo9a;Ljava/lang/Boolean;)V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a extends b {
        private final d88 a;
        private final o9a b;
        private final Boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d88 d88Var, o9a o9aVar, Boolean bool) {
            super(null);
            z65.h(d88Var, "pizzeria");
            z65.h(o9aVar, "selectedPizzeriaType");
            this.a = d88Var;
            this.b = o9aVar;
            this.c = bool;
        }

        public final d88 a() {
            return this.a;
        }
    }

    /* compiled from: PizzeriaSelectionResult.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003¨\u0006\f"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/b$b;", "Lcom/dodopizza/order/feature/selectionmap/presentation/b;", "", "toString", "", "hashCode", "", "other", "", "equals", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.dodopizza.order.feature.selectionmap.presentation.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0202b extends b {
        public static final C0202b a = new C0202b();

        private C0202b() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0202b)) {
                return false;
            }
            C0202b c0202b = (C0202b) obj;
            return true;
        }

        public int hashCode() {
            return -1494046151;
        }

        public String toString() {
            return "PizzeriaNotChanged";
        }
    }

    private b() {
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
