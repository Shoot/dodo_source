package ru.dodopizza.app.presentation.checkout.details;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: fsm.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/a;", "", "<init>", "()V", "a", "b", "Lru/dodopizza/app/presentation/checkout/details/a$a;", "Lru/dodopizza/app/presentation/checkout/details/a$b;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class a {

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/a$a;", "Lru/dodopizza/app/presentation/checkout/details/a;", "Lb61;", "checkoutState", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lb61;", "b", "()Lb61;", "<init>", "(Lb61;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.presentation.checkout.details.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0528a extends a {
        private final b61 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0528a(b61 b61Var) {
            super(null);
            z65.h(b61Var, "checkoutState");
            this.a = b61Var;
        }

        public final C0528a a(b61 b61Var) {
            z65.h(b61Var, "checkoutState");
            return new C0528a(b61Var);
        }

        public final b61 b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0528a) && z65.c(this.a, ((C0528a) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            b61 b61Var = this.a;
            return "CheckoutStateData(checkoutState=" + b61Var + ")";
        }
    }

    /* compiled from: fsm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/a$b;", "Lru/dodopizza/app/presentation/checkout/details/a;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
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
