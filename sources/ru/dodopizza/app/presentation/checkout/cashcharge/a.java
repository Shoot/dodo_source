package ru.dodopizza.app.presentation.checkout.cashcharge;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CashChargePresenter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/cashcharge/a;", "", "<init>", "()V", "a", "b", "Lru/dodopizza/app/presentation/checkout/cashcharge/a$a;", "Lru/dodopizza/app/presentation/checkout/cashcharge/a$b;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class a {

    /* compiled from: CashChargePresenter.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/dodopizza/app/presentation/checkout/cashcharge/a$a;", "Lru/dodopizza/app/presentation/checkout/cashcharge/a;", "Lws0;", "cashChargeVO", "", "noteChanged", "a", "", "toString", "", "hashCode", "", "other", "equals", "Lws0;", "b", "()Lws0;", "Z", com.huawei.hms.opendevice.c.a, "()Z", "<init>", "(Lws0;Z)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.presentation.checkout.cashcharge.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0520a extends a {
        private final ws0 a;
        private final boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0520a(ws0 ws0Var, boolean z) {
            super(null);
            z65.h(ws0Var, "cashChargeVO");
            this.a = ws0Var;
            this.b = z;
        }

        public final C0520a a(ws0 ws0Var, boolean z) {
            z65.h(ws0Var, "cashChargeVO");
            return new C0520a(ws0Var, z);
        }

        public final ws0 b() {
            return this.a;
        }

        public final boolean c() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0520a)) {
                return false;
            }
            C0520a c0520a = (C0520a) obj;
            if (z65.c(this.a, c0520a.a) && this.b == c0520a.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + a91.a(this.b);
        }

        public String toString() {
            ws0 ws0Var = this.a;
            boolean z = this.b;
            return "CashChargeVOData(cashChargeVO=" + ws0Var + ", noteChanged=" + z + ")";
        }
    }

    /* compiled from: CashChargePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/checkout/cashcharge/a$b;", "Lru/dodopizza/app/presentation/checkout/cashcharge/a;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
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
